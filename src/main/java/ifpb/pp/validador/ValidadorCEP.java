package ifpb.pp.teste.validador;

/**
 *
 * @author DouglasGabriel
 */
public class ValidadorCEP {

    public boolean assertCPF(String cep) {
        cep.replace(".", "");
        cep.replace("-", "");
        if (cep.length() == 8) {
            try {
                Integer.parseInt(cep);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }
}
