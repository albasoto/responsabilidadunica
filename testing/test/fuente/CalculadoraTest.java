/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuente;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wendy Soto
 */
public class CalculadoraTest {
  
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        int numero1 = 45;
        int nuemro2 = 10;     
        int esperado = 55;
           Calculadora calculadora = new Calculadora();
        int result = calculadora.sumar(numero1, nuemro2);
        assertEquals(esperado, result);
        // TODO review the generated test code and remove the default call to fail.
 
    }
    
}
