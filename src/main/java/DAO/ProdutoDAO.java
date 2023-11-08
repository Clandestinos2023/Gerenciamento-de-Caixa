/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.telasCadastro.telaCadastroProduto;

/**
 *
 * @author Davidson
 */
public class ProdutoDAO {

    public void cadastrar(String nome, double valor, int quantidade) {
        //  CADASTRAR - MODELO
        try {
            String insert = "insert into produto(nome, valor, quantidade) values (?, ?, ?)";
            Connection con = new Conexao().getConnection();
            System.out.println("Connection established!");

            PreparedStatement stmt = con.prepareStatement(insert);

            stmt.setString(1, nome);
            stmt.setDouble(2, valor);
            stmt.setInt(3, quantidade);

            stmt.executeUpdate();

            stmt.close();
            System.out.println("Connection closed!");

//            dispose();
//            telaCadastroProduto obj = new telaCadastroProduto();
//            obj.setVisible(true);
//
//            JOptionPane.showMessageDialog(jLExib, "Produto cadastrado com sucesso!");

        } catch (SQLException ex) {
            System.err.println(ex);
        } catch (Exception ex) {
            Logger.getLogger(telaCadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editar(String nome) {
        System.out.println(nome);

        // INSERIR NA TABELA SECUNDÁRIA - MODELO
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
         */
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
         */
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
         */
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
         */
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
         */
    }

    /**
     * Funções necessárias: -cadastrar -alterar -excluir -vizualizar
     */
}
