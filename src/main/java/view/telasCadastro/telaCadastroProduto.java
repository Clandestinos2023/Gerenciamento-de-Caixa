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
package view.telasCadastro;

import controller.ProdutoController;
import javax.swing.JOptionPane;
import view.telaPrincipal;

/**
 *
 * @author Davidson
 * @since 11/2023
 *
 * View - tela de cadastro de produto
 */
public class telaCadastroProduto extends javax.swing.JFrame {

    private String nome;
    private double value;
    private int quantidade;

    /**
     * Objeto referente a classe ProdutoController a qual cria um controller de
     * Produto
     */
    ProdutoController prodcont = new ProdutoController();

    /**
     * Método que inicializa os componentes da view
     */
    public telaCadastroProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLNome = new javax.swing.JLabel();
        jTFProdNome = new javax.swing.JTextField();
        jLIdade = new javax.swing.JLabel();
        jLContato = new javax.swing.JLabel();
        jBCadastrar = new javax.swing.JButton();
        jBLimparCad = new javax.swing.JButton();
        jLExib = new javax.swing.JLabel();
        jTFValor = new javax.swing.JTextField();
        jBVoltar = new javax.swing.JButton();
        jTFQuantidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLNome.setText("Nome do produto");

        jLIdade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLIdade.setText("Valor (separe as casas decimais com '.')");

        jLContato.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLContato.setText("Quantidade");

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBLimparCad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBLimparCad.setText("Limpar");
        jBLimparCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparCadActionPerformed(evt);
            }
        });

        jBVoltar.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jBVoltar.setText("<");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jBLimparCad, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLIdade)
                                .addGap(18, 18, 18)
                                .addComponent(jLExib, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLContato, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFProdNome))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTFQuantidade, jTFValor});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFProdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLIdade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLContato))
                    .addComponent(jLExib, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimparCad, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTFQuantidade, jTFValor});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botão que limpa as informações da tela
     *
     * @param evt
     */

    private void jBLimparCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparCadActionPerformed
        jTFProdNome.setText(null);
        jTFValor.setText(null);
        jTFQuantidade.setText(null);
    }//GEN-LAST:event_jBLimparCadActionPerformed

    /**
     * Botão que cadastra o produto
     *
     * @param evt
     */

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed

        String quant, valor;

        valor = jTFValor.getText();
        nome = jTFProdNome.getText();
        quant = jTFQuantidade.getText();

        if (nome.length() > 0 & quant.length() > 0 & valor.length() > 0) {

            quantidade = Integer.parseInt(quant);
            value = Double.parseDouble(valor);

            prodcont.cadastrar(nome, value, quantidade);

            JOptionPane.showMessageDialog(jLExib, "Produto cadastrado "
                    + "com sucesso!");
            jBVoltarActionPerformed(evt);

        } else {
            JOptionPane.showMessageDialog(jLExib, "Não pode haver informações vazias!");
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

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
     * Método que inicializa a tela de cadastro de produto
     *
     * @param args
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new telaCadastroProduto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLimparCad;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLContato;
    private javax.swing.JLabel jLExib;
    private javax.swing.JLabel jLIdade;
    private javax.swing.JLabel jLNome;
    private javax.swing.JTextField jTFProdNome;
    private javax.swing.JTextField jTFQuantidade;
    private javax.swing.JTextField jTFValor;
    // End of variables declaration//GEN-END:variables
}
