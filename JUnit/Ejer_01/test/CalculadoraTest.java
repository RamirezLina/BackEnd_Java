/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entities.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LINA RAMIREZ
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    Calculadora c;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c = new Calculadora ();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void calculoDescuento(){
//        assertEquals(15,15,0);
        assertEquals(50,c.calcularDescuento(100, 50),0);
        assertEquals(100,c.calcularDescuento(100, 0),0);
//        assertEquals(10,c.calcularDescuento(100, 90),0);
    }
    
}
