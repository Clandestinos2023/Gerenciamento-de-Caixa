package model;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import DAO.FuncionarioDAO;

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
    
    FuncionarioDAO dao = new FuncionarioDAO();

    //  SETTERS
    public void setID(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setUser(String user) {
        this.usuario = user;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setConfirmaSenha(String confirmSenha) {
        this.confirmacaoSenha = confirmSenha;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    
    //  GETTERS
    public int setID() {
        return this.id;
    }
    public String setNome() {
        return this.nome;
    }
    public String setUser() {
        return this.usuario;
    }
    public String setSenha() {
        return this.senha;
    }
    public String getConfirmaSenha() {
        return this.confirmacaoSenha;
    }
    public String getTelefone() {
        return this.telefone;
    }
    public String getEmail() {
        return this.email;
    }
    public String getSexo() {
        return this.sexo;
    }
    public String getCPF() {
        return this.cpf;
    }

    //  MÉTODO PARA CRIAÇÃO DE UM OBJETO COM AS INFORMAÇÕES DO FUNCIONÁRIO
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
