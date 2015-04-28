package ifpb.pp.teste;

/**
 * @author job
 */
public class Calculadora {

    public int somar(Integer a, Integer b) {

        if (a == null || b == null) {
            throw new CalculadoraException("Nao e possivel somar com valores nulos");
        }
        return a + b;
    }

    public int multiplicar(Integer a, Integer b) {

        if (a == null || b == null) {
            throw new CalculadoraException("Nao e possivel multiplicar com valores nulos");
        }
        return a * b;
    }

    public double raizQuadrada(Integer value) {
        if (value < 0) {
            throw new CalculadoraException("Não é possivel efetuar raiz quadrada de número negativo");
        }
        return Math.sqrt(value);
    }

    public int subtrair(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new CalculadoraException("Não é possivel subtrair com valores nulos");
        }
        return a - b;
    }

}
