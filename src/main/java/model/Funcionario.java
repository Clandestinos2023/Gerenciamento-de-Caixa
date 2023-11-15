/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DAO.FuncionarioDAO;

/**
 *
 * @author Davidson
 */
public class Funcionario {

    private int id;
    private String nome;
    private String usuario;
    private String senha;
    private String confirmacaoSenha;
    private String telefone;
    private String email;
    private String sexo;
    private String cpf;
    
    FuncionarioDAO dao = new FuncionarioDAO();
    /*
    // GETTERS E SETTERS
    public void setID(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setUser(String user) {
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setConfirmaSenha(String confirmSenha) {
        this.confirmacaoSenha = confirmSenha;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    */

    public void cadastrar(String name, String user, String pass, String confirmPass,
            String phone, String mail, String sex, String CPF) throws Exception {
        this.nome = name;
        this.usuario = user;
        this.senha = pass;
        this.confirmacaoSenha = confirmPass;
        this.telefone = phone;
        this.email = mail;
        this.sexo = sex;
        this.cpf = CPF;

        dao.cadastrar(name, user, pass, confirmPass, phone, mail, sex, CPF);
    }
    
    /*
    public void editar(String nome) {
        System.out.println(nome);
    }

    public void excluir(String nome) {
        System.out.println(nome);
    }

    public void vizualizar(String nome) {
        System.out.println(nome);
    }
    */

    /**
     * Funções necessárias: -cadastrar -alterar -excluir -vizualizar
     */
}
