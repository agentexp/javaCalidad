/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jean
 */
public class MatrizzTest {
    
    public MatrizzTest() {
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
     * Test of CantidadNumeros method, of class Matrizz.
     */
    @Test
    public void testCantidadNumeros() {
        System.out.println("CantidadNumeros");
        Matrizz instance = new Matrizz();
        int expResult = 0;
        int result = instance.CantidadNumeros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SumaDeTodoLosNumeros method, of class Matrizz.
     */
    @Test
    public void testSumaDeTodoLosNumeros() {
        System.out.println("SumaDeTodoLosNumeros");
        Matrizz instance = new Matrizz();
        int expResult = 0;
        int result = instance.SumaDeTodoLosNumeros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numeroMayor method, of class Matrizz.
     */
    @Test
    public void testNumeroMayor() {
        System.out.println("numeroMayor");
        Matrizz instance = new Matrizz();
        int expResult = 0;
        int result = instance.numeroMayor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numeroMenor method, of class Matrizz.
     */
    @Test
    public void testNumeroMenor() {
        System.out.println("numeroMenor");
        Matrizz instance = new Matrizz();
        int expResult = 0;
        int result = instance.numeroMenor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumaFilaN method, of class Matrizz.
     */
    @Test
    public void testSumaFilaN() {
        System.out.println("sumaFilaN");
        int posFila = 0;
        Matrizz instance = new Matrizz();
        int expResult = 0;
        int result = instance.sumaFilaN(posFila);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumaColumnaN method, of class Matrizz.
     */
    @Test
    public void testSumaColumnaN() {
        System.out.println("sumaColumnaN");
        int posColumna = 0;
        Matrizz instance = new Matrizz();
        int expResult = 0;
        int result = instance.sumaColumnaN(posColumna);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumaNoPerteneceDiagonal method, of class Matrizz.
     */
    @Test
    public void testSumaNoPerteneceDiagonal() {
        System.out.println("sumaNoPerteneceDiagonal");
        Matrizz instance = new Matrizz();
        int expResult = 0;
        int result = instance.sumaNoPerteneceDiagonal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerMatriz method, of class Matrizz.
     */
    @Test
    public void testObtenerMatriz() {
        System.out.println("obtenerMatriz");
        Matrizz instance = new Matrizz();
        Object[][] expResult = null;
        Object[][] result = instance.obtenerMatriz();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
