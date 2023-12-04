/*
 * The MIT License
 *
 * Copyright 2023 Davidson Teixeira Filho.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package model;

import DAO.VendaDAO;

/**
 *
 * @author Davidson
 * @since 11/2023
 *
 * Classe para padronização de venda
 */
public class Venda {

    private int id;
    private int idCliente;
    private double valorCompra;
    private String descricao;

    /**
     * Objeto referente a classe VendaDAO a qual possui manipulação do Banco de
     * Dados
     */
    VendaDAO dao = new VendaDAO();

    //  SETTERS
    /**
     * Método para atribuir ID
     *
     * @param id
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     * Método para atribuir id do cliente
     *
     * @param idCliente
     */
    public void setIDCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Método para atribuir valor total da compra
     *
     * @param valorTotal
     */
    public void setValorCompra(double valorTotal) {
        this.valorCompra = valorTotal;
    }

    /**
     * Método para atribuir a descrição da compra
     *
     * @param desc
     */
    public void setDescricao(String desc) {
        this.descricao = desc;
    }

    //  GETTERS
    /**
     * Método para buscar ID
     *
     * @return id
     */
    public int getID() {
        return this.id;
    }

    /**
     * Método para buscar id do cliente
     *
     * @return idCliente
     */
    public int getIDCliente() {
        return this.idCliente;
    }

    /**
     * Método para buscar valor total da compra
     *
     * @return valorCompra
     */
    public double getValorCompra() {
        return this.valorCompra;
    }

    /**
     * Método para buscar a descrição da compra
     *
     * @return descricao
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Método para criação de um objeto com as informações da venda
     *
     * @param idCliente
     * @param valorCompra
     * @param descricao
     */
    public void cadastrar(int idCliente, double valorCompra, String descricao) {
        this.idCliente = idCliente;
        this.valorCompra = valorCompra;
        this.descricao = descricao;

        dao.cadastrar(idCliente, valorCompra, descricao);
    }

}
