package interfaz;

import dominio.ComidaPorDia;
import dominio.Sistema;
import javax.swing.JFrame;

public class PanelVerHistorialUsuario extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private JFrame ventana;
    private InterfazBotonesUsuario interfaz;
    private ComidaPorDia comidaActiva;

    //Constructor
    public PanelVerHistorialUsuario(Sistema unSistema,
            JFrame unaVentana,
            InterfazBotonesUsuario unaInterfaz,
            ComidaPorDia unaComidaPorDia) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        interfaz = unaInterfaz;
        comidaActiva = unaComidaPorDia;
        fecha.setText(comidaActiva.getFecha());
        listaHistorialDeComidas.setListData(comidaActiva.getComidasIngeridas().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaHistorialDeComidas = new javax.swing.JList();
        btnVolver = new javax.swing.JButton();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1147, 784));
        setLayout(null);

        listaHistorialDeComidas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(listaHistorialDeComidas);

        add(jScrollPane1);
        jScrollPane1.setBounds(250, 160, 650, 400);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        add(btnVolver);
        btnVolver.setBounds(20, 10, 130, 60);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 0, 102));
        etiquetaTitulo.setText("Historial de Comidas");
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(400, 20, 360, 40);

        etiquetaFecha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFecha.setText("Fecha de Ingesta:");
        add(etiquetaFecha);
        etiquetaFecha.setBounds(220, 100, 200, 40);

        fecha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        fecha.setText("-");
        add(fecha);
        fecha.setBounds(430, 110, 160, 29);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ventana.remove(this);
        PanelHistorialDeComidasUsuario nuevo = new PanelHistorialDeComidasUsuario(sistema, ventana, interfaz);
        interfaz.setActual(nuevo);
        ventana.add(nuevo);
        ventana.pack();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel fecha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaHistorialDeComidas;
    // End of variables declaration//GEN-END:variables
}
