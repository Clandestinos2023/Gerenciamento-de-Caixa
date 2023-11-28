package DAO;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import view.telasAlteracao.telaAlterarCliente;

public class ClienteDAOTest {
    
    /**
     * Test of cadastrar method, of class ClienteDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testCadastrar() throws Exception {
        System.out.println("cadastrar");
        String nome = "Jubileu";
        int idade = 20;
        String tipoCliente = "Fisico";
        String codCliente = "123.456.789-12";
        String contato = "(31) 98818-6620";
        ClienteDAO instance = new ClienteDAO();
        instance.cadastrar(nome, idade, tipoCliente, codCliente, contato);
    }

    /**
     * Test of getID method, of class ClienteDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetID() throws Exception {
        System.out.println("getID");
        String nome = "SSSSS";
        ClienteDAO instance = new ClienteDAO();
        int expResult = 3;
        int result = instance.getID(nome);
        assertEquals(expResult, result);
    }

    /**
     * Test of getIdade method, of class ClienteDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetIdade() throws Exception {
        System.out.println("getIdade");
        int id = 1;
        ClienteDAO instance = new ClienteDAO();
        int expResult = 20;
        int result = instance.getIdade(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getNome method, of class ClienteDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetNome() throws Exception {
        System.out.println("getNome");
        int id = 1;
        ClienteDAO instance = new ClienteDAO();
        String expResult = "Davidson";
        String result = instance.getNome(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getTipoCliente method, of class ClienteDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetTipoCliente() throws Exception {
        System.out.println("getTipoCliente");
        int id = 1;
        ClienteDAO instance = new ClienteDAO();
        String expResult = "Fisico";
        String result = instance.getTipoCliente(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getCodigoCliente method, of class ClienteDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetCodigoCliente() throws Exception {
        System.out.println("getCodigoCliente");
        int id = 1;
        ClienteDAO instance = new ClienteDAO();
        String expResult = "00000000000";
        String result = instance.getCodigoCliente(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getContato method, of class ClienteDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetContato() throws Exception {
        System.out.println("getContato");
        int id = 1;
        ClienteDAO instance = new ClienteDAO();
        String expResult = "(11) 11111-1111";
        String result = instance.getContato(id);
        assertEquals(expResult, result);
    }

//    /**
//     * Test of getCliente method, of class ClienteDAO.
//     * @throws java.lang.Exception
//     */
//    @Test
//    public void testGetCliente() throws Exception {
//        System.out.println("getCliente");
//        int id = 6;
//        JTextField nome = telaAlterarCliente.nome;
//        JTextField idade = telaAlterarCliente.idade;
//        JRadioButton fis = telaAlterarCliente.fis;
//        JRadioButton jur = telaAlterarCliente.jur;
//        JTextField codigoCliente = telaAlterarCliente.codigoCliente;
//        JTextField contato = telaAlterarCliente.contato;
//        ClienteDAO instance = new ClienteDAO();
//        instance.getCliente(id, nome, idade, fis, jur, codigoCliente, contato);
//    }

    /**
     * Test of updateCliente method, of class ClienteDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testUpdateCliente() throws Exception {
        System.out.println("updateCliente");
        int id = 33;
        String nome = "Julieta";
        int idade = 15;
        String tipoCliente = "Fisico";
        String codigoCliente = "111.111.111-11";
        String contato = "(15) 94002-8922";
        ClienteDAO instance = new ClienteDAO();
        instance.updateCliente(id, nome, idade, tipoCliente, codigoCliente, contato);
    }

    /**
     * Test of deleteCliente method, of class ClienteDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testDeleteCliente() throws Exception {
        System.out.println("deleteCliente");
        int id = 41;
        ClienteDAO instance = new ClienteDAO();
        instance.deleteCliente(id);
    }

    
}
