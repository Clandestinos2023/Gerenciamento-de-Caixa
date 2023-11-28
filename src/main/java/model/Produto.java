package model;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import DAO.ProdutoDAO;

public class Produto {
    
    private int id;
    private String nome;
    private double valor;
    private int quantidade;
    
    ProdutoDAO dao = new ProdutoDAO();
    
    // SETTERS
    public void setID(int ID) {
        this.id = ID;
    }
    public void setNome(String name) {
        this.nome = name;
    }
    public void setValor(double value) {
        this.valor = value;
    }
    public void setQuantidade(int qnt) {
        this.quantidade = qnt;
    }
    
    // GETTERS
    public int getID() {
        return this.id;
    }
    public String getNome() {
        return this.nome;
    }
    public double getValor() {
        return this.valor;
    }
    public int getQuantidade() {
        return this.quantidade;
    }

    //  MÉTODO PARA CRIAÇÃO DE UM OBJETO COM AS INFORMAÇÕES DO PRODUTO
    public void cadastrar(String name, double value, int quant) {
        this.nome = name;
        this.valor = value;
        this.quantidade = quant;
        
        dao.cadastrar(name, value, quant);
    }
         
}
