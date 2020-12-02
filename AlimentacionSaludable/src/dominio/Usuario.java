package dominio;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;

public class Usuario extends Persona implements Serializable {

    //Atributos
    private static final long serialVersionUID = 6106269076155338045L;
    private Nacionalidades nacionalidad;
    private Nacionalidades[] listaNacionalidades;
    private double pesoKg;
    private double alturaCm;
    private Preferencias preferenciasAlimentarias;
    private Restricciones restricciones;
    private boolean[] listaRestricciones;
    private PlanDeAlimentacion plan;
    private boolean necesitoPlan;
    private Profesional profesionalAsignado;
    private String sexo;
    private ArrayList<ComidaPorDia> historialComidas;
    private ComidaPorDia historialComidaDelDia;
    private ArrayList<Mensaje> casillaDeEntrada;
    private String fechaUltimaAdicion;

    
    public Usuario(Nacionalidades nacionalidad, double pesoKg, double alturaCm,
            Preferencias preferenciasAlimentarias, Restricciones restricciones,
            PlanDeAlimentacion plan, String sexo, String nombre,
            String apellidos, String nombreUsuario, String fechaNacimiento,
            ImageIcon fotoPerfil) {
        super(nombre, apellidos, nombreUsuario, fechaNacimiento, fotoPerfil);
        this.nacionalidad = nacionalidad;
        this.pesoKg = pesoKg;
        this.alturaCm = alturaCm;
        this.preferenciasAlimentarias = preferenciasAlimentarias;
        this.restricciones = restricciones;
        this.listaRestricciones = new boolean[5];
        this.plan = plan;
        this.necesitoPlan = false;
        this.profesionalAsignado = new Profesional();
        this.sexo = sexo;
        this.historialComidas = new ArrayList<>();
        this.historialComidaDelDia = new ComidaPorDia();
        this.listaNacionalidades = inicializoListaNacionalidades();
        this.casillaDeEntrada = new ArrayList<>();
        this.fechaUltimaAdicion = "No se ingreso la fecha correspondiente";
    }
    
    
    public Usuario() {
        super("No se ingreso el nombre", "No se ingreso el apellido", 
                "No se ingreso el alias de usuario", 
                "No se ingreso su fecha de nacimiento", null);
        this.setFotoPerfil(new javax
                           .swing.ImageIcon(getClass()
                           .getResource
                           ("/imagenes/predeterminadaUsuario.jpg")));
        this.nacionalidad = Nacionalidades.Uruguaya;
        this.pesoKg = 0;
        this.alturaCm = 0;
        this.preferenciasAlimentarias = Preferencias.Ninguna;
        this.restricciones = Restricciones.Ninguna;
        this.listaRestricciones = new boolean[5];
        this.necesitoPlan = false;
        this.profesionalAsignado = new Profesional();
        this.plan = new PlanDeAlimentacion(this);
        this.sexo = "No se ha ingresado el sexo";
        this.historialComidas = new ArrayList<>();
        this.historialComidaDelDia = new ComidaPorDia();
        this.listaNacionalidades = inicializoListaNacionalidades();
        this.casillaDeEntrada = new ArrayList<>();
        this.fechaUltimaAdicion = "No se ingreso la fecha correspondiente";
    }

    public String getFechaUltimaAdicion() {
        return fechaUltimaAdicion;
    }

    public void setFechaUltimaAdicion(String fechaUltimaAdicion) {
        this.fechaUltimaAdicion = fechaUltimaAdicion;
    }

    public ComidaPorDia getHistorialComidaDelDia() {
        return historialComidaDelDia;
    }

    public void setHistorialComidaDelDia(ComidaPorDia historialComidaDelDia) {
        this.historialComidaDelDia = historialComidaDelDia;
    }

    public Profesional getProfesionalAsignado() {
        return profesionalAsignado;
    }

    public void setProfesionalAsignado(Profesional profesionalAsignado) {
        this.profesionalAsignado = profesionalAsignado;
    }

    public ArrayList<Mensaje> getCasillaDeEntrada() {
        return casillaDeEntrada;
    }

    public void setCasillaDeEntrada(ArrayList<Mensaje> casillaDeEntrada) {
        this.casillaDeEntrada = casillaDeEntrada;
    }

    public Nacionalidades getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidades nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Nacionalidades[] getListaNacionalidades() {
        Nacionalidades[] lista = listaNacionalidades;
        return lista;
    }

