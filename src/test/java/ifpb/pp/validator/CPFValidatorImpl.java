package ifpb.pp.validator;

import java.util.ArrayList;

/**
 *
 * @author João Marcos F <joaomarccos.ads@gmail.com>
 */
public class CPFValidatorImpl{
    
    private ArrayList<String> invalids;

    public CPFValidatorImpl() {
        invalids = new ArrayList<>();
        invalids.add("00000000000");
        invalids.add("11111111111");
        invalids.add("22222222222");
        invalids.add("33333333333");
        invalids.add("44444444444");
        invalids.add("55555555555");
        invalids.add("66666666666");
        invalids.add("77777777777");
        invalids.add("88888888888");
        invalids.add("99999999999");
    }
        
    public boolean isValid(String cpfString) throws NumberFormatException {

        if (cpfString.isEmpty() || invalids.contains(cpfString) || cpfString.length() != 11) {
            return false;
        }

        long cpf = Long.parseLong(cpfString);
        long vdigit1 = (cpf % 100) / 10;
        long vdigit2 = cpf % 10;

        if (vdigit1 != calculateDigit(cpf, 1)) {
            return false;
        }
        if (vdigit2 != calculateDigit(cpf, 2)) {
            return false;
        }

        return true;
    }

    private long calculateDigit(long cpf, int step) {

        int limit;

        if (step == 1) {
            limit = 10;
            cpf /= 100;
        } else {
            limit = 11;
            cpf /= 10;
        }

        long sum = 0;
        for (int i = 2; i <= limit; i++) {
            sum += (cpf % 10) * i;
            cpf /= 10;
        }

        long rest = sum % 11;

        return (rest >= 2) ? 11 - (sum % 11) : 0;
    }

}
