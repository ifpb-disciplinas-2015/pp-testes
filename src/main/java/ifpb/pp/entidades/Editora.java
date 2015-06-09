
package ifpb.pp.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Emanuel Batista da Silva Filho
 */
@Entity
public class Editora implements Serializable {

    @Id
    int id;
    String nome;
    String email;
    
    
}
