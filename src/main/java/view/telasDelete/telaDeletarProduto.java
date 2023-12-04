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
package view.telasDelete;

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
 * View - tela de delete de produto
 */
public class telaDeletarProduto extends javax.swing.JFrame {

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
    public telaDeletarProduto() throws Exception {
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
        jBExcluir = new javax.swing.JButton();
        jLValor = new javax.swing.JLabel();
        jBAtualizar = new javax.swing.JButton();
        jLExib = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jBVoltar = new javax.swing.JButton();
        jTFValor = new javax.swing.JTextField();
        jLID = new javax.swing.JLabel();
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

        jBExcluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBExcluir.setText("Efetuar a exclusão");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jLValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLValor.setText("Valor do produto");

        jBAtualizar.setText("Atualizar informações");
        jBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarActionPerformed(evt);
            }
        });

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLNome.setText("Nome");

        jTFNome.setEditable(false);
        jTFNome.setFocusable(false);

        jBVoltar.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jBVoltar.setText("<");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        jTFValor.setEditable(false);
        jTFValor.setFocusable(false);

        jLID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLID.setText("ID");

        jTFID.setEditable(false);
        jTFID.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLProduto)
                                    .addComponent(jCBProdutos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLID)
                                            .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(165, 165, 165)
                                        .addComponent(jLExib, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jBAtualizar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jBExcluir))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNome)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLValor)
                            .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBAtualizar, jBPesquisar});

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLExib, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBAtualizar, jBPesquisar, jCBProdutos, jTFPesquisar});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTFNome, jTFValor});

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
            Logger.getLogger(telaDeletarProduto.class.getName()).log(Level.SEVERE, null, ex);
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
     * Botão que deleta um produto no BD e volta para a tela principal
     *
     * @param evt
     */

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        String name;
        int id;

        name = jCBProdutos.getSelectedItem().toString();

        try {
            id = proddao.getID(name);
            proddao.deleteProduto(id);

            JOptionPane.showMessageDialog(jLExib, "Produto apagado com sucesso!");

            telaPrincipal obj;
            obj = new telaPrincipal();
            obj.setVisible(true);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(telaDeletarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    /**
     * Botão que ao ser clicado atualiza as informações do produto
     *
     * @param evt
     */

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        String nomeID;
        int id;

        nomeID = jCBProdutos.getSelectedItem().toString();

        try {
            id = proddao.getID(nomeID);
            proddao.getProduto(id, jTFValor, jTFNome, jTFID);
        } catch (Exception ex) {
            Logger.getLogger(telaDeletarProduto.class.getName()).log(Level.SEVERE, null, ex);
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
     * Método que inicializa a tela de delete de produto
     *
     * @param args
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new telaDeletarProduto().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(telaDeletarProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JComboBox jCBProdutos;
    private javax.swing.JLabel jLExib;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLProduto;
    private javax.swing.JLabel jLValor;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFPesquisar;
    private javax.swing.JTextField jTFValor;
    // End of variables declaration//GEN-END:variables
}
