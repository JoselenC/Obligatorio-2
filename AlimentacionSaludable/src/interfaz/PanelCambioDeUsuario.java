package interfaz;

import dominio.Persona;
import dominio.Profesional;
import dominio.Usuario;
import dominio.Sistema;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;

public class PanelCambioDeUsuario extends javax.swing.JPanel {

    private JFrame ventana;
    private Sistema sistema;
    private InterfazBotonesProfesional interfazProf=null;
    private InterfazBotonesUsuario interfazUsr=null;
    private InterfazBotonesAdministrador interfazAdm=null;

       
    public PanelCambioDeUsuario(JFrame unaVentana,
            Sistema unSistema,
            InterfazBotonesProfesional unaInterfaz) {
        initComponents();
        ventana = unaVentana;
        sistema = unSistema;
        interfazProf = unaInterfaz;
        this.setSize(800, 500);
    }

    
    public PanelCambioDeUsuario(JFrame unaVentana,
            Sistema unSistema,
            InterfazBotonesUsuario unaInterfaz) {
        initComponents();
        ventana = unaVentana;
        sistema = unSistema;
        interfazUsr = unaInterfaz;
    }

    //constructor desde Administrador
    public PanelCambioDeUsuario(JFrame unaVentana,
            Sistema unSistema,
            InterfazBotonesAdministrador unaInterfaz) {
        initComponents();
        ventana = unaVentana;
        sistema = unSistema;
        interfazAdm = unaInterfaz;
    }

    //constructor para comenzar la aplicacion
    public PanelCambioDeUsuario(JFrame unaVentana,
            Sistema unSistema) {
        initComponents();
        ventana = unaVentana;
        sistema = unSistema;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProfesional = new javax.swing.JButton();
        btnPruebaAdministrador1 = new javax.swing.JButton();
        btnUsuario1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(229, 229, 240));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(null);

        btnProfesional.setBackground(new java.awt.Color(229, 229, 240));
        btnProfesional.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnProfesional.setForeground(new java.awt.Color(255, 255, 255));
        btnProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesional 2.png"))); // NOI18N
        btnProfesional.setBorderPainted(false);
        btnProfesional.setContentAreaFilled(false);
        btnProfesional.setOpaque(true);
        btnProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfesionalActionPerformed(evt);
            }
        });
        add(btnProfesional);
        btnProfesional.setBounds(40, 150, 210, 250);

        btnPruebaAdministrador1.setBackground(new java.awt.Color(229, 229, 240));
        btnPruebaAdministrador1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPruebaAdministrador1.setForeground(new java.awt.Color(255, 255, 255));
        btnPruebaAdministrador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/administrador 1 1.png"))); // NOI18N
        btnPruebaAdministrador1.setBorderPainted(false);
        btnPruebaAdministrador1.setContentAreaFilled(false);
        btnPruebaAdministrador1.setOpaque(true);
        btnPruebaAdministrador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPruebaAdministrador1ActionPerformed(evt);
            }
        });
        add(btnPruebaAdministrador1);
        btnPruebaAdministrador1.setBounds(490, 160, 260, 210);

        btnUsuario1.setBackground(new java.awt.Color(229, 229, 240));
        btnUsuario1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images 1.png"))); // NOI18N
        btnUsuario1.setBorderPainted(false);
        btnUsuario1.setContentAreaFilled(false);
        btnUsuario1.setOpaque(true);
        btnUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuario1ActionPerformed(evt);
            }
        });
        add(btnUsuario1);
        btnUsuario1.setBounds(280, 170, 220, 197);

        jPanel1.setBackground(new java.awt.Color(171, 171, 199));

        etiquetaTitulo.setBackground(new java.awt.Color(135, 135, 156));
        etiquetaTitulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaTitulo.setText("Inicio de sesion");
        jPanel1.add(etiquetaTitulo);

        add(jPanel1);
        jPanel1.setBounds(10, 10, 800, 90);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPruebaAdministrador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPruebaAdministrador1ActionPerformed
        if (interfazProf != null) {
            ventana.remove(interfazProf);
        }
        if (interfazUsr != null) {
            ventana.remove(interfazUsr);
        }
        PanelValidacionAdministrador validacion = new PanelValidacionAdministrador(sistema, ventana, this);
        validacion.setVisible(true);
    }//GEN-LAST:event_btnPruebaAdministrador1ActionPerformed

    private void btnUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuario1ActionPerformed
        if (interfazProf != null) {
            ventana.remove(interfazProf);
        }
        if (interfazAdm != null) {
            ventana.remove(interfazAdm);
        }
        FromIngresoUsuario usuario = new FromIngresoUsuario(sistema, ventana, "Usuario", this);
        usuario.setVisible(true);
    }//GEN-LAST:event_btnUsuario1ActionPerformed

    private void btnProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfesionalActionPerformed

        if (interfazUsr != null) {
            ventana.remove(interfazUsr);
        }
        if (interfazAdm != null) {
            ventana.remove(interfazAdm);
        }
        FromIngresoUsuario usuario = new FromIngresoUsuario(sistema, ventana, "Profesional", this);
        usuario.setVisible(true);

    }//GEN-LAST:event_btnProfesionalActionPerformed

    void limpioInterfaces() {
        if (interfazProf != null) {
            ventana.remove(interfazProf.getActual());
            ventana.remove(interfazProf);
        }
        if (interfazUsr != null) {
            ventana.remove(interfazUsr.getActual());
            ventana.remove(interfazUsr);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProfesional;
    private javax.swing.JButton btnPruebaAdministrador1;
    private javax.swing.JButton btnUsuario1;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
