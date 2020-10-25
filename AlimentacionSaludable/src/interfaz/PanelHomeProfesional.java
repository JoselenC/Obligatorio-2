package interfaz;

import dominio.Profesional;
import dominio.Sistema;
import java.util.ArrayList;
import javax.swing.JFrame;

public class PanelHomeProfesional extends javax.swing.JPanel {

    //Atributos
    private Profesional profesional;
    private Sistema sistema;
    private InterfazBotonesProfesional interfaz;
    private JFrame ventana;

    //Cosntructor
    public PanelHomeProfesional(Sistema unSistema,
            InterfazBotonesProfesional interfazActual, JFrame unaVentana) {
        initComponents();
        sistema = unSistema;
        interfaz = interfazActual;
        ventana = unaVentana;
        profesional = interfaz.getUsuarioActivo();
        jListDatosDelProfesional.setListData(cargoDatosDelProfesional(profesional).toArray());
        etiquetaFoto.setIcon(profesional.getFotoPerfil());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEdiatrPerfilProfesional = new javax.swing.JButton();
        etiquetaTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListDatosDelProfesional = new javax.swing.JList();
        etiquetaEditar = new javax.swing.JLabel();
        etiquetaFoto = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1147, 784));
        setLayout(null);

        btnEdiatrPerfilProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnEditar.png"))); // NOI18N
        btnEdiatrPerfilProfesional.setBorderPainted(false);
        btnEdiatrPerfilProfesional.setContentAreaFilled(false);
        btnEdiatrPerfilProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdiatrPerfilProfesionalActionPerformed(evt);
            }
        });
        add(btnEdiatrPerfilProfesional);
        btnEdiatrPerfilProfesional.setBounds(50, 60, 110, 70);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 0, 102));
        etiquetaTitulo.setText("Datos del Profesional");
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(400, 20, 360, 40);

        jListDatosDelProfesional.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jListDatosDelProfesional.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListDatosDelProfesional);

        add(jScrollPane2);
        jScrollPane2.setBounds(310, 100, 590, 600);

        etiquetaEditar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaEditar.setText("Editar ");
        add(etiquetaEditar);
        etiquetaEditar.setBounds(60, 140, 80, 30);

        etiquetaFoto.setMaximumSize(new java.awt.Dimension(210, 240));
        etiquetaFoto.setMinimumSize(new java.awt.Dimension(210, 240));
        etiquetaFoto.setPreferredSize(new java.awt.Dimension(210, 240));
        add(etiquetaFoto);
        etiquetaFoto.setBounds(70, 240, 210, 290);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEdiatrPerfilProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdiatrPerfilProfesionalActionPerformed
        ventana.remove(this);
        PanelEditarPerfilProfesional nuevo = new PanelEditarPerfilProfesional(sistema, ventana, interfaz);
        interfaz.setActual(nuevo);
        ventana.add(nuevo);
        ventana.pack();
    }//GEN-LAST:event_btnEdiatrPerfilProfesionalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdiatrPerfilProfesional;
    private javax.swing.JLabel etiquetaEditar;
    private javax.swing.JLabel etiquetaFoto;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JList jListDatosDelProfesional;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private ArrayList<String> cargoDatosDelProfesional(Profesional prof) {
        ArrayList<String> datos = new ArrayList<>();
        datos.add("Nombre: " + prof.getNombre());
        datos.add("Apellidos: " + prof.getApellidos());
        datos.add("Nombre de usuario: " + prof.getNombreUsuario());
        datos.add("Fecha de nacimiento: " + prof.getFechaNacimiento());
        datos.add("Nombre del título profesional: " + prof.getNombreTituloProf());
        datos.add("Fecha graduación: " + prof.getFechaGraduacion());
        datos.add("País de graduación: " + prof.getPaisObtuvoTitulo());
        return datos;
    }

}
