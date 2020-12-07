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
        this.setFotoPerfil(new javax.swing.ImageIcon(getClass()
                .getResource("/imagenes/predeterminadaProfesional.png")));
        this.tituloProfesional = "No se ingreso el nombre del titulo de profesional";
        this.fechaGraduacion = "No se ingreso la fecha graduacion";
        this.paisObtuvoTitulo = Pais.URUGUAY;
        this.casillaDeEntrada = new ArrayList<>();
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
        if (!tituloProfesional.trim().isEmpty()) {
            this.tituloProfesional = tituloProfesional;
        }
    }

    public String getFechaGraduacion() {
        return fechaGraduacion;
    }

    public void setFechaGraduacion(String fechaGraduacion) {
        if (!fechaGraduacion.trim().isEmpty()) {
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
        return listaPaises;
    }

    public void setListaEnumPais(Pais[] listaEnumPais) {
        this.listaPaises = Optional
                .ofNullable(listaEnumPais)
                .orElse(null);

    }

    public enum Pais {
        ALEMANIA, ARGENTINA, AUSTRALIA, AUSTRIA, BRASIL, CANADÁ, CHILE, CHINA,
        COLOMBIA, COREADELSUR, CUBA, ECUADOR, EGIPTO, ESPAÑA, ESTADOSUNIDOS,
        FRANCIA, GRECIA, HOLANDA, INDIA, INGLATERRA, ISRAEL, ITALIA, JAPÓN,
        MÉXICO, PARAGUAY, PERÚ, PORTUGAL, RUSIA, SUDÁFRICA, URUGUAY, VENEZUELA

    }

    public Pais[] inicializoListaPaises() {
        return new Pais[]{
            Pais.ALEMANIA, Pais.ARGENTINA, Pais.AUSTRALIA,
            Pais.AUSTRIA, Pais.BRASIL, Pais.CANADÁ,
            Pais.CHILE, Pais.CHINA, Pais.COLOMBIA,
            Pais.COREADELSUR, Pais.CUBA, Pais.ECUADOR,
            Pais.EGIPTO, Pais.ESPAÑA, Pais.ESTADOSUNIDOS,
            Pais.FRANCIA, Pais.GRECIA, Pais.HOLANDA,
            Pais.INDIA, Pais.INGLATERRA, Pais.ISRAEL,
            Pais.ITALIA, Pais.JAPÓN, Pais.MÉXICO, Pais.PARAGUAY,
            Pais.PERÚ, Pais.PORTUGAL, Pais.RUSIA, Pais.SUDÁFRICA,
            Pais.URUGUAY, Pais.VENEZUELA
        };
    }

    @Override
    public String toString() {
        return "Usuario: " + this.getAliasUsuario();
    }
}
