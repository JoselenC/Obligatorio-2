/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
/**
 *
 * @author ale
 */
public class AlimentacionSaludable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema s = new Sistema();
        s.cargarSistema();
        PanelPrincipal p = new PanelPrincipal(s);
        //InterfazBotonesAdministrador i = new InterfazBotonesAdministrador(s,p);
        //InterfazBotonesUsuario i = new InterfazBotonesUsuario(s,p);
        //InterfazBotonesProfesional i = new InterfazBotonesProfesional(s,p);
        PanelCambioDeUsuario comienzo = new PanelCambioDeUsuario(p,p.getSistema());
        p.add(comienzo);
        p.pack();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }
}
