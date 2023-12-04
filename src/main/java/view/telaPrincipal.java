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
package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import view.telasAlteracao.telaAlterarCliente;
import view.telasAlteracao.telaAlterarFuncionario;
import view.telasAlteracao.telaAlterarProduto;
import view.telasCadastro.telaCadastroCliente;
import view.telasCadastro.telaCadastroFuncionario;
import view.telasCadastro.telaCadastroProduto;
import view.telasDelete.telaDeletarCliente;
import view.telasDelete.telaDeletarFuncionario;
import view.telasDelete.telaDeletarProduto;
import view.telasExibicao.telaVisualizarClientes;
import view.telasExibicao.telaVisualizarFuncionarios;
import view.telasExibicao.telaVisualizarProdutos;
import view.telasExibicao.telaVisualizarVendas;

/**
 *
 * @author Davidson
 * @since 11/2023
 *
 * View - tela principal
 */
public class telaPrincipal extends javax.swing.JFrame {

    public telaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar = new javax.swing.JMenuBar();
        jMCads = new javax.swing.JMenu();
        jMICadastrarFuncionario = new javax.swing.JMenuItem();
        jMICadastrarCliente = new javax.swing.JMenuItem();
        jMICadastrarProduto = new javax.swing.JMenuItem();
        jMILogout = new javax.swing.JMenuItem();
        jMEfetuar = new javax.swing.JMenu();
        jMIEfetuarVenda = new javax.swing.JMenuItem();
        jMAlteracoes = new javax.swing.JMenu();
        jMIAlterarCliente = new javax.swing.JMenuItem();
        jMIAlterarFuncionario = new javax.swing.JMenuItem();
        jMIAlterarProduto = new javax.swing.JMenuItem();
        jMDeletes = new javax.swing.JMenu();
        jMIDeleteCliente = new javax.swing.JMenuItem();
        jMIDeleteFuncionario = new javax.swing.JMenuItem();
        jMIDeleteProduto = new javax.swing.JMenuItem();
        Vizualizar = new javax.swing.JMenu();
        jMIVisualizarClientes = new javax.swing.JMenuItem();
        jMIVisualizarFuncionarios = new javax.swing.JMenuItem();
        jMIVisualizarProdutos = new javax.swing.JMenuItem();
        jMIVisualizarVendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMCads.setText("Cadastros");

