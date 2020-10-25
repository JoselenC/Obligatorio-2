package interfaz;

import dominio.Alimento;
import dominio.PlanDeAlimentacion;
import dominio.Sistema;
import dominio.Usuario;
import java.util.ArrayList;
import javax.swing.JFrame;

public class PanelRealizarPlanAlimentacion extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private InterfazBotonesProfesional interfaz;
    private JFrame ventana;
    private Usuario usuarioAModificar;
    private PlanDeAlimentacion nuevoPlan;

    //Constructor
    public PanelRealizarPlanAlimentacion(Sistema unSistema,
            InterfazBotonesProfesional unaInterfaz,
            JFrame unaVentana,
            Usuario unUsuario) {
        initComponents();
        sistema = unSistema;
        interfaz = unaInterfaz;
        ventana = unaVentana;
        usuarioAModificar = unUsuario;
        nuevoPlan = new PlanDeAlimentacion(usuarioAModificar);
        listaComidasDiarias.setListData(nuevoPlan.getListaLunes().toArray());
    }

    //Constructor
    public PanelRealizarPlanAlimentacion(Sistema unSistema,
            InterfazBotonesProfesional unaInterfaz,
            JFrame unaVentana,
            Usuario unUsuario,
            PlanDeAlimentacion unPlan) {
        initComponents();
        sistema = unSistema;
        interfaz = unaInterfaz;
        ventana = unaVentana;
        usuarioAModificar = unUsuario;
        nuevoPlan = unPlan;
        listaComidasDiarias.setListData(nuevoPlan.getListaLunes().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaDiasDeLaSemana = new javax.swing.JComboBox<>();
        etiquetaDiasDeLaSemana = new javax.swing.JLabel();
        etiquetaTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaComidasDiarias = new javax.swing.JList();
        btnAgregarComida = new javax.swing.JButton();
        btnQuitarComida = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnEnviarPlan = new javax.swing.JButton();
        mensajeAlAceptar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1147, 784));
        setLayout(null);

        listaDiasDeLaSemana.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listaDiasDeLaSemana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" }));
        listaDiasDeLaSemana.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaDiasDeLaSemanaItemStateChanged(evt);
            }
        });
        add(listaDiasDeLaSemana);
        listaDiasDeLaSemana.setBounds(380, 130, 160, 35);

        etiquetaDiasDeLaSemana.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaDiasDeLaSemana.setText("Dia de la semana:");
        add(etiquetaDiasDeLaSemana);
        etiquetaDiasDeLaSemana.setBounds(170, 130, 200, 30);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 0, 102));
        etiquetaTitulo.setText("Realizar Plan de Alimentación");
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(300, 20, 480, 50);

        listaComidasDiarias.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(listaComidasDiarias);

        add(jScrollPane1);
        jScrollPane1.setBounds(360, 180, 410, 370);

        btnAgregarComida.setBackground(new java.awt.Color(255, 0, 102));
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
        btnAgregarComida.setBounds(600, 570, 210, 37);

        btnQuitarComida.setBackground(new java.awt.Color(255, 0, 102));
        btnQuitarComida.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnQuitarComida.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitarComida.setText("Quitar Comida");
        btnQuitarComida.setContentAreaFilled(false);
        btnQuitarComida.setOpaque(true);
        btnQuitarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarComidaActionPerformed(evt);
            }
        });
        add(btnQuitarComida);
        btnQuitarComida.setBounds(300, 570, 190, 37);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setToolTipText("");
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        add(btnVolver);
        btnVolver.setBounds(20, 20, 100, 50);

        btnEnviarPlan.setBackground(new java.awt.Color(255, 0, 102));
        btnEnviarPlan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEnviarPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarPlan.setText("Enviar Plan");
        btnEnviarPlan.setContentAreaFilled(false);
        btnEnviarPlan.setOpaque(true);
        btnEnviarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarPlanActionPerformed(evt);
            }
        });
        add(btnEnviarPlan);
        btnEnviarPlan.setBounds(890, 100, 160, 37);

        mensajeAlAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        add(mensajeAlAceptar);
        mensajeAlAceptar.setBounds(790, 160, 350, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarComidaActionPerformed
        Alimento alimentoSeleccionado = (Alimento) listaComidasDiarias.getSelectedValue();
        listaActiva().remove(alimentoSeleccionado);
        actualizarLista();
    }//GEN-LAST:event_btnQuitarComidaActionPerformed

    private void btnAgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComidaActionPerformed
        ventana.remove(this);
        ArrayList<Alimento> listaActiva = listaActiva();
        PanelAgregarComidasAPlan nuevo = new PanelAgregarComidasAPlan(sistema, interfaz, ventana, listaActiva, nuevoPlan, usuarioAModificar);
        interfaz.setActual(nuevo);
        ventana.add(nuevo);
        ventana.pack();
    }//GEN-LAST:event_btnAgregarComidaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ventana.remove(this);
        PanelSeleccionarPlanARealizar nuevo = new PanelSeleccionarPlanARealizar(sistema, interfaz, ventana);
        interfaz.setActual(nuevo);
        ventana.add(nuevo);
        ventana.pack();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void listaDiasDeLaSemanaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaDiasDeLaSemanaItemStateChanged
        actualizarLista();
    }//GEN-LAST:event_listaDiasDeLaSemanaItemStateChanged

    private void btnEnviarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarPlanActionPerformed
        usuarioAModificar.setPlan(nuevoPlan);
        mensajeAlAceptar.setText("Se ha enviado correctamente");
    }//GEN-LAST:event_btnEnviarPlanActionPerformed

    void actualizarLista() {
        if (listaDiasDeLaSemana.getSelectedItem().equals("lunes")) {
            listaComidasDiarias.setListData(nuevoPlan.getListaLunes().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("martes")) {
            listaComidasDiarias.setListData(nuevoPlan.getListaMartes().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("miercoles")) {
            listaComidasDiarias.setListData(nuevoPlan.getListaMiercoles().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("jueves")) {
            listaComidasDiarias.setListData(nuevoPlan.getListaJueves().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("viernes")) {
            listaComidasDiarias.setListData(nuevoPlan.getListaViernes().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("sabado")) {
            listaComidasDiarias.setListData(nuevoPlan.getListaSabado().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("domingo")) {
            listaComidasDiarias.setListData(nuevoPlan.getListaDomingo().toArray());
        }
    }

    ArrayList<Alimento> listaActiva() {
        ArrayList<Alimento> retorno = null;
        if (listaDiasDeLaSemana.getSelectedItem().equals("lunes")) {
            retorno = nuevoPlan.getListaLunes();
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("martes")) {
            retorno = nuevoPlan.getListaMartes();
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("miercoles")) {
            retorno = nuevoPlan.getListaMiercoles();
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("jueves")) {
            retorno = nuevoPlan.getListaJueves();
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("viernes")) {
            retorno = nuevoPlan.getListaViernes();
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("sabado")) {
            retorno = nuevoPlan.getListaSabado();
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("domingo")) {
            retorno = nuevoPlan.getListaDomingo();
        }
        return retorno;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarComida;
    private javax.swing.JButton btnEnviarPlan;
    private javax.swing.JButton btnQuitarComida;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel etiquetaDiasDeLaSemana;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaComidasDiarias;
    private javax.swing.JComboBox<String> listaDiasDeLaSemana;
    private javax.swing.JLabel mensajeAlAceptar;
    // End of variables declaration//GEN-END:variables
}
