package interfaz;

import dominio.Sistema;
import javax.swing.JFrame;
import dominio.Mensaje;

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
        listaMensajes.setListData(interfaz.getUsuarioActual().getCasillaDeEntrada().toArray());
        if (interfaz.getUsuarioActual().getCasillaDeEntrada().size() > 0) {
            listaMensajes.setSelectedIndex(0);
        }
        mensajeSeleccionado = null;
        textoLeerMensaje.setEditable(false);
        if(sistema.getListaProfesionales().size()<1){
            btnRedactar.setEnabled(false);
        }
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
        etiquetaTituloConsultas = new javax.swing.JLabel();
        etiquetaBandejaDeEntrada = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1147, 784));

        panelConsultaProf.setBackground(new java.awt.Color(255, 255, 255));
        panelConsultaProf.setPreferredSize(new java.awt.Dimension(1147, 784));
        panelConsultaProf.setLayout(null);

        btnRedactar.setBackground(new java.awt.Color(255, 0, 102));
        btnRedactar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRedactar.setForeground(new java.awt.Color(255, 255, 255));
        btnRedactar.setText("Redactar");
        btnRedactar.setContentAreaFilled(false);
        btnRedactar.setOpaque(true);
        btnRedactar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedactarActionPerformed(evt);
            }
        });
        panelConsultaProf.add(btnRedactar);
        btnRedactar.setBounds(710, 530, 130, 37);

        textoLeerMensaje.setColumns(20);
        textoLeerMensaje.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textoLeerMensaje.setRows(5);
        jScrollPane1.setViewportView(textoLeerMensaje);

        panelConsultaProf.add(jScrollPane1);
        jScrollPane1.setBounds(60, 160, 547, 347);

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
        jScrollPane2.setBounds(710, 160, 280, 350);

        btnBorrarCons.setBackground(new java.awt.Color(255, 0, 102));
        btnBorrarCons.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnBorrarCons.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarCons.setText("Borrar");
        btnBorrarCons.setContentAreaFilled(false);
        btnBorrarCons.setOpaque(true);
        btnBorrarCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarConsActionPerformed(evt);
            }
        });
        panelConsultaProf.add(btnBorrarCons);
        btnBorrarCons.setBounds(880, 530, 110, 37);

        etiquetaTituloConsultas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTituloConsultas.setForeground(new java.awt.Color(255, 0, 102));
        etiquetaTituloConsultas.setText("Consultas a Profesionales");
        panelConsultaProf.add(etiquetaTituloConsultas);
        etiquetaTituloConsultas.setBounds(340, 10, 420, 40);

        etiquetaBandejaDeEntrada.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaBandejaDeEntrada.setText("Bandeja de entrada");
        panelConsultaProf.add(etiquetaBandejaDeEntrada);
        etiquetaBandejaDeEntrada.setBounds(720, 120, 210, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConsultaProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }//GEN-LAST:event_btnBorrarConsActionPerformed

    private void listaMensajesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaMensajesValueChanged
        mensajeSeleccionado = (Mensaje) listaMensajes.getSelectedValue();
        if (mensajeSeleccionado != null) {
            String textoMensaje = mensajeSeleccionado.getMensaje();
            textoLeerMensaje.setText(textoMensaje);
        }
    }//GEN-LAST:event_listaMensajesValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarCons;
    private javax.swing.JButton btnRedactar;
    private javax.swing.JLabel etiquetaBandejaDeEntrada;
    private javax.swing.JLabel etiquetaTituloConsultas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaMensajes;
    private javax.swing.JPanel panelConsultaProf;
    private javax.swing.JTextArea textoLeerMensaje;
    // End of variables declaration//GEN-END:variables
}
