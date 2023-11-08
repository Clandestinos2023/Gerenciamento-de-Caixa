/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DAO.VendaDAO;

/**
 *
 * @author Davidson
 */
public class Venda {
    
    private int id;
    private String nomeCliente;
    private double valorCompra;
    private String descricao;
    
    VendaDAO dao = new VendaDAO();
    
    public void cadastrar(String nomeCliente,double valorCompra, String descricao) {
        this.nomeCliente = nomeCliente;
        this.valorCompra = valorCompra;
        this.descricao = descricao;
        
        dao.cadastrar(nomeCliente, valorCompra, descricao);
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