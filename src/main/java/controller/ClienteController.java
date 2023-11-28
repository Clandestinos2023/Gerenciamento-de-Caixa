package controller;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import model.Cliente;

public class ClienteController {
    
    Cliente model = new Cliente();
    
    //  MÉTODO PARA CRIAÇÃO DE UM CONTROLLER COM AS INFORMAÇÕES DO CLIENTE
    public void cadastrar(String name, int age, String typeCliente, String codigo, String telefone) throws Exception {
        model.cadastrar(name, age, typeCliente, codigo, telefone);
    }
    
}
