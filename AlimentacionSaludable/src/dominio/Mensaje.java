package dominio;

import java.io.Serializable;


public class Mensaje implements Serializable{
    
    //Atributos
     private static final long serialVersionUID = 6106269076155338045L;
    private Persona origen;
    private Persona destino;
    private String asunto;
    private String mensaje;
    
    //Constructor
    public Mensaje() {
        Persona p = (Persona) new Usuario();
        this.origen = p;
        this.destino = p;
        this.asunto = "No se asigno un asunto";
        this.mensaje = "No se ha scrito un texto de mensaje";
    }
    
    //Metodos de la clase Mensaje

    public Persona getOrigen() {
        return origen;
    }

    public void setOrigen(Persona origen) {
        this.origen = origen;
    }

    public Persona getDestino() {
        return destino;
    }

    public void setDestino(Persona destino) {
        this.destino = destino;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
 
    @Override
    public String toString() {
        return "Mensaje de: "+ origen.getAliasUsuario() 
               + " con Asunto: " + asunto;
    }
    
}
