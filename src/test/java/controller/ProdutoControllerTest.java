package controller;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import org.junit.jupiter.api.Test;

public class ProdutoControllerTest {
    
    /**
     * Test of cadastrar method, of class ProdutoController.
     */
    @Test
    public void testCadastrar() {
        System.out.println("cadastrar");
        String name = "Notebook";
        double value = 4597.99;
        int quant = 20;
        ProdutoController instance = new ProdutoController();
        instance.cadastrar(name, value, quant);
    }
}
