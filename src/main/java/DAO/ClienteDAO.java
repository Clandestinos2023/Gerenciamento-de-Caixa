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
import javax.swing.table.DefaultTableModel;

public class ClienteDAO {

    //  MÉTODO PARA CADASTRAR O CLIENTE NO BD
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
            }
            System.out.println("Connection closed!");

        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    //  MÉTODO PARA BUSCAR O ID DO CLIENTE
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

    //  MÉTODO PARA BUSCAR A IDADE DO CLIENTE
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

    //  MÉTODO PARA BUSCAR O NOME DO CLIENTE
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

    //  MÉTODO PARA BUSCAR O TIPO DO CLIENTE (CPF/CNPJ)
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

    //  MÉTODO PARA BUSCAR O CÓDIGO DO CLIENTE
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

    //  MÉTODO PARA BUSCAR O CONTATO DO CLIENTE
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

    //  MÉTODO PARA LISTAR TODOS OS NOMES DOS CLIENTES
    public void listarCliente(javax.swing.JComboBox cli) throws Exception {
        cli.removeAllItems();
        cli.addItem("------");

        try {
            Connection con = new Conexao().getConnection();
            Statement stm = con.createStatement();

            String sql = "select nome from cliente";

            ResultSet rs = (ResultSet) stm.executeQuery(sql);

            while (rs.next()) {
                cli.addItem(rs.getString("nome"));
            }

        } catch (SQLException ex) {
            System.err.println("Ocorreu um erro ao carregar o ComboBox");
        }

    }

    //  MÉTODO PARA LISTAR TODOS OS NOMES DE PRODUTO QUE SÃO PARECIDOS COM O PASSADO
    public void pesquisarCliente(String pesquisa, javax.swing.JComboBox cli) throws Exception {
        cli.removeAllItems();
        cli.addItem("------");

        try {
            Connection con = new Conexao().getConnection();
            Statement stm = con.createStatement();

            String sql = "select nome from cliente where nome like '%" + pesquisa + "%'";

            ResultSet rs = (ResultSet) stm.executeQuery(sql);

            while (rs.next()) {
                cli.addItem(rs.getString("nome"));
            }

        } catch (SQLException ex) {
            System.err.println("Ocorreu um erro ao carregar o ComboBox");
        }

    }

    //  MÉTODO PARA BUSCAR AS INFORMAÇÕES DE UM CLIENTE E SETAR AS INFORMAÇÕES NA VIEW
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
            if (typeCli.equals("Fisico")){
                fis.setSelected(true);
            } else if (typeCli.equals("Juridico")) {
                jur.setSelected(true);
            }
            
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    //  MÉTODO PARA ATUALIZAR AS INFORMAÇÕES DE UM CLIENTE NO BD PELO ID
    public void updateCliente(int id, String nome, int idade, String tipoCliente,
            String codigoCliente, String contato) throws Exception {
        try {
            //  busca e atualização de saldo na tabela ACAMPANTE
            Connection con = new Conexao().getConnection();

            String update = "update cliente set nome = '"+ nome +"', idade = "+ idade +", tipo_cliente = '"+ tipoCliente +"', codigo_cliente = '"+ codigoCliente +"', contato = '"+ contato +"' where id="+ id +"";
                    
                    Statement stmt = con.prepareStatement(update);
            int res = stmt.executeUpdate(update);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
   
    //  MÉTODO PARA DELETAR UM CLIENTE DO BD PELO ID
    public void deleteCliente(int id) throws Exception {
        try {
            Connection con = new Conexao().getConnection();

            String delete = "delete from cliente where id=" + id + "";
            PreparedStatement stmt = con.prepareStatement(delete);
            int res = stmt.executeUpdate(delete);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
    
    //  MÉTODO PARA VISUALIZAR TODOS OS CLIENTES EM FORMATO DE TABELA
    public void visualizarCliente(javax.swing.JTable cli) throws Exception {
        try {
            Connection con = new database.Conexao().getConnection();
            
            String sql = "select id, nome, idade, tipo_cliente, codigo_cliente, contato from cliente";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            DefaultTableModel modelo = (DefaultTableModel) cli.getModel();
            modelo.setNumRows(0);
            
            while (rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int age = rs.getInt("idade");
                String typeCli = rs.getString("tipo_cliente");
                String codCli = rs.getString("codigo_cliente");
                String contato = rs.getString("contato");
                modelo.addRow(new Object[]{id,nome,age, typeCli, codCli, contato});   
            }
        }catch(SQLException ex){
            System.err.println(ex);
        }
    }
}
