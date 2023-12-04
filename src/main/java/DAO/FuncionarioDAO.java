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
package DAO;

import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Davidson
 * @since 11/2023
 *
 * Classe para manipulação de banco de dados - tabela: funcionario
 */
public class FuncionarioDAO {

    /**
     * Método para cadastrar o funcionário no BD
     *
     * @param nome
     * @param usuario
     * @param senha
     * @param confirmacaoSenha
     * @param telefone
     * @param email
     * @param sexo
     * @param cpf
     * @throws Exception
     */
    public void cadastrar(String nome, String usuario, String senha, String confirmacaoSenha,
            String telefone, String email, String sexo, String cpf) throws Exception {

        try {
            String insert = "insert into funcionario(nome, usuario, senha, telefone, "
                    + "email, sexo, cpf) values (?,?,?,?,?,?,?)";
            Connection con = new Conexao().getConnection();
            System.out.println("Connection established!");

            try (PreparedStatement stmt = con.prepareStatement(insert)) {
                stmt.setString(1, nome);
                stmt.setString(2, usuario);
                stmt.setString(3, senha);
                stmt.setString(4, telefone);
                stmt.setString(5, email);
                stmt.setString(6, sexo);
                stmt.setString(7, cpf);

                stmt.executeUpdate();
            }
            System.out.println("Connection closed!");

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    /**
     * Método para buscar o ID do funcionário
     *
     * @param nome
     * @return id
     * @throws Exception
     */
    public int getID(String nome) throws Exception {
        int id = 0;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select id from funcionario where nome='" + nome + "';";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                id = rs.getInt("id");
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return id;
    }

    /**
     * Método para buscar o nome do funcionário
     *
     * @param id
     * @return nome
     * @throws Exception
     */
    public String getNome(int id) throws Exception {
        String nome = null;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select nome from funcionario where id='" + id + "';";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                nome = rs.getString("nome");
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return nome;
    }

    /**
     * Método para buscar o usuário do funcionário
     *
     * @param id
     * @return usuario
     * @throws Exception
     */
    public String getUsuario(int id) throws Exception {
        String usuario = null;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select usuario from funcionario where id='" + id + "';";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                usuario = rs.getString("usuario");
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return usuario;
    }

    /**
     * Método para buscar a senha do funcionário
     *
     * @param id
     * @return senha
     * @throws Exception
     */
    public String getSenha(int id) throws Exception {
        String senha = null;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select senha from funcionario where id='" + id + "';";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                senha = rs.getString("senha");
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return senha;
    }

    /**
     * Método para busccar o tetlefone do funcionário
     *
     * @param id
     * @return telefone
     * @throws Exception
     */
    public String getTelefone(int id) throws Exception {
        String telefone = null;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select telefone from funcionario where id='" + id + "';";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                telefone = rs.getString("telefone");
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return telefone;
    }

    /**
     * Método para buscar o email do funcionário
     *
     * @param id
     * @return
     * @throws Exception
     */
    public String getEmail(int id) throws Exception {
        String email = null;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select email from funcionario where id='" + id + "';";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                email = rs.getString("email");
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return email;
    }

    /**
     * Método para buscar o sexo do funcionário
     *
     * @param id
     * @return sexo
     * @throws Exception
     */
    public String getSexo(int id) throws Exception {
        String sexo = null;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select sexo from funcionario where id='" + id + "';";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                sexo = rs.getString("sexo");
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return sexo;
    }

    /**
     * Método para buscar o cpf do funcionario
     *
     * @param id
     * @return cpf
     * @throws Exception
     */
    public String getCPF(int id) throws Exception {
        String cpf = null;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select cpf from funcionario where id='" + id + "';";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                cpf = rs.getString("cpf");
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return cpf;
    }

    /**
     * Método para listar todos os nomes dos funcionários
     *
     * @param funcionarios
     * @throws Exception
     */
    public void listarFuncionario(javax.swing.JComboBox funcionarios) throws Exception {
        funcionarios.removeAllItems();
        funcionarios.addItem("------");

        try {
            Connection con = new Conexao().getConnection();
            Statement stm = con.createStatement();

            String sql = "select nome from funcionario";

            ResultSet rs = (ResultSet) stm.executeQuery(sql);

            while (rs.next()) {
                funcionarios.addItem(rs.getString("nome"));
            }

        } catch (SQLException ex) {
            System.err.println("Ocorreu um erro ao carregar o ComboBox");
        }

    }

    /**
     * Método para listar todos os nomes de funcionários que possuem a String
     * passada
     *
     * @param pesquisa
     * @param funcionarios
     * @throws Exception
     */
    public void pesquisarFuncionario(String pesquisa, javax.swing.JComboBox funcionarios) throws Exception {
        funcionarios.removeAllItems();
        funcionarios.addItem("------");

        try {
            Connection con = new Conexao().getConnection();
            Statement stm = con.createStatement();

            String sql = "select nome from funcionario where nome like '%" + pesquisa + "%'";

            ResultSet rs = (ResultSet) stm.executeQuery(sql);

            while (rs.next()) {
                funcionarios.addItem(rs.getString("nome"));
            }

        } catch (SQLException ex) {
            System.err.println("Ocorreu um erro ao carregar o ComboBox");
        }

    }

    /**
     * Método para buscar as informações de um funcionário e setar as
     * informações na view
     *
     * @param id
     * @param nome
     * @param usuario
     * @param senha
     * @param confirmacaoSenha
     * @param telefone
     * @param email
     * @param masc
     * @param fem
     * @param cpf
     * @throws Exception
     */
    public void getFuncionario(int id, javax.swing.JTextField nome, javax.swing.JTextField usuario, javax.swing.JTextField senha,
            javax.swing.JTextField confirmacaoSenha, javax.swing.JTextField telefone, javax.swing.JTextField email, javax.swing.JRadioButton masc,
            javax.swing.JRadioButton fem, javax.swing.JTextField cpf) throws Exception {

        String name = "", user = "", phone = "", mail = "", sex = "", CPF = "", pass = "";

        try {
            Connection con = new Conexao().getConnection();
            Statement stm = con.createStatement();

            String sql = "select nome, usuario, telefone, email, sexo, cpf, senha from funcionario where id = '" + id + "'";

            ResultSet rs = (ResultSet) stm.executeQuery(sql);

            while (rs.next()) {
                name = rs.getString("nome");
                user = rs.getString("usuario");
                phone = rs.getString("telefone");
                mail = rs.getString("email");
                sex = rs.getString("sexo");
                CPF = rs.getString("cpf");
                pass = rs.getString("senha");
            }

            nome.setText(name);
            usuario.setText(user);
            telefone.setText(phone);
            email.setText(mail);
            cpf.setText(CPF);
            senha.setText(pass);
            confirmacaoSenha.setText(pass);
            if (sex.equals("Masculino")) {
                masc.setSelected(true);
            } else {
                fem.setSelected(true);
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    /**
     * Método para atualizar as informações de um funcionário no BD pelo ID
     *
     * @param idFunc
     * @param nome
     * @param usuario
     * @param senha
     * @param confirmacaoSenha
     * @param telefone
     * @param email
     * @param sexo
     * @param cpf
     * @throws Exception
     */
    public void updateFuncionario(int idFunc, String nome, String usuario, String senha,
            String confirmacaoSenha, String telefone, String email, String sexo, String cpf) throws Exception {

        try {
            Connection con = new Conexao().getConnection();

            String update = "update funcionario set nome = '" + nome + "', usuario = '" + usuario + "', senha = '" + senha + "', telefone = '" + telefone + "', email = '" + email + "', sexo = '" + sexo + "', cpf = '" + cpf + "' where id=" + idFunc + "";

            Statement stmt = con.prepareStatement(update);
            stmt.executeUpdate(update);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    /**
     * Método para deletar um funcionário no BD pelo ID
     *
     * @param id
     * @throws Exception
     */
    public void deleteFuncionario(int id) throws Exception {
        try {
            Connection con = new Conexao().getConnection();

            String delete = "delete from funcionario where id='" + id + "'";
            PreparedStatement stmt = con.prepareStatement(delete);
            int res = stmt.executeUpdate(delete);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    /**
     * Método para visualizar todos os funcionários em formato de tabela
     *
     * @param funcionarios
     * @throws Exception
     */
    public void visualizarFuncionarios(javax.swing.JTable funcionarios) throws Exception {
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select id, nome, usuario, telefone, email, sexo, cpf from funcionario";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            DefaultTableModel modelo = (DefaultTableModel) funcionarios.getModel();
            modelo.setNumRows(0);

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String usuario = rs.getString("usuario");
                String phone = rs.getString("telefone");
                String mail = rs.getString("email");
                String sex = rs.getString("sexo");
                String CPF = rs.getString("cpf");
                modelo.addRow(new Object[]{id, nome, usuario, phone, mail, sex, CPF});
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
}
