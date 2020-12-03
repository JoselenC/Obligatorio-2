package dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdministradorTest {

    public AdministradorTest() {
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
    public void testConstructorParametros() {
        String usuario = "Joselen";
        String contrasenia = "1234";
        Administrador administrador = new Administrador(usuario, contrasenia);
        Administrador administradorEsperado = new Administrador();
        administradorEsperado.setContrasenia(contrasenia);
        administradorEsperado.setUsuario(usuario);
        assertEquals(administrador, administradorEsperado);
    }

    @Test
    public void testGetUsuario() {
        String usuarioEsperado = "Joselen";
        String contrasenia = "1234";
        Administrador administrador = new Administrador(usuarioEsperado, contrasenia);
        String usuario = administrador.getUsuario();
        assertEquals(usuarioEsperado, usuario);
    }

    @Test
    public void testGetContraseña() {
        String usuario = "Joselen";
        String contraseniaEsperada = "1234";
        Administrador administrador = new Administrador(usuario, contraseniaEsperada);
        String contrasenia = administrador.getContrasenia();
        assertEquals(contrasenia, contraseniaEsperada);
    }

    @Test
    public void testEqualsCaseDiffcontrasenia() {
        String usuario = "Joselen";
        String contraseniaEsperada = "123478";
        String contrasenia = "3478";
        Administrador administrador = new Administrador(usuario, contraseniaEsperada);
        Administrador administrador2 = new Administrador(usuario, contrasenia);
        assertNotEquals(administrador, administrador2);
    }

    @Test
    public void testEqualsCaseDiffUsuario() {
        String usuario = "JoselenCC";
        String contraseniaEsperada = "123478";
        String usuario2 = "Joselen";
        Administrador administrador = new Administrador(usuario, contraseniaEsperada);
        Administrador administrador2 = new Administrador(usuario2, contraseniaEsperada);
        assertNotEquals(administrador2, administrador);
    }

    @Test
    public void testEqualsCaseDiffObj() {
        String usuario = "JoselenCC";
        String contraseniaEsperada = "123478";
        String usuario2 = "Joselen";
        Administrador administrador = new Administrador(usuario, contraseniaEsperada);
        Administrador administrador2 = new Administrador(usuario2, contraseniaEsperada);
        assertNotEquals(administrador2, administrador);
    }

    @Test
    public void testEqualsCaseNull() {
        Administrador administrador = null;
        Administrador administrador2 = new Administrador();
        assertNotEquals(administrador2, administrador);
    }

    @Test
    public void testEqualsCaseDiffType() {
        Alimento alimento = new Alimento();
        Administrador administrador2 = new Administrador();
        assertNotEquals(administrador2, alimento);
    }

    @Test
    public void testToString() {
        String usuario = "Joselen";
        String contraseniaEsperada = "1234";
        Administrador administrador = new Administrador(usuario, contraseniaEsperada);
        String administradorString = administrador.toString();
        String administradorEsperadoString = "Administrador{" + "usuario=" + usuario + '}';
        assertEquals(administradorString, administradorEsperadoString);
    }
}
