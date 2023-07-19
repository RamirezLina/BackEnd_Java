/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Services.TemperatureConverter;
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
public class ConverterT_Test {
    
    TemperatureConverter c;
    public ConverterT_Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c = new TemperatureConverter();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void aCelsius(){
        assertEquals(-173.15, c.Celsius_K(100),0.1);
        assertEquals(37.7778, c.Celsius_F(100),0.1);
    }
    
    @Test
    public void aKelvin(){
        assertEquals(373.15, c.Kelvin_C(100) ,0.001);
        assertEquals(310.928, c.Kelvin_F(100),0.001);
    }
    
    @Test
    public void aFahren(){
        assertEquals(-279.67,c.Fahren_K(100),0.05);
        assertEquals(212,c.Fahren_C(100),0.05);
    }
}
