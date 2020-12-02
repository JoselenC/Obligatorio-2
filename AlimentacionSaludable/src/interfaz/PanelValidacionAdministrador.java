package interfaz;

import dominio.Administrador;
import dominio.Sistema;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelValidacionAdministrador extends javax.swing.JFrame {

    private Sistema sistema;
    private ArrayList<Administrador> administradores = new ArrayList<Administrador>();
    private boolean inicioSesion = false;
    private JFrame ventana;
    JPanel cambio;

    public PanelValidacionAdministrador(Sistema unSistema, JFrame unaVentana,JPanel cambioUsuario) {
        initComponents();
        sistema = unSistema;
        this.setSize(500, 250);
        this.setResizable(false);
        setLocationRelativeTo(cambioUsuario);
        ventana = unaVentana;
        cambio=cambioUsuario;
    }

      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        brnRegistrarme = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        etiquetaTituloProf = new javax.swing.JLabel();
        lblUsu = new javax.swing.JLabel();
        lblCon = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();

        setBackground(new java.awt.Color(229, 229, 240));
        setPreferredSize(new java.awt.Dimension(1147, 784));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña");

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnIniciarSesion.setBackground(new java.awt.Color(102, 102, 102));
        btnIniciarSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIniciarSesion.setText("Iniciar sesion");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        brnRegistrarme.setBackground(new java.awt.Color(102, 102, 102));
        brnRegistrarme.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        brnRegistrarme.setText("Registrarme");
        brnRegistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnRegistrarmeActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(171, 171, 199));

        etiquetaTituloProf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaTituloProf.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaTituloProf.setText("Inicio sesion administrador");
        jPanel2.add(etiquetaTituloProf);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(brnRegistrarme)
                        .addGap(84, 84, 84)
                        .addComponent(btnIniciarSesion))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(127, 127, 127)
                                    .addComponent(lblContra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario)
                    .addComponent(lblContraseña))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsuario)
                        .addGap(68, 68, 68)
                        .addComponent(lblContraseña)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(brnRegistrarme)
                            .addComponent(btnIniciarSesion))
                        .addGap(29, 29, 29))))
        );

        jLabel2.getAccessibleContext().setAccessibleDescription("");
        txtUsuario.getAccessibleContext().setAccessibleName("txtUsuario");
        txtContraseña.getAccessibleContext().setAccessibleName("txtContraseña");
        btnIniciarSesion.getAccessibleContext().setAccessibleName("btnIniciarSesion");
        brnRegistrarme.getAccessibleContext().setAccessibleName("btnRegistrarme");
    }// </editor-fold>//GEN-END:initComponents

    private void brnRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnRegistrarmeActionPerformed
        String usuario = txtUsuario.getText();
        String contraseña = txtContraseña.getText();
        if (usuario.equals("")) {
             JOptionPane.showMessageDialog(null,"El usuario no puede ser vacio");
        } else if (contraseña.equals("")) {
             JOptionPane.showMessageDialog(null,"La contraseña no puede ser vacia");
        } 
        else if (contraseña.length()>8){
             JOptionPane.showMessageDialog(null,"La contraseña no puede tener mas de 8 caracteres");
        }
        else {
            Administrador nuevoAdministrador = new Administrador(usuario, contraseña);
            if (sistema.getListaAdministradores().contains(nuevoAdministrador)) {
                JOptionPane.showMessageDialog(null, "El administrador ya esta registrado en el sistema, presiona iniciar sesion");
            } else {
                sistema.getListaAdministradores().add(nuevoAdministrador);
                JOptionPane.showMessageDialog(null, "Registrado exitosamente");
                this.setVisible(false);
                
            }
        }
    }//GEN-LAST:event_brnRegistrarmeActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String usuario = txtUsuario.getText();
        String contraseña = txtContraseña.getText();
        if ("".equals(usuario)) {
            lblUsu.setText("El usuario no puede ser vacio");
        } else if ("".equals(contraseña)) {
            lblCon.setText("La contraseña no puede ser vacia");
        } else {
            Administrador nuevoAdministrador = new Administrador(usuario, contraseña);
            if (sistema.getListaAdministradores().contains(nuevoAdministrador)) {
                this.setVisible(false);
                ventana.remove(cambio);
                InterfazBotonesAdministrador nuevaBotonera = new InterfazBotonesAdministrador(sistema, ventana);
                ventana.pack();
            } else {
                JOptionPane.showMessageDialog(null, "Administrador no registrado en el sistema");

            }
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnRegistrarme;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel etiquetaTituloProf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCon;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUsu;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
