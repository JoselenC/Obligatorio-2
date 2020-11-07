package interfaz;

import dominio.Sistema;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class PanelHomeUsuario extends javax.swing.JPanel {

    //Atrubutos
    private Sistema sistema;
    private InterfazBotonesUsuario interfaz;
    private JFrame ventana;

    //Constructor
    public PanelHomeUsuario(Sistema unSistema, InterfazBotonesUsuario unaInterfaz, JFrame unaVentana) {
        initComponents();
        sistema = unSistema;
        interfaz = unaInterfaz;
        ventana = unaVentana;
        listaComidasPlan.setListData(interfaz.getUsuarioActual().getPlan().getListaLunes().toArray());
        lblUsuario.setText(interfaz.getUsuarioActual().getNombre()+ " "+ interfaz.getUsuarioActual().getApellidos());       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaComidasPlan = new javax.swing.JList();
        listaDiasDeLaSemana = new javax.swing.JComboBox<>();
        etiquetaComidasDelDia = new javax.swing.JLabel();
        btnHistorialDeComidas = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(229, 229, 240));
        setPreferredSize(new java.awt.Dimension(1147, 784));
        setLayout(null);

        listaComidasPlan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(listaComidasPlan);

        add(jScrollPane1);
        jScrollPane1.setBounds(200, 210, 400, 390);

        listaDiasDeLaSemana.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listaDiasDeLaSemana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" }));
        listaDiasDeLaSemana.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaDiasDeLaSemanaItemStateChanged(evt);
            }
        });
        listaDiasDeLaSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDiasDeLaSemanaActionPerformed(evt);
            }
        });
        add(listaDiasDeLaSemana);
        listaDiasDeLaSemana.setBounds(30, 210, 139, 35);

        etiquetaComidasDelDia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaComidasDelDia.setText("Comidas del dia:");
        add(etiquetaComidasDelDia);
        etiquetaComidasDelDia.setBounds(30, 160, 180, 29);

        btnHistorialDeComidas.setBackground(new java.awt.Color(102, 102, 102));
        btnHistorialDeComidas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnHistorialDeComidas.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorialDeComidas.setText("Historial de Comidas");
        btnHistorialDeComidas.setContentAreaFilled(false);
        btnHistorialDeComidas.setOpaque(true);
        btnHistorialDeComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialDeComidasActionPerformed(evt);
            }
        });
        add(btnHistorialDeComidas);
        btnHistorialDeComidas.setBounds(280, 160, 250, 37);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUsuario.setText("jLabel2");
        add(lblUsuario);
        lblUsuario.setBounds(700, 220, 240, 30);

        jPanel1.setBackground(new java.awt.Color(137, 137, 161));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Panel Home");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel1);

        add(jPanel1);
        jPanel1.setBounds(10, 10, 1130, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images 1.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(740, 20, 188, 189);
    }// </editor-fold>//GEN-END:initComponents

    private void listaDiasDeLaSemanaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaDiasDeLaSemanaItemStateChanged
        if (interfaz.getUsuarioActual().getPlan() != null) {
            actualizarLista();
        }
    }//GEN-LAST:event_listaDiasDeLaSemanaItemStateChanged

    private void btnHistorialDeComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialDeComidasActionPerformed
        ventana.remove(this);
        PanelHistorialDeComidasUsuario nuevo = new PanelHistorialDeComidasUsuario(sistema, ventana, interfaz);
        interfaz.setActual(nuevo);
        ventana.add(nuevo);
        ventana.pack();
    }//GEN-LAST:event_btnHistorialDeComidasActionPerformed

    private void listaDiasDeLaSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDiasDeLaSemanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaDiasDeLaSemanaActionPerformed

    void actualizarLista() {
        if (listaDiasDeLaSemana.getSelectedItem().equals("lunes")) {
            listaComidasPlan.setListData(interfaz.getUsuarioActual().getPlan().getListaLunes().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("martes")) {
            listaComidasPlan.setListData(interfaz.getUsuarioActual().getPlan().getListaMartes().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("miercoles")) {
            listaComidasPlan.setListData(interfaz.getUsuarioActual().getPlan().getListaMiercoles().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("jueves")) {
            listaComidasPlan.setListData(interfaz.getUsuarioActual().getPlan().getListaJueves().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("viernes")) {
            listaComidasPlan.setListData(interfaz.getUsuarioActual().getPlan().getListaViernes().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("sabado")) {
            listaComidasPlan.setListData(interfaz.getUsuarioActual().getPlan().getListaSabado().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("domingo")) {
            listaComidasPlan.setListData(interfaz.getUsuarioActual().getPlan().getListaDomingo().toArray());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistorialDeComidas;
    private javax.swing.JLabel etiquetaComidasDelDia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JList listaComidasPlan;
    private javax.swing.JComboBox<String> listaDiasDeLaSemana;
    // End of variables declaration//GEN-END:variables
}
