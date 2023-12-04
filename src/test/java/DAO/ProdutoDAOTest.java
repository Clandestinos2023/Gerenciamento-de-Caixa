package DAO;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class ProdutoDAOTest {
    
    public static JTable table;
    
    public static JTextField name;
    public static JTextField codID;
    public static JTextField value;
    
    public static JComboBox produto;
    public static JComboBox quantity;

    @BeforeAll
    public static void setUpClass() throws Exception {
        table = new JTable();
        table.setModel(new DefaultTableModel(
                new Object[][]{},
                //TITULOS DAS SUAS COLUNAS
                new String[]{"ID", "Nome", "Valor", "Quantidade"}) {
        });
        
        name = new JTextField();
        codID = new JTextField();
        value = new JTextField();
                
        produto = new JComboBox();
        produto.addItem("------");
        
        quantity = new JComboBox();
        quantity.addItem("------");
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

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

    /**
     * Test of listarProduto method, of class ProdutoDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testListarProduto() throws Exception {
        System.out.println("listarProduto");
        JComboBox prod = produto;
        ProdutoDAO instance = new ProdutoDAO();
        instance.listarProduto(prod);
    }

    /**
     * Test of pesquisarProduto method, of class ProdutoDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testPesquisarProduto() throws Exception {
        System.out.println("pesquisarProduto");
        String pesquisa = "Vej";
        JComboBox prod = produto;
        ProdutoDAO instance = new ProdutoDAO();
        instance.pesquisarProduto(pesquisa, prod);
    }

    /**
     * Test of getProduto method, of class Produ
     * @throws java.lang.Exception
     */
    @Test
    public void testGetProduto() throws Exception {
        System.out.println("getProduto");
        int id = 0;
        JTextField valor = value;
        JTextField nome = name;
        JTextField ID = codID;
        ProdutoDAO instance = new ProdutoDAO();
        instance.getProduto(id, valor, nome, ID);
    }

    /**
     * Test of getProdutoQuant method, of class ProdutoDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetProdutoQuant() throws Exception {
        System.out.println("getProdutoQuant");
        int id = 0;
        JComboBox qnt = quantity;
        JTextField valor = value;
        JTextField nome = name;
        JTextField ID = codID;
        ProdutoDAO instance = new ProdutoDAO();
        instance.getProdutoQuant(id, qnt, valor, nome, ID);
    }

    /**
     * Test of contarQuantidade method, of class ProdutoDAO.
     */
    @Test
    public void testContarQuantidade() {
        System.out.println("contarQuantidade");
        int qnt = 10;
        JComboBox quant = quantity;
        ProdutoDAO instance = new ProdutoDAO();
        instance.contarQuantidade(qnt, quant);
    }

    /**
     * Test of vis
     * @throws java.lang.Exception
     */
    @Test
    public void testVisualizarProdutos() throws Exception {
        System.out.println("visualizarProdutos");
        JTable prod = table;
        ProdutoDAO instance = new ProdutoDAO();
        instance.visualizarProdutos(prod);
    }

}
