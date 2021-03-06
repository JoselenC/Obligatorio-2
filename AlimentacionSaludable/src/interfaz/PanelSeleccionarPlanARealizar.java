package interfaz;


import dominio.Sistema;
import dominio.Usuario;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PanelSeleccionarPlanARealizar extends javax.swing.JPanel {

    private Sistema sistema;
    private JFrame ventana;
    private InterfazBotonesProfesional interfaz;

    public PanelSeleccionarPlanARealizar(Sistema unSistema,
            InterfazBotonesProfesional unaInterfaz,
            JFrame unaVentana) {
        initComponents();
        interfaz = unaInterfaz;
        sistema = unSistema;
        ventana = unaVentana;
        ventana.pack();
        listaUsuarios.setListData(listaConPlanARealizar().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaUsuarios = new javax.swing.JList();
        btnRealizarPlan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(229, 229, 240));
        setPreferredSize(new java.awt.Dimension(1147, 784));
        setLayout(null);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaTitulo.setText("Seleccionar Plan de Alimentacion a Realizar");
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(190, 20, 710, 40);

        listaUsuarios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(listaUsuarios);

        add(jScrollPane1);
        jScrollPane1.setBounds(340, 120, 410, 410);

        btnRealizarPlan.setBackground(new java.awt.Color(102, 102, 102));
        btnRealizarPlan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRealizarPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarPlan.setText("Realizar Plan");
        btnRealizarPlan.setContentAreaFilled(false);
        btnRealizarPlan.setOpaque(true);
        btnRealizarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPlanActionPerformed(evt);
            }
        });
        add(btnRealizarPlan);
        btnRealizarPlan.setBounds(610, 540, 180, 40);

        jPanel1.setBackground(new java.awt.Color(171, 171, 199));
        add(jPanel1);
        jPanel1.setBounds(10, 10, 1080, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPlanActionPerformed
        if (listaUsuarios.getSelectedValue() != null) {
            if (sistema.getAlimentos().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay alimentos registrados en el sistema que permitan realizar el plan");
            } else {
                Usuario usuarioAModificar = sistema.getUsuarios().get(listaUsuarios.getSelectedIndex());
                ventana.remove(this);
                PanelRealizarPlanAlimentacion nuevo = new PanelRealizarPlanAlimentacion(sistema, interfaz, ventana, usuarioAModificar);
                interfaz.setActual(nuevo);
                ventana.add(nuevo);
                ventana.pack();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un usuario para realizar el plan");
        }
    }//GEN-LAST:event_btnRealizarPlanActionPerformed

    ArrayList<Usuario> listaConPlanARealizar() {
        ArrayList<Usuario> retorno = new ArrayList<>();
        for (int i = 0; i < sistema.getUsuarios().size(); i++) {
            if (sistema.getUsuarios().get(i).isNecesitoPlan() && sistema.getUsuarios().get(i).getProfesionalAsignado().equals(interfaz.getUsuarioActivo())) {
                retorno.add(sistema.getUsuarios().get(i));
            }
        }
        return retorno;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRealizarPlan;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaUsuarios;
    // End of variables declaration//GEN-END:variables
}
