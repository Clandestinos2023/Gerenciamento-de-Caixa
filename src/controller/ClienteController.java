/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ClienteDAO;
import model.Cliente;

/**
 *
 * @author Davidson
 */
public class ClienteController {
    
    Cliente model = new Cliente();
    ClienteDAO dao = new ClienteDAO();
    
    public void cadastrar(String nome, int idade, String tipoCliente, String codCliente, String contato) throws Exception {
        model.cadastrar(nome, idade, tipoCliente, codCliente, contato);
        dao.cadastrar(nome, idade, tipoCliente, codCliente, contato);
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
