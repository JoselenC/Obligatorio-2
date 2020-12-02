package dominio;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlanDeAlimentacionTest {

    public PlanDeAlimentacionTest() {
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
    public void testSetUsuario() {
        Usuario usuarioExpected = new Usuario();
        PlanDeAlimentacion plan = new PlanDeAlimentacion();
        plan.setUsuario(usuarioExpected);
        Usuario usuario = plan.getUsuario();
        assertEquals(usuarioExpected, usuario);
    }

    @Test
    public void testSetListaLunes() {
        ArrayList<Alimento> listaLunesExpected = new ArrayList<Alimento>();
        PlanDeAlimentacion plan = new PlanDeAlimentacion();
        plan.setListaLunes(listaLunesExpected);
        ArrayList<Alimento> listaLunes = plan.getListaLunes();
        assertEquals(listaLunesExpected, listaLunes);
    }

    @Test
    public void testSetListaMartes() {
        ArrayList<Alimento> listaMartesExpected = new ArrayList<Alimento>();
        PlanDeAlimentacion plan = new PlanDeAlimentacion();
        plan.setListaMartes(listaMartesExpected);
        ArrayList<Alimento> listaMartes = plan.getListaMartes();
        assertEquals(listaMartesExpected, listaMartes);
    }

    @Test
    public void testSetListaMiercoles() {
        ArrayList<Alimento> listaMiercolesExpected = new ArrayList<Alimento>();
        PlanDeAlimentacion plan = new PlanDeAlimentacion();
        plan.setListaMiercoles(listaMiercolesExpected);
        ArrayList<Alimento> listaMiercoles = plan.getListaMiercoles();
        assertEquals(listaMiercolesExpected, listaMiercoles);
    }

    @Test
    public void testSetListaJueves() {
        ArrayList<Alimento> listaJuevesExpected = new ArrayList<Alimento>();
        PlanDeAlimentacion plan = new PlanDeAlimentacion();
        plan.setListaJueves(listaJuevesExpected);
        ArrayList<Alimento> listaJueves = plan.getListaJueves();
        assertEquals(listaJuevesExpected, listaJueves);
    }

    @Test
    public void testSetListaViernes() {
        ArrayList<Alimento> listaViernesExpected = new ArrayList<Alimento>();
        PlanDeAlimentacion plan = new PlanDeAlimentacion();
        plan.setListaViernes(listaViernesExpected);
        ArrayList<Alimento> listaViernes = plan.getListaViernes();
        assertEquals(listaViernesExpected, listaViernes);
    }

    @Test
    public void testSetListaSabado() {
        ArrayList<Alimento> listaSabadoExpected = new ArrayList<Alimento>();
        PlanDeAlimentacion plan = new PlanDeAlimentacion();
        plan.setListaSabado(listaSabadoExpected);
        ArrayList<Alimento> listaSabado = plan.getListaSabado();
        assertEquals(listaSabadoExpected, listaSabado);
    }

    @Test
    public void testSetListaDomingo() {
        ArrayList<Alimento> listaDomingoExpected = new ArrayList<Alimento>();
        PlanDeAlimentacion plan = new PlanDeAlimentacion();
        plan.setListaDomingo(listaDomingoExpected);
        ArrayList<Alimento> listaDomingo = plan.getListaDomingo();
        assertEquals(listaDomingoExpected, listaDomingo);
    }

    @Test
    public void testPlanDeAlimentacion() {
        Usuario usuarioExpected = new Usuario();
        PlanDeAlimentacion planExpected = new PlanDeAlimentacion();
        planExpected.setUsuario(usuarioExpected);
        PlanDeAlimentacion plan = new PlanDeAlimentacion(usuarioExpected);
        assertEquals(planExpected.getUsuario(), plan.getUsuario());
    }
}
