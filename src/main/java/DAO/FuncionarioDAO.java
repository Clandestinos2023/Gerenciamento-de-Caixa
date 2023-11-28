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

public class FuncionarioDAO {

    //  MÉTODO PARA CADASTRAR O FUNCIONÁRIO NO BD
    public void cadastrar(String nome, String usuario, String senha, String confirmacaoSenha,
            String telefone, String email, String sexo, String cpf) throws Exception {

        try {
            String insert = "insert into funcionario(nome, usuario, senha, telefone, "
                    + "email, sexo, cpf) values (?,?,?,?,?,?,?)";
            Connection con = new Conexao().getConnection();
            System.out.println("Connection established!");

            PreparedStatement stmt = con.prepareStatement(insert);

            stmt.setString(1, nome);
            stmt.setString(2, usuario);
            stmt.setString(3, senha);
            stmt.setString(4, telefone);
            stmt.setString(5, email);
            stmt.setString(6, sexo);
            stmt.setString(7, cpf);

            stmt.executeUpdate();

            stmt.close();
            System.out.println("Connection closed!");

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    //  MÉTODO PARA BUSCAR O ID DO FUNCIONÁRIO
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
    
    //  MÉTODO PARA BUSCAR O NOME DO FUNCIONÁRIO
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
    
    //  MÉTODO PARA BUSCAR O USUÁRIO DO FUNCIONÁRIO
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
    
    //  MÉTODO PARA BUSCAR A SENHA DO FUNCIONÁRIO
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

    //  MÉTODO PARA BUSCAR O TELEFONE DO FUNCIONÁRIO
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
    
    //  MÉTODO PARA BUSCAR O EMAIL DO FUNCIONÁRIO
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
    
    //  MÉTODO PARA BUSCAR O SEXO DO FUNCIONÁRIO
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
    
    //  MÉTODO PARA BUSCAR O CPF DO FUNCIONÁRIO
    public String getCPF (int id) throws Exception {
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
    
    //  MÉTODO PARA LISTAR TODOS OS NOMES DOS FUNCIONÁRIOS
    public void listarFuncionario(javax.swing.JComboBox func) throws Exception {
        func.removeAllItems();
        func.addItem("------");

        try {
            Connection con = new Conexao().getConnection();
            Statement stm = con.createStatement();

            String sql = "select nome from funcionario";

            ResultSet rs = (ResultSet) stm.executeQuery(sql);

            while (rs.next()) {
                func.addItem(rs.getString("nome"));
            }

        } catch (SQLException ex) {
            System.err.println("Ocorreu um erro ao carregar o ComboBox");
        }

    }

    //  MÉTODO PARA LISTAR TODOS OS NOMES DE FUNCIONÁRIOS QUE SÃO PARECIDOS COM O PASSADO
    public void pesquisarFuncionario(String pesquisa, javax.swing.JComboBox func) throws Exception {
        func.removeAllItems();
        func.addItem("------");

        try {
            Connection con = new Conexao().getConnection();
            Statement stm = con.createStatement();

            String sql = "select nome from funcionario where nome like '%" + pesquisa + "%'";

            ResultSet rs = (ResultSet) stm.executeQuery(sql);

            while (rs.next()) {
                func.addItem(rs.getString("nome"));
            }

        } catch (SQLException ex) {
            System.err.println("Ocorreu um erro ao carregar o ComboBox");
        }

    }

    //  MÉTODO PARA BUSCAR AS INFORMAÇÕES DE UM FUNCIONÁRIO E SETAR AS INFORMAÇÕES NA VIEW
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
            } else if (sex.equals("Feminino")) {
                fem.setSelected(true);
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    //  MÉTODO PARA ATUALIZAR AS INFORMAÇÕES DE UM FUNCIONÁRIO NO BD PELO ID
    public void updateFuncionario(int idFunc, String nome, String usuario, String senha,
            String confirmacaoSenha, String telefone, String email, String sexo, String cpf) throws Exception {
        
        String name;
        try {
            //  busca e atualização de saldo na tabela ACAMPANTE
            Connection con = new Conexao().getConnection();

            String update = "update funcionario set nome = '"+ nome +"', usuario = '"+ usuario +"', senha = '"+ senha +"', telefone = '"+ telefone +"', email = '"+ email +"', sexo = '"+ sexo +"', cpf = '"+ cpf +"' where id="+ idFunc +"";
                    
                    Statement stmt = con.prepareStatement(update);
            int res = stmt.executeUpdate(update);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
    
    //  MÉTODO PARA DELETAR UM FUNCIONÁRIO DO BD PELO ID
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
    
    //  MÉTODO PARA VISUALIZAR TODOS OS FUNCIONÁRIOS EM FORMATO DE TABELA
    public void visualizarFuncionarios(javax.swing.JTable func) throws Exception {
        try {
            Connection con = new database.Conexao().getConnection();
            
            String sql = "select id, nome, usuario, telefone, email, sexo, cpf from funcionario";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            DefaultTableModel modelo = (DefaultTableModel) func.getModel();
            modelo.setNumRows(0);
            
            while (rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String usuario = rs.getString("usuario");
                String phone = rs.getString("telefone");
                String mail = rs.getString("email");
                String sex = rs.getString("sexo");
                String CPF = rs.getString("cpf");
                modelo.addRow(new Object[]{id,nome,usuario,phone,mail,sex, CPF});   
            }
        }catch(SQLException ex){
            System.err.println(ex);
        }
    }
}
