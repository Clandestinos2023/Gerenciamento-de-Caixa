package DAO;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class FuncionarioDAOTest {
    
    public static JTable table;
    
    public static JTextField name;
    public static JTextField user;
    public static JTextField pass;
    public static JTextField confPass;
    public static JTextField phone;
    public static JTextField mail;
    public static JRadioButton male;
    public static JRadioButton female;
    public static JTextField doc;
    
    public static JComboBox funcionario;

    @BeforeAll
    public static void setUpClass() throws Exception {
        table = new JTable();
        table.setModel(new DefaultTableModel(
                new Object[][]{},
                //TITULOS DAS SUAS COLUNAS
                new String[]{"ID", "Nome", "Usuario", "Telefone", "Email", "Sexo", "CPF"}) {
        });
        
        name = new JTextField();
        user = new JTextField();
        pass = new JTextField();
        confPass = new JTextField();
        phone = new JTextField();
        mail = new JTextField();
        male = new JRadioButton();
        female = new JRadioButton();
        doc = new JTextField();
        
        funcionario = new JComboBox();
        funcionario.addItem("------");
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
     * Test of cadastrar method, of class FuncionarioDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testCadastrar() throws Exception {
        System.out.println("cadastrar");
        String nome = "Adriel";
        String usuario = "adriel";
        String senha = "123";
        String confirmacaoSenha = "123";
        String telefone = "(31)98818-6620";
        String email = "adriel@test.com.br";
        String sexo = "M";
        String cpf = "123.456.789-12";
        FuncionarioDAO instance = new FuncionarioDAO();
        instance.cadastrar(nome, usuario, senha, confirmacaoSenha, telefone, email, sexo, cpf);
    }

    /**
     * Test of getID method, of class FuncionarioDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetID() throws Exception {
        System.out.println("getID");
        String nome = "Deivisson";
        FuncionarioDAO instance = new FuncionarioDAO();
        int expResult = 1;
        int result = instance.getID(nome);
        assertEquals(expResult, result);
    }

    /**
     * Test of getNome method, of class FuncionarioDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetNome() throws Exception {
        System.out.println("getNome");
        int id = 1;
        FuncionarioDAO instance = new FuncionarioDAO();
        String expResult = "Deivisson";
        String result = instance.getNome(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getUsuario method, of class FuncionarioDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetUsuario() throws Exception {
        System.out.println("getUsuario");
        int id = 1;
        FuncionarioDAO instance = new FuncionarioDAO();
        String expResult = "davidson04";
        String result = instance.getUsuario(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getSenha method, of class FuncionarioDAO.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testGetSenha() throws Exception {
        System.out.println("getSenha");
        int id = 1;
        FuncionarioDAO instance = new FuncionarioDAO();
        String expResult = "123";
        String result = instance.getSenha(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getTelefone method, of class FuncionarioDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetTelefone() throws Exception {
        System.out.println("getTelefone");
        int id = 1;
        FuncionarioDAO instance = new FuncionarioDAO();
        String expResult = "(31) 98823-9894";
        String result = instance.getTelefone(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmail method, of class FuncionarioDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetEmail() throws Exception {
        System.out.println("getEmail");
        int id = 1;
        FuncionarioDAO instance = new FuncionarioDAO();
        String expResult = "odavidsonteixeira@teste.com.br";
        String result = instance.getEmail(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getSexo method, of class FuncionarioDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetSexo() throws Exception {
        System.out.println("getSexo");
        int id = 1;
        FuncionarioDAO instance = new FuncionarioDAO();
        String expResult = "Masculino";
        String result = instance.getSexo(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getCPF method, of class FuncionarioDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetCPF() throws Exception {
        System.out.println("getCPF");
        int id = 1;
        FuncionarioDAO instance = new FuncionarioDAO();
        String expResult = "097.772.986-92";
        String result = instance.getCPF(id);
        assertEquals(expResult, result);
    }

    /**
     * @throws java.lang.Exception
     * Test of updateFuncionario method, of class FuncionarioDAO.
     */
    @Test
    public void testUpdateFuncionario() throws Exception {
        System.out.println("updateFuncionario");
        int idFunc = 5;
        String nome = "Roberto";
        String usuario = "roberto";
        String senha = "123";
        String confirmacaoSenha = "123";
        String telefone = "(31) 99636-3424";
        String email = "roberto@test.com.br";
        String sexo = "Masculino";
        String cpf = "789.456.123-64";
        FuncionarioDAO instance = new FuncionarioDAO();
        instance.updateFuncionario(idFunc, nome, usuario, senha, confirmacaoSenha, telefone, email, sexo, cpf);
    }

    /**
     * Test of deleteFuncionario method, of class FuncionarioDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testDeleteFuncionario() throws Exception {
        System.out.println("deleteFuncionario");
        int id = 31;
        FuncionarioDAO instance = new FuncionarioDAO();
        instance.deleteFuncionario(id);
    }

    /**
     * Test of listarFuncionario method, of class FuncionarioDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testListarFuncionario() throws Exception {
        System.out.println("listarFuncionario");
        JComboBox func = funcionario;
        FuncionarioDAO instance = new FuncionarioDAO();
        instance.listarFuncionario(func);
    }

    /**
     * Test of pesquisarFuncionario method, of class FuncionarioDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testPesquisarFuncionario() throws Exception {
        System.out.println("pesquisarFuncionario");
        String pesquisa = "Rob";
        JComboBox func = funcionario;
        FuncionarioDAO instance = new FuncionarioDAO();
        instance.pesquisarFuncionario(pesquisa, func);
    }

    /**
     * Test of getFuncionario method, of class FuncionarioDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetFuncionario() throws Exception {
        System.out.println("getFuncionario");
        int id = 1;
        JTextField nome = name;
        JTextField usuario = user;
        JTextField senha = pass;
        JTextField confirmacaoSenha = confPass;
        JTextField telefone = phone;
        JTextField email = mail;
        JRadioButton masc = male;
        JRadioButton fem = female;
        JTextField cpf = doc;
        FuncionarioDAO instance = new FuncionarioDAO();
        instance.getFuncionario(id, nome, usuario, senha, confirmacaoSenha, telefone, email, masc, fem, cpf);
    }

    /**
     * Test of visualizarFuncionarios method, of class FuncionarioDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testVisualizarFuncionarios() throws Exception {
        System.out.println("visualizarFuncionarios");
        JTable func = table;
        FuncionarioDAO instance = new FuncionarioDAO();
        instance.visualizarFuncionarios(func);
    }
}
