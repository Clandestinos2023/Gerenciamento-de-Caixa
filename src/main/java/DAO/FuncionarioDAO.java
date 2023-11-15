/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Funcionario;

/**
 *
 * @author Davidson
 */
public class FuncionarioDAO {

    public void cadastrar(String nome, String usuario, String senha, String confirmacaoSenha,
            String telefone, String email, String sexo, String cpf) throws Exception {

        // CADASTRAR - MODELO
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

//            dispose();
//            CadastroAcampante set = new CadastroAcampante();
//            set.setVisible(true);
//
//            JOptionPane.showMessageDialog(jLExib, "Acampante cadastrado com sucesso!");
        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

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
    
    /*

    public void editar(String nome) {
        System.out.println(nome);

        // TABELA SECUNDARIA - MODELO
        /*
         try {

         //  busca e atualização de valor na tabela Produto
         Connection con = new Conexao().getConnection();

         //  registro de depósito na tabela COMPRA
         Statement state = con.createStatement();

         String sel = "select id from produto where nome='" + pesquisa + "'";

         ResultSet r = state.executeQuery(sel);
         r.next();
         int id = r.getInt("id");
         System.out.println(id);

         String insert = "insert into alteracoesValor(valor_inicial, valor_final, id_acamp, lider_caixa) values (?,?,?,?)";
         System.out.println("Connection established!");

         PreparedStatement input = con.prepareStatement(insert);

         input.setDouble(1, atualizar.valor);
         input.setDouble(2, atualizar.novoValor);
         input.setInt(3, id);
         input.setString(4, lider);

         input.executeUpdate();

         input.close();
         System.out.println("Connection closed!");
            
         dispose();
         telaAlterarProduto obj = new telaAlterarProduto();
         obj.setVisible(true);
            
         JOptionPane.showMessageDialog(jLExib, "Produto alterado com sucesso!");

         } catch (SQLException ex) {
         System.err.println(ex);
         } catch (Exception ex) {
         System.out.println(ex);;
         }
         
    }

    public void excluir(String nome) {
        System.out.println(nome);
    }

    public void vizualizar(String nome) {
        System.out.println(nome);

        // VIZUALIZAR - MODELO
        /*
         try {
         Connection con = new database.Conexao().getConnection();
            
         String sql = "select id, nome, idade, contato, rg, alergia from acampante";
            
         PreparedStatement stmt = con.prepareStatement(sql);
            
         ResultSet rs = stmt.executeQuery();
            
         DefaultTableModel modelo = (DefaultTableModel) jTbAcampantes.getModel();
         modelo.setNumRows(0);
            
         while (rs.next()){
         int id = rs.getInt("id");
         String nome = rs.getString("nome");
         int idade = rs.getInt("idade");
         String contato = rs.getString("contato");
         String rg = rs.getString("rg");
         String alergia = rs.getString("alergia");
         modelo.addRow(new Object[]{id,nome,idade, contato, rg, alergia});   
         }
         }catch(SQLException ex){
         System.err.println(ex);
         }
         
    }

    public void atualizar(String nome) {
        System.out.println(nome);

        // ATUALIZAR - MODELO
        /*
         try {
         Connection con = new Conexao().getConnection();
         Statement stm = con.createStatement();

         String sql = "select valor from produto where nome='" + produto + "'";
         //System.out.println(sql);
         ResultSet rs = stm.executeQuery(sql);
         while (rs.next()) {
         double value = rs.getDouble("valor");

         String inter = String.valueOf(value);
         jTFValAtual.setText(inter);
         }
         } catch (SQLException ex) {
         System.err.println(ex);

         } catch (Exception ex) {
         Logger.getLogger(telaAlterarProduto.class
         .getName()).log(Level.SEVERE, null, ex);
         }
         
    }

    public void listar(javax.swing.JComboBox lid) {
        lid.removeAllItems();
        lid.addItem("------");

        //  LISTAR _ MODELO
        /*
         try {
         Connection con = new Conexao().getConnection();
         Statement stm = con.createStatement();

         String sql = "select nome from lideranca";

         ResultSet rs = (ResultSet) stm.executeQuery(sql);

         while (rs.next()) {
         lid.addItem(rs.getString("nome"));
         }

         } catch (SQLException ex) {
         System.err.println("Ocorreu um erro ao carregar o ComboBox");
         } catch (Exception ex) {
         Logger.getLogger(DepositoAcampante.class.getName()).log(Level.SEVERE, null, ex);
         }
         
    }

    public void pesquisar(javax.swing.JTextField pesq, javax.swing.JComboBox prod) {
        prod.removeAllItems();
        prod.addItem("------");

        /*
         String pesquisa;

         pesquisa = (pesq.getText());

         try {
         Connection con = new Conexao().getConnection();
         Statement stm = con.createStatement();

         String sql = "select nome, quantidade, valor from produto where nome like '%" + pesquisa + "%'";

         ResultSet rs = (ResultSet) stm.executeQuery(sql);

         while (rs.next()) {
         prod.addItem(rs.getString("nome"));
         this.nome= rs.getString("nome");
         this.valor= rs.getDouble("valor");
         }

         } catch (SQLException ex) {
         System.err.println("Ocorreu um erro ao carregar o ComboBox");
         } catch (Exception ex) {
         Logger.getLogger(TelaCompra.class.getName()).log(Level.SEVERE, null, ex);
         }
         
    }
    */

    /**
     * Funções necessárias: -cadastrar -alterar -excluir -vizualizar
     */
}
