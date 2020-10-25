package interfaz;

import dominio.Sistema;
import dominio.Usuario;
import java.util.ArrayList;
import javax.swing.JFrame;

public class PanelPerfilUsuario extends javax.swing.JPanel {

    //Atrubutos
    private Sistema sistema;
    private Usuario usuario;
    private JFrame ventana;
    private InterfazBotonesUsuario interfaz;

    //Constructor
    public PanelPerfilUsuario(Sistema unSistema, JFrame unaVentana, InterfazBotonesUsuario interfazActual) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        interfaz = interfazActual;
        usuario = interfaz.getUsuarioActual();
        datosDelUsuario.setListData(cargoDatosDelUsuario(usuario).toArray());
        etiquetaFoto.setIcon(usuario.getFotoPerfil());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHome = new javax.swing.JPanel();
        etiquetaInfoUsuario = new javax.swing.JLabel();
        btnEditarPerfilUsuario = new javax.swing.JButton();
        etiquetaFoto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datosDelUsuario = new javax.swing.JList();
        etiquetaEditar = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1147, 784));

        panelHome.setBackground(new java.awt.Color(255, 255, 255));
        panelHome.setLayout(null);

        etiquetaInfoUsuario.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaInfoUsuario.setForeground(new java.awt.Color(255, 0, 102));
        etiquetaInfoUsuario.setText("Info del Usuario");
        panelHome.add(etiquetaInfoUsuario);
        etiquetaInfoUsuario.setBounds(420, 20, 300, 50);

        btnEditarPerfilUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnEditar.png"))); // NOI18N
        btnEditarPerfilUsuario.setBorderPainted(false);
        btnEditarPerfilUsuario.setContentAreaFilled(false);
        btnEditarPerfilUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilUsuarioActionPerformed(evt);
            }
        });
        panelHome.add(btnEditarPerfilUsuario);
        btnEditarPerfilUsuario.setBounds(70, 40, 90, 70);

        etiquetaFoto.setMaximumSize(new java.awt.Dimension(210, 240));
        etiquetaFoto.setMinimumSize(new java.awt.Dimension(210, 240));
        etiquetaFoto.setPreferredSize(new java.awt.Dimension(210, 240));
        panelHome.add(etiquetaFoto);
        etiquetaFoto.setBounds(120, 180, 220, 260);

        datosDelUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        datosDelUsuario.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(datosDelUsuario);

        panelHome.add(jScrollPane1);
        jScrollPane1.setBounds(390, 100, 440, 470);

        etiquetaEditar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaEditar.setText("Editar");
        panelHome.add(etiquetaEditar);
        etiquetaEditar.setBounds(80, 120, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelHome, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarPerfilUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilUsuarioActionPerformed
        ventana.remove(this);
        PanelEditarPerfilUsuario nuevo = new PanelEditarPerfilUsuario(sistema, ventana, interfaz);
        interfaz.setActual(nuevo);
        ventana.add(nuevo);
        ventana.pack();
    }//GEN-LAST:event_btnEditarPerfilUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarPerfilUsuario;
    private javax.swing.JList datosDelUsuario;
    private javax.swing.JLabel etiquetaEditar;
    private javax.swing.JLabel etiquetaFoto;
    private javax.swing.JLabel etiquetaInfoUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    public ArrayList<String> cargoDatosDelUsuario(Usuario unUsuario) {
        String restricciones = imprimoRestricciones(unUsuario);
        ArrayList<String> datos = new ArrayList<>();
        datos.add("Nombre: " + unUsuario.getNombre());
        datos.add("Apellidos: " + unUsuario.getApellidos());
        datos.add("Nombre de usuario: " + unUsuario.getNombreUsuario());
        datos.add("Fecha de nacimiento: " + unUsuario.getFechaNacimiento());
        datos.add("Nacionalidad: " + unUsuario.getNacionalidad());
        datos.add("Altura: " + unUsuario.getAlturaCm());
        datos.add("Paso: " + unUsuario.getPesoKg());
        datos.add("Sexo: " + unUsuario.getSexo());
        datos.add("Restricciones: " + restricciones);
        datos.add("Preferencias: " + unUsuario.getPreferenciasAlimentarias());
        return datos;
    }

    public String imprimoRestricciones(Usuario unUsuario) {
        int cantidadDeRestricciones = 0;
        String retorno = "";
        int contador = 0;
        for (int i = 0; i < unUsuario.getListaRestricciones().length; i++) {
            if (unUsuario.getListaRestricciones()[i] == true) {
                cantidadDeRestricciones++;
            }
        }
        if (unUsuario.getListaRestricciones()[Usuario.Restricciones.Celiaco.ordinal()] == true) {
            if (contador == cantidadDeRestricciones - 1) {
                retorno += "Celiaco";
            } else {
                retorno += "Celiaco, ";
                contador++;
            }

        }
        if (unUsuario.getListaRestricciones()[Usuario.Restricciones.Diabetico.ordinal()] == true) {
            if (contador == cantidadDeRestricciones - 1) {
                retorno += "Diabético";
            } else {
                retorno += "Diabético, ";
                contador++;
            }
        }
        if (unUsuario.getListaRestricciones()[Usuario.Restricciones.Hipertension.ordinal()] == true) {
            if (contador == cantidadDeRestricciones - 1) {
                retorno += "Hipertensión";
            } else {
                retorno += "Hipertensión, ";
                contador++;
            }
        }
        if (unUsuario.getListaRestricciones()[Usuario.Restricciones.IntoleranteALaLactosa.ordinal()] == true) {
            if (contador == cantidadDeRestricciones - 1) {
                retorno += "Intolerancia a la lactosa";
            } else {
                retorno += "Intolerancia a la lactosa, ";
                contador++;
            }
        }
        if (cantidadDeRestricciones == 0) {
            retorno += "Ninguna ";
        }
        return retorno;
    }

}
