package mx.com.itam.adsi.ejercicio;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPrincipal {
    private final static Logger LOG = Logger.getLogger(TestPrincipal.class);
    
    private Solucion p = new Solucion();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        System.out.println("Before Test Case");
    }

    @Test
    public void isCorrectBuildTest() {
        String val="A-->B-->C-->D-->E-->F-->";
        LOG.info("Ejecutando la prueba");
        
        assertTrue("Prn test of '"+val+"':", build(val));
    }
    
    private boolean build(res) {
        Node test = p.build();
        System.out.println(test.prn());
        return res == test.prn();
    }

    @After
    public void after() {
        System.out.println("After Test Case");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}
