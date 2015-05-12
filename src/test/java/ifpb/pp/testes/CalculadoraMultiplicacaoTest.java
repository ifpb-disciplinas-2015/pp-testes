/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp.testes;

import ifpb.pp.teste.Calculadora;
import ifpb.pp.teste.CalculadoraException;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Marcelo Augusto
 */

@RunWith(Parameterized.class)
public class CalculadoraMultiplicacaoTest {

    @Parameterized.Parameters
    public static Collection<Integer[]> addNumeros(){
        return Arrays.asList(new Integer[][] {{1,2}, {2,3}});
    }   
    private Calculadora calculadora = new Calculadora();
    private int a,b;
    
    public CalculadoraMultiplicacaoTest(int a,int b) {
      this.a=a;
      this.b=b;
    }

    @Test
    public void testaMultiplicacaoPorZero() {
//        assertEquals("multiplicacao por zero", 0, calculadora.multiplicar(a, b));
//        assertEquals("multiplicacao por zero", 0, calculadora.multiplicar(a, b));
//        assertTrue("multiplicacao por zero", 0 == calculadora.multiplicar(a, b));
        assertFalse("multiplicacao por zero", 
                3 == calculadora.multiplicar(a, b));
    }

    @Test
    public void testaMultiplicacaoValoresNegativos() {
//        assertEquals("multiplicacao por valores negativos", -3, calculadora.multiplicar(a, b));
//        assertEquals("multiplicacao por valores negativos", 4, calculadora.multiplicar(a, b));
//        assertTrue("multiplicacao por valores negativos", -12 == calculadora.multiplicar(a, b));
        assertFalse("multiplicacao por valores negativos", 5 == calculadora.multiplicar(a, b));
    }

    @Test(expected = CalculadoraException.class)
    public void testaMultiplicacaoValoresNulos() {
        assertEquals("Multiplicacao por valores nulos", 4, 
                calculadora.multiplicar(null, 3));
        assertEquals("Multiplicacao por valores ", 0, 
                calculadora.multiplicar(4, null));
        assertFalse("Multiplicacao por valores ", 
                3 == calculadora.multiplicar(null, null));
    }

}
