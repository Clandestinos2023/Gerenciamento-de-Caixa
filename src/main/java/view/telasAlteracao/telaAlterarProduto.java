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
package view.telasAlteracao;

import DAO.ProdutoDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.telaPrincipal;

/**
 *
 * @author Davidson
 * @since 11/2023
 *
 * View - tela de alteração de produto
 */
public class telaAlterarProduto extends javax.swing.JFrame {

    /**
     * Objeto referente a classe ProdutoDAO a qual possui manipulação do Banco
     * de Dados
     */
    ProdutoDAO proddao = new ProdutoDAO();

    /**
     * Método que inicializa os componentes da view
     *
     * @throws Exception
     */
    public telaAlterarProduto() throws Exception {
        initComponents();
        proddao.listarProduto(jCBProdutos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLProduto = new javax.swing.JLabel();
        jCBProdutos = new javax.swing.JComboBox();
        jBPesquisar = new javax.swing.JButton();
        jTFPesquisar = new javax.swing.JTextField();
        jBAlterar = new javax.swing.JButton();
        jLValorNovo = new javax.swing.JLabel();
        jTFValorNovo = new javax.swing.JTextField();
        jLValorAtual = new javax.swing.JLabel();
        jBAtualizar = new javax.swing.JButton();
        jLExib = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jBVoltar = new javax.swing.JButton();
        jTFValorAtual = new javax.swing.JTextField();
        jTFID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLProduto.setText("Produto");

        jCBProdutos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------" }));
        jCBProdutos.setToolTipText("");

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jTFPesquisar.setToolTipText("Pesquisar em acampantes");
        jTFPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPesquisarActionPerformed(evt);
            }
        });

        jBAlterar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBAlterar.setText("Efetuar a alteração");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jLValorNovo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLValorNovo.setText("Novo valor (separe as casas decimais com '.')");

        jLValorAtual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLValorAtual.setText("Valor atual do produto");

        jBAtualizar.setText("Atualizar informações");
        jBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarActionPerformed(evt);
            }
        });

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLNome.setText("Nome");

        jBVoltar.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jBVoltar.setText("<");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        jTFValorAtual.setEditable(false);
        jTFValorAtual.setFocusable(false);

        jTFID.setEditable(false);
        jTFID.setEnabled(false);
        jTFID.setFocusable(false);
        jTFID.setOpaque(false);
        jTFID.setRequestFocusEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLValorNovo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFValorNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLProduto)
                                    .addComponent(jLNome)
                                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBProdutos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLValorAtual)
                                                .addGap(165, 165, 165))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTFValorAtual)
                                                .addGap(118, 118, 118)))
                                        .addComponent(jLExib, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jBAtualizar)))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jBAlterar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBAtualizar, jBPesquisar});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTFNome, jTFValorNovo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jLProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jBAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLValorAtual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLExib, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFValorAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLValorNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFValorNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBAtualizar, jBPesquisar, jCBProdutos, jTFPesquisar});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTFNome, jTFValorAtual, jTFValorNovo});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botão que pesquisa produtos no BD com informações do jTextField
     *
     * @param evt
     */

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        String pesquisa;

        pesquisa = (jTFPesquisar.getText());
        try {
            proddao.pesquisarProduto(pesquisa, jCBProdutos);
        } catch (Exception ex) {
            Logger.getLogger(telaAlterarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

    /**
     * Pesquisa de produtos no BD através de um jTextField
     *
     * @param evt
     */

    private void jTFPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPesquisarActionPerformed
        jBPesquisarActionPerformed(evt);
    }//GEN-LAST:event_jTFPesquisarActionPerformed

    /**
     * Botão que efetua a alteração do produto no BD e atualiza a tela
     *
     * @param evt
     */

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        String nome = null, nomeProd;
        double valor;
        int id;

        nome = jTFNome.getText();
        valor = Double.parseDouble(jTFValorNovo.getText());

        nomeProd = jCBProdutos.getSelectedItem().toString();

        try {
            id = proddao.getID(nomeProd);
            proddao.updateProdutoInfos(nome, valor, id);

            JOptionPane.showMessageDialog(jLExib, "Produto alterado com sucesso!");

            telaAlterarProduto obj;
            obj = new telaAlterarProduto();
            obj.setVisible(true);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(telaAlterarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBAlterarActionPerformed

    /**
     * Botão que ao ser clicado atualiza as informações do produto
     *
     * @param evt
     */

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        String nomeID;
        int ID;

        nomeID = jCBProdutos.getSelectedItem().toString();

        try {
            ID = proddao.getID(nomeID);
            proddao.getProduto(ID, jTFValorAtual, jTFNome, jTFID);
        } catch (Exception ex) {
            Logger.getLogger(telaAlterarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBAtualizarActionPerformed

    /**
     * Botão que volta para a tela principal do sistema
     *
     * @param evt
     */

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        telaPrincipal set = new telaPrincipal();
        set.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBVoltarActionPerformed

    /**
     * Método que inicializa a tela de alteração de produto
     *
     * @param args
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new telaAlterarProduto().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(telaAlterarProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JComboBox jCBProdutos;
    private javax.swing.JLabel jLExib;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLProduto;
    private javax.swing.JLabel jLValorAtual;
    private javax.swing.JLabel jLValorNovo;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFPesquisar;
    private javax.swing.JTextField jTFValorAtual;
    private javax.swing.JTextField jTFValorNovo;
    // End of variables declaration//GEN-END:variables
}
