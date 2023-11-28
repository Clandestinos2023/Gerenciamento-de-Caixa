package controller;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import org.junit.jupiter.api.Test;

public class FuncionarioControllerTest {

    /**
     * Test of cadastrar method, of class FuncionarioController.
     */
    @Test
    public void testCadastrar() throws Exception {
        System.out.println("cadastrar");
        String name = "Juliana";
        String user = "juliana";
        String pass = "123";
        String confirmPass = "123";
        String phone = "(31) 98765-4321";
        String mail = "tester@tester.com";
        String sex = "Masculino";
        String CPF = "123.456.789-32";
        FuncionarioController instance = new FuncionarioController();
        instance.cadastrar(name, user, pass, confirmPass, phone, mail, sex, CPF);
    }
    
}
