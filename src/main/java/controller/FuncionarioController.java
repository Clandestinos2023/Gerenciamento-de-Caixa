/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.FuncionarioDAO;
import model.Funcionario;

/**
 *
 * @author Davidson
 */
public class FuncionarioController {
    
    Funcionario model = new Funcionario();
    
    public void cadastrar(String nome, String usuario, String senha, String confirmacaoSenha,
                String telefone, String email, String sexo, String cpf) throws Exception {
        model.cadastrar(nome,usuario,senha,confirmacaoSenha, telefone, email, sexo, cpf);
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