    public void setListaNacionalidades (Nacionalidades[] listaEnumNac) {
        this.listaNacionalidades = Optional
                .ofNullable(listaEnumNac)
                .orElse(null);
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        if(pesoKg > 0 && pesoKg < 501){
            this.pesoKg = pesoKg;
        }
    }
    
    public double getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(double alturaCm) {
        if(alturaCm > 0 && alturaCm < 266){
            this.alturaCm = alturaCm;
        }
    }

    public Preferencias getPreferenciasAlimentarias() {
        return preferenciasAlimentarias;
    }

    public void setPreferenciasAlimentarias(Preferencias
                                            preferenciasAlimentarias) {
        this.preferenciasAlimentarias = preferenciasAlimentarias;
    }

    public Restricciones getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(Restricciones restricciones) {
        this.restricciones = restricciones;
    }

    public PlanDeAlimentacion getPlan() {
        return plan;
    }

    public void setPlan(PlanDeAlimentacion plan) {
        this.plan = plan;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if(sexo.equals("Masculino") || sexo.equals("Femenino")){
            this.sexo = sexo;
        }
    }

    public boolean[] getListaRestricciones() {
        boolean[] lista = listaRestricciones;
        return lista;
    }

    public void setListaRestricciones(boolean[] listaRestricciones) {
        this.listaRestricciones = Optional
                .ofNullable(listaRestricciones)
                .orElse(null);
    }

    public boolean isNecesitoPlan() {
        return necesitoPlan;
    }

    public void setNecesitoPlan(boolean necesitoPlan) {
        this.necesitoPlan = necesitoPlan;
    }

    public ArrayList<ComidaPorDia> getHistorialComidas() {
        return historialComidas;
    }

    public void setHistorialComidas(ArrayList<ComidaPorDia> historialComidas) {
        this.historialComidas = historialComidas;
    }

    public enum Nacionalidades {
        Alemana, Argentina, Australiana, Austriaca, Brasileña, Canadiense,
        Chilena, China, Colombiana, Cubana, Ecuatoriana, Egipcia,
        Española, EstadoUnidense, Francesa, Griega, Holandesa, India, Inglesa,
        Israeli, Italiana, Japonesa, Méxicana, Paraguaya, Peruana, Portuguesa,
        Rusa, Sudáfricana, Surcoreana, Uruguaya, Venezolana
    }

    String[] misNacionalidades() {
        String[] listaPaisesPivot = {"Alemana", "Australiana", "Austriaca",
            "Brasileña","Canadiense", "Chilena", "China", "Colombiana",
            "Surcoreana", "Cubana", "Ecuatoriana", "Egipcia",
            "Española", "EstadoUnidense", "Francesa", "Griega",
            "Holandesa", "India", "Inglesa", "Israeli", "Italiana",
            "Japonesa", "Méxicana", "Paraguaya", "Peruana",
            "Portuguesa", "Rusa", "Sudáfricana", "Uruguaya",
            "Venezolana"};
        return listaPaisesPivot;
    }

    public Nacionalidades[] inicializoListaNacionalidades() {
        Nacionalidades[] listaEnumPivot = {
            Nacionalidades.Alemana, Nacionalidades.Argentina,
            Nacionalidades.Australiana, Nacionalidades.Austriaca,
            Nacionalidades.Brasileña, Nacionalidades.Canadiense,
            Nacionalidades.Chilena, Nacionalidades.China,
            Nacionalidades.Colombiana, Nacionalidades.Surcoreana,
            Nacionalidades.Cubana, Nacionalidades.Ecuatoriana, 
            Nacionalidades.Egipcia, Nacionalidades.Española, 
            Nacionalidades.EstadoUnidense, Nacionalidades.Francesa,
            Nacionalidades.Griega, Nacionalidades.Holandesa,
            Nacionalidades.India, Nacionalidades.Inglesa,
            Nacionalidades.Israeli, Nacionalidades.Italiana,
            Nacionalidades.Japonesa, Nacionalidades.Méxicana,
            Nacionalidades.Paraguaya, Nacionalidades.Peruana,
            Nacionalidades.Portuguesa, Nacionalidades.Rusa,
            Nacionalidades.Sudáfricana, Nacionalidades.Uruguaya,
            Nacionalidades.Venezolana
        };
        return listaEnumPivot;
    }

    public enum Preferencias {
        Vegano, Vegetariano, Macrobiotico, Organico, Ninguna
    }

    public enum Restricciones {
        Celiaco, IntoleranteALaLactosa, Diabetico, Hipertension, Ninguna
    }

    @Override
    public String toString() {
        return "Usuario: " + this.getAliasUsuario();
    }
}
