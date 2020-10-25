package dominio;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProfesionalTest {
    
    public ProfesionalTest() {
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
    public void testGetCasillaDeEntrada() {
        System.out.println("getCasillaDeEntrada");
        Profesional instance = new Profesional();
        ArrayList<Mensaje> expResult = new ArrayList<Mensaje>();
        ArrayList<Mensaje> result = instance.getCasillaDeEntrada();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCasillaDeEntrada() {
        System.out.println("setCasillaDeEntrada");
        ArrayList<Mensaje> casillaDeEntrada = new ArrayList<Mensaje>();
        Profesional instance = new Profesional();
        instance.setCasillaDeEntrada(casillaDeEntrada);
        assertEquals(instance.getCasillaDeEntrada(),casillaDeEntrada);
    }

    @Test
    public void testGetNombreTituloProf() {
        System.out.println("getNombreTituloProf");
        Profesional instance = new Profesional();
        String expResult = "no ingreso titulo prof";
        String result = instance.getNombreTituloProf();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNombreTituloProf() {
        System.out.println("setNombreTituloProf");
        String nombreTituloProf = "no ingreso titulo prof";
        Profesional instance = new Profesional();
        instance.setNombreTituloProf(nombreTituloProf);
        assertEquals(nombreTituloProf,instance.getNombreTituloProf());
    }
    
    
    @Test
    public void testGetPaisObtuvoTituloIndia() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.India);
        Profesional.Pais expResult = Profesional.Pais.India;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloInglaterra() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.Inglaterra);
        Profesional.Pais expResult = Profesional.Pais.Inglaterra;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloInglaterra() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.Inglaterra);
        Profesional.Pais expResult = Profesional.Pais.Inglaterra;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloIsrael() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.Israel);
        Profesional.Pais expResult = Profesional.Pais.Israel;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloIsrael() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.Israel);
        Profesional.Pais expResult = Profesional.Pais.Israel;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloItalia() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.Italia);
        Profesional.Pais expResult = Profesional.Pais.Italia;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloItalia() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.Italia);
        Profesional.Pais expResult = Profesional.Pais.Italia;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloJapon() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.Japón);
        Profesional.Pais expResult = Profesional.Pais.Japón;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloJapon() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.Japón);
        Profesional.Pais expResult = Profesional.Pais.Japón;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloMexico() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.México);
        Profesional.Pais expResult = Profesional.Pais.México;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloMexico() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.México);
        Profesional.Pais expResult = Profesional.Pais.México;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloParaguay() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.Paraguay);
        Profesional.Pais expResult = Profesional.Pais.Paraguay;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloParaguay() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.Paraguay);
        Profesional.Pais expResult = Profesional.Pais.Paraguay;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloPeru() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.Perú);
        Profesional.Pais expResult = Profesional.Pais.Perú;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloPeru() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.Perú);
        Profesional.Pais expResult = Profesional.Pais.Perú;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloPortugal() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.Portugal);
        Profesional.Pais expResult = Profesional.Pais.Portugal;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloPortugal() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.Portugal);
        Profesional.Pais expResult = Profesional.Pais.Portugal;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloRusia() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.Rusia);
        Profesional.Pais expResult = Profesional.Pais.Rusia;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloRusia() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.Rusia);
        Profesional.Pais expResult = Profesional.Pais.Rusia;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloSudafrica() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.Sudáfrica);
        Profesional.Pais expResult = Profesional.Pais.Sudáfrica;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloSudafrica() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.Rusia);
        Profesional.Pais expResult = Profesional.Pais.Rusia;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloVenezuela() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.Venezuela);
        Profesional.Pais expResult = Profesional.Pais.Venezuela;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloVenezuela() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.Venezuela);
        Profesional.Pais expResult = Profesional.Pais.Venezuela;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetListaEnumPais() {
        System.out.println("getListaEnumPais");
        Profesional instance = new Profesional();
        Profesional.Pais[] expResult = instance.inicializoListaEnumPaises();
        Profesional.Pais[] result = instance.getListaEnumPais();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testSetListaEnumPais() {
        System.out.println("setListaEnumPais");
        Profesional instance = new Profesional();
        Profesional.Pais[] listaEnumPais = instance.inicializoListaEnumPaises();
        instance.setListaEnumPais(listaEnumPais);
        assertArrayEquals(instance.getListaEnumPais(),listaEnumPais);
    }

    @Test
    public void testInicializoListaEnumPaises() {
        System.out.println("inicializoListaEnumPaises");
        Profesional instance = new Profesional();
        Profesional.Pais[] expResult = instance.inicializoListaEnumPaises();
        Profesional.Pais[] result = instance.inicializoListaEnumPaises();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Profesional instance = new Profesional();
        String expResult = "Usuario: " + instance.getNombreUsuario();;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testEqualsFalse() {
        System.out.println("equals");
        Profesional obj = new Profesional();
        obj.setNombreUsuario("prueba");
        Profesional instance = new Profesional();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertFalse(obj.equals(instance));
    }
    
    @Test
    public void testEqualsTrue() {
        System.out.println("equals");
        Profesional obj = new Profesional();
        Profesional instance = new Profesional();
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    } 
    
    @Test(expected = NullPointerException.class)
    public void testEqualsNull() {
        System.out.println("equalsNull");
        Profesional obj = new Profesional();
        Profesional instance = null;
        assert(instance.equals(obj));
    }
    
    @Test
    public void testEqualsDistintoTipo() {
        System.out.println("equalsDistintoTipo");
        Profesional obj = new Profesional();
        obj.setNombreUsuario("nombre");
        boolean test = obj.equals("soy string");
        assertFalse(test);
    } 
}
