package ifpb.pp.testes;

import ifpb.pp.teste.Calculadora;
import org.junit.Test;

/**
 *
 * @author João Marcos F <joaomarccos.ads@gmail.com>
 */
public class CalculatorTestRaiz {
    @Test
    public void testaRaizQuadrada() {
        assertEquals("Resultado válido", 2, Calculadora.raizQuadrada(4));
        assertTrue("Resultado válido", 3==Calculadora.raizQuadrada(9));
        assertEquals("Resutado válido", 0, Calculadora.raizQuadrada(0));
    }

    @Test(expected = CalculadoraException.class)
    public void testaRaizQuadradaNegativos() {
        assertEquals("Impossivel calcular raiz de numeros negativos", 2, Calculadora.raizQuadrada(-1));
    }
    
    @Test(expected = CalculadoraException.class)
    public void testaRaizQuadradaNulos() {
        assertEquals("Impossivel calcular raiz de um valor nulo", 2, Calculadora.raizQuadrada(null));
    }    
}
