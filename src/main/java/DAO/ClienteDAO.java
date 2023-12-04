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
 * Classe para manipulação de banco de dados - tabela: cliente
 */
public class ClienteDAO {

    /**
     * Método para cadastrar o cliente no BD
     *
     * @param nome
     * @param idade
     * @param tipoCliente
     * @param codCliente
     * @param contato
     * @throws Exception
     */
    public void cadastrar(String nome, int idade, String tipoCliente, String codCliente, String contato) throws Exception {

        try {
            String insert = "insert into cliente(nome, idade, tipo_cliente, codigo_cliente, contato) values (?,?,?,?,?)";
            Connection con = new Conexao().getConnection();
            System.out.println("Connection established!");

            try (PreparedStatement stmt = con.prepareStatement(insert)) {
                stmt.setString(1, nome);
                stmt.setInt(2, idade);
                stmt.setString(3, tipoCliente);
                stmt.setString(4, codCliente);
                stmt.setString(5, contato);

                stmt.executeUpdate();
            } catch (Exception ex) {
                System.err.println(ex);
            }
            System.out.println("Connection closed!");

        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    /**
     * Método para buscar o ID do cliente
     *
     * @param nome
     * @return id
     * @throws Exception
     */
    public int getID(String nome) throws Exception {
        int id = 0;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select id from cliente where nome='" + nome + "';";

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
     * Método para buscar a idade do cliente
     *
     * @param id
     * @return idade
     * @throws Exception
     */
    public int getIdade(int id) throws Exception {
        int idade = 0;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select idade from cliente where id='" + id + "';";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                idade = rs.getInt("idade");
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return idade;
    }

    /**
     * Método para buscar o nome do cliente
     *
     * @param id
     * @return nome
     * @throws Exception
     */
    public String getNome(int id) throws Exception {
        String nome = null;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select nome from cliente where id='" + id + "';";

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
     * Método para buscar o tipo do cliente (Físico ou Jurídico)
     *
     * @param id
     * @return tipoCliente
     * @throws Exception
     */
    public String getTipoCliente(int id) throws Exception {
        String tipoCliente = null;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select tipo_cliente from cliente where id='" + id + "';";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                tipoCliente = rs.getString("tipo_cliente");
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return tipoCliente;
    }

    /**
     * Método para buscar o código do cliente (CPF ou CNPJ)
     *
     * @param id
     * @return codigoCliente
     * @throws Exception
     */
    public String getCodigoCliente(int id) throws Exception {
        String codigoCliente = null;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select codigo_cliente from cliente where id='" + id + "';";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                codigoCliente = rs.getString("codigo_cliente");
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return codigoCliente;
    }

    /**
     * Método para buscar o contato do cliente
     *
     * @param id
     * @return contato
     * @throws Exception
     */
    public String getContato(int id) throws Exception {
        String contato = null;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select contato from cliente where id='" + id + "';";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                contato = rs.getString("contato");
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return contato;
    }

    /**
     * Método para listar todos os nomes dos clientes
     *
     * @param clientes
     * @throws Exception
     */
    public void listarCliente(javax.swing.JComboBox clientes) throws Exception {
        clientes.removeAllItems();
        clientes.addItem("------");

        try {
            Connection con = new Conexao().getConnection();
            Statement stm = con.createStatement();

            String sql = "select nome from cliente";

            ResultSet rs = (ResultSet) stm.executeQuery(sql);

            while (rs.next()) {
                clientes.addItem(rs.getString("nome"));
            }

        } catch (SQLException ex) {
            System.err.println("Ocorreu um erro ao carregar o ComboBox");
        }

    }

    /**
     * Método para listar todos os nomes de cliente que possuem a String passada
     *
     * @param pesquisa
     * @param clientes
     * @throws Exception
     */
    public void pesquisarCliente(String pesquisa, javax.swing.JComboBox clientes) throws Exception {
        clientes.removeAllItems();
        clientes.addItem("------");

        try {
            Connection con = new Conexao().getConnection();
            Statement stm = con.createStatement();

            String sql = "select nome from cliente where nome like '%" + pesquisa + "%'";

            ResultSet rs = (ResultSet) stm.executeQuery(sql);

            while (rs.next()) {
                clientes.addItem(rs.getString("nome"));
            }

        } catch (SQLException ex) {
            System.err.println("Ocorreu um erro ao carregar o ComboBox");
        }

    }

    /**
     * Método para buscar as informações de um cliente e setar as informações na
     * view
     *
     * @param id
     * @param nome
     * @param idade
     * @param fis
     * @param jur
     * @param codigoCliente
     * @param contato
     * @throws Exception
     */
    public void getCliente(int id, javax.swing.JTextField nome,
            javax.swing.JTextField idade, javax.swing.JRadioButton fis, javax.swing.JRadioButton jur,
            javax.swing.JTextField codigoCliente, javax.swing.JTextField contato) throws Exception {

        String name = "", typeCli = "", codCli = "", phone = "";
        int age = 0;

        try {
            Connection con = new Conexao().getConnection();
            Statement stm = con.createStatement();

            String sql = "select nome, idade, tipo_cliente, codigo_cliente, contato from cliente where id = '" + id + "'";

            ResultSet rs = (ResultSet) stm.executeQuery(sql);

            while (rs.next()) {
                name = rs.getString("nome");
                age = rs.getInt("idade");
                typeCli = rs.getString("tipo_cliente");
                codCli = rs.getString("codigo_cliente");
                phone = rs.getString("contato");
            }

            nome.setText(name);
            idade.setText(String.valueOf(age));
            codigoCliente.setText(codCli);
            contato.setText(phone);
            if (typeCli.equals("Fisico")) {
                fis.setSelected(true);
            } else if (typeCli.equals("Juridico")) {
                jur.setSelected(true);
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    /**
     * Método para atualizar as informações de um cliente no BD pelo ID
     *
     * @param id
     * @param nome
     * @param idade
     * @param tipoCliente
     * @param codigoCliente
     * @param contato
     * @throws Exception
     */
    public void updateCliente(int id, String nome, int idade, String tipoCliente,
            String codigoCliente, String contato) throws Exception {
        try {
            //  busca e atualização de saldo na tabela ACAMPANTE
            Connection con = new Conexao().getConnection();

            String update = "update cliente set nome = '" + nome + "', idade = " + idade + ", tipo_cliente = '" + tipoCliente + "', codigo_cliente = '" + codigoCliente + "', contato = '" + contato + "' where id=" + id + "";

            Statement stmt = con.prepareStatement(update);
            stmt.executeUpdate(update);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    /**
     * Método para deletar um cliente no BD pelo ID
     *
     * @param id
     * @throws Exception
     */
    public void deleteCliente(int id) throws Exception {
        try {
            Connection con = new Conexao().getConnection();

            String delete = "delete from cliente where id=" + id + "";
            PreparedStatement stmt = con.prepareStatement(delete);
            stmt.executeUpdate(delete);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    /**
     * Método para visualizar todos os clientes em formato de tabela
     *
     * @param clientes
     * @throws Exception
     */
    public void visualizarCliente(javax.swing.JTable clientes) throws Exception {
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select id, nome, idade, tipo_cliente, codigo_cliente, contato from cliente";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            DefaultTableModel modelo = (DefaultTableModel) clientes.getModel();
            modelo.setNumRows(0);

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int age = rs.getInt("idade");
                String typeCli = rs.getString("tipo_cliente");
                String codCli = rs.getString("codigo_cliente");
                String contato = rs.getString("contato");
                modelo.addRow(new Object[]{id, nome, age, typeCli, codCli, contato});
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
}
