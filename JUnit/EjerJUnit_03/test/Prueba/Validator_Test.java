/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Services.PasswordValidator;
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
public class Validator_Test {
    
    PasswordValidator v;
    public Validator_Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        v = new PasswordValidator();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void fortalezaContraseñaT(){
       assertTrue(v.fortalezaC("LinaMaria!$%"));
       assertTrue(v.fortalezaC("JUANABIENAMaria!?"));
       assertTrue(v.fortalezaC("LinaRamirez0209#"));
       assertTrue(v.fortalezaC("POAOLO/DOMINGuez"));
       assertTrue(v.fortalezaC("LinaMariaaaaa#"));
    }
    
    @Test
    public void fortalezaContraseñaF(){
       
       assertFalse(v.fortalezaC("LinaM#"));
       assertFalse(v.fortalezaC("LinaMariaRamirezMedina"));
       assertFalse(v.fortalezaC("alvarojosemanuel!"));
       assertFalse(v.fortalezaC("tria"));
    }
}
