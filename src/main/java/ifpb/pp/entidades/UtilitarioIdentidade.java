
package ifpb.pp.entidades;

import java.util.Random;
import java.util.UUID;

/**
 *
 * @author Emanuel Batista da Silva Filho
 */
public class UtilitarioIdentidade {
 
    public static int getUUID() {
        return new Random().nextInt();
    }
}

