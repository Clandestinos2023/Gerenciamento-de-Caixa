package controller;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import model.Venda;

public class VendaController {
    
    Venda model = new Venda();
    
    //  MÉTODO PARA CRIAÇÃO DE UM CONTROLLER COM AS INFORMAÇÕES DA VENDA
    public void cadastrar(int idCliente,double valorCompra, String descricao) {
        model.cadastrar(idCliente, valorCompra, descricao);
    }
}
