package dominio;

import java.util.Objects;
import java.io.Serializable;

public class Administrador {
    private static final long serialVersionUID = 6106269076155338045L;
    private String usuario;
    private String contraseña;
    
    public Administrador(String vUsuario, String vContraseña){
        usuario=vUsuario;
        contraseña=vContraseña;
    }
    
    public Administrador(){
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
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
        if (!Objects.equals(this.contraseña, other.contraseña)) {
            return false;
        }
        return true;
    }

    public String getUsuario() {
        return usuario;
    }
   
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
     @Override
    public String toString() {
        return "Administrador{" + "usuario=" + usuario + '}';
    }

            
}
