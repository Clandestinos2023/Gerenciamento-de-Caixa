package model;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import org.junit.jupiter.api.Test;

public class VendaTest {

    /**
     * Test of cadastrar method, of class Venda.
     */
    @Test
    public void testCadastrar() {
        System.out.println("cadastrar");
        int idCliente = 1;
        double valorCompra = 19.76;
        String descricao = "3x bolas";
        Venda instance = new Venda();
        instance.cadastrar(idCliente, valorCompra, descricao);
    }

}
