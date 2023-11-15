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

}
