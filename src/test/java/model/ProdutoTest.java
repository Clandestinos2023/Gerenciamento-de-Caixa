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
