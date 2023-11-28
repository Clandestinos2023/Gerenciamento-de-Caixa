package model;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import DAO.VendaDAO;

public class Venda {
    
    private int id;
    private int idCliente;
    private double valorCompra;
    private String descricao;
    
    VendaDAO dao = new VendaDAO();
    
    //  SETTERS
    public void setID(int id) {
        this.id = id;
    }
    public void setIDCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public void setValorCompra(double valorTotal) {
        this.valorCompra = valorTotal;
    }
    public void setDescricao(String desc) {
        this.descricao = desc;
    }
    
    //  GETTERS
    public int getID() {
        return this.id;
    }
    public int getIDCliente() {
        return this.idCliente;
    }
    public double getValorCompra() {
        return this.valorCompra;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    //  MÉTODO PARA CRIAÇÃO DE UM OBJETO COM AS INFORMAÇÕES DA VENDA
    public void cadastrar(int idCliente,double valorCompra, String descricao) {
        this.idCliente = idCliente;
        this.valorCompra = valorCompra;
        this.descricao = descricao;
        
        dao.cadastrar(idCliente, valorCompra, descricao);
    }
    
}
