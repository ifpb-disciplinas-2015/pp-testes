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
    
    public double dividir(Integer a, Integer b){
        if(a==null || b==null){
            throw new CalculadoraException("Não é possivel dividir com valores nulos");
        }
        else if(b==0){
            throw new CalculadoraException("Não é possivel dividir um valor por 0");
        }
        
        return a/b;
    }
}
