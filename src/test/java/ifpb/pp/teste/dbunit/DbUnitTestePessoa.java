/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp.teste.dbunit;

import ifpb.pp.entidades.DAO;
import ifpb.pp.entidades.DAOJPA;
import ifpb.pp.entidades.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.dbunit.operation.DatabaseOperation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Emanuel Batista da Silva Filho
 */
public class DbUnitTestePessoa {
    
    private static DbUnitHelp dbUnitHelp;
    private DAO<Pessoa> daoJpa;
    public DbUnitTestePessoa() {
        dbUnitHelp.execute(DatabaseOperation.INSERT);
        daoJpa=new DAOJPA("pp-testes");
    }
    
    @BeforeClass
    public static void setUpClass() {
        dbUnitHelp=new DbUnitHelp("Pessoa.xml");
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void testeBanco(){
        Pessoa pessoa=daoJpa.buscar(new Long(1), Pessoa.class);
        assertNotNull(pessoa);
    }
    
    @After
    public void setDown(){
//        dbUnitHelp.execute(DatabaseOperation.DELETE_ALL);
    }
}