        jMICadastrarFuncionario.setText("Funcionário");
        jMICadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarFuncionarioActionPerformed(evt);
            }
        });
        jMCads.add(jMICadastrarFuncionario);

        jMICadastrarCliente.setText("Cliente");
        jMICadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarClienteActionPerformed(evt);
            }
        });
        jMCads.add(jMICadastrarCliente);

        jMICadastrarProduto.setText("Produto");
        jMICadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarProdutoActionPerformed(evt);
            }
        });
        jMCads.add(jMICadastrarProduto);

        jMILogout.setText("Log out");
        jMILogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMILogoutActionPerformed(evt);
            }
        });
        jMCads.add(jMILogout);

        jMenuBar.add(jMCads);

        jMEfetuar.setText("Efetuar");

        jMIEfetuarVenda.setText("Venda");
        jMIEfetuarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEfetuarVendaActionPerformed(evt);
            }
        });
        jMEfetuar.add(jMIEfetuarVenda);

        jMenuBar.add(jMEfetuar);

        jMAlteracoes.setText("Alterações");

        jMIAlterarCliente.setText("Cliente");
        jMIAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAlterarClienteActionPerformed(evt);
            }
        });
        jMAlteracoes.add(jMIAlterarCliente);

        jMIAlterarFuncionario.setText("Funcionário");
        jMIAlterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAlterarFuncionarioActionPerformed(evt);
            }
        });
        jMAlteracoes.add(jMIAlterarFuncionario);

        jMIAlterarProduto.setText("Produto");
        jMIAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAlterarProdutoActionPerformed(evt);
            }
        });
        jMAlteracoes.add(jMIAlterarProduto);

        jMenuBar.add(jMAlteracoes);

        jMDeletes.setText("Deletar");

        jMIDeleteCliente.setText("Cliente");
        jMIDeleteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIDeleteClienteActionPerformed(evt);
            }
        });
        jMDeletes.add(jMIDeleteCliente);

        jMIDeleteFuncionario.setText("Funcionário");
        jMIDeleteFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIDeleteFuncionarioActionPerformed(evt);
            }
        });
        jMDeletes.add(jMIDeleteFuncionario);

        jMIDeleteProduto.setText("Produto");
        jMIDeleteProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIDeleteProdutoActionPerformed(evt);
            }
        });
        jMDeletes.add(jMIDeleteProduto);

        jMenuBar.add(jMDeletes);

        Vizualizar.setText("Visualizar");

        jMIVisualizarClientes.setText("Clientes");
        jMIVisualizarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVisualizarClientesActionPerformed(evt);
            }
        });
        Vizualizar.add(jMIVisualizarClientes);

        jMIVisualizarFuncionarios.setText("Funcionários");
        jMIVisualizarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVisualizarFuncionariosActionPerformed(evt);
            }
        });
        Vizualizar.add(jMIVisualizarFuncionarios);

        jMIVisualizarProdutos.setText("Produtos");
        jMIVisualizarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVisualizarProdutosActionPerformed(evt);
            }
        });
        Vizualizar.add(jMIVisualizarProdutos);

        jMIVisualizarVendas.setText("Vendas");
        jMIVisualizarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVisualizarVendasActionPerformed(evt);
            }
        });
        Vizualizar.add(jMIVisualizarVendas);

        jMenuBar.add(Vizualizar);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Item de menu que redireciona para a tela de cadastro do funcionário
     *
     * @param evt
     */
    private void jMICadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarFuncionarioActionPerformed
        telaCadastroFuncionario screen = new telaCadastroFuncionario();
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMICadastrarFuncionarioActionPerformed

    /**
     * Item de menu que redireciona para a tela de cadastro do produto
     *
     * @param evt
     */
    private void jMICadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarProdutoActionPerformed
        telaCadastroProduto screen = new telaCadastroProduto();
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMICadastrarProdutoActionPerformed

    /**
     * Item de menu que redireciona para a tela de cadastro do cliente
     *
     * @param evt
     */
    private void jMICadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarClienteActionPerformed
        telaCadastroCliente screen = new telaCadastroCliente();
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMICadastrarClienteActionPerformed

    /**
     * Item de menu que redireciona para a tela de login, efetuando o logout
     *
     * @param evt
     */
    private void jMILogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMILogoutActionPerformed
        telaLogin screen = new telaLogin();
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMILogoutActionPerformed

    /**
     * Item de menu que redireciona para a tela de venda
     *
     * @param evt
     */
    private void jMIEfetuarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEfetuarVendaActionPerformed
        telaVenda screen;
        try {
            screen = new telaVenda();
            screen.setVisible(true);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMIEfetuarVendaActionPerformed

    /**
     * Item de menu que redireciona para a tela de alteração do cliente
     *
     * @param evt
     */
    private void jMIAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAlterarClienteActionPerformed
        telaAlterarCliente screen;
        try {
            screen = new telaAlterarCliente();
            screen.setVisible(true);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMIAlterarClienteActionPerformed

    /**
     * Item de menu que redireciona para a tela de alteração do produto
     *
     * @param evt
     */
    private void jMIAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAlterarProdutoActionPerformed
        telaAlterarProduto screen;
        try {
            screen = new telaAlterarProduto();
            screen.setVisible(true);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMIAlterarProdutoActionPerformed

    /**
     * Item de menu que redireciona para a tela de deletar cliente
     *
     * @param evt
     */
    private void jMIDeleteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDeleteClienteActionPerformed
        telaDeletarCliente screen;
        try {
            screen = new telaDeletarCliente();
            screen.setVisible(true);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMIDeleteClienteActionPerformed

    /**
     * Item de menu que redireciona para a tela de deletar funcionário
     *
     * @param evt
     */
    private void jMIDeleteFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDeleteFuncionarioActionPerformed
        telaDeletarFuncionario screen;
        try {
            screen = new telaDeletarFuncionario();
            screen.setVisible(true);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMIDeleteFuncionarioActionPerformed

    /**
     * Item de menu que redireciona para a tela de deletar produto
     *
     * @param evt
     */
    private void jMIDeleteProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDeleteProdutoActionPerformed
        telaDeletarProduto screen;
        try {
            screen = new telaDeletarProduto();
            screen.setVisible(true);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMIDeleteProdutoActionPerformed

    /**
     * Item de menu que redireciona para a tela de alteração do funcionário
     *
     * @param evt
     */
    private void jMIAlterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAlterarFuncionarioActionPerformed
        telaAlterarFuncionario screen;
        try {
            screen = new telaAlterarFuncionario();
            screen.setVisible(true);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMIAlterarFuncionarioActionPerformed

    /**
     * Item de menu que redireciona para a tela de visualizar clientes
     *
     * @param evt
     */
    private void jMIVisualizarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVisualizarClientesActionPerformed
        telaVisualizarClientes screen;
        try {
            screen = new telaVisualizarClientes();
            screen.setVisible(true);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMIVisualizarClientesActionPerformed

    /**
     * Item de menu que redireciona para a tela de visualizar funcionários
     *
     * @param evt
     */
    private void jMIVisualizarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVisualizarFuncionariosActionPerformed
        telaVisualizarFuncionarios screen;
        try {
            screen = new telaVisualizarFuncionarios();
            screen.setVisible(true);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMIVisualizarFuncionariosActionPerformed

    /**
     * Item de menu que redireciona para a tela de visualizar produtos
     *
     * @param evt
     */
    private void jMIVisualizarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVisualizarProdutosActionPerformed
        telaVisualizarProdutos screen;
        try {
            screen = new telaVisualizarProdutos();
            screen.setVisible(true);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMIVisualizarProdutosActionPerformed

    /**
     * Item de menu que redireciona para a tela de visualizar vendas
     *
     * @param evt
     */
    private void jMIVisualizarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVisualizarVendasActionPerformed
        telaVisualizarVendas screen;
        try {
            screen = new telaVisualizarVendas();
            screen.setVisible(true);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMIVisualizarVendasActionPerformed

    /**
     * Método que inicializa a tela principal
     *
     * @param args
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new telaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Vizualizar;
    private javax.swing.JMenu jMAlteracoes;
    private javax.swing.JMenu jMCads;
    private javax.swing.JMenu jMDeletes;
    private javax.swing.JMenu jMEfetuar;
    private javax.swing.JMenuItem jMIAlterarCliente;
    private javax.swing.JMenuItem jMIAlterarFuncionario;
    private javax.swing.JMenuItem jMIAlterarProduto;
    private javax.swing.JMenuItem jMICadastrarCliente;
    private javax.swing.JMenuItem jMICadastrarFuncionario;
    private javax.swing.JMenuItem jMICadastrarProduto;
    private javax.swing.JMenuItem jMIDeleteCliente;
    private javax.swing.JMenuItem jMIDeleteFuncionario;
    private javax.swing.JMenuItem jMIDeleteProduto;
    private javax.swing.JMenuItem jMIEfetuarVenda;
    private javax.swing.JMenuItem jMILogout;
    private javax.swing.JMenuItem jMIVisualizarClientes;
    private javax.swing.JMenuItem jMIVisualizarFuncionarios;
    private javax.swing.JMenuItem jMIVisualizarProdutos;
    private javax.swing.JMenuItem jMIVisualizarVendas;
    private javax.swing.JMenuBar jMenuBar;
    // End of variables declaration//GEN-END:variables
}
