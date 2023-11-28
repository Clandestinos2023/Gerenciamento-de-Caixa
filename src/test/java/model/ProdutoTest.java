package model;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import org.junit.jupiter.api.Test;

public class ProdutoTest {

    /**
     * Test of cadastrar method, of class Produto.
     */
    @Test
    public void testCadastrar() {
        System.out.println("cadastrar");
        String name = "Bola";
        double value = 15.0;
        int quant = 34;
        Produto instance = new Produto();
        instance.cadastrar(name, value, quant);
    }

}
