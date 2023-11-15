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
    
    public void cadastrar(String name, int age, String typeCliente, String codigo, String telefone) throws Exception {
        model.cadastrar(name, age, typeCliente, codigo, telefone);
    }
    
    /*
    public void editar(String nome) throws Exception {
        model.editar(nome);
    }
    
    public void excluir(String nome) {
        model.excluir(nome);
    }
    
    public void vizualizar(String nome) {
        model.vizualizar(nome);
    }
    */
    
}
