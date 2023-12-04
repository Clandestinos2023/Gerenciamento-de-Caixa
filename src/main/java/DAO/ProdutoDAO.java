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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import view.telasCadastro.telaCadastroProduto;

/**
 *
 * @author Davidson
 * @since 11/2023
 *
 * Classe para manipulação de banco de dados - tabela: produto
 */
public class ProdutoDAO {

    /**
     * Método para cadastrar o produto no banco de dados
     *
     * @param nome
     * @param valor
     * @param quantidade
     */
    public void cadastrar(String nome, double valor, int quantidade) {

        try {
            String insert = "insert into produto(nome, valor, quantidade) values (?, ?, ?)";
            Connection con = new Conexao().getConnection();
            System.out.println("Connection established!");

            try (PreparedStatement stmt = con.prepareStatement(insert)) {
                stmt.setString(1, nome);
                stmt.setDouble(2, valor);
                stmt.setInt(3, quantidade);

                stmt.executeUpdate();
            }
            System.out.println("Connection closed!");

        } catch (SQLException ex) {
            System.err.println(ex);
        } catch (Exception ex) {
            Logger.getLogger(telaCadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método para buscar o ID do produto
     *
     * @param nome
     * @return id
     * @throws Exception
     */
    public int getID(String nome) throws Exception {
        int id = 0;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select id from produto where nome like '" + nome + "';";

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
     * Método para buscar a quantidade do produto
     *
     * @param id
     * @return quantidade
     * @throws Exception
     */
    public int getQuantidade(int id) throws Exception {
        int quantidade = 0;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select quantidade from produto where id='" + id + "';";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                quantidade = rs.getInt("quantidade");
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return quantidade;
    }

    /**
     * Método para buscar o nome do produto
     *
     * @param id
     * @return nome
     * @throws Exception
     */
    public String getNome(int id) throws Exception {
        String nome = null;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select nome from produto where id='" + id + "';";

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
     * Método para buscar o valor do produto
     *
     * @param id
     * @return valor
     * @throws Exception
     */
    public double getValor(int id) throws Exception {
        double valor = 0;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select valor from produto where id='" + id + "';";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                valor = rs.getDouble("valor");
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return valor;
    }

    /**
     * Método para listar todos os nomes dos produtos
     *
     * @param prod
     * @throws Exception
     */
    public void listarProduto(javax.swing.JComboBox prod) throws Exception {
        prod.removeAllItems();
        prod.addItem("------");

        try {
            Connection con = new Conexao().getConnection();
            Statement stm = con.createStatement();

            String sql = "select nome from produto";

            ResultSet rs = (ResultSet) stm.executeQuery(sql);

            while (rs.next()) {
                prod.addItem(rs.getString("nome"));
            }

        } catch (SQLException ex) {
            System.err.println("Ocorreu um erro ao carregar o ComboBox");
        }

    }

    /**
     * Método para listar todos os nomes de produtos que possuem a String
     * passada
     *
     * @param pesquisa
     * @param produtos
     * @throws Exception
     */
    public void pesquisarProduto(String pesquisa, javax.swing.JComboBox produtos) throws Exception {
        produtos.removeAllItems();
        produtos.addItem("------");

        try {
            Connection con = new Conexao().getConnection();
            Statement stm = con.createStatement();

            String sql = "select nome from produto where nome like '%" + pesquisa + "%'";

            ResultSet rs = (ResultSet) stm.executeQuery(sql);

            while (rs.next()) {
                produtos.addItem(rs.getString("nome"));
            }

        } catch (SQLException ex) {
            System.err.println("Ocorreu um erro ao carregar o ComboBox");
        }

    }

    /**
     * Método para buscar as informações de um produto e setar as informações na
     * view
     *
     * @param id
     * @param valor
     * @param nome
     * @param ID
     * @throws Exception
     */
    public void getProduto(int id, javax.swing.JTextField valor, javax.swing.JTextField nome, javax.swing.JTextField ID) throws Exception {
        String name = "";
        double value = 0.0;

        try {
            Connection con = new Conexao().getConnection();
            Statement stm = con.createStatement();

            String sql = "select nome, valor from produto where id = '" + id + "'";

            ResultSet rs = (ResultSet) stm.executeQuery(sql);

            while (rs.next()) {
                name = rs.getString("nome");
                value = rs.getDouble("valor");
            }

            nome.setText(name);
            valor.setText(String.valueOf(value));
            ID.setText(String.valueOf(id));

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    /**
     * Método para buscar as informações de um produto e setar as informações na
     * view + contar quantidade
     *
     * @param id
     * @param qnt
     * @param valor
     * @param nome
     * @param ID
     * @throws Exception
     */
    public void getProdutoQuant(int id, javax.swing.JComboBox qnt, javax.swing.JTextField valor, javax.swing.JTextField nome, javax.swing.JTextField ID) throws Exception {
        String name = "";
        double value = 0.0;
        int quant = 0;

        try {
            Connection con = new Conexao().getConnection();
            Statement stm = con.createStatement();

            String sql = "select nome, valor, quantidade from produto where id = '" + id + "'";

            ResultSet rs = (ResultSet) stm.executeQuery(sql);

            while (rs.next()) {
                name = rs.getString("nome");
                value = rs.getDouble("valor");
                quant = rs.getInt("quantidade");
            }

            nome.setText(name);
            valor.setText(String.valueOf(value));
            ID.setText(String.valueOf(id));
            contarQuantidade(quant, qnt);

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    /**
     * Método para atualizar as informações de um produto no BD pelo ID
     *
     * @param nome
     * @param valor
     * @param id
     * @throws Exception
     */
    public void updateProdutoInfos(String nome, double valor, int id) throws Exception {
        try {

            Connection con = new Conexao().getConnection();

            String update = "update produto set valor = " + valor + ", nome = '" + nome + "' where id='" + id + "'";
            PreparedStatement stmt = con.prepareStatement(update);
            stmt.executeUpdate(update);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    /**
     * Método para deletar um produto no BD pelo ID
     *
     * @param id
     * @throws Exception
     */
    public void deleteProduto(int id) throws Exception {
        try {
            Connection con = new Conexao().getConnection();

            String delete = "delete from produto where id='" + id + "'";
            PreparedStatement stmt = con.prepareStatement(delete);
            stmt.executeUpdate(delete);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    /**
     * Método para contar até a quantidade de produtos em estoque
     *
     * @param quantidade
     * @param quantidadeCB
     */
    public void contarQuantidade(int quantidade, javax.swing.JComboBox quantidadeCB) {
        quantidadeCB.removeAllItems();
        quantidadeCB.addItem("------");

        for (int i = 0; i <= quantidade; i++) {
            quantidadeCB.addItem(i);
        }
    }

    /**
     * Método para visualizar todos os produto em formato de tabela
     *
     * @param prod
     * @throws Exception
     */
    public void visualizarProdutos(javax.swing.JTable prod) throws Exception {
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select id, nome, valor, quantidade from produto";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            DefaultTableModel modelo = (DefaultTableModel) prod.getModel();
            modelo.setNumRows(0);

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                double valor = rs.getDouble("valor");
                int quantidade = rs.getInt("quantidade");
                modelo.addRow(new Object[]{id, nome, valor, quantidade});
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
}
