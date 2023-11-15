/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Funcionario;

/**
 *
 * @author Davidson
 */
public class FuncionarioController {
    
    Funcionario model = new Funcionario();
    
    public void cadastrar(String name, String user, String pass, String confirmPass,
                String phone, String mail, String sex, String CPF) throws Exception {
        model.cadastrar(name, user, pass, confirmPass, phone, mail, sex, CPF);
    }
    
    /*
    public void editar(String nome) {
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
