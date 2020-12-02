package alimentacionsaludable;
import dominio.Sistema;
import interfaz.InterfazBotonesAdministrador;
import interfaz.InterfazBotonesProfesional;
import interfaz.InterfazBotonesUsuario;
import interfaz.PanelCambioDeUsuario;
import interfaz.PanelPerfilUsuario;
import interfaz.PanelPrincipal;
import java.awt.Component;
import javax.swing.JPanel;


public class AlimentacionSaludable {

  
    public static void main(String[] args) {
        Sistema s = new Sistema();
        s.cargarSistema();
        PanelPrincipal p = new PanelPrincipal(s);
        PanelCambioDeUsuario comienzo = new PanelCambioDeUsuario(p,p.getSistema());
        p.add(comienzo);
        p.pack();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }
}
