package interfaz;

import dominio.Sistema;
import dominio.Usuario;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PanelEditarPerfilUsuario extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private Usuario usuario;
    private JFrame ventana;
    private InterfazBotonesUsuario interfaz;

    //Constructor
    public PanelEditarPerfilUsuario(Sistema unSistema, JFrame unaVentana,
            InterfazBotonesUsuario interfazActual) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        interfaz = interfazActual;
        usuario = interfaz.getUsuarioActual();
        grupoBotonesSexo.add(rBtnFemeninoUsuario);
        grupoBotonesSexo.add(rBtnMasculinoUsuario);
        rBtnMasculinoUsuario.setSelected(true);
        grupoBotonesPreferencias.add(rBVegano);
        grupoBotonesPreferencias.add(rBVegetariano);
        grupoBotonesPreferencias.add(rBMacrobiotico);
        grupoBotonesPreferencias.add(rBOrganico);
        Usuario.Nacionalidades[] listaNac = usuario.getListaEnumNac();
        listaNacionalidadesUsuario.setModel(new DefaultComboBoxModel(listaNac));
        listaNacionalidadesUsuario.setSelectedIndex(Usuario.Nacionalidades.Uruguaya.ordinal());
        usuario.setListaRestricciones(new boolean[usuario.getListaRestricciones().length]);
        usuario.setPreferenciasAlimentarias(Usuario.Preferencias.Ninguna);
        fotoPerfil.setSize(210, 240);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotonesSexo = new javax.swing.ButtonGroup();
        grupoBotonesPreferencias = new javax.swing.ButtonGroup();
        panelEditarPerfilUsuario = new javax.swing.JPanel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaApellidos = new javax.swing.JLabel();
        etiquetaFDNaciomiento = new javax.swing.JLabel();
        etiquetaFotoPerfil = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        cajaApellidos = new javax.swing.JTextField();
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
        btnVolver = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1147, 784));

        panelEditarPerfilUsuario.setBackground(new java.awt.Color(255, 255, 255));
        panelEditarPerfilUsuario.setPreferredSize(new java.awt.Dimension(1147, 784));
        panelEditarPerfilUsuario.setLayout(null);

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNombre.setText("Nombre:");
        panelEditarPerfilUsuario.add(etiquetaNombre);
        etiquetaNombre.setBounds(370, 80, 92, 29);

        etiquetaApellidos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaApellidos.setText("Apellidos:");
        panelEditarPerfilUsuario.add(etiquetaApellidos);
        etiquetaApellidos.setBounds(360, 130, 110, 26);

        etiquetaFDNaciomiento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFDNaciomiento.setText("Fecha de Nacimiento:");
        panelEditarPerfilUsuario.add(etiquetaFDNaciomiento);
        etiquetaFDNaciomiento.setBounds(240, 230, 230, 26);

        etiquetaFotoPerfil.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFotoPerfil.setText("Foto de Perfil:");
        panelEditarPerfilUsuario.add(etiquetaFotoPerfil);
        etiquetaFotoPerfil.setBounds(60, 110, 160, 29);

        cajaNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaNombreFocusLost(evt);
            }
        });
        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(cajaNombre);
        cajaNombre.setBounds(480, 80, 160, 35);

        cajaApellidos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaApellidosFocusLost(evt);
            }
        });
        panelEditarPerfilUsuario.add(cajaApellidos);
        cajaApellidos.setBounds(480, 130, 160, 35);

        etiquetaPeso.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaPeso.setText("Peso:");
        panelEditarPerfilUsuario.add(etiquetaPeso);
        etiquetaPeso.setBounds(410, 330, 60, 26);

        etiquetaAltura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaAltura.setText("Altura:");
        panelEditarPerfilUsuario.add(etiquetaAltura);
        etiquetaAltura.setBounds(400, 280, 70, 26);

        cajaAltura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaAltura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaAlturaFocusLost(evt);
            }
        });
        cajaAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaAlturaActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(cajaAltura);
        cajaAltura.setBounds(480, 330, 160, 35);

        cajaPeso.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaPeso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaPesoFocusLost(evt);
            }
        });
        panelEditarPerfilUsuario.add(cajaPeso);
        cajaPeso.setBounds(480, 280, 160, 35);

        etiquetaMedidaPeso.setText("Kg");
        panelEditarPerfilUsuario.add(etiquetaMedidaPeso);
        etiquetaMedidaPeso.setBounds(650, 330, 24, 26);

        etiquetaMedidaAltura.setText("Cm");
        panelEditarPerfilUsuario.add(etiquetaMedidaAltura);
        etiquetaMedidaAltura.setBounds(650, 280, 31, 26);

        btnAceptarUsuario.setBackground(new java.awt.Color(255, 0, 102));
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
        panelEditarPerfilUsuario.add(btnAceptarUsuario);
        btnAceptarUsuario.setBounds(850, 590, 200, 40);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 0, 102));
        etiquetaTitulo.setText("Editar perfil del usuario");
        panelEditarPerfilUsuario.add(etiquetaTitulo);
        etiquetaTitulo.setBounds(390, 0, 380, 44);

        etiquetaNacionalidadUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNacionalidadUsuario.setText("Nacionalidad:");
        panelEditarPerfilUsuario.add(etiquetaNacionalidadUsuario);
        etiquetaNacionalidadUsuario.setBounds(330, 180, 160, 29);

        listaNacionalidadesUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listaNacionalidadesUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaNacionalidadesUsuarioActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(listaNacionalidadesUsuario);
        listaNacionalidadesUsuario.setBounds(480, 180, 160, 35);

        etiquetaSexo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaSexo.setText("Sexo:");
        panelEditarPerfilUsuario.add(etiquetaSexo);
        etiquetaSexo.setBounds(410, 370, 70, 29);

        rBtnMasculinoUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBtnMasculinoUsuario.setText("Masculino");
        rBtnMasculinoUsuario.setContentAreaFilled(false);
        rBtnMasculinoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnMasculinoUsuarioActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(rBtnMasculinoUsuario);
        rBtnMasculinoUsuario.setBounds(480, 370, 150, 35);

        rBtnFemeninoUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBtnFemeninoUsuario.setText("Femenino");
        rBtnFemeninoUsuario.setContentAreaFilled(false);
        rBtnFemeninoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnFemeninoUsuarioActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(rBtnFemeninoUsuario);
        rBtnFemeninoUsuario.setBounds(630, 370, 160, 35);

        etiquetaRestricciones.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaRestricciones.setText("Restricciones:");
        panelEditarPerfilUsuario.add(etiquetaRestricciones);
        etiquetaRestricciones.setBounds(320, 410, 150, 26);

        checkBoxCeliaco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxCeliaco.setText("Celíaco");
        checkBoxCeliaco.setContentAreaFilled(false);
        checkBoxCeliaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxCeliacoActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(checkBoxCeliaco);
        checkBoxCeliaco.setBounds(480, 410, 120, 35);

        checkBoxIntoleranteLactosa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxIntoleranteLactosa.setText("Intolerante a la lactosa");
        checkBoxIntoleranteLactosa.setContentAreaFilled(false);
        checkBoxIntoleranteLactosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxIntoleranteLactosaActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(checkBoxIntoleranteLactosa);
        checkBoxIntoleranteLactosa.setBounds(590, 410, 285, 37);

        checkBoxDiabetico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxDiabetico.setText("Diabético");
        checkBoxDiabetico.setContentAreaFilled(false);
        checkBoxDiabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxDiabeticoActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(checkBoxDiabetico);
        checkBoxDiabetico.setBounds(880, 410, 140, 35);

        checkBoxHipertension.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxHipertension.setText("Hipertensión");
        checkBoxHipertension.setContentAreaFilled(false);
        checkBoxHipertension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxHipertensionActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(checkBoxHipertension);
        checkBoxHipertension.setBounds(480, 450, 170, 35);

        etiquetaErrorNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelEditarPerfilUsuario.add(etiquetaErrorNombre);
        etiquetaErrorNombre.setBounds(660, 80, 400, 30);

        etiquetaErrorApellido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelEditarPerfilUsuario.add(etiquetaErrorApellido);
        etiquetaErrorApellido.setBounds(660, 130, 370, 30);

        etiquetaErrorNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelEditarPerfilUsuario.add(etiquetaErrorNombreUsuario);
        etiquetaErrorNombreUsuario.setBounds(660, 180, 390, 30);

        etiquetaErrorAltura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelEditarPerfilUsuario.add(etiquetaErrorAltura);
        etiquetaErrorAltura.setBounds(790, 330, 230, 0);

        etiquetaErrorPeso.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelEditarPerfilUsuario.add(etiquetaErrorPeso);
        etiquetaErrorPeso.setBounds(790, 380, 310, 0);

        etiquetaMensajeAlAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelEditarPerfilUsuario.add(etiquetaMensajeAlAceptar);
        etiquetaMensajeAlAceptar.setBounds(670, 550, 450, 26);

        fotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"))); // NOI18N
        fotoPerfil.setMaximumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setMinimumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setPreferredSize(new java.awt.Dimension(210, 240));
        panelEditarPerfilUsuario.add(fotoPerfil);
        fotoPerfil.setBounds(30, 150, 210, 220);

        fechaNacimiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fechaNacimientoFocusLost(evt);
            }
        });
        panelEditarPerfilUsuario.add(fechaNacimiento);
        fechaNacimiento.setBounds(480, 230, 160, 32);

        etiquetaErrorFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelEditarPerfilUsuario.add(etiquetaErrorFechaNacimiento);
        etiquetaErrorFechaNacimiento.setBounds(660, 280, 310, 0);

        etiquetaPreferencias.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaPreferencias.setText("Preferencias:");
        panelEditarPerfilUsuario.add(etiquetaPreferencias);
        etiquetaPreferencias.setBounds(320, 490, 150, 26);

        rBVegano.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBVegano.setText("Vegano");
        rBVegano.setContentAreaFilled(false);
        rBVegano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBVeganoActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(rBVegano);
        rBVegano.setBounds(470, 490, 120, 37);

        rBVegetariano.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBVegetariano.setText("Vegetariano");
        rBVegetariano.setContentAreaFilled(false);
        rBVegetariano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBVegetarianoActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(rBVegetariano);
        rBVegetariano.setBounds(590, 490, 170, 37);

        rBMacrobiotico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBMacrobiotico.setText("Macrobiótico");
        rBMacrobiotico.setContentAreaFilled(false);
        rBMacrobiotico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBMacrobioticoActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(rBMacrobiotico);
        rBMacrobiotico.setBounds(760, 490, 180, 37);

        rBOrganico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBOrganico.setText("Orgánico");
        rBOrganico.setContentAreaFilled(false);
        rBOrganico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBOrganicoActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(rBOrganico);
        rBOrganico.setBounds(940, 490, 140, 37);

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
        panelEditarPerfilUsuario.add(btnCambiarFoto);
        btnCambiarFoto.setBounds(30, 390, 210, 37);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(btnVolver);
        btnVolver.setBounds(30, 10, 100, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1147, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelEditarPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelEditarPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaNombreFocusLost
        String nombre = cajaNombre.getText();
        if (nombre.trim().isEmpty()) {
            etiquetaErrorNombre.setText("El nombre no puede ser vacío");
        }
    }//GEN-LAST:event_cajaNombreFocusLost

    private void cajaApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaApellidosFocusLost
        String apellido = cajaApellidos.getText();
        if (apellido.trim().isEmpty()) {
            etiquetaErrorApellido.setText("El apellido no puede ser vacío");
        }
    }//GEN-LAST:event_cajaApellidosFocusLost

    private void cajaAlturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaAlturaFocusLost
        String altura = cajaAltura.getText();
        if (altura.trim().isEmpty()) {
            etiquetaErrorAltura.setText("La altura no puede estar vacía");
        }
    }//GEN-LAST:event_cajaAlturaFocusLost

    private void cajaPesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaPesoFocusLost
        String peso = cajaPeso.getText();
        if (peso.trim().isEmpty()) {
            etiquetaErrorAltura.setText("El peso no puede estar vacío");
        }
    }//GEN-LAST:event_cajaPesoFocusLost

    private void btnAceptarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarUsuarioActionPerformed
        boolean nombreValido = !cajaNombre.getText().trim().isEmpty();
        boolean apellidoValido = !cajaApellidos.getText().trim().isEmpty();
        boolean fNacimientoValido = fechaNacimiento.getCalendar() != null;
        boolean altura = pidoDatoNumerico(cajaAltura.getText(), 0, 265, etiquetaErrorAltura);
        boolean peso = pidoDatoNumerico(cajaPeso.getText(), 0, 265, etiquetaErrorPeso);
        boolean sexoPred = sexoPredeterminado();
        if (nombreValido && apellidoValido
                && altura && peso && fNacimientoValido) {
            usuario.setNombre(cajaNombre.getText());
            usuario.setApellidos(cajaApellidos.getText());
            usuario.setNacionalidad(usuario.getListaEnumNac()[listaNacionalidadesUsuario.getSelectedIndex()]);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String fNacimiento = formatter.format(fechaNacimiento.getCalendar().getTime());
            usuario.setFechaNacimiento(fNacimiento);
            if (sexoPred == true) {
                usuario.setSexo("Masculino");
            } else {
                usuario.setSexo("Femenino");
            }
            usuario.setAlturaCm(Integer.parseInt(cajaAltura.getText()));
            usuario.setPesoKg(Integer.parseInt(cajaPeso.getText()));
            usuario.setFotoPerfil((ImageIcon) fotoPerfil.getIcon());
            etiquetaMensajeAlAceptar.setText("Usuario editado correctamente");

        } else {
            etiquetaMensajeAlAceptar.setText("Error al editar el usuario");
            if (nombreValido == false) {
                etiquetaErrorNombre.setText("El nombre no puede ser vacío");
            }
            if (apellidoValido == false) {
                etiquetaErrorApellido.setText("El apellido no puede ser vacío");
            }
            if (fNacimientoValido == false) {
                etiquetaErrorFechaNacimiento.setText("Fecha de nacimiento no válida");
            }
            if (altura == false) {
                 etiquetaErrorAltura.setText("La altura no puede estar vacía");
            }
            if (peso == false) {
                 etiquetaErrorPeso.setText("El peso no puede estar vacío");
            }
        }
    }//GEN-LAST:event_btnAceptarUsuarioActionPerformed

    private void rBtnMasculinoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnMasculinoUsuarioActionPerformed
        usuario.setSexo("Masculino");
    }//GEN-LAST:event_rBtnMasculinoUsuarioActionPerformed

    private void rBtnFemeninoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnFemeninoUsuarioActionPerformed
        usuario.setSexo("Femenino");
    }//GEN-LAST:event_rBtnFemeninoUsuarioActionPerformed

    private void fechaNacimientoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaNacimientoFocusLost
        //Metodo para validar que se seleccione la fecha de nacimiento 
        if (fechaNacimiento.getCalendar() == null) {
            etiquetaErrorFechaNacimiento.setText("Debe ingresar una fecha");
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

    private void listaNacionalidadesUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaNacionalidadesUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaNacionalidadesUsuarioActionPerformed

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

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void cajaAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaAlturaActionPerformed

    private void btnCambiarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarFotoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter file = new FileNameExtensionFilter("Archivo imagen", "jpg");
        fileChooser.setFileFilter(file);
        int imagen = fileChooser.showOpenDialog(this);
        if (imagen == JFileChooser.APPROVE_OPTION) {
            ImageIcon fotoPerfil = new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath());
            ImageIcon fotoArreglada = resizeImageIcon(fotoPerfil, 210, 240);
            usuario.setFotoPerfil(fotoArreglada);
        }
        actualizar();
    }//GEN-LAST:event_btnCambiarFotoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ventana.remove(this);
        PanelPerfilUsuario nuevo = new PanelPerfilUsuario(sistema, ventana, interfaz);
        interfaz.setActual(nuevo);
        ventana.add(nuevo);
        ventana.pack();
    }//GEN-LAST:event_btnVolverActionPerformed

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
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField cajaAltura;
    private javax.swing.JTextField cajaApellidos;
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
    private javax.swing.JComboBox listaNacionalidadesUsuario;
    private javax.swing.JPanel panelEditarPerfilUsuario;
    private javax.swing.JRadioButton rBMacrobiotico;
    private javax.swing.JRadioButton rBOrganico;
    private javax.swing.JRadioButton rBVegano;
    private javax.swing.JRadioButton rBVegetariano;
    private javax.swing.JRadioButton rBtnFemeninoUsuario;
    private javax.swing.JRadioButton rBtnMasculinoUsuario;
    // End of variables declaration//GEN-END:variables

    private boolean pidoDatoNumerico(String dato, int min, int max, JLabel etiqueta) {
        int datoAVerificar = 0;
        boolean pidiendo = false;
        try {
            datoAVerificar = Integer.parseInt(dato);
            if ((datoAVerificar >= min) && (datoAVerificar <= max)) {
                pidiendo = true;
            } else {
                etiqueta.setText("El dato no es válido, debe estar entre:"
                        + min + "y" + max);
            }
        } catch (NumberFormatException ex) {
            etiqueta.setText("Debe ingresar un valor numérico");
        }
        return pidiendo;
    }

    private boolean sexoPredeterminado() {
        boolean predeterminado = true;
        if (rBtnMasculinoUsuario.isSelected() == false) {
            predeterminado = false;
        }
        return predeterminado;
    }
}
