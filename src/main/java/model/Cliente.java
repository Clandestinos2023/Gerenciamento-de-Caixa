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

import DAO.ClienteDAO;

/**
 *
 * @author Davidson
 * @since 11/2023
 *
 * Classe para padronização de cliente
 */
public class Cliente {

    private int id;
    private String nome;
    private int idade;
    private String codCliente;
    private String tipoCliente;
    private String contato;

    /**
     * Objeto referente a classe ClienteDAO a qual possui manipulação do Banco
     * de Dados
     */
    ClienteDAO dao = new ClienteDAO();

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
     * Método para atribuir idade
     *
     * @param age
     */
    public void setIdade(int age) {
        this.idade = age;
    }

    /**
     * Método para atribuir o código do cliente (CPF ou CNPJ)
     *
     * @param codeCli
     */
    public void setCodCliente(String codeCli) {
        this.codCliente = codeCli;
    }

    /**
     * Método para atribuir o tipo de cliente (Físico ou Jurídico)
     *
     * @param typeCli
     */
    public void setTipoCliente(String typeCli) {
        this.tipoCliente = typeCli;
    }

    /**
     * Método para atribuir o telefone de contato
     *
     * @param phone
     */
    public void setContato(String phone) {
        this.contato = phone;
    }

    // GETTERS
    /**
     * Método para buscar ID
     *
     * @return ID
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
     * Método para buscar idade
     *
     * @return idade
     */
    public int getIdade() {
        return this.idade;
    }

    /**
     * Método para buscar o código do cliente (CPF ou CNPJ)
     *
     * @return codCliente
     */
    public String getCodCliente() {
        return this.codCliente;
    }

    /**
     * Método para buscar o tipo de cliente (Físico ou Jurídico)
     *
     * @return tipoCliente
     */
    public String getTipoCliente() {
        return this.tipoCliente;
    }

    /**
     * Método para buscar o telefone de contato
     *
     * @return contato
     */
    public String getContato() {
        return this.contato;
    }

    /**
     * Método para criação de um objeto com as informações do cliente
     *
     * @param name
     * @param age
     * @param typeCliente
     * @param codigo
     * @param telefone
     * @throws Exception
     */
    public void cadastrar(String name, int age, String typeCliente, String codigo, String telefone) throws Exception {
        this.nome = name;
        this.idade = age;
        this.codCliente = codigo;
        this.tipoCliente = typeCliente;
        this.contato = telefone;

        dao.cadastrar(name, age, typeCliente, codigo, telefone);
    }

}
