/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp.testes;

import ifpb.pp.teste.Calculadora;
import ifpb.pp.teste.CalculadoraException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Marcelo Augusto
 */
public class CalculadoraMultiplicacaoTest {

    private Calculadora calculadora = new Calculadora();

    public CalculadoraMultiplicacaoTest() {
    }

    @Test
    public void testaMultiplicacaoPorZero() {
        assertEquals("multiplicacao por zero", 0, calculadora.multiplicar(0, 3));
        assertEquals("multiplicacao por zero", 0, calculadora.multiplicar(4, 0));
        assertTrue("multiplicacao por zero", 0 == calculadora.multiplicar(0, 2));
        assertFalse("multiplicacao por zero", 3 == calculadora.multiplicar(0, 0));
    }

    @Test
    public void testaMultiplicacaoValoresNegativos() {
        assertEquals("multiplicacao por valores negativos", -3, calculadora.multiplicar(-1, 3));
        assertEquals("multiplicacao por valores negativos", 4, calculadora.multiplicar(-2, -2));
        assertTrue("multiplicacao por valores negativos", -12 == calculadora.multiplicar(4, -3));
        assertFalse("multiplicacao por valores negativos", 5 == calculadora.multiplicar(-5, 1));
    }

    @Test(expected = CalculadoraException.class)
    public void testaMultiplicacaoValoresNulos() {
        assertEquals("Multiplicacao por valores nulos", 4, calculadora.multiplicar(null, 3));
        assertEquals("Multiplicacao por valores ", 0, calculadora.multiplicar(4, null));
        assertFalse("Multiplicacao por valores ", 3 == calculadora.multiplicar(null, null));
    }

}
