
package ifpb.pp.entidades;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Emanuel Batista da Silva Filho
 */
@Entity
public class Pessoa implements Serializable {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String nome;
    String sobrenome;
    int idade;
    
    public void inicializar(){
        if(id==0){
            id=geradorId();
                   
        }
    }

    private int geradorId(){
        return  UtilitarioIdentidade.getUUID();
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + Objects.hashCode(this.sobrenome);
        hash = 67 * hash + this.idade;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    public long calcularJuros(String data){
        //calcular os dias
        // calcular o valor dos juros
        
        return calcularJurosDepoisDias(calcularDias(data));
        
    }
    private int calcularDias(String data){
        return 0;
    }
    private long calcularJurosDepoisDias(int dias){
        return 0;
    }
    
}
