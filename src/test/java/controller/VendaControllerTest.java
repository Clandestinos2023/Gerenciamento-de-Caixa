package controller;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import org.junit.jupiter.api.Test;

public class VendaControllerTest {
    
    /**
     * Test of cadastrar method, of class VendaController.
     */
    @Test
    public void testCadastrar() {
        System.out.println("cadastrar");
        int idCliente = 2;
        double valorCompra = 14.0;
        String descricao = "Teste";
        VendaController instance = new VendaController();
        instance.cadastrar(idCliente, valorCompra, descricao);
    }
    
}
