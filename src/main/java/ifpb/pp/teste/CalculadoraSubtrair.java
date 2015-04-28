package ifpb.pp.teste;

/**
 *
 * @author Emanuel Batista da Silva Filho
 */
public class CalculadoraSubtrair {

    public int subtrair(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new CalculadoraException("Não é possivel subtrair com valores nulos");
        }
        return a - b;
    }
}
