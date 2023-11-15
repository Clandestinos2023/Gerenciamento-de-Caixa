/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model;

import org.junit.jupiter.api.Test;

/**
 *
 * @author Davidson
 */
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
