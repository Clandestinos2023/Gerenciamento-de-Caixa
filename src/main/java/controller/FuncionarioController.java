package controller;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import model.Funcionario;

public class FuncionarioController {
    
    Funcionario model = new Funcionario();
    
    //  MÉTODO PARA CRIAÇÃO DE UM CONTROLLER COM AS INFORMAÇÕES DO FUNCIONÁRIO
    public void cadastrar(String name, String user, String pass, String confirmPass,
                String phone, String mail, String sex, String CPF) throws Exception {
        model.cadastrar(name, user, pass, confirmPass, phone, mail, sex, CPF);
    }
    
}
