
package ifpb.pp.teste.power.mockito;

import ifpb.pp.entidades.Pessoa;
import ifpb.pp.entidades.UtilitarioIdentidade;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import static org.powermock.api.mockito.PowerMockito.when;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 *
 * @author Emanuel Batista da Silva Filho
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest({UtilitarioIdentidade.class,Pessoa.class})
public class PessoaTest {

    @Test
    public void testeInicializar(){
        PowerMockito.mockStatic(UtilitarioIdentidade.class);
        when(UtilitarioIdentidade.getUUID()).thenReturn(1);
        Pessoa pessoa=new Pessoa();
        pessoa.inicializar();
        int result = (int) pessoa.getId();
        assertEquals(result, 1);
    }
    
    @Test
    public void testeGetId(){
        try {
            Pessoa pessoa=PowerMockito.spy(new Pessoa());
            when(pessoa, "geradorId").thenReturn(1);
            pessoa.inicializar();
            assertEquals(1, pessoa.getId());
        } catch (Exception ex) {
            Logger.getLogger(PessoaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
