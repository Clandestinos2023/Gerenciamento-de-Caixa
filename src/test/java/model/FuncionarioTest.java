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
