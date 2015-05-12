package ifpb.pp.validador;

/**
 *
 * @author DouglasGabriel
 */
public class Validador {

    public static boolean assertCPF(String cpf) {
        cpf = cpf.replace(".", "").replace("-", "");
        if (cpf.length() == 11) {
            int verificadorPrimeiroDigito = 0, verificadorSegundoDigito = 0, cursor = 0;
            for (int k = 11; k >= 2; k--) {
                if (k < 11) {
                    verificadorPrimeiroDigito += Integer.parseInt(cpf.substring(cursor-1, cursor)) * k;
                }                
                verificadorSegundoDigito += Integer.parseInt(cpf.substring(cursor, cursor + 1)) * k;
                cursor++;
            }
            return ((verificadorPrimeiroDigito % 11 <= 1 && Integer.parseInt(cpf.substring(9, 10)) == 0)
                    || (11 - (verificadorPrimeiroDigito % 11) == Integer.parseInt(cpf.substring(9, 10))))
                    && ((verificadorSegundoDigito % 11 <= 1 && Integer.parseInt(cpf.substring(10, 11)) == 0)
                    || (11 - (verificadorSegundoDigito % 11) == Integer.parseInt(cpf.substring(10, 11))));
        } else {
            return false;
        }
    }
}
