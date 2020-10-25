package dominio;

import static datechooser.beans.pic.Pictures.getResource;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SistemaTest {
    
    public SistemaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetListaTiposDeUsuario() {
        System.out.println("getListaTiposDeUsuario");
        Sistema instance = new Sistema();
        Sistema.tipoUsuario[] expResult = {Sistema.tipoUsuario.Profesional, Sistema.tipoUsuario.Usuario};
        Sistema.tipoUsuario[] result = instance.getListaTiposDeUsuario();
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testPidoDatoNumericoInvalido() {
        System.out.println("pidoDatoNumericoInvalido");
        int dato = -1;
        int min = 0;
        int max = 2;
        Sistema instance = new Sistema();
        boolean result = instance.pidoDatoNumerico(dato, min, max);
        assertFalse(result);
    }
    
    @Test
    public void testPidoDatoNumericoInvalido2() {
        System.out.println("pidoDatoNumericoInvalido2");
        int dato = 3;
        int min = 0;
        int max = 2;
        Sistema instance = new Sistema();
        boolean result = instance.pidoDatoNumerico(dato, min, max);
        assertFalse(result);
    }

    @Test
    public void testResizeImageIconTrue(){
        System.out.println("resizeImageIcon");
        Sistema instance = new Sistema();
        ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"));
        Integer width = 100;
        Integer height = 100;
        ImageIcon result = instance.resizeImageIcon(imageIcon, width, height);
        boolean heightCorrectas = result.getIconHeight() == height;
        boolean widthCorrectas = result.getIconWidth() == width;
        assertTrue(heightCorrectas && widthCorrectas);
    }
    
    @Test
    public void testResizeImageIconFalse(){
        System.out.println("resizeImageIcon");
        Sistema instance = new Sistema();
        ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"));
        Integer width = 100;
        Integer height = 100;
        Integer heightMal = 50;
        ImageIcon result = instance.resizeImageIcon(imageIcon, width, height);
        boolean heightCorrectas = result.getIconHeight() == heightMal;
        boolean widthCorrectas = result.getIconWidth() == width;
        assertFalse(heightCorrectas && widthCorrectas);
    }

    @Test
    public void testRegistroUsuario() {
        System.out.println("registroUsuario");
        String unNombre = "nombre";
        String unApellido = "apellido";
        String unUsuario = "usuario";
        String unSexo = "Masculino";
        String unaFechaNacimiento = "19/11/2004";
        double unaAltura = 1.0;
        ImageIcon unaFotoPerfil = new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"));
        double unPeso = 1.0;
        Usuario.Nacionalidades unaNacionalidad = Usuario.Nacionalidades.Uruguaya;
        Sistema instance = new Sistema();
        instance.registroUsuario(unNombre, unApellido, unUsuario, unSexo, unaFechaNacimiento, unaAltura, unaFotoPerfil, unPeso, unaNacionalidad);
        assertTrue(instance.getListaUsuarios().size()>0);
    }
    
    @Test
    public void testRegistroUsuarioInvalido() {
        System.out.println("registroUsuario");
        String unNombre = "nombre";
        String unApellido = "apellido";
        String unUsuario = "usuario";
        String unSexo = "Masculino";
        String unaFechaNacimiento = "19/11/2004";
        double unaAltura = 1.0;
        ImageIcon unaFotoPerfil = new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"));
        double unPeso = 1.0;
        Usuario.Nacionalidades unaNacionalidad = Usuario.Nacionalidades.Uruguaya;
        Sistema instance = new Sistema();
        instance.registroUsuario(unNombre, unApellido, unUsuario, unSexo, unaFechaNacimiento, unaAltura, unaFotoPerfil, unPeso, unaNacionalidad);
        instance.registroUsuario(unNombre, unApellido, unUsuario, unSexo, unaFechaNacimiento, unaAltura, unaFotoPerfil, unPeso, unaNacionalidad);
        assertFalse(instance.getListaUsuarios().size()>1);
    }

    @Test
    public void testRegistroProfesionalInvalido() {
        System.out.println("registroProfesionalInvalido");
        String unNombre = "nombre";
        String unApellido = "apellido";
        String unNombreUsuario = "usuario";
        String unNombreTitulo = "titulo";
        Profesional.Pais unPais = Profesional.Pais.Uruguay;
        ImageIcon unaFotoPerfil = new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaProfesional.png"));
        String unaFechaNacimiento = "19/11/2004";
        String unaFechaGraduacion = "19/11/2004";
        Profesional.Pais unPaisTitulo = Profesional.Pais.Uruguay;
        Sistema instance = new Sistema();
        instance.registroProfesional(unNombre, unApellido, unNombreUsuario, unNombreTitulo, unPais, unaFotoPerfil, unaFechaNacimiento, unaFechaGraduacion, unPaisTitulo);
        instance.registroProfesional(unNombre, unApellido, unNombreUsuario, unNombreTitulo, unPais, unaFotoPerfil, unaFechaNacimiento, unaFechaGraduacion, unPaisTitulo);
        assertFalse(instance.getListaProfesionales().size()>1);
    }
    
    @Test
    public void testRegistroProfesional() {
        System.out.println("registroProfesional");
        String unNombre = "nombre";
        String unApellido = "apellido";
        String unNombreUsuario = "usuario";
        String unNombreTitulo = "titulo";
        Profesional.Pais unPais = Profesional.Pais.Uruguay;
        ImageIcon unaFotoPerfil = new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaProfesional.png"));
        String unaFechaNacimiento = "19/11/2004";
        String unaFechaGraduacion = "19/11/2004";
        Profesional.Pais unPaisTitulo = Profesional.Pais.Uruguay;
        Sistema instance = new Sistema();
        instance.registroProfesional(unNombre, unApellido, unNombreUsuario, unNombreTitulo, unPais, unaFotoPerfil, unaFechaNacimiento, unaFechaGraduacion, unPaisTitulo);
        assertTrue(instance.getListaProfesionales().size()>0);
    }

    @Test
    public void testRegistroAlimento() {
        System.out.println("registroAlimento");
        String nombreAlim = "";
        Alimento.TipoAlimento unTipo = Alimento.TipoAlimento.Otro;
        Alimento a = new Alimento();
        boolean[] unaListaNutrientes = new boolean[a.getListaNutrientesSeleccionados().length];
        Sistema instance = new Sistema();
        instance.registroAlimento(nombreAlim, unTipo, unaListaNutrientes);
        assertTrue(instance.getListaAlimentos().size()>0);
    }
    
    @Test
    public void testRegistroAlimentoInvalido() {
        System.out.println("registroAlimentoInvalido");
        String nombreAlim = "";
        Alimento.TipoAlimento unTipo = Alimento.TipoAlimento.Otro;
        Alimento a = new Alimento();
        boolean[] unaListaNutrientes = new boolean[a.getListaNutrientesSeleccionados().length];
        Sistema instance = new Sistema();
        instance.registroAlimento(nombreAlim, unTipo, unaListaNutrientes);
        instance.registroAlimento(nombreAlim, unTipo, unaListaNutrientes);
        assertFalse(instance.getListaAlimentos().size()>1);
    }
    
    @Test
    public void testValuesTipoUsuario(){
        Sistema.tipoUsuario[] listaNac = Sistema.tipoUsuario.values();
    }
    
    @Test
    public void testSistemaPorParametro(){
        ArrayList<Usuario> listaU = new ArrayList<Usuario>();
        ArrayList<Profesional> listaP = new ArrayList<Profesional>();
        ArrayList<Alimento> listaA = new ArrayList<Alimento>();
        Sistema.tipoUsuario usuarioActivo = Sistema.tipoUsuario.NoSeleccionado;
        Sistema s = new Sistema(listaA,listaU,listaP,usuarioActivo);
    }
    
}
