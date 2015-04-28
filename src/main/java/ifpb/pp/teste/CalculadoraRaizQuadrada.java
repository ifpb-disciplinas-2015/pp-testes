package ifpb.pp.teste;

/**
 *
 * @author Emanuel Batista da Silva Filho
 */
public class CalculadoraRaizQuadrada {

    public double raizQuadrada(Integer value) {
        if (value < 0) {
            throw new CalculadoraException("Não é possivel efetuar raiz quadrada de número negativo");
        }
        return Math.sqrt(value);
    }
}
