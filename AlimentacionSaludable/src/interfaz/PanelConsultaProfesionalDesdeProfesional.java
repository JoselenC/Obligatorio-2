package interfaz;

import dominio.Mensaje;
import dominio.Sistema;
import javax.swing.JFrame;

public class PanelConsultaProfesionalDesdeProfesional extends javax.swing.JPanel {

    private Sistema sistema;
    private InterfazBotonesProfesional interfaz;
    private JFrame ventana;
    private Mensaje mensajeSeleccionado;

    public PanelConsultaProfesionalDesdeProfesional(Sistema unSistema,
            InterfazBotonesProfesional interfazActual, JFrame unaVentana) {
        initComponents();
        sistema = unSistema;
        interfaz = interfazActual;
        ventana = unaVentana;
        listaMensajes.setListData(interfaz.getUsuarioActivo().getCasillaDeEntrada().toArray());
        textoLeerMensaje.setEditable(false);
        mensajeSeleccionado = null;
        if(sistema.getUsuarios().size()<1){
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
        etiquetaBandejaDeEntrada = new javax.swing.JLabel();
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
        btnRedactar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedactarActionPerformed(evt);
            }
        });
        panelConsultaProf.add(btnRedactar);
        btnRedactar.setBounds(670, 530, 140, 37);

        textoLeerMensaje.setColumns(20);
        textoLeerMensaje.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textoLeerMensaje.setRows(5);
        jScrollPane1.setViewportView(textoLeerMensaje);

        panelConsultaProf.add(jScrollPane1);
        jScrollPane1.setBounds(50, 160, 547, 347);

        listaMensajes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listaMensajes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaMensajesValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaMensajes);

        panelConsultaProf.add(jScrollPane2);
        jScrollPane2.setBounds(628, 160, 390, 350);

        btnBorrarCons.setBackground(new java.awt.Color(102, 102, 102));
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
        btnBorrarCons.setBounds(820, 530, 110, 37);

        etiquetaBandejaDeEntrada.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaBandejaDeEntrada.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaBandejaDeEntrada.setText("Bandeja de entrada");
        panelConsultaProf.add(etiquetaBandejaDeEntrada);
        etiquetaBandejaDeEntrada.setBounds(710, 120, 220, 30);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelConsultaProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelConsultaProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRedactarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedactarActionPerformed
        ventana.remove(this);
        PanelRedactarConsultaDesdeProfesional nuevo = new PanelRedactarConsultaDesdeProfesional(sistema, interfaz, ventana);
        interfaz.setActual(nuevo);
        ventana.add(nuevo);
        ventana.pack();
    }//GEN-LAST:event_btnRedactarActionPerformed

     public void mensjSeleccionado(){
         mensajeSeleccionado = (Mensaje) listaMensajes.getSelectedValue();
    }
    
    private void listaMensajesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaMensajesValueChanged
        mensjSeleccionado();
        if (mensajeSeleccionado != null) {
            textoLeerMensaje.setText(mensajeSeleccionado.getTextoMensaje());
        }
    }//GEN-LAST:event_listaMensajesValueChanged

   
    private void btnBorrarConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarConsActionPerformed
        if (mensajeSeleccionado != null) {
            mensjSeleccionado();
            textoLeerMensaje.setText("");
            interfaz.getUsuarioActivo().getCasillaDeEntrada().remove(mensajeSeleccionado);
            mensajeSeleccionado = null;
            listaMensajes.setListData(interfaz.getUsuarioActivo().getCasillaDeEntrada().toArray());
        }
    }//GEN-LAST:event_btnBorrarConsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarCons;
    private javax.swing.JButton btnRedactar;
    private javax.swing.JLabel etiquetaBandejaDeEntrada;
    private javax.swing.JLabel etiquetaTituloConsultas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaMensajes;
    private javax.swing.JPanel panelConsultaProf;
    private javax.swing.JTextArea textoLeerMensaje;
    // End of variables declaration//GEN-END:variables
}
