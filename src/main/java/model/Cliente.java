/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DAO.ClienteDAO;

/**
 *
 * @author Davidson
 */
public class Cliente {

    /**
     * Funções necessárias: -cadastrar -alterar -excluir -vizualizar
     */
    private int id;
    private String nome;
    private int idade;
    private String codCliente;
    private String tipoCliente;
    private String contato;
    
    ClienteDAO dao = new ClienteDAO();

    public void cadastrar(String name, int age, String typeCliente, String codigo, String telefone) throws Exception {
        this.nome = name;
        this.idade = age;
        this.codCliente = codigo;
        this.tipoCliente = typeCliente;
        this.contato = telefone;

        dao.cadastrar(name, age, typeCliente, codigo, telefone);

    }

    /*
    public void editar(String nome) throws Exception {
        //dao.getID(nome);
    }

    public void excluir(String nome) {
        System.out.println(nome);
    }

    public void vizualizar(String nome) {
        System.out.println(nome);
    }

    public void cadastrar(String hugo, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    */

}
