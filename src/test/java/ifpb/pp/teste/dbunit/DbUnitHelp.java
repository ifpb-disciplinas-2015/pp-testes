package ifpb.pp.teste.dbunit;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.ext.postgresql.PostgresqlDataTypeFactory;
import org.dbunit.operation.DatabaseOperation;

/**
 *
 * @author Emanuel Batista da Silva Filho
 */
public class DbUnitHelp {

    private Connection con;
    private DatabaseConnection databaseConnection;
    private String xmlFolder;

    public DbUnitHelp(String xmlFolder) {
        this.xmlFolder = xmlFolder;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pp-testes", "postgres", "123456");
            databaseConnection = new DatabaseConnection(con);
            DatabaseConfig databaseConfig = databaseConnection.getConfig();
            databaseConfig.setProperty(DatabaseConfig.PROPERTY_DATATYPE_FACTORY, new PostgresqlDataTypeFactory());
        } catch (ClassNotFoundException | SQLException | DatabaseUnitException ex) {
            Logger.getLogger(DbUnitHelp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void execute(DatabaseOperation operation) {
        try {
            InputStream is = getClass().getResourceAsStream("/"+xmlFolder);
            FlatXmlDataSetBuilder builder = new FlatXmlDataSetBuilder();
            IDataSet dataSet = builder.build(is);
            operation.execute(databaseConnection, dataSet);
        } catch (DatabaseUnitException | SQLException e) {
             Logger.getLogger(DbUnitHelp.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void close() {
        try {
            databaseConnection.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
