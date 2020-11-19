package dominio;

import com.toedter.calendar.JDateChooser;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Optional;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Sistema implements Serializable {

    //Atributos
    private static final long serialVersionUID = 6106269076155338045L;
    ArrayList<Alimento> alimentos;
    ArrayList<Usuario> usuarios;
    ArrayList<Profesional> profesionales;
    ArrayList<Administrador> administradores;
    tipoUsuario[] listaTiposDeUsuario;
    tipoUsuario usuarioActivo;

    //Cosntructor
    public Sistema(ArrayList<Alimento> listaAlimentos,
            ArrayList<Usuario> listaUsuarios,
            ArrayList<Profesional> listaProfesionales,
            ArrayList<Administrador> listaAdministradores,
            tipoUsuario usuarioActivo) {
        this.alimentos = listaAlimentos;
        this.usuarios = listaUsuarios;
        this.profesionales = listaProfesionales;
        this.usuarioActivo = usuarioActivo;
        administradores = listaAdministradores;
        this.listaTiposDeUsuario = inicializoListaTiposDeUsuario();
    }

    public Sistema() {
        this.alimentos = new ArrayList();
        this.usuarios = new ArrayList();
        this.profesionales = new ArrayList();
        this.administradores = new ArrayList();
        this.usuarioActivo = tipoUsuario.NoSeleccionado;
        this.listaTiposDeUsuario = inicializoListaTiposDeUsuario();
    }
    //Metodos de la clase sistema

    public tipoUsuario[] getListaTiposDeUsuario() {
        tipoUsuario[] lista = listaTiposDeUsuario;
        return lista;
    }

    public void setListaTiposDeUsuario(tipoUsuario[] listaTiposDeUsuario) {
        this.listaTiposDeUsuario = Optional
                .ofNullable(listaTiposDeUsuario)
                .orElse(null);
    }

    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(ArrayList<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public Usuario getUsuarioPorNombre(String nombre) {
        for (int i = 0; i < usuarios.size(); i++) {
           Usuario usuario = usuarios.get(i);
            if (usuario.getNombreUsuario().equals(nombre)) {
                return usuario;
            }
        }
        return null;
    }

    public boolean existeNombreUsuario(String nombre) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = usuarios.get(i);
            if (usuario.getNombreUsuario().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public boolean existeNombreProfesional(String nombre) {
        for (int i = 0; i < profesionales.size(); i++) {
            Profesional profesional = profesionales.get(i);
            if (profesional.getNombreUsuario().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public Profesional getProfesionalPorNombre(String nombre) {
        for (int i = 0; i < profesionales.size(); i++) {
            Profesional profesional = profesionales.get(i);
            if (profesional.getNombreUsuario().equals(nombre)) {
                return profesional;
            }
        }
        return null;
    }

    public ArrayList<Administrador> getListaAdministradores() {
        return administradores;
    }

    public void setAdministrador(Administrador administrador) {
        administradores.add(administrador);
    }

    public void setListaAdministradores(ArrayList<Administrador> listaAdministradores) {
        this.administradores = listaAdministradores;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Profesional> getProfesionales() {
        return profesionales;
    }

    public void setProfesionales(ArrayList<Profesional> profesionales) {
        this.profesionales = profesionales;
    }

    public tipoUsuario getUsuarioActivo() {
        return usuarioActivo;
    }

    public void setUsuarioActivo(tipoUsuario usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }

    public enum tipoUsuario {
        Profesional, Usuario, NoSeleccionado
    }

    //Metodo para inicializar lista de enums de tipo de usuario
    tipoUsuario[] inicializoListaTiposDeUsuario() {
        tipoUsuario[] listaPivot = {tipoUsuario.Profesional,
            tipoUsuario.Usuario};
        return listaPivot;
    }

    //CARGAR Y GUARDAR SISTEMA
    public void cargarSistema() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("sis.ser"));
            ArrayList<Alimento> listAlimentos = (ArrayList<Alimento>) in.readObject();
            alimentos = listAlimentos;
            ArrayList<Usuario> listUsuarios = (ArrayList<Usuario>) in.readObject();
            usuarios = listUsuarios;
            ArrayList<Profesional> listProfesionales = (ArrayList<Profesional>) in.readObject();
            profesionales = listProfesionales;
            ArrayList<Administrador> administradores = (ArrayList<Administrador>) in.readObject();
            administradores = administradores;
            in.close();
        } catch (Exception ex) {
            alimentos = new ArrayList<Alimento>();
            usuarios = new ArrayList<Usuario>();
            profesionales = new ArrayList<Profesional>();
            administradores= new ArrayList<Administrador>();
        }
    }

    public void guardarSistema() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sis.ser"));
            out.writeObject(alimentos);
            out.writeObject(usuarios);
            out.writeObject(profesionales);
            out.writeObject(administradores);
            out.flush();
            out.close();
        } catch (IOException ex) {
        }
    }

    //Metodo para validarque el dato sea numericoF
    public boolean pidoDatoNumerico(int dato, int min, int max) {
        int datoAVerificar = 0;
        boolean pidiendo = false;
        try {
            datoAVerificar = dato;
            if ((datoAVerificar >= min) && (datoAVerificar <= max)) {
                pidiendo = true;
            }
        } catch (NumberFormatException ex) {

        }
        return pidiendo;
    }

    //Metodo que adapta el tamaño de la imagen al deseado
    ImageIcon resizeImageIcon(ImageIcon imageIcon, Integer width,
            Integer height) {
        BufferedImage bufferedImage = new BufferedImage(width, height,
                BufferedImage.TRANSLUCENT);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(imageIcon.getImage(), 0, 0, width, height, null);
        graphics2D.dispose();
        return new ImageIcon(bufferedImage, imageIcon.getDescription());
    }

    void registroUsuario(String unNombre, String unApellido, String unUsuario,
            String unSexo, String unaFechaNacimiento,
            double unaAltura, ImageIcon unaFotoPerfil,
            double unPeso,
            Usuario.Nacionalidades unaNacionalidad) {
        Usuario usuario = new Usuario();
        usuario.setNombre(unNombre);
        usuario.setApellidos(unApellido);
        usuario.setNombreUsuario(unUsuario);
        usuario.setNacionalidad(usuario.getListaEnumNac()[unaNacionalidad.ordinal()]);
        usuario.setFechaNacimiento(unaFechaNacimiento);
        usuario.setSexo(unSexo);
        usuario.setAlturaCm(unaAltura);
        usuario.setPesoKg(unPeso);
        usuario.setFotoPerfil(unaFotoPerfil);
        if (!this.getUsuarios().contains(usuario)) {
            this.getUsuarios().add(usuario);
        }
    }

    public void registroProfesional(String unNombre, String unApellido,
            String unNombreUsuario,
            String unNombreTitulo,
            Profesional.Pais unPais,
            ImageIcon unaFotoPerfil,
            String unaFechaNacimiento,
            String unaFechaGraduacion,
            Profesional.Pais unPaisTitulo) {
        Profesional profesional = new Profesional();
        profesional.setNombre(unNombre);
        profesional.setApellidos(unApellido);
        profesional.setNombreUsuario(unNombreUsuario);
        profesional.setFechaNacimiento(unaFechaNacimiento);
        profesional.setNombreTituloProf(unNombreTitulo);
        profesional.setFechaGraduacion(unaFechaGraduacion);
        profesional.setPaisObtuvoTitulo(unPaisTitulo);
        profesional.setFotoPerfil(unaFotoPerfil);
        if (!this.getProfesionales().contains(profesional)) {
            this.getProfesionales().add(profesional);
        }
    }

    public void registroAlimento(String nombreAlim,
            Alimento.TipoAlimento unTipo,
            boolean[] unaListaNutrientes) {
        Alimento alimento = new Alimento();
        alimento.setNombre(nombreAlim);
        alimento.setTipo(alimento.getListaEnumTipoAlimento()[unTipo.ordinal()]);
        alimento.setListaNutrientesSeleccionados(unaListaNutrientes);
        if (!this.getAlimentos().contains(alimento)) {
            this.getAlimentos().add(alimento);
        }
    }

     public void registroAdministrador(String usuarioAdministrador, String contraseñaAdministrador) {
        Administrador administrador= new Administrador();
        administrador.setUsuario(usuarioAdministrador);
        administrador.setContraseña(contraseñaAdministrador);
    }
}
