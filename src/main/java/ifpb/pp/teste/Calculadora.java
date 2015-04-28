package ifpb.pp.teste;

/**
 * @author job
 */
public class Calculadora {

    public int somar(Integer a,Integer b){
        
        if(a==null || b==null)
            throw new CalculadoraException("Nao e possivel somar com valores nulos");
        return a+b;
    }
}
