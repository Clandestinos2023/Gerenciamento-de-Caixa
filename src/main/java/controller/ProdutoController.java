package controller;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import model.Produto;

public class ProdutoController {
    
    public Produto model = new Produto();
    
    //  MÉTODO PARA CRIAÇÃO DE UM CONTROLLER COM AS INFORMAÇÕES DO PRODUTO
    public void cadastrar(String name, double value, int quant) {
        model.cadastrar(name, value, quant);
    }
    
}
