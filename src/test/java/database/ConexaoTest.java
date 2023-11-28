package database;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConexaoTest {

    /**
     * Test of getConnection method, of class Conexao.
     */
    @Test
    public void testGetConnection() throws Exception {
        System.out.println("getConnection");
        Conexao instance = new Conexao();
        Connection expResult = DriverManager.getConnection("jdbc:mysql://localhost:3306/gerenciamento_caixa", "root", "");;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
    }
    
}
