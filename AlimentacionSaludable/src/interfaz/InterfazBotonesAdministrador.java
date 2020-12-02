package interfaz;

import dominio.Sistema;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfazBotonesAdministrador extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private JPanel actual;    
    private JPanel nuevaActual;
    private JFrame ventana;

    //Cosntructor
    public InterfazBotonesAdministrador(Sistema unSistema, JFrame unaVentana) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana; 
        actual =new PanelRegistroUsuario(sistema,ventana);       
        ventana.add(this);   
        ventana.add(actual);
        ventana.pack();
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
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBotonesAdministrador = new javax.swing.JPanel();
        btnRegistrarUsuario = new javax.swing.JButton();
        btnRegistrarProfesional = new javax.swing.JButton();
        btnRegistrarAlimento = new javax.swing.JButton();
        btnCambiarUsuario = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(250, 784));
        setLayout(null);

        panelBotonesAdministrador.setBackground(new java.awt.Color(193, 193, 217));
        panelBotonesAdministrador.setPreferredSize(new java.awt.Dimension(250, 600));
        panelBotonesAdministrador.setLayout(null);

        btnRegistrarUsuario.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistrarUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRegistrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarUsuario.setText("Registrar Usuario");
        btnRegistrarUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarUsuario.setContentAreaFilled(false);
        btnRegistrarUsuario.setOpaque(true);
        btnRegistrarUsuario.setPreferredSize(new java.awt.Dimension(193, 136));
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });
        panelBotonesAdministrador.add(btnRegistrarUsuario);
        btnRegistrarUsuario.setBounds(0, 30, 260, 50);

        btnRegistrarProfesional.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistrarProfesional.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRegistrarProfesional.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarProfesional.setText("Registrar Profesional");
        btnRegistrarProfesional.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarProfesional.setContentAreaFilled(false);
        btnRegistrarProfesional.setOpaque(true);
        btnRegistrarProfesional.setPreferredSize(new java.awt.Dimension(225, 196));
        btnRegistrarProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProfesionalActionPerformed(evt);
            }
        });
        panelBotonesAdministrador.add(btnRegistrarProfesional);
        btnRegistrarProfesional.setBounds(0, 110, 260, 50);

        btnRegistrarAlimento.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistrarAlimento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRegistrarAlimento.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAlimento.setText("Registrar Alimento");
        btnRegistrarAlimento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarAlimento.setContentAreaFilled(false);
        btnRegistrarAlimento.setOpaque(true);
        btnRegistrarAlimento.setPreferredSize(new java.awt.Dimension(205, 196));
        btnRegistrarAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAlimentoActionPerformed(evt);
            }
        });
        panelBotonesAdministrador.add(btnRegistrarAlimento);
        btnRegistrarAlimento.setBounds(0, 190, 260, 50);

        btnCambiarUsuario.setBackground(new java.awt.Color(102, 102, 102));
        btnCambiarUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCambiarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarUsuario.setText("Cambiar Usuario");
        btnCambiarUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCambiarUsuario.setContentAreaFilled(false);
        btnCambiarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCambiarUsuario.setOpaque(true);
        btnCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarUsuarioActionPerformed(evt);
            }
        });
        panelBotonesAdministrador.add(btnCambiarUsuario);
        btnCambiarUsuario.setBounds(0, 270, 260, 50);

        add(panelBotonesAdministrador);
        panelBotonesAdministrador.setBounds(0, 0, 250, 1010);
    }// </editor-fold>//GEN-END:initComponents


private void cambiarPanel(JPanel actualNueva){
        ventana.remove(actual);
        nuevaActual= actualNueva;
        ventana.add(nuevaActual);
        actual=nuevaActual;
        ventana.pack();
    }

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        nuevaActual = new PanelRegistroUsuario(sistema, ventana);
        cambiarPanel(nuevaActual);       
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void btnRegistrarProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProfesionalActionPerformed
        nuevaActual = new PanelRegistroProfesional(sistema, ventana);
        cambiarPanel(nuevaActual); 
    }//GEN-LAST:event_btnRegistrarProfesionalActionPerformed

    private void btnRegistrarAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAlimentoActionPerformed
        nuevaActual = new PanelRegistroAlimento(sistema, ventana);
        cambiarPanel(nuevaActual);  
    }//GEN-LAST:event_btnRegistrarAlimentoActionPerformed

    private void btnCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarUsuarioActionPerformed
        nuevaActual = new PanelCambioDeUsuario(ventana, sistema, this);
        cambiarPanel(nuevaActual); 
    }//GEN-LAST:event_btnCambiarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarUsuario;
    private javax.swing.JButton btnRegistrarAlimento;
    private javax.swing.JButton btnRegistrarProfesional;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JPanel panelBotonesAdministrador;
    // End of variables declaration//GEN-END:variables
}
