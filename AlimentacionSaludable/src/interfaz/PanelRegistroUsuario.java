package interfaz;

import dominio.Profesional;
import dominio.Sistema;
import dominio.Usuario;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PanelRegistroUsuario extends javax.swing.JPanel {

    private Sistema sistema;
    private Usuario usuario;

    public PanelRegistroUsuario(Sistema unSistema, JFrame unaVentana) {
        initComponents();
        sistema = unSistema;
        usuario = new Usuario();
        grupoBotonesSexo.add(rBtnFemeninoUsuario);
        grupoBotonesSexo.add(rBtnMasculinoUsuario);
        rBtnMasculinoUsuario.setSelected(true);
        grupoBotonesPreferencias.add(rBVegano);
        grupoBotonesPreferencias.add(rBVegetariano);
        grupoBotonesPreferencias.add(rBMacrobiotico);
        grupoBotonesPreferencias.add(rBOrganico);
        Usuario.Nacionalidades[] listaNac = usuario.getListaNacionalidades();
        listaNacionalidadesUsuario.setModel(new DefaultComboBoxModel(listaNac));
        listaNacionalidadesUsuario.setSelectedIndex(Usuario.Nacionalidades.Uruguaya.ordinal());
        fotoPerfil.setSize(210, 240);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotonesSexo = new javax.swing.ButtonGroup();
        grupoBotonesPreferencias = new javax.swing.ButtonGroup();
        panelRegUsuario = new javax.swing.JPanel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaApellidos = new javax.swing.JLabel();
        etiquetaNombUsuario = new javax.swing.JLabel();
        etiquetaFDNaciomiento = new javax.swing.JLabel();
        etiquetaFotoPerfil = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        cajaApellidos = new javax.swing.JTextField();
        cajaNombUsuario = new javax.swing.JTextField();
        etiquetaPeso = new javax.swing.JLabel();
        etiquetaAltura = new javax.swing.JLabel();
        cajaAltura = new javax.swing.JTextField();
        cajaPeso = new javax.swing.JTextField();
        etiquetaMedidaPeso = new javax.swing.JLabel();
        etiquetaMedidaAltura = new javax.swing.JLabel();
        btnAceptarUsuario = new javax.swing.JButton();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaNacionalidadUsuario = new javax.swing.JLabel();
        listaNacionalidadesUsuario = new javax.swing.JComboBox();
        etiquetaSexo = new javax.swing.JLabel();
        rBtnMasculinoUsuario = new javax.swing.JRadioButton();
        rBtnFemeninoUsuario = new javax.swing.JRadioButton();
        etiquetaRestricciones = new javax.swing.JLabel();
        checkBoxCeliaco = new javax.swing.JCheckBox();
        checkBoxIntoleranteLactosa = new javax.swing.JCheckBox();
        checkBoxDiabetico = new javax.swing.JCheckBox();
        checkBoxHipertension = new javax.swing.JCheckBox();
        etiquetaErrorNombre = new javax.swing.JLabel();
        etiquetaErrorApellido = new javax.swing.JLabel();
        etiquetaErrorNombreUsuario = new javax.swing.JLabel();
        etiquetaErrorAltura = new javax.swing.JLabel();
        etiquetaErrorPeso = new javax.swing.JLabel();
        etiquetaMensajeAlAceptar = new javax.swing.JLabel();
        fotoPerfil = new javax.swing.JLabel();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        etiquetaErrorFechaNacimiento = new javax.swing.JLabel();
        etiquetaPreferencias = new javax.swing.JLabel();
        rBVegano = new javax.swing.JRadioButton();
        rBVegetariano = new javax.swing.JRadioButton();
        rBMacrobiotico = new javax.swing.JRadioButton();
        rBOrganico = new javax.swing.JRadioButton();
        btnCambiarFoto = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1147, 784));

        panelRegUsuario.setBackground(new java.awt.Color(229, 229, 240));
        panelRegUsuario.setPreferredSize(new java.awt.Dimension(1147, 784));
        panelRegUsuario.setLayout(null);

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNombre.setText("Nombre:");
        panelRegUsuario.add(etiquetaNombre);
        etiquetaNombre.setBounds(370, 80, 92, 29);

        etiquetaApellidos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaApellidos.setText("Apellidos:");
        panelRegUsuario.add(etiquetaApellidos);
        etiquetaApellidos.setBounds(360, 130, 110, 26);

        etiquetaNombUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNombUsuario.setText("Nombre de Usuario:");
        panelRegUsuario.add(etiquetaNombUsuario);
        etiquetaNombUsuario.setBounds(250, 180, 220, 26);

        etiquetaFDNaciomiento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFDNaciomiento.setText("Fecha de Nacimiento:");
        panelRegUsuario.add(etiquetaFDNaciomiento);
        etiquetaFDNaciomiento.setBounds(240, 280, 230, 26);

        etiquetaFotoPerfil.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFotoPerfil.setText("Foto de Perfil:");
        panelRegUsuario.add(etiquetaFotoPerfil);
        etiquetaFotoPerfil.setBounds(60, 70, 160, 29);

        cajaNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaNombreFocusLost(evt);
            }
        });
        panelRegUsuario.add(cajaNombre);
        cajaNombre.setBounds(480, 80, 160, 35);

        cajaApellidos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaApellidosFocusLost(evt);
            }
        });
        panelRegUsuario.add(cajaApellidos);
        cajaApellidos.setBounds(480, 130, 160, 35);

        cajaNombUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaNombUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaNombUsuarioFocusLost(evt);
            }
        });
        panelRegUsuario.add(cajaNombUsuario);
        cajaNombUsuario.setBounds(480, 180, 160, 35);

        etiquetaPeso.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaPeso.setText("Peso:");
        panelRegUsuario.add(etiquetaPeso);
        etiquetaPeso.setBounds(410, 380, 60, 26);

        etiquetaAltura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaAltura.setText("Altura:");
        panelRegUsuario.add(etiquetaAltura);
        etiquetaAltura.setBounds(400, 330, 70, 26);

        cajaAltura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaAltura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaAlturaFocusLost(evt);
            }
        });
        panelRegUsuario.add(cajaAltura);
        cajaAltura.setBounds(480, 330, 160, 35);

        cajaPeso.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaPeso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaPesoFocusLost(evt);
            }
        });
        panelRegUsuario.add(cajaPeso);
        cajaPeso.setBounds(480, 380, 160, 35);

        etiquetaMedidaPeso.setText("Kg");
        panelRegUsuario.add(etiquetaMedidaPeso);
        etiquetaMedidaPeso.setBounds(650, 380, 20, 14);

        etiquetaMedidaAltura.setText("Cm");
        panelRegUsuario.add(etiquetaMedidaAltura);
        etiquetaMedidaAltura.setBounds(650, 330, 20, 14);

        btnAceptarUsuario.setBackground(new java.awt.Color(102, 102, 102));
        btnAceptarUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAceptarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarUsuario.setText("Aceptar");
        btnAceptarUsuario.setContentAreaFilled(false);
        btnAceptarUsuario.setOpaque(true);
        btnAceptarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarUsuarioActionPerformed(evt);
            }
        });
        panelRegUsuario.add(btnAceptarUsuario);
        btnAceptarUsuario.setBounds(810, 600, 170, 40);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaTitulo.setText("Registro Usuario");
        panelRegUsuario.add(etiquetaTitulo);
        etiquetaTitulo.setBounds(390, 0, 330, 44);

        etiquetaNacionalidadUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNacionalidadUsuario.setText("Nacionalidad:");
        panelRegUsuario.add(etiquetaNacionalidadUsuario);
        etiquetaNacionalidadUsuario.setBounds(330, 230, 160, 29);

        listaNacionalidadesUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegUsuario.add(listaNacionalidadesUsuario);
        listaNacionalidadesUsuario.setBounds(480, 230, 160, 37);

        etiquetaSexo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaSexo.setText("Sexo:");
        panelRegUsuario.add(etiquetaSexo);
        etiquetaSexo.setBounds(410, 420, 70, 29);

        rBtnMasculinoUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBtnMasculinoUsuario.setText("Masculino");
        rBtnMasculinoUsuario.setContentAreaFilled(false);
        rBtnMasculinoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnMasculinoUsuarioActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBtnMasculinoUsuario);
        rBtnMasculinoUsuario.setBounds(480, 420, 150, 35);

        rBtnFemeninoUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBtnFemeninoUsuario.setText("Femenino");
        rBtnFemeninoUsuario.setContentAreaFilled(false);
        rBtnFemeninoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnFemeninoUsuarioActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBtnFemeninoUsuario);
        rBtnFemeninoUsuario.setBounds(630, 420, 160, 35);

        etiquetaRestricciones.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaRestricciones.setText("Restricciones:");
        panelRegUsuario.add(etiquetaRestricciones);
        etiquetaRestricciones.setBounds(320, 460, 150, 26);

        checkBoxCeliaco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxCeliaco.setText("Celíaco");
        checkBoxCeliaco.setContentAreaFilled(false);
        checkBoxCeliaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxCeliacoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(checkBoxCeliaco);
        checkBoxCeliaco.setBounds(470, 460, 120, 35);

        checkBoxIntoleranteLactosa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxIntoleranteLactosa.setText("Intolerante a la lactosa");
        checkBoxIntoleranteLactosa.setContentAreaFilled(false);
        checkBoxIntoleranteLactosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxIntoleranteLactosaActionPerformed(evt);
            }
        });
        panelRegUsuario.add(checkBoxIntoleranteLactosa);
        checkBoxIntoleranteLactosa.setBounds(590, 460, 271, 37);

        checkBoxDiabetico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxDiabetico.setText("Diabético");
        checkBoxDiabetico.setContentAreaFilled(false);
        checkBoxDiabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxDiabeticoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(checkBoxDiabetico);
        checkBoxDiabetico.setBounds(880, 460, 140, 35);

        checkBoxHipertension.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxHipertension.setText("Hipertensión");
        checkBoxHipertension.setContentAreaFilled(false);
        checkBoxHipertension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxHipertensionActionPerformed(evt);
            }
        });
        panelRegUsuario.add(checkBoxHipertension);
        checkBoxHipertension.setBounds(470, 500, 170, 35);

        etiquetaErrorNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegUsuario.add(etiquetaErrorNombre);
        etiquetaErrorNombre.setBounds(660, 80, 400, 30);

        etiquetaErrorApellido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegUsuario.add(etiquetaErrorApellido);
        etiquetaErrorApellido.setBounds(660, 130, 370, 30);

        etiquetaErrorNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegUsuario.add(etiquetaErrorNombreUsuario);
        etiquetaErrorNombreUsuario.setBounds(660, 180, 480, 30);

        etiquetaErrorAltura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegUsuario.add(etiquetaErrorAltura);
        etiquetaErrorAltura.setBounds(700, 330, 430, 30);

        etiquetaErrorPeso.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegUsuario.add(etiquetaErrorPeso);
        etiquetaErrorPeso.setBounds(690, 380, 440, 30);

        etiquetaMensajeAlAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegUsuario.add(etiquetaMensajeAlAceptar);
        etiquetaMensajeAlAceptar.setBounds(670, 600, 450, 26);

        fotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"))); // NOI18N
        fotoPerfil.setMaximumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setMinimumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setPreferredSize(new java.awt.Dimension(210, 240));
        panelRegUsuario.add(fotoPerfil);
        fotoPerfil.setBounds(30, 100, 210, 220);

        fechaNacimiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fechaNacimientoFocusLost(evt);
            }
        });
        panelRegUsuario.add(fechaNacimiento);
        fechaNacimiento.setBounds(480, 280, 160, 20);

        etiquetaErrorFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegUsuario.add(etiquetaErrorFechaNacimiento);
        etiquetaErrorFechaNacimiento.setBounds(660, 280, 310, 0);

        etiquetaPreferencias.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaPreferencias.setText("Preferencias:");
        panelRegUsuario.add(etiquetaPreferencias);
        etiquetaPreferencias.setBounds(320, 540, 150, 26);

        rBVegano.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBVegano.setText("Vegano");
        rBVegano.setContentAreaFilled(false);
        rBVegano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBVeganoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBVegano);
        rBVegano.setBounds(470, 540, 120, 37);

        rBVegetariano.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBVegetariano.setText("Vegetariano");
        rBVegetariano.setContentAreaFilled(false);
        rBVegetariano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBVegetarianoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBVegetariano);
        rBVegetariano.setBounds(590, 540, 170, 37);

        rBMacrobiotico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBMacrobiotico.setText("Macrobiótico");
        rBMacrobiotico.setContentAreaFilled(false);
        rBMacrobiotico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBMacrobioticoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBMacrobiotico);
        rBMacrobiotico.setBounds(760, 540, 180, 37);

        rBOrganico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBOrganico.setText("Orgánico");
        rBOrganico.setContentAreaFilled(false);
        rBOrganico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBOrganicoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBOrganico);
        rBOrganico.setBounds(940, 540, 140, 37);

        btnCambiarFoto.setBackground(new java.awt.Color(102, 102, 102));
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
        panelRegUsuario.add(btnCambiarFoto);
        btnCambiarFoto.setBounds(30, 330, 210, 37);

        jPanel1.setBackground(new java.awt.Color(171, 171, 199));
        panelRegUsuario.add(jPanel1);
        jPanel1.setBounds(10, 0, 1080, 60);

        lblFecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelRegUsuario.add(lblFecha);
        lblFecha.setBounds(660, 280, 400, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRegUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRegUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaNombreFocusLost
        String nombre = cajaNombre.getText();
        if (nombre.trim().isEmpty()) {
            etiquetaErrorNombre.setText("El nombre no puede ser vacío");
        } else {
            etiquetaErrorNombre.setText(" ");
        }
    }//GEN-LAST:event_cajaNombreFocusLost

    private void cajaApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaApellidosFocusLost
        String apellido = cajaApellidos.getText();
        if (apellido.trim().isEmpty()) {
            etiquetaErrorApellido.setText("El apellido no puede ser vacío");
        } else {
            etiquetaErrorApellido.setText(" ");
        }
    }//GEN-LAST:event_cajaApellidosFocusLost

    private void cajaNombUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaNombUsuarioFocusLost
        String nombreUsuario = cajaNombUsuario.getText();
        Usuario comparoUsuario = new Usuario();
        comparoUsuario.setAliasUsuario(nombreUsuario);
        Profesional comparoProf = new Profesional();
        comparoProf.setAliasUsuario(nombreUsuario);
        if (nombreUsuario.trim().isEmpty()) {
            etiquetaErrorNombreUsuario.setText("El nombre de usuario no puede estar vacío");
        } else {
            if (sistema.getUsuarios().contains(comparoUsuario)
                    && sistema.getProfesionales().contains(comparoProf)) {
                etiquetaErrorNombreUsuario.setText("El alias de usuario ya existe");
            } else {
                etiquetaErrorNombreUsuario.setText(" ");
            }
        }
    }//GEN-LAST:event_cajaNombUsuarioFocusLost

    private void cajaAlturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaAlturaFocusLost
        String altura = cajaAltura.getText();
        if (altura.trim().isEmpty()) {
            etiquetaErrorAltura.setText("La altura no puede estar vacia");
        }
        pidoDatoNumerico(altura, 0, 265, etiquetaErrorAltura);
    }//GEN-LAST:event_cajaAlturaFocusLost

    private void cajaPesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaPesoFocusLost
        String peso = cajaPeso.getText();
        if (peso.trim().isEmpty()) {
            etiquetaErrorPeso.setText("El peso no puede estar vacío");
        }
        pidoDatoNumerico(peso, 0, 265, etiquetaErrorAltura);
    }//GEN-LAST:event_cajaPesoFocusLost

    private void btnAceptarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarUsuarioActionPerformed
        Usuario miUsuario = new Usuario();
        Profesional comparoProf = new Profesional();
        comparoProf.setAliasUsuario(cajaNombUsuario.getText());
        Usuario comparoUsr = new Usuario();
        comparoUsr.setAliasUsuario(cajaNombUsuario.getText());

        boolean apellidoValido = !cajaApellidos.getText().trim().isEmpty();
        boolean nombreUsuarioValido = !cajaNombUsuario.getText().trim().isEmpty()
                && !sistema.getUsuarios().contains(comparoUsr)
                && !sistema.getProfesionales().contains(comparoProf);
        boolean fNacimientoValido = fechaNacimiento.getCalendar() != null;
        boolean altura = pidoDatoNumerico(cajaAltura.getText(), 0, 265, etiquetaErrorAltura);
        boolean peso = pidoDatoNumerico(cajaPeso.getText(), 0, 600, etiquetaErrorPeso);
        boolean sexoPred = sexoPredeterminado();
        if (apellidoValido && nombreUsuarioValido && fNacimientoValido) {
            registrarUsuario(miUsuario, sexoPred);
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar el usuario");

            if (!nombreUsuarioValido) {
                etiquetaErrorNombreUsuario.setText("Nombre de usuario no válido");
            }
            if (!fNacimientoValido) {
                lblFecha.setText("Fecha no válida");
            }
    }//GEN-LAST:event_btnAceptarUsuarioActionPerformed
    }

    private void registrarUsuario(Usuario miUsuario, boolean sexoPred) {
        etiquetaErrorAltura.setText("");
        etiquetaErrorPeso.setText("");
        miUsuario.setNombre(cajaNombre.getText());
        miUsuario.setApellidos(cajaApellidos.getText());
        miUsuario.setAliasUsuario(cajaNombUsuario.getText());
        miUsuario.setNacionalidad(miUsuario.getListaNacionalidades()[listaNacionalidadesUsuario.getSelectedIndex()]);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String fNacimiento = formatter.format(fechaNacimiento.getCalendar().getTime());
        miUsuario.setFechaNacimiento(fNacimiento);
        if (sexoPred == true) {
            miUsuario.setSexo("Masculino");
        } else {
            miUsuario.setSexo("Femenino");
        }
        miUsuario.setAlturaCm(Integer.parseInt(cajaAltura.getText()));
        miUsuario.setPesoKg(Integer.parseInt(cajaPeso.getText()));
        miUsuario.setFotoPerfil((ImageIcon) fotoPerfil.getIcon());
        sistema.getUsuarios().add(miUsuario);
        JOptionPane.showMessageDialog(this, "Usuario registrado correctamente");

    }
    private void rBtnMasculinoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnMasculinoUsuarioActionPerformed
        usuario.setSexo("Masculino");
    }//GEN-LAST:event_rBtnMasculinoUsuarioActionPerformed

    private void rBtnFemeninoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnFemeninoUsuarioActionPerformed
        usuario.setSexo("Femenino");
    }//GEN-LAST:event_rBtnFemeninoUsuarioActionPerformed

    private void fechaNacimientoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaNacimientoFocusLost
        //Metodo para validar que se seleccione la fecha de nacimiento 
        if (fechaNacimiento.getCalendar() == null) {
            lblFecha.setText("Debe ingresar una fecha");
        }
    }//GEN-LAST:event_fechaNacimientoFocusLost

    private void checkBoxIntoleranteLactosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxIntoleranteLactosaActionPerformed
        int posicionEnum = Usuario.Restricciones.IntoleranteALaLactosa.ordinal();
        boolean valorEnPos = usuario.getListaRestricciones()[posicionEnum];
        usuario.getListaRestricciones()[posicionEnum] = !valorEnPos;
    }//GEN-LAST:event_checkBoxIntoleranteLactosaActionPerformed

    private void checkBoxHipertensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxHipertensionActionPerformed
        int posicionEnum = Usuario.Restricciones.Hipertension.ordinal();
        boolean valorEnPos = usuario.getListaRestricciones()[posicionEnum];
        usuario.getListaRestricciones()[posicionEnum] = !valorEnPos;
    }//GEN-LAST:event_checkBoxHipertensionActionPerformed

    private void rBMacrobioticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBMacrobioticoActionPerformed
        usuario.setPreferenciasAlimentarias(Usuario.Preferencias.Macrobiotico);
    }//GEN-LAST:event_rBMacrobioticoActionPerformed

    private void rBVeganoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBVeganoActionPerformed
        usuario.setPreferenciasAlimentarias(Usuario.Preferencias.Vegano);
    }//GEN-LAST:event_rBVeganoActionPerformed

    private void rBVegetarianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBVegetarianoActionPerformed
        usuario.setPreferenciasAlimentarias(Usuario.Preferencias.Vegetariano);
    }//GEN-LAST:event_rBVegetarianoActionPerformed

    private void rBOrganicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBOrganicoActionPerformed
        usuario.setPreferenciasAlimentarias(Usuario.Preferencias.Organico);
    }//GEN-LAST:event_rBOrganicoActionPerformed

    private void checkBoxCeliacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxCeliacoActionPerformed
        int posicionEnum = Usuario.Restricciones.Celiaco.ordinal();
        boolean valorEnPos = usuario.getListaRestricciones()[posicionEnum];
        usuario.getListaRestricciones()[posicionEnum] = !valorEnPos;
    }//GEN-LAST:event_checkBoxCeliacoActionPerformed

    private void checkBoxDiabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxDiabeticoActionPerformed
        int posicionEnum = Usuario.Restricciones.Diabetico.ordinal();
        boolean valorEnPos = usuario.getListaRestricciones()[posicionEnum];
        usuario.getListaRestricciones()[posicionEnum] = !valorEnPos;
    }//GEN-LAST:event_checkBoxDiabeticoActionPerformed

    private void btnCambiarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarFotoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter file = new FileNameExtensionFilter("Archivo imagen", "jpg");
        fileChooser.setFileFilter(file);
        int imagen = fileChooser.showOpenDialog(this);
        if (imagen == JFileChooser.APPROVE_OPTION) {
            ImageIcon imgFotoPerfil = new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath());
            ImageIcon fotoArreglada = resizeImageIcon(imgFotoPerfil, 210, 240);
            usuario.setFotoPerfil(fotoArreglada);
        }
        actualizar();
    }//GEN-LAST:event_btnCambiarFotoActionPerformed

    void actualizar() {
        fotoPerfil.setIcon(usuario.getFotoPerfil());
    }

    ImageIcon resizeImageIcon(ImageIcon imageIcon, Integer width, Integer height) {
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);

        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(imageIcon.getImage(), 0, 0, width, height, null);
        graphics2D.dispose();

        return new ImageIcon(bufferedImage, imageIcon.getDescription());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarUsuario;
    private javax.swing.JButton btnCambiarFoto;
    private javax.swing.JTextField cajaAltura;
    private javax.swing.JTextField cajaApellidos;
    private javax.swing.JTextField cajaNombUsuario;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPeso;
    private javax.swing.JCheckBox checkBoxCeliaco;
    private javax.swing.JCheckBox checkBoxDiabetico;
    private javax.swing.JCheckBox checkBoxHipertension;
    private javax.swing.JCheckBox checkBoxIntoleranteLactosa;
    private javax.swing.JLabel etiquetaAltura;
    private javax.swing.JLabel etiquetaApellidos;
    private javax.swing.JLabel etiquetaErrorAltura;
    private javax.swing.JLabel etiquetaErrorApellido;
    private javax.swing.JLabel etiquetaErrorFechaNacimiento;
    private javax.swing.JLabel etiquetaErrorNombre;
    private javax.swing.JLabel etiquetaErrorNombreUsuario;
    private javax.swing.JLabel etiquetaErrorPeso;
    private javax.swing.JLabel etiquetaFDNaciomiento;
    private javax.swing.JLabel etiquetaFotoPerfil;
    private javax.swing.JLabel etiquetaMedidaAltura;
    private javax.swing.JLabel etiquetaMedidaPeso;
    private javax.swing.JLabel etiquetaMensajeAlAceptar;
    private javax.swing.JLabel etiquetaNacionalidadUsuario;
    private javax.swing.JLabel etiquetaNombUsuario;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPeso;
    private javax.swing.JLabel etiquetaPreferencias;
    private javax.swing.JLabel etiquetaRestricciones;
    private javax.swing.JLabel etiquetaSexo;
    private javax.swing.JLabel etiquetaTitulo;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.ButtonGroup grupoBotonesPreferencias;
    private javax.swing.ButtonGroup grupoBotonesSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JComboBox listaNacionalidadesUsuario;
    private javax.swing.JPanel panelRegUsuario;
    private javax.swing.JRadioButton rBMacrobiotico;
    private javax.swing.JRadioButton rBOrganico;
    private javax.swing.JRadioButton rBVegano;
    private javax.swing.JRadioButton rBVegetariano;
    private javax.swing.JRadioButton rBtnFemeninoUsuario;
    private javax.swing.JRadioButton rBtnMasculinoUsuario;
    // End of variables declaration//GEN-END:variables

    private boolean pidoDatoNumerico(String dato, int min, int max, JLabel etiqueta) {
        int datoAVerificar;
        boolean pidiendo = false;
        try {
            datoAVerificar = Integer.parseInt(dato);
            if ((datoAVerificar >= min) && (datoAVerificar <= max)) {
                pidiendo = true;
            } else {
                etiqueta.setText("El dato debe estar entre:"
                        + min + "y" + max);
            }
        } catch (NumberFormatException ex) {
            etiqueta.setText("Debe ingresar un valor numérico");
        }
        return pidiendo;
    }

    private boolean sexoPredeterminado() {
        boolean predeterminado = true;
        if (!rBtnMasculinoUsuario.isSelected()) {
            predeterminado = false;
        }
        return predeterminado;
    }
}
