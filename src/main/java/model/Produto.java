/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DAO.ProdutoDAO;

/**
 *
 * @author Davidson
 */
public class Produto {
    
    private int id;
    private String nome;
    private double valor;
    private int quantidade;
    
    ProdutoDAO dao = new ProdutoDAO();
    
    public void cadastrar(String name, double value, int quant) {
        this.nome = name;
        this.valor = value;
        this.quantidade = quant;
        
        dao.cadastrar(name, value, quant);
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
