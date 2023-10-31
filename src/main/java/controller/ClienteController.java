/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cliente;

/**
 *
 * @author Davidson
 */
public class ClienteController {
    
    Cliente model = new Cliente();
    
    public void cadastrar(String nome, int idade, String tipoCliente, String codCliente, String contato) throws Exception {
        model.cadastrar(nome, idade, tipoCliente, codCliente, contato);
    }
    
    public void editar(String nome) throws Exception {
        model.editar(nome);
    }
    
    public void excluir(String nome) {
        model.excluir(nome);
    }
    
    public void vizualizar(String nome) {
        model.vizualizar(nome);
    }
    
}
