package interfaz;

import dominio.ComidaPorDia;
import dominio.Sistema;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PanelHistorialDeComidasUsuario extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private JFrame ventana;
    private InterfazBotonesUsuario interfaz;

    //Constructor
    public PanelHistorialDeComidasUsuario(Sistema unSistema,
            JFrame unaVentana,
            InterfazBotonesUsuario unaInterfaz) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        ventana.pack();
        interfaz = unaInterfaz;
        listaHistorialDeComidas.setListData(interfaz.getUsuarioActual().getHistorialComidas().toArray());
        lblUsuario.setText(interfaz.getUsuarioActual().getNombre()+ " "+ interfaz.getUsuarioActual().getApellidos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaHistorialDeComidas = new javax.swing.JList();
        btnVerHistorial = new javax.swing.JButton();
        etiquetaTitulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(229, 229, 240));
        setPreferredSize(new java.awt.Dimension(1147, 784));
        setLayout(null);

        listaHistorialDeComidas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(listaHistorialDeComidas);

        add(jScrollPane1);
        jScrollPane1.setBounds(360, 130, 440, 400);

        btnVerHistorial.setBackground(new java.awt.Color(102, 102, 102));
        btnVerHistorial.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnVerHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnVerHistorial.setText("Ver Historial");
        btnVerHistorial.setContentAreaFilled(false);
        btnVerHistorial.setOpaque(true);
        btnVerHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerHistorialActionPerformed(evt);
            }
        });
        add(btnVerHistorial);
        btnVerHistorial.setBounds(500, 550, 170, 37);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(102, 102, 102));
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(380, 10, 330, 40);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        add(btnVolver);
        btnVolver.setBounds(20, 0, 100, 60);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUsuario.setText("jLabel1");
        add(lblUsuario);
        lblUsuario.setBounds(880, 220, 210, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images 1.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(870, 20, 188, 189);

        jPanel1.setBackground(new java.awt.Color(137, 137, 161));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Historial de Comidas");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel1);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1130, 90);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerHistorialActionPerformed
        ComidaPorDia comidaSeleccionada = (ComidaPorDia) listaHistorialDeComidas.getSelectedValue();
        if (comidaSeleccionada != null) {
            ventana.remove(this);
            PanelVerHistorialUsuario nuevo = new PanelVerHistorialUsuario(sistema, ventana, interfaz, comidaSeleccionada);
            interfaz.setActual(nuevo);
            ventana.add(nuevo);
            ventana.pack();
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccione una comida");
        }
    }//GEN-LAST:event_btnVerHistorialActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ventana.remove(this);
        PanelHomeUsuario nuevo = new PanelHomeUsuario(sistema, interfaz, ventana);
        interfaz.setActual(nuevo);
        ventana.add(nuevo);
        ventana.pack();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerHistorial;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JList listaHistorialDeComidas;
    // End of variables declaration//GEN-END:variables
}
