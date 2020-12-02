package dominio;

import java.io.Serializable;
import javax.swing.ImageIcon;

public abstract class Persona implements Serializable {

    //Atributos
    private static final long serialVersionUID = 6106269076155338045L;
    private String nombre;
    private String apellido;
    private String aliasUsuario;
    private String fechaNacimiento;
    private ImageIcon fotoPerfil;

    //Cosntructor
    public Persona(String nombre, String apellidos, String nombreUsuario,
                   String fechaNacimiento, ImageIcon fotoPerfil) {
        this.nombre = nombre;
        this.apellido = apellidos;
        this.aliasUsuario = nombreUsuario;
        this.fechaNacimiento = fechaNacimiento;
        this.fotoPerfil = fotoPerfil;
    }
     public Persona(String nombre, String apellidos, String nombreUsuario,
                   String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellidos;
        this.aliasUsuario = nombreUsuario;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellido;
    }

    public void setApellidos(String apellidos) {
        this.apellido = apellidos;
    }

    public String getAliasUsuario() {
        return aliasUsuario;
    }

    public void setAliasUsuario(String aliasUsuario) {
        this.aliasUsuario = aliasUsuario;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ImageIcon getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(ImageIcon fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    //Redefino el equals
    @Override
    public boolean equals(Object obj) {
        boolean retorno = true;
        if (obj == null) {
            retorno = false;
        }
        if (obj.getClass() != this.getClass()) {
            retorno = false;
        }
        if(retorno == true){
            Persona p = (Persona) obj;
            retorno = this.getAliasUsuario()
                      .equalsIgnoreCase(p.getAliasUsuario());
        }
        return retorno;
    }
}
