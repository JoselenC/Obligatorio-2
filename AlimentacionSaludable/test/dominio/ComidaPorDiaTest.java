package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComidaPorDiaTest {

    public ComidaPorDiaTest() {
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
    public void testGetComidasIngeridas() {
        System.out.println("getComidasIngeridas");
        ComidaPorDia instance = new ComidaPorDia();
        ArrayList<Alimento> expResult = new ArrayList<Alimento>();
        ArrayList<Alimento> result = instance.getComidasIngeridas();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        ComidaPorDia instance = new ComidaPorDia();
        String fechaExpected = "Comidas ingeridas el: " + "23/03/2020";
        String fecha = "23/03/2020";
        instance.setFecha(fecha);
        String resultado = instance.toString();
        assertEquals(fechaExpected, resultado);
    }

    @Test
    public void testconstructor() {
        ArrayList<Alimento> comidasIngeridas = new ArrayList<Alimento>();
        String fecha = "23/03/2020";
        ComidaPorDia expected = new ComidaPorDia();
        expected.setFecha(fecha);
        expected.setComidasIngeridas(comidasIngeridas);
        ComidaPorDia instance = new ComidaPorDia(comidasIngeridas, fecha);
        assertEquals(expected, instance);
    }
     
    @Test
    public void testSetComidasIngeridas() {
        ArrayList<Alimento> comidasIngeridasExpected = new ArrayList<Alimento>();
        ComidaPorDia instance = new ComidaPorDia();
        instance.setComidasIngeridas(comidasIngeridasExpected);
        ArrayList<Alimento> comidasIngeridas= instance.getComidasIngeridas();
        assertEquals(comidasIngeridasExpected, comidasIngeridas);
    }
    
      @Test
    public void testEqualsCaseObjNull() {
        ArrayList<Alimento> comidasIngeridasExpected = new ArrayList<Alimento>();
        ComidaPorDia instance = new ComidaPorDia();
        instance.setComidasIngeridas(comidasIngeridasExpected);
        ArrayList<Alimento> comidasIngeridas= instance.getComidasIngeridas();
        assertNotEquals(null, comidasIngeridas);
    }
    
     @Test
    public void testEqualsCaseDiffType() {
        ArrayList<Alimento> comidasIngeridasExpected = new ArrayList<Alimento>();
        ComidaPorDia instance = new ComidaPorDia();
        instance.setComidasIngeridas(comidasIngeridasExpected);
        ArrayList<Alimento> comidasIngeridas= instance.getComidasIngeridas();
        Usuario usuario=new Usuario();
        assertNotEquals(usuario, comidasIngeridas);
    }
    
    
    @Test
    public void testSetFecha() {
       String fechaExpected = "23/03/2020";
        ComidaPorDia instance = new ComidaPorDia();
        instance.setFecha(fechaExpected);
        String fecha= instance.getFecha();
        assertEquals(fechaExpected, fecha);
    }
    
}
