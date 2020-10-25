package interfaz;

import dominio.Persona;
import dominio.Sistema;
import dominio.Profesional;
import dominio.Usuario;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PanelRegistroProfesional extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private Profesional prof;
    private JFrame ventana;
    
    //Constructor
    public PanelRegistroProfesional(Sistema unSistema, JFrame unaVentana) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        prof = new Profesional();
        Profesional.Pais[] listaPaises = prof.inicializoListaEnumPaises();
        listaPaisDeGraduacion.setModel(new DefaultComboBoxModel(listaPaises));
        listaPaisDeGraduacion.setSelectedIndex(Profesional.Pais.Uruguay.ordinal());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegProf = new javax.swing.JPanel();
        etiquetaTituloProf = new javax.swing.JLabel();
        etiquetaNombreProf = new javax.swing.JLabel();
        etiquetaApellidosProf = new javax.swing.JLabel();
        etiquetaUsuarioProf = new javax.swing.JLabel();
        etiquetaFechaNacProf = new javax.swing.JLabel();
        etiquetaNombTituloProf = new javax.swing.JLabel();
        etiquetaFechaGradProf = new javax.swing.JLabel();
        etiquetaFotoPerfilProf = new javax.swing.JLabel();
        cajaNombreProf = new javax.swing.JTextField();
        cajaApellidosProf = new javax.swing.JTextField();
        cajaUsuarioProf = new javax.swing.JTextField();
        cajaNombreTituloProf = new javax.swing.JTextField();
        btnAceptarProf = new javax.swing.JButton();
        etiquetaPaisDeGraduacion = new javax.swing.JLabel();
        listaPaisDeGraduacion = new javax.swing.JComboBox<>();
        etiquetaErrorNombreProf = new javax.swing.JLabel();
        etiquetaErrorApellidoProf = new javax.swing.JLabel();
        etiquetaErrorNombreUsuarioProf = new javax.swing.JLabel();
        etiquetaErrorNombreTituloProf = new javax.swing.JLabel();
        etiquetaMensajeAlAceptar = new javax.swing.JLabel();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        etiquetaErrorFechaNacimiento = new javax.swing.JLabel();
        fechaGraduacion = new com.toedter.calendar.JDateChooser();
        etiquetaErrorFechaGraduacion = new javax.swing.JLabel();
        btnCambiarFoto = new javax.swing.JButton();
        fotoPerfil = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1147, 784));

        panelRegProf.setBackground(new java.awt.Color(255, 255, 255));
        panelRegProf.setPreferredSize(new java.awt.Dimension(1147, 784));
        panelRegProf.setLayout(null);

        etiquetaTituloProf.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTituloProf.setForeground(new java.awt.Color(255, 0, 102));
        etiquetaTituloProf.setText("Registro Profesionales");
        panelRegProf.add(etiquetaTituloProf);
        etiquetaTituloProf.setBounds(350, 10, 360, 50);

        etiquetaNombreProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNombreProf.setText("Nombre:");
        panelRegProf.add(etiquetaNombreProf);
        etiquetaNombreProf.setBounds(450, 120, 92, 29);

        etiquetaApellidosProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaApellidosProf.setText("Apellidos:");
        panelRegProf.add(etiquetaApellidosProf);
        etiquetaApellidosProf.setBounds(440, 170, 110, 30);

        etiquetaUsuarioProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaUsuarioProf.setText("Nombre de Usuario:");
        panelRegProf.add(etiquetaUsuarioProf);
        etiquetaUsuarioProf.setBounds(330, 220, 220, 26);

        etiquetaFechaNacProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFechaNacProf.setText("Fecha de nacimiento:");
        panelRegProf.add(etiquetaFechaNacProf);
        etiquetaFechaNacProf.setBounds(320, 270, 230, 26);

        etiquetaNombTituloProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNombTituloProf.setText("Nombre de título profesional:");
        panelRegProf.add(etiquetaNombTituloProf);
        etiquetaNombTituloProf.setBounds(240, 320, 310, 29);

        etiquetaFechaGradProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFechaGradProf.setText("Fecha de graduación:");
        panelRegProf.add(etiquetaFechaGradProf);
        etiquetaFechaGradProf.setBounds(320, 370, 230, 26);

        etiquetaFotoPerfilProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFotoPerfilProf.setText("Foto de perfil:");
        panelRegProf.add(etiquetaFotoPerfilProf);
        etiquetaFotoPerfilProf.setBounds(38, 82, 160, 40);

        cajaNombreProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaNombreProf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaNombreProfFocusLost(evt);
            }
        });
        panelRegProf.add(cajaNombreProf);
        cajaNombreProf.setBounds(560, 120, 160, 35);

        cajaApellidosProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaApellidosProf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaApellidosProfFocusLost(evt);
            }
        });
        cajaApellidosProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaApellidosProfActionPerformed(evt);
            }
        });
        panelRegProf.add(cajaApellidosProf);
        cajaApellidosProf.setBounds(560, 170, 160, 35);

        cajaUsuarioProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaUsuarioProf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaUsuarioProfFocusLost(evt);
            }
        });
        panelRegProf.add(cajaUsuarioProf);
        cajaUsuarioProf.setBounds(560, 220, 160, 35);

        cajaNombreTituloProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaNombreTituloProf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaNombreTituloProfFocusLost(evt);
            }
        });
        panelRegProf.add(cajaNombreTituloProf);
        cajaNombreTituloProf.setBounds(560, 320, 160, 35);

        btnAceptarProf.setBackground(new java.awt.Color(255, 0, 102));
        btnAceptarProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAceptarProf.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarProf.setText("Aceptar");
        btnAceptarProf.setContentAreaFilled(false);
        btnAceptarProf.setOpaque(true);
        btnAceptarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarProfActionPerformed(evt);
            }
        });
        panelRegProf.add(btnAceptarProf);
        btnAceptarProf.setBounds(850, 610, 150, 37);

        etiquetaPaisDeGraduacion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaPaisDeGraduacion.setText("País de graduación:");
        panelRegProf.add(etiquetaPaisDeGraduacion);
        etiquetaPaisDeGraduacion.setBounds(340, 420, 210, 26);

        listaPaisDeGraduacion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listaPaisDeGraduacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelRegProf.add(listaPaisDeGraduacion);
        listaPaisDeGraduacion.setBounds(560, 420, 160, 35);

        etiquetaErrorNombreProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegProf.add(etiquetaErrorNombreProf);
        etiquetaErrorNombreProf.setBounds(740, 120, 400, 26);

        etiquetaErrorApellidoProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegProf.add(etiquetaErrorApellidoProf);
        etiquetaErrorApellidoProf.setBounds(720, 170, 400, 26);

        etiquetaErrorNombreUsuarioProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegProf.add(etiquetaErrorNombreUsuarioProf);
        etiquetaErrorNombreUsuarioProf.setBounds(720, 220, 400, 26);

        etiquetaErrorNombreTituloProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegProf.add(etiquetaErrorNombreTituloProf);
        etiquetaErrorNombreTituloProf.setBounds(740, 320, 410, 26);

        etiquetaMensajeAlAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegProf.add(etiquetaMensajeAlAceptar);
        etiquetaMensajeAlAceptar.setBounds(650, 540, 470, 40);

        fechaNacimiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fechaNacimientoFocusLost(evt);
            }
        });
        panelRegProf.add(fechaNacimiento);
        fechaNacimiento.setBounds(560, 270, 160, 32);

        etiquetaErrorFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegProf.add(etiquetaErrorFechaNacimiento);
        etiquetaErrorFechaNacimiento.setBounds(740, 270, 390, 26);

        fechaGraduacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fechaGraduacionFocusLost(evt);
            }
        });
        panelRegProf.add(fechaGraduacion);
        fechaGraduacion.setBounds(560, 370, 160, 32);

        etiquetaErrorFechaGraduacion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegProf.add(etiquetaErrorFechaGraduacion);
        etiquetaErrorFechaGraduacion.setBounds(740, 370, 310, 26);

        btnCambiarFoto.setBackground(new java.awt.Color(255, 0, 102));
        btnCambiarFoto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCambiarFoto.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarFoto.setText("Cambiar Foto");
        btnCambiarFoto.setContentAreaFilled(false);
        btnCambiarFoto.setOpaque(true);
        btnCambiarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarFotoActionPerformed(evt);
            }
        });
        panelRegProf.add(btnCambiarFoto);
        btnCambiarFoto.setBounds(40, 390, 190, 40);

        fotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaProfesional.png"))); // NOI18N
        fotoPerfil.setPreferredSize(new java.awt.Dimension(210, 270));
        panelRegProf.add(fotoPerfil);
        fotoPerfil.setBounds(30, 120, 210, 270);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelRegProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelRegProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNombreProfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaNombreProfFocusLost
        String nombre = cajaNombreProf.getText();
        if (nombre.trim().isEmpty()) {
            etiquetaErrorNombreProf.setText("El nombre no puede ser vacío");
        }
    }//GEN-LAST:event_cajaNombreProfFocusLost

    private void cajaApellidosProfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaApellidosProfFocusLost
        String apellido = cajaApellidosProf.getText();
 
    }//GEN-LAST:event_cajaApellidosProfFocusLost

    private void cajaUsuarioProfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaUsuarioProfFocusLost
        String nombreUsuario = cajaUsuarioProf.getText();
        Profesional comparoProf = new Profesional();
        comparoProf.setNombreUsuario(nombreUsuario);
        Usuario comparoUsuario = new Usuario();
        comparoUsuario.setNombreUsuario(nombreUsuario);
        if (nombreUsuario.trim().isEmpty()) {
            etiquetaErrorNombreUsuarioProf.setText("El nombre de usuario no puede estar vacío");
        } else {
            if (sistema.getListaUsuarios().contains(comparoUsuario)
                    && sistema.getListaProfesionales().contains(comparoProf)) {
                etiquetaErrorNombreUsuarioProf.setText("El nombre de usuario ya está en uso");
            } else {
                etiquetaErrorNombreUsuarioProf.setText(" ");
            }
        }
    }//GEN-LAST:event_cajaUsuarioProfFocusLost

    private void cajaNombreTituloProfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaNombreTituloProfFocusLost
        String nombreTitulo = cajaNombreTituloProf.getText();
        if (nombreTitulo.trim().isEmpty()) {
            etiquetaErrorNombreTituloProf.setText("El nombre del título no puede estar vacío");
        }
    }//GEN-LAST:event_cajaNombreTituloProfFocusLost

    private void btnAceptarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarProfActionPerformed
        Profesional profesional = new Profesional();
        boolean nombreValido = !cajaNombreProf.getText().trim().isEmpty();
        
        Usuario comparoUsr = new Usuario();
        comparoUsr.setNombreUsuario(cajaUsuarioProf.getText());
        Profesional comparoProf = new Profesional();
        comparoProf.setNombreUsuario(cajaUsuarioProf.getText());
        boolean nombreUsuarioValido = !cajaUsuarioProf.getText().trim().isEmpty()
                && !sistema.getListaUsuarios().contains(comparoUsr)
                && !sistema.getListaProfesionales().contains(comparoProf);
        boolean fNacimientoValido = fechaNacimiento.getCalendar() != null;
        boolean nombreTituloValido = !cajaNombreTituloProf.getText().trim().isEmpty();
        boolean fGraduacionValido = fechaGraduacion.getCalendar() != null;
        if (nombreValido && nombreUsuarioValido
                && fNacimientoValido && nombreTituloValido && fGraduacionValido) {
            profesional.setNombre(cajaNombreProf.getText());
            profesional.setApellidos(cajaApellidosProf.getText());
            profesional.setNombreUsuario(cajaUsuarioProf.getText());
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String fNacimiento = formatter.format(fechaNacimiento.getCalendar().getTime());
            profesional.setFechaNacimiento(fNacimiento);
            profesional.setNombreTituloProf(cajaNombreTituloProf.getText());
            SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
            String fGraduacion = formatter2.format(fechaGraduacion.getCalendar().getTime());
            profesional.setFechaGraduacion(fGraduacion);
            profesional.setPaisObtuvoTitulo(profesional.getListaEnumPais()[listaPaisDeGraduacion.getSelectedIndex()]);
            profesional.setFotoPerfil((ImageIcon) fotoPerfil.getIcon());
            sistema.getListaProfesionales().add(profesional);
            etiquetaMensajeAlAceptar.setText("Profesional registrado correctamente");
        } else {
            etiquetaMensajeAlAceptar.setText("Error al ingresar el profesional");
            if (nombreValido == false) {
                etiquetaErrorNombreProf.setText("El nombre no puede ser vacío");
            }
            
            if (nombreUsuarioValido == false) {
                etiquetaErrorNombreUsuarioProf.setText("Nombre de usuario no válido");
            }
            if (fNacimientoValido == false) {
                etiquetaErrorFechaNacimiento.setText("Fecha de nacimiento no válida");
            }
            if (nombreTituloValido == false) {
                etiquetaErrorNombreTituloProf.setText("El nombre no puede ser válida");
            }
            if (fGraduacionValido == false) {
                etiquetaErrorFechaGraduacion.setText("Fecha de graduación no válida");
            }
        }
    }//GEN-LAST:event_btnAceptarProfActionPerformed

    private void fechaNacimientoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaNacimientoFocusLost
        //Metodo para validar que se seleccione la fecha de nacimiento 
        if (fechaNacimiento.getCalendar() == null) {
            etiquetaErrorFechaNacimiento.setText("Debe ingresar una fecha");
        }
    }//GEN-LAST:event_fechaNacimientoFocusLost

    private void fechaGraduacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaGraduacionFocusLost
        //Metodo para validar que se seleccione la fecha de graduacion 
        if (fechaGraduacion.getCalendar() == null) {
            etiquetaErrorFechaGraduacion.setText("Debe ingresar una fecha");
        }
    }//GEN-LAST:event_fechaGraduacionFocusLost

    private void btnCambiarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarFotoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter file = new FileNameExtensionFilter("Archivo imagen", "jpg");
        fileChooser.setFileFilter(file);
        int imagen = fileChooser.showOpenDialog(this);
        if (imagen == JFileChooser.APPROVE_OPTION) {
            ImageIcon fotoPerfil = new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath());
            ImageIcon fotoArreglada = resizeImageIcon(fotoPerfil, 210, 240);
            prof.setFotoPerfil(fotoArreglada);
        }
        actualizar();
    }//GEN-LAST:event_btnCambiarFotoActionPerformed

    private void cajaApellidosProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaApellidosProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaApellidosProfActionPerformed
    
    void actualizar() {
        fotoPerfil.setIcon(prof.getFotoPerfil());
    }
    
    ImageIcon resizeImageIcon(ImageIcon imageIcon, Integer width, Integer height) {
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(imageIcon.getImage(), 0, 0, width, height, null);
        graphics2D.dispose();
        
        return new ImageIcon(bufferedImage, imageIcon.getDescription());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarProf;
    private javax.swing.JButton btnCambiarFoto;
    private javax.swing.JTextField cajaApellidosProf;
    private javax.swing.JTextField cajaNombreProf;
    private javax.swing.JTextField cajaNombreTituloProf;
    private javax.swing.JTextField cajaUsuarioProf;
    private javax.swing.JLabel etiquetaApellidosProf;
    private javax.swing.JLabel etiquetaErrorApellidoProf;
    private javax.swing.JLabel etiquetaErrorFechaGraduacion;
    private javax.swing.JLabel etiquetaErrorFechaNacimiento;
    private javax.swing.JLabel etiquetaErrorNombreProf;
    private javax.swing.JLabel etiquetaErrorNombreTituloProf;
    private javax.swing.JLabel etiquetaErrorNombreUsuarioProf;
    private javax.swing.JLabel etiquetaFechaGradProf;
    private javax.swing.JLabel etiquetaFechaNacProf;
    private javax.swing.JLabel etiquetaFotoPerfilProf;
    private javax.swing.JLabel etiquetaMensajeAlAceptar;
    private javax.swing.JLabel etiquetaNombTituloProf;
    private javax.swing.JLabel etiquetaNombreProf;
    private javax.swing.JLabel etiquetaPaisDeGraduacion;
    private javax.swing.JLabel etiquetaTituloProf;
    private javax.swing.JLabel etiquetaUsuarioProf;
    private com.toedter.calendar.JDateChooser fechaGraduacion;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.JComboBox<String> listaPaisDeGraduacion;
    private javax.swing.JPanel panelRegProf;
    // End of variables declaration//GEN-END:variables
}
