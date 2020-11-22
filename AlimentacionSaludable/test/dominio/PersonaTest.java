package dominio;

import javax.swing.ImageIcon;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonaTest {
    
    public PersonaTest() {
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
    public void testGetEmptyNombre() {
        System.out.println("getNombre");
        Persona instance = new Usuario();
        String expResult = "no ingreso nombre";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testGetNombre() {
        String nombre="Juan";
        Persona instance = new Usuario();
        instance.setNombre(nombre);
        String result = instance.getNombre();
        assertEquals(nombre, result);
    }

     @Test
    public void testGetEmptyApellido() {
        Persona instance = new Usuario();
        String expResult = "no ingreso apellido";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetApellidos() {
        String apellido="Perez";
        Persona instance = new Usuario();
        instance.setApellidos(apellido);
        String result = instance.getApellidos();
        assertEquals(apellido, result);
    }
    
    @Test
    public void testGetFechaNacimiento() {
        String fechaExpected="23/04/2020";
        Persona instance = new Usuario();
        instance.setApellidos("lopez");
        instance.setFechaNacimiento(fechaExpected);
        String fechaNacimiento = instance.getApellidos();
        assertEquals(fechaExpected, fechaNacimiento);
    }
        
    @Test
    public void testEqualsFalse() {
        System.out.println("equalsFalse");
        Persona obj = new Usuario();
        obj.setNombreUsuario("pruebaFalse");
        Persona instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test(expected = NullPointerException.class)
    public void testEqualsNull() {
        System.out.println("equalsNull");
        Persona obj = null;
        Persona instance = new Usuario();
        assert(instance.equals(obj));
    }
    
    @Test
    public void testEqualsDistintoTipo() {
        System.out.println("equalsNull");
        Persona instance = new Usuario();
        boolean test = instance.equals("soy string");
        assertFalse(test);
    }

    public class PersonaImpl extends Persona {

        public PersonaImpl() {
            super("", "", "", "", null);
        }
    }
    
}
