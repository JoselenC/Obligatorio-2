package interfaz;

import dominio.Profesional;
import dominio.Sistema;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PanelPlanAlimentacionUsuario extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private JFrame ventana;
    private InterfazBotonesUsuario interfaz;

    //Constructor
    public PanelPlanAlimentacionUsuario(Sistema unSistema,
            JFrame unaVentana,
            InterfazBotonesUsuario unaInterfaz) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        interfaz = unaInterfaz;
        listaProfesionalesAlim.setModel(new DefaultComboBoxModel(sistema.getListaProfesionales().toArray()));
        lblUsuario.setText(interfaz.getUsuarioActual().getNombre()+ " "+ interfaz.getUsuarioActual().getApellidos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPlan = new javax.swing.JPanel();
        etiquetaProfesionalACargo = new javax.swing.JLabel();
        listaProfesionalesAlim = new javax.swing.JComboBox();
        btnAceptarPlan = new javax.swing.JButton();
        mensajeAlAceptar = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        etiquetaTituloConsultas = new javax.swing.JLabel();

        panelPlan.setBackground(new java.awt.Color(229, 229, 240));
        panelPlan.setPreferredSize(new java.awt.Dimension(1147, 784));
        panelPlan.setLayout(null);

        etiquetaProfesionalACargo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaProfesionalACargo.setText("Profesional a cargo:");
        panelPlan.add(etiquetaProfesionalACargo);
        etiquetaProfesionalACargo.setBounds(110, 290, 220, 29);

        listaProfesionalesAlim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelPlan.add(listaProfesionalesAlim);
        listaProfesionalesAlim.setBounds(360, 290, 360, 37);

        btnAceptarPlan.setBackground(new java.awt.Color(102, 102, 102));
        btnAceptarPlan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAceptarPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarPlan.setText("Aceptar");
        btnAceptarPlan.setContentAreaFilled(false);
        btnAceptarPlan.setOpaque(true);
        btnAceptarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarPlanActionPerformed(evt);
            }
        });
        panelPlan.add(btnAceptarPlan);
        btnAceptarPlan.setBounds(750, 290, 150, 37);

        mensajeAlAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelPlan.add(mensajeAlAceptar);
        mensajeAlAceptar.setBounds(500, 390, 410, 80);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUsuario.setText("jLabel1");
        panelPlan.add(lblUsuario);
        lblUsuario.setBounds(810, 210, 210, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images 1.png"))); // NOI18N
        panelPlan.add(jLabel2);
        jLabel2.setBounds(790, 20, 188, 189);

        jPanel1.setBackground(new java.awt.Color(137, 137, 161));

        etiquetaTituloConsultas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTituloConsultas.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaTituloConsultas.setText("Plan de alimentacion");
        jPanel1.add(etiquetaTituloConsultas);

        panelPlan.add(jPanel1);
        jPanel1.setBounds(0, 0, 1130, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarPlanActionPerformed
        Profesional profesionalActivo = (Profesional) listaProfesionalesAlim.getSelectedItem();
        interfaz.getUsuarioActual().setProfesionalAsignado(profesionalActivo);
        interfaz.getUsuarioActual().setNecesitoPlan(true);
         JOptionPane.showMessageDialog(null, "Se ha pedido el plan de alimentación");
       
    }//GEN-LAST:event_btnAceptarPlanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarPlan;
    private javax.swing.JLabel etiquetaProfesionalACargo;
    private javax.swing.JLabel etiquetaTituloConsultas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JComboBox listaProfesionalesAlim;
    private javax.swing.JLabel mensajeAlAceptar;
    private javax.swing.JPanel panelPlan;
    // End of variables declaration//GEN-END:variables
}
