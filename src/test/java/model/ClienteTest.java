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
public class ClienteTest {
    
    /**
     * Test of cadastrar method, of class Cliente.
     */
    @Test
    public void testCadastrar() throws Exception {
        System.out.println("cadastrar");
        String name = "Daniel";
        int age = 21;
        String typeCliente = "Físico";
        String codigo = "097.771.435-67";
        String telefone = "(31) 97658-9843";
        Cliente instance = new Cliente();
        instance.cadastrar(name, age, typeCliente, codigo, telefone);
    }

}
