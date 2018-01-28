/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasUnitarias;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
//agregar carpeta y archivo del servicio web
import ServiciosWeb.Servicio1;
/**
 *
 * @author Pamela Palacios
 */
public class PruebaUnitaria1 {
   /**/
    Servicio1 request;
    public PruebaUnitaria1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         request = new Servicio1();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void prueba_servicio()
    {
        String p="world";
        String r =  this.request.hello(p);
        assertEquals("Hello world",r);

    }
}
