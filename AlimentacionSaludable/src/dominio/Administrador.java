package dominio;

public class Administrador {
    private String usuario;
    private String contraseña;
    
    public Administrador(String vUsuario, String vContraseña){
        usuario=vUsuario;
        contraseña=vContraseña;
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
