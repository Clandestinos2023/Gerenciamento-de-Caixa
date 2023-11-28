package model;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import org.junit.jupiter.api.Test;

public class FuncionarioTest {

    /**
     * Test of cadastrar method, of class Funcionario.
     */
    @Test
    public void testCadastrar() throws Exception {
        System.out.println("cadastrar");
        String name = "Renato";
        String user = "renato";
        String pass = "234";
        String confirmPass = "234";
        String phone = "(11) 11111-1111";
        String mail = "renato@test.com";
        String sex = "Masculino";
        String CPF = "111.111.111-11";
        Funcionario instance = new Funcionario();
        instance.cadastrar(name, user, pass, confirmPass, phone, mail, sex, CPF);
    }
    
}
