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
public class Cliente {
    
    /**
     * Funções necessárias:
     * -cadastrar
     * -alterar
     * -excluir
     * -vizualizar
    */
    
    private int id;
    private String nome;
    private int idade;
    private String codCliente;
    private String tipoCliente;
    private String contato;
    
    public void cadastrar(String nome, int idade, String codCliente, String tipoCliente, String contato) {
        this.nome = nome;
        this.idade = idade;
        this.codCliente = codCliente;
        this.tipoCliente = tipoCliente;
        this.contato = contato;
        
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
    
}
