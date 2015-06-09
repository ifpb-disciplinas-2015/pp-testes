package ifpb.pp.testes;

import ifpb.pp.validador.ValidadorCPF;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Ricardo Job
 */
@RunWith(Parameterized.class)
public class CPFTest {

    @Parameterized.Parameters
    public static Collection<String[]> addNumeros() {
        return Arrays.asList(new String[][]{{"111.111.111-11"},
        {"000.000.000-00"}});

    }

    private ValidadorCPF validador = new ValidadorCPF();

    private String cpf;

    public CPFTest(String cpf) {
        this.cpf = cpf;
    }

    @Test
    public void testValidaCPF() {
        assertFalse(validador.valida(cpf));
    }

}
