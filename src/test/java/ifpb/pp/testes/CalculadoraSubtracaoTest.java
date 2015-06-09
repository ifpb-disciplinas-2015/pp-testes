package ifpb.pp.testes;

import ifpb.pp.teste.Calculadora;
import ifpb.pp.teste.CalculadoraException;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author DouglasGabriel
 */
@RunWith(Parameterized.class)
public class CalculadoraSubtracaoTest {
    
    @Parameterized.Parameters
    public static Collection<Integer[]> addNumeros(){
        return Arrays.asList(new Integer[][] {{1,2}, {0,1}});
    } 
    private Calculadora calc = new Calculadora();
    private int a,b;
    
    public CalculadoraSubtracaoTest(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    @Test
    public void testarSubtracaoNumPositivos (){
      //  assertEquals("1 - 2", -1, calc.subtrair(1,2));
      //  assertEquals("20 - 10", 10, calc.subtrair(20,10));
        assertEquals(-1, calc.subtrair(a, b));
        assertFalse("subtracao de numeros positivos", 5 ==calc.subtrair(a, b));
        
    }
    
    @Test
    public void testarSubtracaoNumNegativos (){
     //   assertEquals("2 - (-1)", 3, calc.subtrair(2, -1));
        assertEquals("subtração de numeros negativos", -1 ,calc.subtrair(a, b));
        assertFalse(4 == calc.subtrair(a, b));
    }
    
    @Test(expected = CalculadoraException.class)
    public void testarSubtracaoValoresNulos(){
        assertEquals("10 - null",calc.subtrair(10, null));
        assertEquals("null - null", calc.subtrair(null, null));
    }
    
}
