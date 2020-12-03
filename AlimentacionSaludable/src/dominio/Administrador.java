package dominio;

import java.util.Objects;
import java.io.Serializable;

public class Administrador implements Serializable {
    private static final long serialVersionUID = 6106269076155338045L;
    private String usuario;
    private String contrasenia;
    
    public Administrador(String miUsuario, String miContrasenia) {
        usuario = miUsuario;
        contrasenia = miContrasenia;
    }
    
    public Administrador() {
    }  

    public String getUsuario() {
        return usuario;
    }
   
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    @Override
    public String toString() {
        return "Administrador{" + "usuario=" + usuario + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Administrador other = (Administrador) obj;
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.contrasenia, other.contrasenia)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }            
}
