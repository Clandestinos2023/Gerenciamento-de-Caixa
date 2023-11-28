package DAO;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import view.telasCadastro.telaCadastroProduto;

public class VendaDAO {

    //  MÉTODO PARA CADASTRAR A VENDA NO BD
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
    
    //  MÉTODO PARA BUSCAR O ID DO CLIENTE
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

    //  MÉTODO PARA BUSCAR A DESCRIÇÃO DA VENDA
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

    //  MÉTODO PARA BUSCAR O VALOR DA VENDA
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
    
    //  MÉTODO PARA VISUALIZAR TODAS AS VENDAS EM FORMATO DE TABELA
    public void visualizarVendas(javax.swing.JTable vend) throws Exception {
        try {
            Connection con = new database.Conexao().getConnection();
            
            String sql = "select hora, id, id_cliente, valor, descricao from venda order by id";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            DefaultTableModel modelo = (DefaultTableModel) vend.getModel();
            modelo.setNumRows(0);
            
            while (rs.next()){
                String hora = (rs.getDate("hora")).toString();
                int id = rs.getInt("id");
                int idCliente = rs.getInt("id_cliente");
                double valor = rs.getDouble("valor");
                String descricao = rs.getString("descricao");
                modelo.addRow(new Object[]{hora, id,idCliente,valor,descricao});   
            }
        }catch(SQLException ex){
            System.err.println(ex);
        }
    }

}