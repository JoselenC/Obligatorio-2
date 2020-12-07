package alimentacionsaludable;

import dominio.Sistema;
import interfaz.PanelCambioDeUsuario;
import interfaz.PanelPrincipal;


public class AlimentacionSaludable {
  
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.cargarSistema();
        PanelPrincipal panelPrincipal = new PanelPrincipal(sistema);
        PanelCambioDeUsuario comienzo;
        comienzo = new PanelCambioDeUsuario(panelPrincipal, panelPrincipal.getSistema()); 
        panelPrincipal.add(comienzo);
        panelPrincipal.pack();
        panelPrincipal.setLocationRelativeTo(null);
        panelPrincipal.setVisible(true);
    }
}
