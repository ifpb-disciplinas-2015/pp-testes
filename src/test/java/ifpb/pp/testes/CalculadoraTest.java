package ifpb.pp.testes;

import ifpb.pp.teste.Calculadora;
import ifpb.pp.teste.CalculadoraException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author job
 */
public class CalculadoraTest {
    private Calculadora calculadora=new Calculadora();
    
    public CalculadoraTest() {
    }
    
    @Test
    public void testaSomaValoresPositivos(){
        assertEquals("deu certo", 5,calculadora.somar(3,2));
        assertEquals("deu certo", 5,calculadora.somar(2,3));
        assertTrue("deu certo", 5==calculadora.somar(2,3));
        assertFalse("deu certo", 4==calculadora.somar(3, 2));
        
        assertEquals("deu certo", 1,calculadora.somar(3,-2));
    } 
    @Test
    public void testaSomaValoresNegativos(){
        assertEquals("deu certo", 1,calculadora.somar(3,-2));
        assertEquals("deu certo", -5,calculadora.somar(-2,-3));
        assertTrue("deu certo", 1==calculadora.somar(-2,3));
        assertFalse("deu certo", 4==calculadora.somar(-3, -2));
        
        assertEquals("deu certo", 1,calculadora.somar(3,-2));
    } 
    
    @Test(expected = CalculadoraException.class)
    public void testaSomaValoresNulos(){
//        assertEquals("deu certo", 0,calculadora.somar(null,3));
//        assertEquals("deu certo", -5,calculadora.somar(-2,null));
        assertEquals("deu certo", 1,calculadora.somar(3,-2));
      
        assertTrue("deu certo", 1==calculadora.somar(null,null));            
    }
}
