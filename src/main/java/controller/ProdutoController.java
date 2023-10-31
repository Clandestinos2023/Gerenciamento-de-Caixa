/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ProdutoDAO;
import model.Produto;

/**
 *
 * @author Davidson
 */
public class ProdutoController {
    
    Produto model = new Produto();
    ProdutoDAO dao = new ProdutoDAO();
    
    public void cadastrar(String nome, double valor, int quantidade) {
        model.cadastrar(nome, valor, quantidade);
        dao.cadastrar(nome, valor, quantidade);
    }
    
    public void editar(String nome) {
        model.editar(nome);
        dao.editar(nome);
    }
    
    public void excluir(String nome) {
        model.excluir(nome);
        dao.excluir(nome);
    }
    
    public void vizualizar(String nome) {
        model.vizualizar(nome);
        dao.vizualizar(nome);
    }
    
}
