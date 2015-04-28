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
        assertEquals("deu certo", 0, calculadora.multiplicar(0, 3));
        assertEquals("deu certo", 0, calculadora.multiplicar(4, 0));
        assertTrue("deu certo", 2 == calculadora.multiplicar(0, 2));
        assertFalse("deu certo", 3 == calculadora.multiplicar(0, 0));
    }

    @Test
    public void testaMultiplicacaoValoresNegativos() {
        assertEquals("deu certo", -3, calculadora.multiplicar(-1, 3));
        assertEquals("deu certo", 4, calculadora.multiplicar(-2, -2));
        assertTrue("deu certo", -12 == calculadora.multiplicar(4, -3));
        assertFalse("deu certo", 5 == calculadora.multiplicar(-5, 1));
    }

    @Test(expected = CalculadoraException.class)
    public void testaMultiplicacaoValoresNulos() {
        assertEquals("deu certo", 4, calculadora.multiplicar(null, 3));
        assertEquals("deu certo", 0, calculadora.multiplicar(4, null));
        assertFalse("deu certo", 3 == calculadora.multiplicar(null, null));
    }

}
