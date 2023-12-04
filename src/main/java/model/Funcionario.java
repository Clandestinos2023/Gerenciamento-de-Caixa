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

import DAO.FuncionarioDAO;

/**
 *
 * @author Davidson
 * @since 11/2023
 *
 * Classe para padronização de funcionario
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

    /**
     * Objeto referente a classe FuncionarioDAO a qual possui manipulação do
     * Banco de Dados
     */
    FuncionarioDAO dao = new FuncionarioDAO();

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
     * Método para atribuir nome
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para atribuir usuario
     *
     * @param user
     */
    public void setUser(String user) {
        this.usuario = user;
    }

    /**
     * Método para atribuir senha
     *
     * @param senha
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Método para atribuir a confirmação da senha
     *
     * @param confirmSenha
     */
    public void setConfirmaSenha(String confirmSenha) {
        this.confirmacaoSenha = confirmSenha;
    }

    /**
     * Método para atribuir o telefone
     *
     * @param telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Método para atribuir o email
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método para atribuir o sexo
     *
     * @param sexo
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Método para atribuir o cpf
     *
     * @param cpf
     */
    public void setCPF(String cpf) {
        this.cpf = cpf;
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
     * Método para buscar nome
     *
     * @return nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Método para buscar usuario
     *
     * @return usuario
     */
    public String getUser() {
        return this.usuario;
    }

    /**
     * Método para buscar senha
     *
     * @return senha
     */
    public String getSenha() {
        return this.senha;
    }

    /**
     * Método para buscar confirmação de senha
     *
     * @return confirmacaoSenha
     */
    public String getConfirmaSenha() {
        return this.confirmacaoSenha;
    }

    /**
     * Método para buscar telefone
     *
     * @return telefone
     */
    public String getTelefone() {
        return this.telefone;
    }

    /**
     * Método para buscar email
     *
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Método para buscar sexo
     *
     * @return sexo
     */
    public String getSexo() {
        return this.sexo;
    }

    /**
     * Método para buscar cpf
     *
     * @return cpf
     */
    public String getCPF() {
        return this.cpf;
    }

    /**
     * Método para criação de um objeto com as informações do funcionário
     *
     * @param name
     * @param user
     * @param pass
     * @param confirmPass
     * @param phone
     * @param mail
     * @param sex
     * @param CPF
     * @throws Exception
     */
    public void cadastrar(String name, String user, String pass, String confirmPass,
            String phone, String mail, String sex, String CPF) throws Exception {
        this.nome = name;
        this.usuario = user;
        this.senha = pass;
        this.confirmacaoSenha = confirmPass;
        this.telefone = phone;
        this.email = mail;
        this.sexo = sex;
        this.cpf = CPF;

        dao.cadastrar(name, user, pass, confirmPass, phone, mail, sex, CPF);
    }

}
