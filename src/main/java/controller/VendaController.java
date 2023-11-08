/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Venda;

/**
 *
 * @author Davidson
 */
public class VendaController {
    
    Venda model = new Venda();
    
    public void cadastrar(String nomeCliente,double valorCompra, String descricao) {
        model.cadastrar(nomeCliente, valorCompra, descricao);
    }
    
    public void editar(String nome) {
        model.editar(nome);
    }
    
    public void excluir(String nome) {
        model.excluir(nome);
    }
    
    public void vizualizar(String nome) {
        model.vizualizar(nome);
    }
    
}
