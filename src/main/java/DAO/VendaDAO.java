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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import view.telasCadastro.telaCadastroProduto;

/**
 *
 * @author Davidson
 * @since 11/2023
 *
 * Classe para manipulação de banco de dados - tabela: venda
 */
public class VendaDAO {

    /**
     * Método para cadastrar a venda no BD
     *
     * @param idCliente
     * @param valorCompra
     * @param descricao
     */
    public void cadastrar(int idCliente, double valorCompra, String descricao) {
        try {
            String insert = "insert into venda(id_cliente, valor, descricao) values (?, ?, ?)";
            Connection con = new Conexao().getConnection();
            System.out.println("Connection established!");

            try (PreparedStatement stmt = con.prepareStatement(insert)) {
                stmt.setInt(1, idCliente);
                stmt.setDouble(2, valorCompra);
                stmt.setString(3, descricao);

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
     * Método para busccar o ID do cliente
     *
     * @param id
     * @return idCliente
     * @throws Exception
     */
    public int getIDCliente(int id) throws Exception {
        int idCliente = 0;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select id_cliente from venda where id='" + id + "';";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                idCliente = rs.getInt("id_cliente");
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return idCliente;
    }

    /**
     * Método para buscar a descrição da venda
     *
     * @param id
     * @return descricao
     * @throws Exception
     */
    public String getDescricao(int id) throws Exception {
        String descricao = null;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select descricao from venda where id='" + id + "';";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                descricao = rs.getString("descricao");
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return descricao;
    }

    /**
     * Método para buscar o valor total da venda
     *
     * @param id
     * @return valorCompra
     * @throws Exception
     */
    public double getValor(int id) throws Exception {
        double valor = 0;
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select valor from venda where id='" + id + "';";

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
     * Método para visualizar todas as vendas em formato de tabela
     *
     * @param vendas
     * @throws Exception
     */
    public void visualizarVendas(javax.swing.JTable vendas) throws Exception {
        try {
            Connection con = new database.Conexao().getConnection();

            String sql = "select hora, id, id_cliente, valor, descricao from venda order by id";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            DefaultTableModel modelo = (DefaultTableModel) vendas.getModel();
            modelo.setNumRows(0);

            while (rs.next()) {
                String hora = (rs.getDate("hora")).toString();
                int id = rs.getInt("id");
                int idCliente = rs.getInt("id_cliente");
                double valor = rs.getDouble("valor");
                String descricao = rs.getString("descricao");
                modelo.addRow(new Object[]{hora, id, idCliente, valor, descricao});
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

}
