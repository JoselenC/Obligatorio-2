package dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MensajeTest {
    
    public MensajeTest() {
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
    public void testToString(){
        Persona persona= new Usuario();
        persona.setNombreUsuario("juan");
        String asunto="";
        String mensajeStringExpected="Mensaje de: "+ persona.getNombreUsuario() 
               + " con Asunto: " + asunto;
        Mensaje mensaje = new Mensaje();
        mensaje.setAsunto(asunto);
        mensaje.setOrigen(persona);
        String mensajeString=mensaje.toString();
        assertEquals(mensajeStringExpected,mensajeString);
    }
    
    @Test
    public void testSetOrigen(){
        Persona personaExpected= new Usuario();
        personaExpected.setNombreUsuario("juan");
        String asunto="";
        Mensaje mensaje = new Mensaje();
        mensaje.setOrigen(personaExpected);
        Persona persona = mensaje.getOrigen();
        assertEquals(personaExpected,persona);
    }
    
    @Test
    public void testSetDestino(){
        Persona personaExpected= new Usuario();
        personaExpected.setNombreUsuario("juan");
        String asunto="";
        Mensaje mensaje = new Mensaje();
        mensaje.setDestino(personaExpected);
        Persona persona = mensaje.getDestino();
        assertEquals(personaExpected,persona);
    }
    
    @Test
    public void testSetAsunto(){
        String asuntoExpected="";
        Mensaje mensaje = new Mensaje();
        mensaje.setAsunto(asuntoExpected);
        String asunto = mensaje.getAsunto();
        assertEquals(asunto,asuntoExpected);
    }
    
     @Test
    public void testSetMensaje(){
        String mensajeExpected="";
        Mensaje mensaje = new Mensaje();
        mensaje.setMensaje(mensajeExpected);
        String mensajeResultado = mensaje.getMensaje();
        assertEquals(mensajeExpected,mensajeResultado);
    }
    
    
}
