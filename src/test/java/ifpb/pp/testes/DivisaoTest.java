/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp.testes;

import ifpb.pp.teste.Calculadora;
import ifpb.pp.teste.CalculadoraException;
import org.junit.Test;

/**
 *
 * @author Pris
 */
public class DivisaoTest {
    private Calculadora calculadora  = new Calculadora();
    
    @Test(expected = CalculadoraException.class)
    public void testaDivisaoPorZero(){
        assertFalse("divisão por zero",5==calculadora.dividir(5,0));
    }
    
    @Test
    public void testaDivisaoValoresPositivos(){
        assertEquals("divisão valores positivos", 2,calculadora.dividir(4,2));
        assertEquals("divisão valores positivos", 0,calculadora.dividir(0,2));
        assertEquals("divisão valores positivos", 2,calculadora.dividir(5,2));
        assertTrue("divisão valores positivos", 5 == calculadora.dividir(5,1));
    }
    
    @Test
    public void testaDivisaoValoresNegativos(){
        assertEquals("divisão valores negativos", -5,calculadora.dividir(5, -1));
        assertEquals("divisão valores negativos", -2,calculadora.dividir(4, -2));
    }
    
    
}
