package interfaz;

import dominio.Alimento;
import dominio.ComidaPorDia;
import dominio.Sistema;
import dominio.Usuario;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PanelDietaDiariaUsuario extends javax.swing.JPanel {

    private Sistema sistema;
    private JFrame ventana;
    private InterfazBotonesUsuario interfaz;

    public PanelDietaDiariaUsuario(Sistema unSistema,
            JFrame unaVentana,
            InterfazBotonesUsuario unaInterfaz) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        interfaz = unaInterfaz;
        LocalDate diaActual = LocalDate.now();
        interfaz.getUsuarioActual().setFechaUltimaAdicion(diaActual.toString());
        if (interfaz.getUsuarioActual().getHistorialComidaDelDia().getFecha() == null) {
            interfaz.getUsuarioActual().getHistorialComidaDelDia().setFecha(diaActual.toString());
        } else {
            if (!interfaz.getUsuarioActual().getHistorialComidaDelDia().getFecha().equals(interfaz.getUsuarioActual().getFechaUltimaAdicion()) && !interfaz.getUsuarioActual().getHistorialComidaDelDia().getComidasIngeridas().isEmpty()) {
                interfaz.getUsuarioActual().getHistorialComidas().add(interfaz.getUsuarioActual().getHistorialComidaDelDia());
                ComidaPorDia nuevoHistorial = new ComidaPorDia();
                nuevoHistorial.setFecha(diaActual.toString());
                interfaz.getUsuarioActual().setHistorialComidaDelDia(nuevoHistorial);
            }
        }
        listaComidasDiarias.setListData(interfaz.getUsuarioActual().getHistorialComidaDelDia().getComidasIngeridas().toArray());
        lblUsuario.setText(interfaz.getUsuarioActual().getNombre()+ " "+ interfaz.getUsuarioActual().getApellidos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDietaDiaria = new javax.swing.JPanel();
        lstComDiarias = new javax.swing.JScrollPane();
        listaComidasDiarias = new javax.swing.JList();
        etiquetaBtnAgregarComidas = new javax.swing.JButton();
        etiquetaBtnQuitarComida = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        etiquetaTituloAlim = new javax.swing.JLabel();

        panelDietaDiaria.setBackground(new java.awt.Color(229, 229, 240));
        panelDietaDiaria.setPreferredSize(new java.awt.Dimension(1147, 784));
        panelDietaDiaria.setLayout(null);

        listaComidasDiarias.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lstComDiarias.setViewportView(listaComidasDiarias);

        panelDietaDiaria.add(lstComDiarias);
        lstComDiarias.setBounds(370, 160, 330, 410);

        etiquetaBtnAgregarComidas.setBackground(new java.awt.Color(102, 102, 102));
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
        etiquetaBtnAgregarComidas.setBounds(140, 170, 210, 37);

        etiquetaBtnQuitarComida.setBackground(new java.awt.Color(102, 102, 102));
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
        etiquetaBtnQuitarComida.setBounds(140, 260, 210, 37);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images 1.png"))); // NOI18N
        panelDietaDiaria.add(jLabel2);
        jLabel2.setBounds(780, 0, 190, 230);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUsuario.setText("jLabel1");
        panelDietaDiaria.add(lblUsuario);
        lblUsuario.setBounds(750, 230, 230, 30);

        jPanel1.setBackground(new java.awt.Color(171, 171, 199));

        etiquetaTituloAlim.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTituloAlim.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaTituloAlim.setText("Comidas Ingeridas Diarias");
        jPanel1.add(etiquetaTituloAlim);

        panelDietaDiaria.add(jPanel1);
        jPanel1.setBounds(10, 10, 950, 120);

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
            interfaz.getUsuarioActual().getHistorialComidaDelDia().getComidasIngeridas().remove(alimentoABorrar);
            listaComidasDiarias.setListData(interfaz.getUsuarioActual().getHistorialComidaDelDia().getComidasIngeridas().toArray());
        }
        else{
             JOptionPane.showMessageDialog(null, "Seleccione una comida para quitar");
        }
    }//GEN-LAST:event_etiquetaBtnQuitarComidaActionPerformed

    private void etiquetaBtnAgregarComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiquetaBtnAgregarComidasActionPerformed
        if(sistema.getAlimentos().isEmpty()){
         JOptionPane.showMessageDialog(null, "No hay alimentos registrados en el sistema");
        }
        else{
        ventana.remove(this);
        PanelAgregarComidasADietaDiariaUsuario nuevo = new PanelAgregarComidasADietaDiariaUsuario(sistema, ventana, interfaz);
        interfaz.setActual(nuevo);
        ventana.add(nuevo);
        ventana.pack();
        }
    }//GEN-LAST:event_etiquetaBtnAgregarComidasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton etiquetaBtnAgregarComidas;
    private javax.swing.JButton etiquetaBtnQuitarComida;
    private javax.swing.JLabel etiquetaTituloAlim;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JList listaComidasDiarias;
    private javax.swing.JScrollPane lstComDiarias;
    private javax.swing.JPanel panelDietaDiaria;
    // End of variables declaration//GEN-END:variables
}
