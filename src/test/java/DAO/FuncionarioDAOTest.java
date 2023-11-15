/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DAO;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import model.Funcionario;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Davidson
 */
public class FuncionarioDAOTest {

    @BeforeAll
    public static void setUpClass() throws Exception {
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
     */
    @Test
    public void testGetID() throws Exception {
        System.out.println("getID");
        String nome = "Davidson";
        FuncionarioDAO instance = new FuncionarioDAO();
        int expResult = 1;
        int result = instance.getID(nome);
        assertEquals(expResult, result);
    }

    /**
     * Test of getNome method, of class FuncionarioDAO.
     */
    @Test
    public void testGetNome() throws Exception {
        System.out.println("getNome");
        int id = 1;
        FuncionarioDAO instance = new FuncionarioDAO();
        String expResult = "Davidson";
        String result = instance.getNome(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getUsuario method, of class FuncionarioDAO.
     */
    @Test
    public void testGetUsuario() throws Exception {
        System.out.println("getUsuario");
        int id = 1;
        FuncionarioDAO instance = new FuncionarioDAO();
        String expResult = "davidson";
        String result = instance.getUsuario(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getSenha method, of class FuncionarioDAO.
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
     */
    @Test
    public void testGetTelefone() throws Exception {
        System.out.println("getTelefone");
        int id = 1;
        FuncionarioDAO instance = new FuncionarioDAO();
        String expResult = "(31) 98818-6620";
        String result = instance.getTelefone(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmail method, of class FuncionarioDAO.
     */
    @Test
    public void testGetEmail() throws Exception {
        System.out.println("getEmail");
        int id = 1;
        FuncionarioDAO instance = new FuncionarioDAO();
        String expResult = "odavidsonteixeira@gmail.com";
        String result = instance.getEmail(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getSexo method, of class FuncionarioDAO.
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


}
