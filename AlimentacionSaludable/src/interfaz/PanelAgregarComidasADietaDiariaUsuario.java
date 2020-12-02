package interfaz;

import dominio.Alimento;
import dominio.Sistema;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class PanelAgregarComidasADietaDiariaUsuario extends javax.swing.JPanel {

    private Sistema sistema;
    private JFrame ventana;
    private InterfazBotonesUsuario interfaz;

    public PanelAgregarComidasADietaDiariaUsuario(Sistema unSistema,
            JFrame unaVentana, InterfazBotonesUsuario unaInterfaz) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        interfaz = unaInterfaz;        
        listaComidasDiarias.setListData(sistema.getAlimentos().toArray());
        lblUsuario.setText(interfaz.getUsuarioActual().getNombre()+ " "+ interfaz.getUsuarioActual().getApellidos());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaComidasDiarias = new javax.swing.JList();
        etiquetaTitulo = new javax.swing.JLabel();
        btnAgregarComida = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(229, 229, 240));
        setPreferredSize(new java.awt.Dimension(1147, 784));
        setLayout(null);

        listaComidasDiarias.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(listaComidasDiarias);

        add(jScrollPane1);
        jScrollPane1.setBounds(290, 160, 340, 360);

        etiquetaTitulo.setBackground(new java.awt.Color(102, 102, 102));
        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaTitulo.setText("Agregar Comida");
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(340, 40, 270, 50);

        btnAgregarComida.setBackground(new java.awt.Color(102, 102, 102));
        btnAgregarComida.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAgregarComida.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarComida.setText("Agregar Comida");
        btnAgregarComida.setContentAreaFilled(false);
        btnAgregarComida.setOpaque(true);
        btnAgregarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComidaActionPerformed(evt);
            }
        });
        add(btnAgregarComida);
        btnAgregarComida.setBounds(540, 560, 210, 37);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        add(btnVolver);
        btnVolver.setBounds(0, 10, 110, 70);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUsuario.setText("jLabel1");
        add(lblUsuario);
        lblUsuario.setBounds(690, 210, 220, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images 1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(710, 0, 190, 200);

        jPanel1.setBackground(new java.awt.Color(171, 171, 199));
        add(jPanel1);
        jPanel1.setBounds(10, 10, 950, 120);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComidaActionPerformed
        Alimento comidaSeleccionada = (Alimento) listaComidasDiarias.getSelectedValue();
        interfaz.getUsuarioActual().getHistorialComidaDelDia().getComidasIngeridas().add(comidaSeleccionada);
        LocalDate diaActual = LocalDate.now();
        interfaz.getUsuarioActual().setFechaUltimaAdicion(diaActual.toString());
        JOptionPane.showMessageDialog(null, "Se agrego correctamete la comida");
         ventana.remove(this);
        PanelDietaDiariaUsuario nuevo = new PanelDietaDiariaUsuario(sistema, ventana, interfaz);
        interfaz.setActual(nuevo);
        ventana.add(nuevo);
        ventana.setSize(600,600);
        
    }//GEN-LAST:event_btnAgregarComidaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ventana.remove(this);
        PanelDietaDiariaUsuario nuevo = new PanelDietaDiariaUsuario(sistema, ventana, interfaz);
        interfaz.setActual(nuevo);
        ventana.add(nuevo);
        ventana.setSize(600,600);
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarComida;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JList listaComidasDiarias;
    // End of variables declaration//GEN-END:variables
}
