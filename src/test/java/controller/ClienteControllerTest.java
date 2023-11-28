package controller;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import org.junit.jupiter.api.Test;

public class ClienteControllerTest {

    /**
     * Test of cadastrar method, of class ClienteController.
     */
    @Test
    public void testCadastrar() throws Exception {
        System.out.println("cadastrar");
        String name = "Jubileu";
        int age = 76;
        String typeCliente = "Fisico";
        String codigo = "12345678987";
        String telefone = "(22) 98765-4567";
        ClienteController instance = new ClienteController();
        instance.cadastrar(name, age, typeCliente, codigo, telefone);
    }
    
}
