package DAO;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import view.telasAlteracao.telaAlterarFuncionario;
import view.telasExibicao.telaVisualizarFuncionarios;

public class FuncionarioDAOTest {

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

//    /**
//     * Test of listarFuncionario method, of class FuncionarioDAO.
//     * @throws java.lang.Exception
//     */
//    @Test
//    public void testListarFuncionario() throws Exception {
//        System.out.println("listarFuncionario");
//        JComboBox func = telaAlterarFuncionario.func;
//        FuncionarioDAO instance = new FuncionarioDAO();
//        instance.listarFuncionario(func);
//    }
//
//    /**
//     * Test of pesquisarFuncionario method, of class FuncionarioDAO.
//     * @throws java.lang.Exception
//     */
//    @Test
//    public void testPesquisarFuncionario() throws Exception {
//        System.out.println("pesquisarFuncionario");
//        String pesq = "dav";
//        JComboBox func = telaAlterarFuncionario.func;
//        FuncionarioDAO instance = new FuncionarioDAO();
//        instance.pesquisarFuncionario(pesq, func);
//    }
//
//    /**
//     * Test of visualizarFuncionarios method, of class FuncionarioDAO.
//     * @throws java.lang.Exception
//     */
//    @Test
//    public void testVisualizarFuncionarios() throws Exception {
//        System.out.println("visualizarFuncionarios");
//        JTable func = telaVisualizarFuncionarios.func;
//        FuncionarioDAO instance = new FuncionarioDAO();
//        instance.visualizarFuncionarios(func);
//    }
//
//    /**
//     * Test of getFuncionario method, of class FuncionarioDAO.
//     * @throws java.lang.Exception
//     */
//    @Test
//    public void testGetFuncionario() throws Exception {
//        System.out.println("getFuncionario");
//        int id = 11;
//        JTextField nome = telaAlterarFuncionario.nome;
//        JTextField usuario = telaAlterarFuncionario.usuario;
//        JTextField senha = telaAlterarFuncionario.senha;
//        JTextField confirmacaoSenha = telaAlterarFuncionario.confirmacaoSenha;
//        JTextField telefone = telaAlterarFuncionario.telefone;
//        JTextField email = telaAlterarFuncionario.email;
//        JRadioButton masc = telaAlterarFuncionario.masc;
//        JRadioButton fem = telaAlterarFuncionario.fem;
//        JTextField cpf = telaAlterarFuncionario.cpf;
//        FuncionarioDAO instance = new FuncionarioDAO();
//        instance.getFuncionario(id, nome, usuario, senha, confirmacaoSenha, telefone, email, masc, fem, cpf);
//    }

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
}
