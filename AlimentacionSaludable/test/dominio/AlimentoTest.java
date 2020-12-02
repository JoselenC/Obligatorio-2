package dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlimentoTest {

    public AlimentoTest() {
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
    public void testSetListaEnumNutrientes() {
        Alimento instance = new Alimento();
        Alimento.Nutrientes[] listaEnumNutrientesExpected = instance.inicializoNutrientes();
        instance.setListaEnumNutrientes(listaEnumNutrientesExpected);
        Alimento.Nutrientes[] listaEnumNutrientes = instance.getListaEnumNutrientes();
        assertArrayEquals(listaEnumNutrientesExpected, listaEnumNutrientes);
    }

    @Test
    public void testSetListaEnumTipoAlimento() {
        Alimento instance = new Alimento();
        Alimento.TipoAlimento[] listaEnumTipoAlimentoExpected = instance.inicializoTipoAlimento();
        instance.setListaEnumTipoAlimento(listaEnumTipoAlimentoExpected);
        Alimento.TipoAlimento[] listaEnumTipoAlimento = instance.getListaEnumTipoAlimento();
        assertArrayEquals(listaEnumTipoAlimentoExpected, listaEnumTipoAlimento);
    }

    @Test
    public void testgetListaEnumNutrientes() {
        Alimento instance = new Alimento();
        Alimento.Nutrientes[] listaEnumNutrientesExpected = instance.inicializoNutrientes();
        instance.setListaEnumNutrientes(listaEnumNutrientesExpected);
        Alimento.Nutrientes[] listaEnumNutrientes = instance.getListaEnumNutrientes();
        assertArrayEquals(listaEnumNutrientesExpected, listaEnumNutrientes);
    }

     @Test
    public void testToString(){
        Alimento instance = new Alimento();
        String nombreExpected="Juan";
        instance.setNombre(nombreExpected);
        String nombre= instance.toString();
        assertEquals(nombreExpected,nombre);
    }
    
    @Test
    public void testGetTipoBebidas() {
        System.out.println("getTipo");
        Alimento instance = new Alimento();
        instance.setTipo(Alimento.TipoAlimento.Bebidas);
        Alimento.TipoAlimento expResult = Alimento.TipoAlimento.Bebidas;
        Alimento.TipoAlimento result = instance.getTipo();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTipoCarnesBlancas() {
        System.out.println("getTipo");
        Alimento instance = new Alimento();
        instance.setTipo(Alimento.TipoAlimento.CarnesBlancas);
        Alimento.TipoAlimento expResult = Alimento.TipoAlimento.CarnesBlancas;
        Alimento.TipoAlimento result = instance.getTipo();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTipoCarnesRojas() {
        System.out.println("getTipo");
        Alimento instance = new Alimento();
        instance.setTipo(Alimento.TipoAlimento.CarnesRojas);
        Alimento.TipoAlimento expResult = Alimento.TipoAlimento.CarnesRojas;
        Alimento.TipoAlimento result = instance.getTipo();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTipoCereal() {
        System.out.println("getTipo");
        Alimento instance = new Alimento();
        instance.setTipo(Alimento.TipoAlimento.Cereal);
        Alimento.TipoAlimento expResult = Alimento.TipoAlimento.Cereal;
        Alimento.TipoAlimento result = instance.getTipo();
        assertEquals(expResult, result);
    }

}
