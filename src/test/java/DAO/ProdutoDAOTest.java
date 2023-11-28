package DAO;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import javax.swing.JComboBox;
import javax.swing.JTextField;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import view.telaVenda;
import view.telasAlteracao.telaAlterarProduto;

public class ProdutoDAOTest {

    /**
     * Test of cadastrar method, of class ProdutoDAO.
     */
    @Test
    public void testCadastrar() {
        System.out.println("cadastrar");
        String nome = "Veja";
        double valor = 2.5;
        int quantidade = 22;
        ProdutoDAO instance = new ProdutoDAO();
        instance.cadastrar(nome, valor, quantidade);
    }

    /**
     * Test of getID method, of class ProdutoDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetID() throws Exception {
        System.out.println("getID");
        String nome = "Mouse";
        ProdutoDAO instance = new ProdutoDAO();
        int expResult = 11;
        int result = instance.getID(nome);
        assertEquals(expResult, result);
    }

    /**
     * Test of getQuantidade method, of class ProdutoDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetQuantidade() throws Exception {
        System.out.println("getQuantidade");
        int id = 11;
        ProdutoDAO instance = new ProdutoDAO();
        int expResult = 12;
        int result = instance.getQuantidade(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getNome method, of class ProdutoDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetNome() throws Exception {
        System.out.println("getNome");
        int id = 11;
        ProdutoDAO instance = new ProdutoDAO();
        String expResult = "Mouse";
        String result = instance.getNome(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getValor method, of class ProdutoDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetValor() throws Exception {
        System.out.println("getValor");
        int id = 11;
        ProdutoDAO instance = new ProdutoDAO();
        double expResult = 86.5;
        double result = instance.getValor(id);
        assertEquals(expResult, result, 0);
    }
//
//    /**
//     * Test of getProduto method, of class ProdutoDAO.
//     * @throws java.lang.Exception
//     */
//    @Test
//    public void testGetProduto() throws Exception {
//        System.out.println("getProduto");
//        int id = 0;
//        JTextField valor = telaAlterarProduto.value;
//        JTextField nome = telaAlterarProduto.nome;
//        JTextField ID = telaAlterarProduto.id;
//        ProdutoDAO instance = new ProdutoDAO();
//        instance.getProduto(id, valor, nome, ID);
//    }
//
//    /**
//     * Test of getProdutoQuant method, of class ProdutoDAO.
//     * @throws java.lang.Exception
//     */
//    @Test
//    public void testGetProdutoQuant() throws Exception {
//        System.out.println("getProdutoQuant");
//        int id = 0;
//        JComboBox qnt = telaVenda.qnt;
//        JTextField valor = telaAlterarProduto.value;
//        JTextField nome = telaAlterarProduto.nome;
//        JTextField ID = telaAlterarProduto.id;
//        ProdutoDAO instance = new ProdutoDAO();
//        instance.getProdutoQuant(id, qnt, valor, nome, ID);
//    }

    /**
     * Test of updateProdutoInfos method, of class ProdutoDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testUpdateProdutoInfos() throws Exception {
        System.out.println("updateProdutoInfos");
        String nome = "Olhe";
        double valor = 8.64;
        int id = 19;
        ProdutoDAO instance = new ProdutoDAO();
        instance.updateProdutoInfos(nome, valor, id);
    }

    /**
     * Test of deleteProduto method, of class ProdutoDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testDeleteProduto() throws Exception {
        System.out.println("deleteProduto");
        int id = 28;
        ProdutoDAO instance = new ProdutoDAO();
        instance.deleteProduto(id);
    }

//    /**
//     * Test of contarQuantidade method, of class ProdutoDAO.
//     */
//    @Test
//    public void testContarQuantidade() {
//        System.out.println("contarQuantidade");
//        int qnt = 20;
//        JComboBox quant = telaVenda.qnt;
//        ProdutoDAO instance = new ProdutoDAO();
//        instance.contarQuantidade(qnt, quant);
//    }

}
