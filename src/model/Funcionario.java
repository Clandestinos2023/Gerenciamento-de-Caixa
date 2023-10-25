/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


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
    
    public void cadastrar(String nome, String usuario, String senha, String confirmacaoSenha,
                String telefone, String email, String sexo, String cpf) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.confirmacaoSenha = confirmacaoSenha;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.cpf = cpf;
    }
    
    public void editar(String nome) {
        System.out.println(nome);
    }
    
    public void excluir(String nome) {
        System.out.println(nome);
    }
    
    public void vizualizar(String nome) {
        System.out.println(nome);
    }
        
    
    /**
     * Funções necessárias:
     * -cadastrar
     * -alterar
     * -excluir
     * -vizualizar
    */
    
}
