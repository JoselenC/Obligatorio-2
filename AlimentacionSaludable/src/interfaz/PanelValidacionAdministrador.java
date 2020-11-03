/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Administrador;
import dominio.Sistema;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Choche
 */
public class PanelValidacionAdministrador extends javax.swing.JPanel {

    private Sistema sistema;
    private JFrame ventana;
    private ArrayList<Administrador> administradores= new ArrayList<Administrador>();
    private boolean inicioSesion=false;
    
    public PanelValidacionAdministrador(Sistema unSistema, JFrame unaVentana) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
    }

    public boolean inicioSesion(){
        return inicioSesion;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        etiquetaTituloProf = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        brnRegistrarme = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblAdministrador = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1147, 784));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Contraseña");

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtContraseña.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        etiquetaTituloProf.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTituloProf.setForeground(new java.awt.Color(255, 0, 102));
        etiquetaTituloProf.setText("Inicio sesion administrador");

        btnIniciarSesion.setBackground(new java.awt.Color(255, 0, 102));
        btnIniciarSesion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnIniciarSesion.setText("Iniciar sesion");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        brnRegistrarme.setBackground(new java.awt.Color(255, 0, 102));
        brnRegistrarme.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        brnRegistrarme.setText("Registrarme");
        brnRegistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnRegistrarmeActionPerformed(evt);
            }
        });

        lblUsuario.setText("jLabel3");

        lblContraseña.setText("jLabel3");

        lblAdministrador.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(txtUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblContraseña)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(246, 246, 246)
                            .addComponent(brnRegistrarme)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIniciarSesion))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(273, 273, 273)
                            .addComponent(etiquetaTituloProf)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(lblAdministrador)))
                .addContainerGap(448, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTituloProf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblUsuario)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(lblContraseña)))
                .addGap(33, 33, 33)
                .addComponent(lblAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brnRegistrarme)
                    .addComponent(btnIniciarSesion))
                .addGap(281, 281, 281))
        );

        jLabel2.getAccessibleContext().setAccessibleDescription("");
        txtUsuario.getAccessibleContext().setAccessibleName("txtUsuario");
        txtContraseña.getAccessibleContext().setAccessibleName("txtContraseña");
        btnIniciarSesion.getAccessibleContext().setAccessibleName("btnIniciarSesion");
        brnRegistrarme.getAccessibleContext().setAccessibleName("btnRegistrarme");
    }// </editor-fold>//GEN-END:initComponents

    private void brnRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnRegistrarmeActionPerformed
        String usuario = txtUsuario.getText();
        String contraseña=txtContraseña.getText();
        if(usuario==""){
            lblUsuario.setText("El usuario no puede ser vacio");
        }
        else if(contraseña==""){
            lblContraseña.setText("La contraseña no puede ser vacia");
        }
        else{
            Administrador nuevoAdministrador= new Administrador(usuario,contraseña);           
            if(sistema.getListaAdministradores().contains(nuevoAdministrador)){
             lblAdministrador.setText("ya estas registrado en el sistema presiona iniiar sesion");
            }
            else{
              sistema.getListaAdministradores().add(nuevoAdministrador);
             lblAdministrador.setText("registrado exitosamente");             
            }       
        }
    }//GEN-LAST:event_brnRegistrarmeActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String usuario = txtUsuario.getText();
        String contraseña=txtContraseña.getText();
        if(usuario==""){
            lblUsuario.setText("El usuario no puede ser vacio");
        }
        else if(contraseña==""){
            lblContraseña.setText("La contraseña no puede ser vacia");
        }
        else{
            Administrador nuevoAdministrador= new Administrador(usuario,contraseña);           
            if(sistema.getListaAdministradores().contains(nuevoAdministrador)){
                this.inicioSesion=true;
            
            }
            else{
             lblAdministrador.setText("Administrador no registrado en el sistema");             
            }       
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnRegistrarme;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel etiquetaTituloProf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAdministrador;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
