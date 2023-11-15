/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DAO;

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
public class ClienteDAOTest {
    
    /**
     * Test of cadastrar method, of class ClienteDAO.
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
     */
    @Test
    public void testGetID() throws Exception {
        System.out.println("getID");
        String nome = "Abner";
        ClienteDAO instance = new ClienteDAO();
        int expResult = 2;
        int result = instance.getID(nome);
        assertEquals(expResult, result);
    }

    /**
     * Test of getIdade method, of class ClienteDAO.
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
    
}
