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

import DAO.ProdutoDAO;

/**
 *
 * @author Davidson
 * @since 11/2023
 *
 * Classe para padronização de produto
 */
public class Produto {

    private int id;
    private String nome;
    private double valor;
    private int quantidade;

    /**
     * Objeto referente a classe ProdutoDAO a qual possui manipulação do Banco
     * de Dados
     */
    ProdutoDAO dao = new ProdutoDAO();

    // SETTERS
    /**
     * Método para atribuir ID
     *
     * @param ID
     */
    public void setID(int ID) {
        this.id = ID;
    }

    /**
     * Método para atribuir nome
     *
     * @param name
     */
    public void setNome(String name) {
        this.nome = name;
    }

    /**
     * Método para atribuir valor
     *
     * @param value
     */
    public void setValor(double value) {
        this.valor = value;
    }

    /**
     * Método para atribuir quantidade
     *
     * @param qnt
     */
    public void setQuantidade(int qnt) {
        this.quantidade = qnt;
    }

    // GETTERS
    /**
     * Método para buscar ID
     *
     * @return id
     */
    public int getID() {
        return this.id;
    }

    /**
     * Método para buscar nome
     *
     * @return nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Método para buscar valor
     *
     * @return valor
     */
    public double getValor() {
        return this.valor;
    }

    /**
     * Método para buscar quantidade
     *
     * @return quantidade
     */
    public int getQuantidade() {
        return this.quantidade;
    }

    /**
     * Método para criação de um objeto com as informações do produto
     *
     * @param name
     * @param value
     * @param quant
     */
    public void cadastrar(String name, double value, int quant) {
        this.nome = name;
        this.valor = value;
        this.quantidade = quant;

        dao.cadastrar(name, value, quant);
    }

}
