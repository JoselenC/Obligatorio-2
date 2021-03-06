package interfaz;

import dominio.Profesional;
import dominio.Sistema;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfazBotonesProfesional extends javax.swing.JPanel {
    
    private final Sistema sistema;
    private final JFrame ventana;
    private JPanel actual;
    private JPanel nuevaActual;
    private Profesional usuarioActivo;

   
    public InterfazBotonesProfesional(Sistema unSistema, JFrame unaVentana,
            Profesional unProfesional) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        usuarioActivo = unProfesional;
        actual = new PanelHomeProfesional(unSistema, this, unaVentana);
        ventana.add(this);
        ventana.add(actual);
        ventana.pack();
    }

    public JPanel getActual() {
        return actual;
    }

    public void setActual(JPanel actual) {
        this.actual = actual;
    }

    public JPanel getNuevaActual() {
        return nuevaActual;
    }

    public void setNuevaActual(JPanel nuevaActual) {
        this.nuevaActual = nuevaActual;
    }    
    

    public Profesional getUsuarioActivo() {
        return usuarioActivo;
    }

    public void setUsuarioActivo(Profesional usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHome = new javax.swing.JButton();
        btnRealizarPlan = new javax.swing.JButton();
        btnConsultaDirecta = new javax.swing.JButton();
        btnCambiarUsuario = new javax.swing.JButton();

        setBackground(new java.awt.Color(193, 193, 217));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(250, 600));
        setLayout(null);

        btnHome.setBackground(new java.awt.Color(102, 102, 102));
        btnHome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHome.setContentAreaFilled(false);
        btnHome.setOpaque(true);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        add(btnHome);
        btnHome.setBounds(2, 32, 258, 41);

        btnRealizarPlan.setBackground(new java.awt.Color(102, 102, 102));
        btnRealizarPlan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRealizarPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarPlan.setText("Realizar Plan");
        btnRealizarPlan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRealizarPlan.setContentAreaFilled(false);
        btnRealizarPlan.setOpaque(true);
        btnRealizarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPlanActionPerformed(evt);
            }
        });
        add(btnRealizarPlan);
        btnRealizarPlan.setBounds(2, 91, 258, 44);

        btnConsultaDirecta.setBackground(new java.awt.Color(102, 102, 102));
        btnConsultaDirecta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnConsultaDirecta.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaDirecta.setText("Consulta Directa");
        btnConsultaDirecta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultaDirecta.setContentAreaFilled(false);
        btnConsultaDirecta.setOpaque(true);
        btnConsultaDirecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaDirectaActionPerformed(evt);
            }
        });
        add(btnConsultaDirecta);
        btnConsultaDirecta.setBounds(2, 156, 258, 43);

        btnCambiarUsuario.setBackground(new java.awt.Color(102, 102, 102));
        btnCambiarUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCambiarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarUsuario.setText("Cambiar Usuario");
        btnCambiarUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCambiarUsuario.setContentAreaFilled(false);
        btnCambiarUsuario.setOpaque(true);
        btnCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarUsuarioActionPerformed(evt);
            }
        });
        add(btnCambiarUsuario);
        btnCambiarUsuario.setBounds(2, 220, 258, 44);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void cambiarPanel(JPanel actualNueva) {
        ventana.remove(actual);
        nuevaActual = actualNueva;
        ventana.add(nuevaActual);
        actual = nuevaActual;
        ventana.pack();
    }
    
    
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        nuevaActual = new PanelHomeProfesional(sistema, this, ventana);
        cambiarPanel(nuevaActual);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnConsultaDirectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaDirectaActionPerformed
        nuevaActual = new PanelConsultaProfesionalDesdeProfesional(sistema, this, ventana);
        cambiarPanel(nuevaActual);
    }//GEN-LAST:event_btnConsultaDirectaActionPerformed

    private void btnRealizarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPlanActionPerformed
       nuevaActual = new PanelSeleccionarPlanARealizar(sistema, this, ventana);
        cambiarPanel(nuevaActual);
    }//GEN-LAST:event_btnRealizarPlanActionPerformed

    private void btnCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarUsuarioActionPerformed
        nuevaActual = new PanelCambioDeUsuario(ventana, sistema, this);
        cambiarPanel(nuevaActual);
    }//GEN-LAST:event_btnCambiarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarUsuario;
    private javax.swing.JButton btnConsultaDirecta;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRealizarPlan;
    // End of variables declaration//GEN-END:variables
}
