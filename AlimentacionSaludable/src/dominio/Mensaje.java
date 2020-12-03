package dominio;

import java.io.Serializable;


public class Mensaje implements Serializable {
    
    private static final long serialVersionUID = 6106269076155338045L;
    private Persona origen;
    private Persona destino;
    private String asunto;
    private String mensaje;
    
    
    public Mensaje() {
        Persona persona = (Persona) new Usuario();
        this.origen = persona;
        this.destino = persona;
        this.asunto = "No se asigno un asunto";
        this.mensaje = "No se ha scrito un texto de mensaje";
    }
    
   
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
        return "Mensaje de: " + origen.getAliasUsuario() 
               + " con Asunto: " + asunto;
    }
    
}
