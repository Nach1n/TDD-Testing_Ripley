/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author AnX
 */
public class EntradasTest {
    
    public EntradasTest() {
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

    /**
     * Test of validarRut method, of class Entradas.
     */
    @Test
    public void testValidarRut() {
        System.out.println("validarRut");
        String rut = "19.208.616-7";
        boolean expResult = true;
        boolean result = Entradas.validarRut(rut);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Nombre method, of class Entradas.
     */
    @Test
    public void testNombre() {
        System.out.println("Nombre");
        String Nom = "Marcelo";
        Entradas instance = new Entradas();
        boolean expResult = true;
        boolean result = instance.Nombre(Nom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testValidaFecha() {
        System.out.println("validarFecha");
        String fecha = "06/09/2018";
        boolean expResult = true;
        boolean result = Entradas.validarFecha(fecha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
