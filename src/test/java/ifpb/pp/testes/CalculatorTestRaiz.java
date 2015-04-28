package ifpb.pp.testes;

import ifpb.pp.teste.Calculadora;
import ifpb.pp.teste.CalculadoraException;
import ifpb.pp.teste.CalculadoraRaizQuadrada;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author João Marcos F <joaomarccos.ads@gmail.com>
 */
public class CalculatorTestRaiz {
    
    Calculadora calc = new Calculadora();
    
    @Test
    public void testaRaizQuadrada() {
        assertEquals("Resultado válido", 2, calc.raizQuadrada(4));
        assertTrue("Resultado válido", 3==calc.raizQuadrada(9));
        assertEquals("Resutado válido", 0, calc.raizQuadrada(0));
    }

    @Test(expected = CalculadoraException.class)
    public void testaRaizQuadradaNegativos() {
        assertEquals("Impossivel calcular raiz de numeros negativos", 2, calc.raizQuadrada(-1));
    }
    
    @Test(expected = CalculadoraException.class)
    public void testaRaizQuadradaNulos() {
        assertEquals("Impossivel calcular raiz de um valor nulo", 2, calc.raizQuadrada(null));
    }    
}
