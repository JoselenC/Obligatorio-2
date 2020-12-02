
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
        String usuario="Joselen";
        String contraseña="1234";
        Administrador administrador=new Administrador(usuario,contraseña);
        Administrador administradorEsperado= new Administrador();
        administradorEsperado.setContraseña(contraseña);
        administradorEsperado.setUsuario(usuario);
        assertEquals(administrador,administradorEsperado);
    }
    
    
     @Test
    public void testGetUsuario() {
        String usuarioEsperado="Joselen";
        String contraseña="1234";
        Administrador administrador=new Administrador(usuarioEsperado,contraseña);
        String usuario= administrador.getUsuario();
        assertEquals(usuarioEsperado,usuario);
    }
    
     @Test
    public void testGetContraseña() {
        String usuario="Joselen";
        String contraseñaEsperada="1234";
        Administrador administrador=new Administrador(usuario,contraseñaEsperada);
        String contraseña=administrador.getContraseña();
        assertEquals(contraseña,contraseñaEsperada);
    }
    
     @Test
    public void testEqualsCaseDiffContraseña() {
        String usuario="Joselen";
        String contraseñaEsperada="123478";
        String contraseña="3478";
        Administrador administrador=new Administrador(usuario,contraseñaEsperada);
        Administrador administrador2=new Administrador(usuario,contraseña);
        assertNotEquals(administrador,administrador2);
    }
    
     @Test
    public void testEqualsCaseDiffUsuario() {
        String usuario="JoselenCC";
        String contraseñaEsperada="123478";
        String usuario2="Joselen";
        Administrador administrador=new Administrador(usuario,contraseñaEsperada);
        Administrador administrador2=new Administrador(usuario2,contraseñaEsperada);
        assertNotEquals(administrador2,administrador);
    }
    
    @Test
    public void testEqualsCaseDiffObj() {
        String usuario="JoselenCC";
        String contraseñaEsperada="123478";
        String usuario2="Joselen";
        Administrador administrador=new Administrador(usuario,contraseñaEsperada);
        Administrador administrador2=new Administrador(usuario2,contraseñaEsperada);
        assertNotEquals(administrador2,administrador);
    }
    
     @Test
    public void testEqualsCaseNull() {
        Administrador administrador=null;
         Administrador administrador2=new Administrador();
        assertNotEquals(administrador2,administrador);
    }
    
     @Test
    public void testEqualsCaseDiffType() {
        Alimento alimento=new Alimento();
         Administrador administrador2=new Administrador();
        assertNotEquals(administrador2,alimento);
    }
    
     @Test
    public void testToString() {
        String usuario="Joselen";
        String contraseñaEsperada="1234";
        Administrador administrador=new Administrador(usuario,contraseñaEsperada);
        String administradorString= administrador.toString();
        String administradorEsperadoString ="Administrador{" + "usuario=" + usuario + '}';
        assertEquals(administradorString,administradorEsperadoString);
    }
}
