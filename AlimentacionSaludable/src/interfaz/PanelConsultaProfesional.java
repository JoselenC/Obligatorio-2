package interfaz;

import dominio.Sistema;
import javax.swing.JFrame;
import dominio.Mensaje;
import javax.swing.JOptionPane;

public class PanelConsultaProfesional extends javax.swing.JPanel {

    //Atrubutos
    private Sistema sistema;
    private InterfazBotonesUsuario interfaz;
    private JFrame ventana;
    private Mensaje mensajeSeleccionado;

    //Constructor
    public PanelConsultaProfesional(Sistema unSistema,
            InterfazBotonesUsuario interfazActual, JFrame unaVentana) {
        initComponents();
        sistema = unSistema;
        interfaz = interfazActual;
        ventana = unaVentana;
        ventana.pack();
        listaMensajes.setListData(interfaz.getUsuarioActual().getCasillaDeEntrada().toArray());
        if (interfaz.getUsuarioActual().getCasillaDeEntrada().size() > 0) {
            listaMensajes.setSelectedIndex(0);
        }
        mensajeSeleccionado = null;
        textoLeerMensaje.setEditable(false);
        if(sistema.getProfesionales().size()<1){
            btnRedactar.setEnabled(false);
        }
        lblUsuario.setText(interfaz.getUsuarioActual().getNombre()+ " "+ interfaz.getUsuarioActual().getApellidos());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelConsultaProf = new javax.swing.JPanel();
        btnRedactar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoLeerMensaje = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaMensajes = new javax.swing.JList();
        btnBorrarCons = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        etiquetaBandejaDeEntrada = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        etiquetaTituloConsultas = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1147, 784));

        panelConsultaProf.setBackground(new java.awt.Color(229, 229, 240));
        panelConsultaProf.setPreferredSize(new java.awt.Dimension(1147, 784));
        panelConsultaProf.setLayout(null);

        btnRedactar.setBackground(new java.awt.Color(102, 102, 102));
        btnRedactar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRedactar.setForeground(new java.awt.Color(255, 255, 255));
        btnRedactar.setText("Redactar");
        btnRedactar.setContentAreaFilled(false);
        btnRedactar.setOpaque(true);
        btnRedactar.setPreferredSize(new java.awt.Dimension(99, 37));
        btnRedactar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedactarActionPerformed(evt);
            }
        });
        panelConsultaProf.add(btnRedactar);
        btnRedactar.setBounds(540, 540, 130, 37);

        textoLeerMensaje.setColumns(20);
        textoLeerMensaje.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textoLeerMensaje.setRows(5);
        jScrollPane1.setViewportView(textoLeerMensaje);

        panelConsultaProf.add(jScrollPane1);
        jScrollPane1.setBounds(60, 160, 440, 370);

        listaMensajes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listaMensajes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                listaMensajesFocusGained(evt);
            }
        });
        listaMensajes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaMensajesValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaMensajes);

        panelConsultaProf.add(jScrollPane2);
        jScrollPane2.setBounds(530, 160, 280, 360);

        btnBorrarCons.setBackground(new java.awt.Color(102, 102, 102));
        btnBorrarCons.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnBorrarCons.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarCons.setText("Borrar");
        btnBorrarCons.setContentAreaFilled(false);
        btnBorrarCons.setMaximumSize(new java.awt.Dimension(127, 37));
        btnBorrarCons.setMinimumSize(new java.awt.Dimension(127, 37));
        btnBorrarCons.setOpaque(true);
        btnBorrarCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarConsActionPerformed(evt);
            }
        });
        panelConsultaProf.add(btnBorrarCons);
        btnBorrarCons.setBounds(690, 540, 110, 37);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUsuario.setText("jLabel1");
        panelConsultaProf.add(lblUsuario);
        lblUsuario.setBounds(890, 210, 200, 20);

        etiquetaBandejaDeEntrada.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaBandejaDeEntrada.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaBandejaDeEntrada.setText("Bandeja de entrada");
        panelConsultaProf.add(etiquetaBandejaDeEntrada);
        etiquetaBandejaDeEntrada.setBounds(540, 120, 210, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images 1.png"))); // NOI18N
        panelConsultaProf.add(jLabel3);
        jLabel3.setBounds(880, 10, 188, 189);

        jPanel1.setBackground(new java.awt.Color(137, 137, 161));

        etiquetaTituloConsultas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTituloConsultas.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaTituloConsultas.setText("Consultas a Profesionales");
        jPanel1.add(etiquetaTituloConsultas);

        panelConsultaProf.add(jPanel1);
        jPanel1.setBounds(0, 0, 1130, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelConsultaProf, javax.swing.GroupLayout.PREFERRED_SIZE, 1186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(panelConsultaProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRedactarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedactarActionPerformed
        ventana.remove(this);
        PanelRedactarConsulta nuevo = new PanelRedactarConsulta(sistema, interfaz, ventana);
        interfaz.setActual(nuevo);
        ventana.add(nuevo);
        ventana.pack();
    }//GEN-LAST:event_btnRedactarActionPerformed

    private void listaMensajesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listaMensajesFocusGained

    }//GEN-LAST:event_listaMensajesFocusGained

    private void btnBorrarConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarConsActionPerformed
        if (mensajeSeleccionado != null) {
            mensajeSeleccionado = (Mensaje) listaMensajes.getSelectedValue();
            textoLeerMensaje.setText("");
            interfaz.getUsuarioActual().getCasillaDeEntrada().remove(mensajeSeleccionado);
            mensajeSeleccionado = null;
            listaMensajes.setListData(interfaz.getUsuarioActual().getCasillaDeEntrada().toArray());
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccione una consulta para borrar");
        }
    }//GEN-LAST:event_btnBorrarConsActionPerformed

    private void listaMensajesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaMensajesValueChanged
        mensajeSeleccionado = (Mensaje) listaMensajes.getSelectedValue();
        if (mensajeSeleccionado != null) {
            String textoMensaje = mensajeSeleccionado.getMensaje();
            textoLeerMensaje.setText(textoMensaje);
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccione una consulta");
        }
    }//GEN-LAST:event_listaMensajesValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarCons;
    private javax.swing.JButton btnRedactar;
    private javax.swing.JLabel etiquetaBandejaDeEntrada;
    private javax.swing.JLabel etiquetaTituloConsultas;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JList listaMensajes;
    private javax.swing.JPanel panelConsultaProf;
    private javax.swing.JTextArea textoLeerMensaje;
    // End of variables declaration//GEN-END:variables
}
