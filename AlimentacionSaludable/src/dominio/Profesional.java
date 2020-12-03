package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Optional;

public class Profesional extends Persona implements Serializable {

    private static final long serialVersionUID = 6106269076155338045L;
    private String tituloProfesional;
    private String fechaGraduacion;
    private Pais paisObtuvoTitulo;
    private Pais[] listaPaises = inicializoListaPaises();
    private ArrayList<Mensaje> casillaDeEntrada;


    public Profesional() {
        super("No se ingreso el nombre", "No se ingreso el apellido", "No se ingreso el alias de usuario",
              "no ingreso fecha nacimiento", null);
        this.setFotoPerfil(new javax.swing
                           .ImageIcon(getClass()
                           .getResource
                          ("/imagenes/predeterminadaProfesional.png")));
        this.tituloProfesional = "No se ingreso el nombre del titulo de profesional";
        this.fechaGraduacion = "No se ingreso la fecha graduacion";
        this.paisObtuvoTitulo = Pais.Uruguay;
        this.casillaDeEntrada = new ArrayList<Mensaje>();
    }

    public ArrayList<Mensaje> getCasillaDeEntrada() {
        return casillaDeEntrada;
    }

    public void setCasillaDeEntrada(ArrayList<Mensaje> casillaDeEntrada) {
        this.casillaDeEntrada = casillaDeEntrada;
    }

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public void setTituloProfesional(String tituloProfesional) {
        if (!tituloProfesional.trim().isEmpty()){
            this.tituloProfesional = tituloProfesional;
        }
    }

    public String getFechaGraduacion() {
        return fechaGraduacion;
    }

    public void setFechaGraduacion(String fechaGraduacion) {
        if(!fechaGraduacion.trim().isEmpty()){
            this.fechaGraduacion = fechaGraduacion;
        }
    }

    public Pais getPaisObtuvoTitulo() {
        return paisObtuvoTitulo;
    }

    public void setPaisObtuvoTitulo(Pais paisObtuvoTitulo) {
        this.paisObtuvoTitulo = paisObtuvoTitulo;
    }

    public Pais[] getListaEnumPais() {
        Pais[] lista = listaPaises;
        return lista;
    }

    public void setListaEnumPais(Pais[] listaEnumPais) {
        this.listaPaises = Optional
                .ofNullable(listaEnumPais)
                .orElse(null);

    }

    public enum Pais {
        Alemania, Argentina, Australia, Austria, Brasil, Canadá, Chile, China,
        Colombia, CoreaDelSur, Cuba, Ecuador, Egipto, España, EstadosUnidos,
        Francia, Grecia, Holanda, India, Inglaterra, Israel, Italia, Japón,
        México, Paraguay, Perú, Portugal, Rusia, Sudáfrica, Uruguay, Venezuela
    }

    public Pais[] inicializoListaPaises() {
        Pais[] listaEnumPivot = {
            Pais.Alemania, Pais.Argentina, Pais.Australia,
            Pais.Austria, Pais.Brasil, Pais.Canadá,
            Pais.Chile, Pais.China, Pais.Colombia,
            Pais.CoreaDelSur, Pais.Cuba, Pais.Ecuador,
            Pais.Egipto, Pais.España, Pais.EstadosUnidos,
            Pais.Francia, Pais.Grecia, Pais.Holanda,
            Pais.India, Pais.Inglaterra, Pais.Israel,
            Pais.Italia, Pais.Japón, Pais.México, Pais.Paraguay,
            Pais.Perú, Pais.Portugal, Pais.Rusia, Pais.Sudáfrica,
            Pais.Uruguay, Pais.Venezuela
        };
        return listaEnumPivot;
    }

    @Override
    public String toString() {
        return "Usuario: " + this.getAliasUsuario();
    }
}
