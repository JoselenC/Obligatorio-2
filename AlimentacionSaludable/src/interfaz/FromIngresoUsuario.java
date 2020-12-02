package interfaz;

import dominio.Profesional;
import dominio.Sistema;
import dominio.Usuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FromIngresoUsuario extends javax.swing.JFrame {

    private Sistema sistema;
    private JFrame ventana;
    String tipo;
    JPanel cambio;

    public FromIngresoUsuario(Sistema unSistema, JFrame unaVentana, String tipoUsuario,JPanel cambioUsuario) {
        initComponents();
        sistema = unSistema;
        this.pack();
        this.setResizable(false);
        this.setLocation(30, 30);
        setLocationRelativeTo(cambioUsuario);
        ventana = unaVentana;
        ventana.pack();
        tipo = tipoUsuario;
        cambio=cambioUsuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaTitulo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        brnInicioSesion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        etiquetaTitulo3 = new javax.swing.JLabel();

        etiquetaTitulo.setBackground(new java.awt.Color(102, 102, 102));
        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaTitulo.setText("Agregar Comidas");

        etiquetaTitulo1.setBackground(new java.awt.Color(102, 102, 102));
        etiquetaTitulo1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo1.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaTitulo1.setText("Agregar Comidas");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(229, 229, 240));
        setPreferredSize(new java.awt.Dimension(400, 215));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        brnInicioSesion.setBackground(new java.awt.Color(102, 102, 102));
        brnInicioSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        brnInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        brnInicioSesion.setText("Iniciar sesion");
        brnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnInicioSesionActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(171, 171, 199));

        etiquetaTitulo3.setBackground(new java.awt.Color(135, 135, 156));
        etiquetaTitulo3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        etiquetaTitulo3.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaTitulo3.setText("Inicio de sesion");
        jPanel2.add(etiquetaTitulo3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 412, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(brnInicioSesion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(brnInicioSesion)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnInicioSesionActionPerformed
        if ("Usuario".equals(tipo)) {
            if(sistema.existeNombreUsuario(txtUsuario.getText())){
            Usuario usuarioSeleccionado = sistema.getUsuarioPorNombre(txtUsuario.getText());           
                ventana.remove(cambio);
                this.setVisible(false);
                InterfazBotonesUsuario nuevaBotonera = new InterfazBotonesUsuario(sistema, ventana, usuarioSeleccionado);
                ventana.pack();
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no esta registrado en el sistema");
            }
        } else {
            Profesional profesionalSeleccionado = sistema.getProfesionalPorNombre(txtUsuario.getText());
            if (sistema.existeNombreProfesional(txtUsuario.getText())) {
                ventana.remove(cambio);
                 this.setVisible(false);
                InterfazBotonesProfesional nuevaBotonera = new InterfazBotonesProfesional(sistema, ventana, profesionalSeleccionado);
                ventana.pack();
            } else {
                JOptionPane.showMessageDialog(null, "Profesional no registrado en el sistema");
            }
        }
    }//GEN-LAST:event_brnInicioSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnInicioSesion;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel etiquetaTitulo1;
    private javax.swing.JLabel etiquetaTitulo3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
