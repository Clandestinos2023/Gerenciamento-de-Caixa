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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import view.telasCadastro.telaCadastroProduto;

public class ProdutoDAO {

    //  MÉTODO PARA CADASTRAR O PRODUTO NO BD
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

    //  MÉTODO PARA BUSCAR O ID DO PRODUTO
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

    //  MÉTODO PARA BUSCAR A QUANTIDADE DO PRODUTO
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

    //  MÉTODO PARA BUSCAR O NOME DO PRODUTO
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

    //  MÉTODO PARA BUSCAR O VALOR DO PRODUTO
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

    //  MÉTODO PARA LISTAR TODOS OS NOMES DOS PRODUTOS
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

    //  MÉTODO PARA LISTAR TODOS OS NOMES DE PRODUTO QUE SÃO PARECIDOS COM O PASSADO
    public void pesquisarProduto(String pesquisa, javax.swing.JComboBox prod) throws Exception {
        prod.removeAllItems();
        prod.addItem("------");

        try {
            Connection con = new Conexao().getConnection();
            Statement stm = con.createStatement();

            String sql = "select nome from produto where nome like '%" + pesquisa + "%'";

            ResultSet rs = (ResultSet) stm.executeQuery(sql);

            while (rs.next()) {
                prod.addItem(rs.getString("nome"));
            }

        } catch (SQLException ex) {
            System.err.println("Ocorreu um erro ao carregar o ComboBox");
        }

    }

    //  MÉTODO PARA BUSCAR AS INFORMAÇÕES DE UM PRODUTO E SETAR AS INFORMAÇÕES NA VIEW
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
    
    //  MÉTODO PARA BUSCAR AS INFORMAÇÕES DE UM PRODUTO E SETAR AS INFORMAÇÕES NA VIEW + CONTAR QUANTIDADE EM ESTOQUE
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

    //  MÉTODO PARA ATUALIZAR AS INFORMAÇÕES DE UM PRODUTO NO BD PELO ID
    public void updateProdutoInfos(String nome, double valor, int id) throws Exception {
        try {
            //  busca e atualização de saldo na tabela ACAMPANTE
            Connection con = new Conexao().getConnection();

            String update = "update produto set valor = " + valor + ", nome = '" + nome + "' where id='" + id + "'";
            PreparedStatement stmt = con.prepareStatement(update);
            int res = stmt.executeUpdate(update);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    //  MÉTODO PARA DELETAR UM PRODUTO DO BD PELO ID
    public void deleteProduto(int id) throws Exception {
        try {
            Connection con = new Conexao().getConnection();

            String delete = "delete from produto where id='" + id + "'";
            PreparedStatement stmt = con.prepareStatement(delete);
            int res = stmt.executeUpdate(delete);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    //  MÉTODO PARA CONTAR ATÉ A QUANTIDADE DE PRODUTOS EM ESTOQUE
    public void contarQuantidade(int qnt, javax.swing.JComboBox quant) {
        quant.removeAllItems();
        quant.addItem("------");

        for (int i = 0; i <= qnt; i++) {
            quant.addItem(i);
        }
    }
    
    //  MÉTODO PARA VISUALIZAR TODOS OS PRODUTOS EM FORMATO DE TABELA
    public void visualizarProdutos(javax.swing.JTable prod) throws Exception {
        try {
            Connection con = new database.Conexao().getConnection();
            
            String sql = "select id, nome, valor, quantidade from produto";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            DefaultTableModel modelo = (DefaultTableModel) prod.getModel();
            modelo.setNumRows(0);
            
            while (rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                double valor = rs.getDouble("valor");
                int quantidade = rs.getInt("quantidade");
                modelo.addRow(new Object[]{id,nome,valor, quantidade});   
            }
        }catch(SQLException ex){
            System.err.println(ex);
        }
    }
}
