package DAO;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class VendaDAOTest {
    
    public static JTable table;

    @BeforeAll
    public static void setUpClass() throws Exception {
        table = new JTable();
        table.setModel(new DefaultTableModel(
                new Object[][]{},
                //TITULOS DAS SUAS COLUNAS
                new String[]{"Hora", "ID", "ID do Cliente", "Valor Total", "Descrição"}) {
        });
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

    /**
     * Test of visualizarVendas method, of class VendaDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testVisualizarVendas() throws Exception {
        System.out.println("visualizarVendas");
        JTable vend = table;
        VendaDAO instance = new VendaDAO();
        instance.visualizarVendas(vend);
    }
    
}
