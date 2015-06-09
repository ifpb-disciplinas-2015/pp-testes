package ifpb.pp.validador;

 

/**
 *
 * @author Ricardo Job
 */
public class ValidadorCPF  {

     
    public boolean valida(String value) {
        String prefixo = value.substring(0, 3).concat(value.substring(4, 7)).concat(value.substring(8, 11));
        String sufixo = value.substring(12, 14);
        String retorno = "";
        long valor = new Long(prefixo);
        int incremento = 10;
        boolean controle = true;
        long totalPrimeiroDigito = 0;
        long totalSegundoDigito = 0;
        for (int i = 2; i < 10; i++) {
            long valorVerificado = valor % incremento;
            valor = valor / incremento;
            long proximo = valor % incremento;
            if (valorVerificado != proximo) {
                controle = false;
            }
            totalPrimeiroDigito += (i) * valorVerificado;
            totalSegundoDigito += valorVerificado * (i + 1);
//            System.out.print(" " + valorVerificado + " :" + proximo);
        }
        long digitoPrimiero = 11 - (totalPrimeiroDigito % 11);
        totalSegundoDigito += digitoPrimiero * 2;
        long digitoSegundo = 11 - (totalSegundoDigito % 11);
        if (digitoSegundo == 11) {
            digitoSegundo = 0;

        }
        retorno = String.valueOf(digitoPrimiero).concat(String.valueOf(digitoSegundo));
        return retorno.equals(sufixo) && (!controle);
    }

//}
//public class TesteCPF {
//    public static void main(String... agrs) {
//        System.out.println(" Retorno : " + validaCPF("123.456.789-10"));
//    }
    // 012.345.567-98
}
