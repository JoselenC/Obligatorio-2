package interfaz;

import dominio.Alimento;
import dominio.PlanDeAlimentacion;
import dominio.Sistema;
import dominio.Usuario;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelAgregarComidasAPlan extends javax.swing.JPanel {

    private Sistema sistema;
    private InterfazBotonesProfesional interfaz;
    private JFrame ventana;
    private Usuario usuarioAModificar;
    private ArrayList<Alimento> listaAModificar;
    private PlanDeAlimentacion plan;

    public PanelAgregarComidasAPlan(Sistema unSistema,
            InterfazBotonesProfesional unaInterfaz,
            JFrame unaVentana,
            ArrayList<Alimento> unaLista,
            PlanDeAlimentacion unPlan,
            Usuario unUsuario) {
        initComponents();
        sistema = unSistema;
        interfaz = unaInterfaz;
        ventana = unaVentana;
        ventana.pack();
        usuarioAModificar = unUsuario;
        listaAModificar = unaLista;
        plan = unPlan;
        
        listaComidas.setListData(sistema.getAlimentos().toArray());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaComidas = new javax.swing.JList();
        btnAgregarComida = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(229, 229, 240));
        setPreferredSize(new java.awt.Dimension(1147, 784));
        setLayout(null);

        etiquetaTitulo.setBackground(new java.awt.Color(102, 102, 102));
        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaTitulo.setText("Agregar Comidas");
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(380, 20, 290, 50);

        listaComidas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(listaComidas);

        add(jScrollPane1);
        jScrollPane1.setBounds(350, 110, 370, 410);

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
        btnAgregarComida.setBounds(420, 540, 210, 37);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        add(btnVolver);
        btnVolver.setBounds(10, 10, 100, 60);

        jPanel1.setBackground(new java.awt.Color(171, 171, 199));
        add(jPanel1);
        jPanel1.setBounds(10, 10, 950, 80);
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarPanel(JPanel nuevaActual) {
        ventana.remove(this);
        interfaz.setActual(nuevaActual);
        ventana.add(nuevaActual);
        ventana.pack();
    }

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        PanelRealizarPlanAlimentacion nuevaActual = new PanelRealizarPlanAlimentacion(sistema, interfaz, ventana, usuarioAModificar, plan);
        cambiarPanel(nuevaActual);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComidaActionPerformed

        Alimento alimentoAAgregar = (Alimento) listaComidas.getSelectedValue();
        if (alimentoAAgregar != null) {
            listaAModificar.add(alimentoAAgregar);
            JOptionPane.showMessageDialog(null, "Se agrego correctamete la comida");
            PanelRealizarPlanAlimentacion nuevaActual = new PanelRealizarPlanAlimentacion(sistema, interfaz, ventana, usuarioAModificar, plan);
            cambiarPanel(nuevaActual);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una comida para agregar");
        }
    }//GEN-LAST:event_btnAgregarComidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarComida;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaComidas;
    // End of variables declaration//GEN-END:variables
}
