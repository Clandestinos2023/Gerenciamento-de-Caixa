package DAO;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import javax.swing.JTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import view.telasExibicao.telaVisualizarVendas;

public class VendaDAOTest {

    /**
     * Test of cadastrar method, of class VendaDAO.
     */
    @Test
    public void testCadastrar() {
        System.out.println("cadastrar");
        int idCliente = 2;
        double valorCompra = 15.5;
        String descricao = "8x bala IceKiss";
        VendaDAO instance = new VendaDAO();
        instance.cadastrar(idCliente, valorCompra, descricao);
    }

    /**
     * Test of getIDCliente method, of class VendaDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetIDCliente() throws Exception {
        System.out.println("getIDCliente");
        int id = 1;
        VendaDAO instance = new VendaDAO();
        int expResult = 2;
        int result = instance.getIDCliente(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getValor method, of class VendaDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetValor() throws Exception {
        System.out.println("getValor");
        int id = 1;
        VendaDAO instance = new VendaDAO();
        double expResult = 15.5;
        double result = instance.getValor(id);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getDescricao method, of class VendaDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetDescricao() throws Exception {
        System.out.println("getDescricao");
        int id = 1;
        VendaDAO instance = new VendaDAO();
        String expResult = "8x bala IceKiss";
        String result = instance.getDescricao(id);
        assertEquals(expResult, result);
    }

//    /**
//     * Test of visualizarVendas method, of class VendaDAO.
//     * @throws java.lang.Exception
//     */
//    @Test
//    public void testVisualizarVendas() throws Exception {
//        System.out.println("visualizarVendas");
//        JTable vend = telaVisualizarVendas.vendas;
//        VendaDAO instance = new VendaDAO();
//        instance.visualizarVendas(vend);
//    }
    
}
