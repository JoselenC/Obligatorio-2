package interfaz;

import dominio.Alimento;
import dominio.ComidaPorDia;
import dominio.Sistema;
import dominio.Usuario;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JFrame;

public class PanelDietaDiariaUsuario extends javax.swing.JPanel {

    //Atrubutos
    private Sistema sistema;
    private JFrame ventana;
    private InterfazBotonesUsuario interfaz;
    private boolean deboActualizar;

    //Constructor
    public PanelDietaDiariaUsuario(Sistema unSistema,
            JFrame unaVentana,
            InterfazBotonesUsuario unaInterfaz) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        interfaz = unaInterfaz;
        LocalDate diaActual = LocalDate.now();
        interfaz.getUsuarioActual().setFechaUltimaAdicion(diaActual.toString());
        if (interfaz.getUsuarioActual().getHistorialDelDia().getFecha() == null) {
            interfaz.getUsuarioActual().getHistorialDelDia().setFecha(diaActual.toString());
        } else {
            if (!interfaz.getUsuarioActual().getHistorialDelDia().getFecha().equals(interfaz.getUsuarioActual().getFechaUltimaAdicion()) && !interfaz.getUsuarioActual().getHistorialDelDia().getComidasIngeridas().isEmpty()) {
                interfaz.getUsuarioActual().getHistorialComidas().add(interfaz.getUsuarioActual().getHistorialDelDia());
                ComidaPorDia nuevoHistorial = new ComidaPorDia();
                nuevoHistorial.setFecha(diaActual.toString());
                interfaz.getUsuarioActual().setHistorialDelDia(nuevoHistorial);
            }
        }
        listaComidasDiarias.setListData(interfaz.getUsuarioActual().getHistorialDelDia().getComidasIngeridas().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDietaDiaria = new javax.swing.JPanel();
        lstComDiarias = new javax.swing.JScrollPane();
        listaComidasDiarias = new javax.swing.JList();
        etiquetaTituloAlim = new javax.swing.JLabel();
        etiquetaBtnAgregarComidas = new javax.swing.JButton();
        etiquetaBtnQuitarComida = new javax.swing.JButton();

        panelDietaDiaria.setBackground(new java.awt.Color(255, 255, 255));
        panelDietaDiaria.setPreferredSize(new java.awt.Dimension(1147, 784));
        panelDietaDiaria.setLayout(null);

        listaComidasDiarias.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lstComDiarias.setViewportView(listaComidasDiarias);

        panelDietaDiaria.add(lstComDiarias);
        lstComDiarias.setBounds(370, 160, 330, 410);

        etiquetaTituloAlim.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTituloAlim.setForeground(new java.awt.Color(255, 0, 102));
        etiquetaTituloAlim.setText("Comidas Ingeridas Diarias");
        panelDietaDiaria.add(etiquetaTituloAlim);
        etiquetaTituloAlim.setBounds(330, 10, 440, 44);

        etiquetaBtnAgregarComidas.setBackground(new java.awt.Color(255, 0, 102));
        etiquetaBtnAgregarComidas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaBtnAgregarComidas.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaBtnAgregarComidas.setText("Agregar Comida");
        etiquetaBtnAgregarComidas.setContentAreaFilled(false);
        etiquetaBtnAgregarComidas.setOpaque(true);
        etiquetaBtnAgregarComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiquetaBtnAgregarComidasActionPerformed(evt);
            }
        });
        panelDietaDiaria.add(etiquetaBtnAgregarComidas);
        etiquetaBtnAgregarComidas.setBounds(550, 110, 210, 37);

        etiquetaBtnQuitarComida.setBackground(new java.awt.Color(255, 0, 102));
        etiquetaBtnQuitarComida.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaBtnQuitarComida.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaBtnQuitarComida.setText("Quitar Comdia");
        etiquetaBtnQuitarComida.setContentAreaFilled(false);
        etiquetaBtnQuitarComida.setOpaque(true);
        etiquetaBtnQuitarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiquetaBtnQuitarComidaActionPerformed(evt);
            }
        });
        panelDietaDiaria.add(etiquetaBtnQuitarComida);
        etiquetaBtnQuitarComida.setBounds(290, 110, 190, 37);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDietaDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDietaDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void etiquetaBtnQuitarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiquetaBtnQuitarComidaActionPerformed
        if (listaComidasDiarias.getSelectedValue() != null) {
            Alimento alimentoABorrar = (Alimento) listaComidasDiarias.getSelectedValue();
            int diaActual = interfaz.getUsuarioActual().getHistorialComidas().size();
            interfaz.getUsuarioActual().getHistorialDelDia().getComidasIngeridas().remove(alimentoABorrar);
            listaComidasDiarias.setListData(interfaz.getUsuarioActual().getHistorialDelDia().getComidasIngeridas().toArray());
        }
    }//GEN-LAST:event_etiquetaBtnQuitarComidaActionPerformed

    private void etiquetaBtnAgregarComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiquetaBtnAgregarComidasActionPerformed
        ventana.remove(this);
        PanelAgregarComidasADietaDiariaUsuario nuevo = new PanelAgregarComidasADietaDiariaUsuario(sistema, ventana, interfaz);
        interfaz.setActual(nuevo);
        ventana.add(nuevo);
        ventana.pack();
    }//GEN-LAST:event_etiquetaBtnAgregarComidasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton etiquetaBtnAgregarComidas;
    private javax.swing.JButton etiquetaBtnQuitarComida;
    private javax.swing.JLabel etiquetaTituloAlim;
    private javax.swing.JList listaComidasDiarias;
    private javax.swing.JScrollPane lstComDiarias;
    private javax.swing.JPanel panelDietaDiaria;
    // End of variables declaration//GEN-END:variables
}
