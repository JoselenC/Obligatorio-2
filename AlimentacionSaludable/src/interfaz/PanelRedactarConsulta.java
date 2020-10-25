package interfaz;

import dominio.Mensaje;
import dominio.Profesional;
import dominio.Sistema;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;

public class PanelRedactarConsulta extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private InterfazBotonesUsuario interfazUsuario;
    private JFrame ventana;

    //Constructor para usuarios
    public PanelRedactarConsulta(Sistema unSistema,
            InterfazBotonesUsuario interfazActual, JFrame unaVentana) {
        initComponents();
        sistema = unSistema;
        interfazUsuario = interfazActual;
        ventana = unaVentana;
        listaProfConsulta.setModel(new DefaultComboBoxModel(sistema.getListaProfesionales().toArray()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolverConsultas = new javax.swing.JButton();
        etiquetaDestinatarioConsulta = new javax.swing.JLabel();
        listaProfConsulta = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoConsultaAEnviar = new javax.swing.JTextArea();
        btnEnviarConsulta = new javax.swing.JButton();
        cajaAsunto = new javax.swing.JTextField();
        etiquetaAsunto = new javax.swing.JLabel();
        etiquetaMensaje = new javax.swing.JLabel();
        etiquetaTitulo = new javax.swing.JLabel();
        mensajeAlAceptar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1147, 784));
        setLayout(null);

        btnVolverConsultas.setBackground(new java.awt.Color(255, 255, 204));
        btnVolverConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolverConsultas.setBorderPainted(false);
        btnVolverConsultas.setContentAreaFilled(false);
        btnVolverConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverConsultasActionPerformed(evt);
            }
        });
        add(btnVolverConsultas);
        btnVolverConsultas.setBounds(20, 20, 100, 50);

        etiquetaDestinatarioConsulta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaDestinatarioConsulta.setText("Destinatarios:");
        add(etiquetaDestinatarioConsulta);
        etiquetaDestinatarioConsulta.setBounds(60, 110, 150, 29);

        listaProfConsulta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listaProfConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaProfConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaProfConsultaActionPerformed(evt);
            }
        });
        add(listaProfConsulta);
        listaProfConsulta.setBounds(230, 110, 190, 35);

        textoConsultaAEnviar.setColumns(20);
        textoConsultaAEnviar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textoConsultaAEnviar.setRows(5);
        jScrollPane1.setViewportView(textoConsultaAEnviar);

        add(jScrollPane1);
        jScrollPane1.setBounds(230, 220, 530, 340);

        btnEnviarConsulta.setBackground(new java.awt.Color(255, 0, 102));
        btnEnviarConsulta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEnviarConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarConsulta.setText("Enviar");
        btnEnviarConsulta.setContentAreaFilled(false);
        btnEnviarConsulta.setOpaque(true);
        btnEnviarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarConsultaActionPerformed(evt);
            }
        });
        add(btnEnviarConsulta);
        btnEnviarConsulta.setBounds(730, 580, 140, 37);

        cajaAsunto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaAsunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaAsuntoActionPerformed(evt);
            }
        });
        add(cajaAsunto);
        cajaAsunto.setBounds(230, 170, 530, 35);

        etiquetaAsunto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaAsunto.setText("Asunto:");
        add(etiquetaAsunto);
        etiquetaAsunto.setBounds(130, 170, 100, 26);

        etiquetaMensaje.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaMensaje.setText("Mensaje:");
        add(etiquetaMensaje);
        etiquetaMensaje.setBounds(110, 220, 110, 26);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 0, 102));
        etiquetaTitulo.setText("Redactar Consulta");
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(360, 10, 320, 30);

        mensajeAlAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        add(mensajeAlAceptar);
        mensajeAlAceptar.setBounds(710, 640, 370, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void listaProfConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaProfConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaProfConsultaActionPerformed

    private void btnEnviarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarConsultaActionPerformed
        Mensaje mensajeAEnviar = new Mensaje();
        Profesional destino = (Profesional) listaProfConsulta.getSelectedItem();
        mensajeAEnviar.setOrigen(interfazUsuario.getUsuarioActual());
        mensajeAEnviar.setDestino(destino);
        mensajeAEnviar.setAsunto(cajaAsunto.getText());
        mensajeAEnviar.setMensaje(textoConsultaAEnviar.getText());
        destino.getCasillaDeEntrada().add(mensajeAEnviar);
        mensajeAlAceptar.setText("Se ha enviado la consulta");
    }//GEN-LAST:event_btnEnviarConsultaActionPerformed

    private void btnVolverConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverConsultasActionPerformed
        ventana.remove(this);
        PanelConsultaProfesional nuevo = new PanelConsultaProfesional(sistema, interfazUsuario, ventana);
        interfazUsuario.setActual(nuevo);
        ventana.add(nuevo);
        ventana.pack();
    }//GEN-LAST:event_btnVolverConsultasActionPerformed

    private void cajaAsuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaAsuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaAsuntoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarConsulta;
    private javax.swing.JButton btnVolverConsultas;
    private javax.swing.JTextField cajaAsunto;
    private javax.swing.JLabel etiquetaAsunto;
    private javax.swing.JLabel etiquetaDestinatarioConsulta;
    private javax.swing.JLabel etiquetaMensaje;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> listaProfConsulta;
    private javax.swing.JLabel mensajeAlAceptar;
    private javax.swing.JTextArea textoConsultaAEnviar;
    // End of variables declaration//GEN-END:variables
}
