package dominio;


import java.util.ArrayList;
import javax.swing.ImageIcon;
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
        boolean result = instance.esNumero(dato, min, max);
        assertFalse(result);
    }

    @Test
    public void testPidoDatoNumericoInvalido2() {
        System.out.println("pidoDatoNumericoInvalido2");
        int dato = 3;
        int min = 0;
        int max = 2;
        Sistema instance = new Sistema();
        boolean result = instance.esNumero(dato, min, max);
        assertFalse(result);
    }

    @Test
    public void testResizeImageIconTrue() {
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
    public void testResizeImageIconFalse() {
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
        assertTrue(instance.getUsuarios().size() > 0);
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
        assertFalse(instance.getUsuarios().size() > 1);
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
        assertFalse(instance.getProfesionales().size() > 1);
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
        assertTrue(instance.getProfesionales().size() > 0);
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
        assertTrue(instance.getAlimentos().size() > 0);
    }

    @Test
    public void testSetGetAlimentos() {
        Sistema sistema = new Sistema();
        ArrayList<Alimento> alimentosExpected = new ArrayList<>();
        sistema.setAlimentos(alimentosExpected);
        ArrayList<Alimento> alimentos = sistema.getAlimentos();
        assertEquals(alimentosExpected, alimentos);
    }

    @Test
    public void testGetUsuarioPorNombre() {
        Sistema sistema = new Sistema();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setNombre("joselen");
        usuarios.add(usuario);
        sistema.setUsuarios(usuarios);
        Usuario usuarioEncontrado = sistema.getUsuarioPorNombre("joselen");
        assertEquals(usuario, usuarioEncontrado);
    }

    @Test
    public void testGeUsuarioPorNombre() {
        Sistema sistema = new Sistema();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setNombre("joselen");
        usuarios.add(usuario);
        sistema.setUsuarios(usuarios);
        Usuario usuarioEncontrado = sistema.getUsuarioPorNombre("joselenC");
        assertEquals(usuarioEncontrado, null);
    }

    @Test
    public void testSetListaTiposDeUsuario() {
        Sistema sistema = new Sistema();
        Sistema.tipoUsuario[] tipoUsuario = sistema.inicializoListaTiposDeUsuario();
        sistema.setListaTiposDeUsuario(tipoUsuario);
        Sistema.tipoUsuario[] tipoUsuario2 = sistema.getListaTiposDeUsuario();

        assertEquals(tipoUsuario, tipoUsuario2);
    }

    @Test
    public void testRegistroAdministrador() {
        Sistema sistema = new Sistema();
        sistema.registroAdministrador("Joselen", "1234");
    }

    @Test
    public void testExisteNombreUsuarioCaseTrue() {
        Sistema sistema = new Sistema();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setNombre("joselen");
        usuarios.add(usuario);
        sistema.setUsuarios(usuarios);
        boolean usuarioEncontrado = sistema.existeNombreUsuario("joselen");
        assertTrue(usuarioEncontrado);
    }

    @Test
    public void testExisteNombreUsuarioCaseFalse() {
        Sistema sistema = new Sistema();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setNombre("joselen");
        usuarios.add(usuario);
        sistema.setUsuarios(usuarios);
        boolean usuarioEncontrado = sistema.existeNombreUsuario("joselenC");
        assertFalse(usuarioEncontrado);
    }

    @Test
    public void testExisteNombreProfesionCaseFalse() {
        Sistema sistema = new Sistema();
        ArrayList<Profesional> profesionales = new ArrayList<>();
        Profesional profesional = new Profesional();
        profesional.setNombre("joselen");
        profesionales.add(profesional);
        boolean profesionalEncontrado = sistema.existeNombreProfesional("joselenC");
        assertFalse(profesionalEncontrado);
    }

    @Test
    public void testExisteNombreProfesionCaseTrue() {
        Sistema sistema = new Sistema();
        ArrayList<Profesional> profesionales = new ArrayList<>();
        Profesional profesional = new Profesional();
        profesional.setNombre("joselen");
        profesionales.add(profesional);
        sistema.setProfesionales(profesionales);
        boolean profesionalEncontrado = sistema.existeNombreProfesional("joselen");
        assertTrue(profesionalEncontrado);
    }

    @Test
    public void testExisteNombreGetProfesionalPorNombre() {
        Sistema sistema = new Sistema();
        ArrayList<Profesional> profesionales = new ArrayList<>();
        Profesional profesional = new Profesional();
        profesional.setNombre("joselen");
        profesionales.add(profesional);
        sistema.setProfesionales(profesionales);
        Profesional profesionalEncontrado = sistema.getProfesionalPorNombre("joselen");
        assertEquals(profesional, profesionalEncontrado);
    }

    @Test
    public void testSetAdministrador() {
        Sistema sistema = new Sistema();
        Administrador administrador = new Administrador();
        sistema.setAdministrador(administrador);
        assertEquals(administrador, administrador);
    }

    @Test
    public void testSetGetAdministradores() {
        Sistema sistema = new Sistema();
        ArrayList<Administrador> administradores = new ArrayList<>();
        sistema.setListaAdministradores(administradores);
        ArrayList<Administrador> administradores2 = sistema.getListaAdministradores();
        assertEquals(administradores, administradores2);
    }

    @Test
    public void testSetUsuario() {
        Sistema sistema = new Sistema();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        sistema.setUsuarios(usuarios);
        ArrayList<Usuario> usuarios2 = sistema.getUsuarios();
        assertEquals(usuarios, usuarios2);
    }

    @Test
    public void testGetUsuarioActivo() {
        Sistema sistema = new Sistema();
        Sistema.tipoUsuario usuarioTipo = Sistema.tipoUsuario.Profesional;
        sistema.setUsuarioActivo(usuarioTipo);
        Sistema.tipoUsuario usuario = sistema.getUsuarioActivo();
        assertEquals(usuarioTipo, usuario);
    }

    @Test
    public void testValuesTipoUsuario() {
        Sistema.tipoUsuario[] listaNac = Sistema.tipoUsuario.values();
    }

    @Test
    public void testSistemaPorParametro() {
        ArrayList<Usuario> listaU = new ArrayList<>();
        ArrayList<Profesional> listaP = new ArrayList<>();
        ArrayList<Alimento> listaA = new ArrayList<>();
        ArrayList<Administrador> listaAdmi = new ArrayList<>();
        Sistema.tipoUsuario usuarioActivo = Sistema.tipoUsuario.NoSeleccionado;
        Sistema s = new Sistema(listaA, listaU, listaP, listaAdmi, usuarioActivo);
    }

}
