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

import DAO.ClienteDAO;
import DAO.ProdutoDAO;
import controller.VendaController;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Davidson
 * @since 11/2023
 *
 * View - tela de venda
 */
public class telaVenda extends javax.swing.JFrame {

    /**
     * Objeto referente a classe ClienteDAO a qual possui manipulação do Banco
     * de Dados
     */
    ClienteDAO clidao = new ClienteDAO();
    /**
     * Objeto referente a classe ProdutoDAO a qual possui manipulação do Banco
     * de Dados
     */
    ProdutoDAO proddao = new ProdutoDAO();
    /**
     * Objeto referente a classe VendaController a qual cria um controller de
     * Venda
     */
    VendaController vendcont = new VendaController();

    /**
     * Método que inicia os componetes da tela
     *
     * @throws Exception
     */
    public telaVenda() throws Exception {
        initComponents();
        clidao.listarCliente(jCBCliente);
        proddao.listarProduto(jCBItem);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLAcampante = new javax.swing.JLabel();
        jCBCliente = new javax.swing.JComboBox();
        jBPesquisar = new javax.swing.JButton();
        jTFPesquisaCliente = new javax.swing.JTextField();
        jBComprar = new javax.swing.JButton();
        jLValor = new javax.swing.JLabel();
        jTFValorTotal = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLItem = new javax.swing.JLabel();
        jLQuantidade = new javax.swing.JLabel();
        jLValue = new javax.swing.JLabel();
        jTFValorProduto = new javax.swing.JTextField();
        jBAdd = new javax.swing.JButton();
        jLDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescricao = new javax.swing.JTextArea();
        jLPesqProd = new javax.swing.JLabel();
        jBPesqProd = new javax.swing.JButton();
        jTFPesqProd = new javax.swing.JTextField();
        jCBItem = new javax.swing.JComboBox();
        jCBQnt = new javax.swing.JComboBox();
        jLExib = new javax.swing.JLabel();
        jBVoltar = new javax.swing.JButton();
        jBUpdateProduto = new javax.swing.JButton();
        jTFID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLAcampante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLAcampante.setText("Cliente");

        jCBCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------" }));
        jCBCliente.setToolTipText("");

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jTFPesquisaCliente.setToolTipText("Pesquisar em acampantes");
        jTFPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPesquisaClienteActionPerformed(evt);
            }
        });

        jBComprar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBComprar.setText("Efetuar a compra");
        jBComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComprarActionPerformed(evt);
            }
        });

        jLValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLValor.setText("Valor da compra");

        jTFValorTotal.setEditable(false);
        jTFValorTotal.setText("0");
        jTFValorTotal.setFocusable(false);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLItem.setText("Item");

        jLQuantidade.setText("Quantidade");

        jLValue.setText("Valor");

        jTFValorProduto.setFocusable(false);

        jBAdd.setText("Adicionar");
        jBAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddActionPerformed(evt);
            }
        });

        jLDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLDescricao.setText("Descrição (produtos):");

        jTADescricao.setColumns(20);
        jTADescricao.setRows(5);
        jScrollPane1.setViewportView(jTADescricao);

        jLPesqProd.setText("Pesquisar produto");

        jBPesqProd.setText("Pesquisar");
        jBPesqProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesqProdActionPerformed(evt);
            }
        });

        jTFPesqProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPesqProdActionPerformed(evt);
            }
        });

        jCBItem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------" }));
        jCBItem.setToolTipText("");

        jCBQnt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jBVoltar.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jBVoltar.setText("<");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        jBUpdateProduto.setText("Atualizar");
        jBUpdateProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUpdateProdutoActionPerformed(evt);
            }
        });

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBComprar))
                            .addComponent(jCBCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLAcampante)
                                    .addComponent(jLValor))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLDescricao)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTFValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLExib, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLItem)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCBItem, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBUpdateProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLValue)
                                            .addComponent(jTFValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLQuantidade)
                                            .addComponent(jCBQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(14, 14, 14))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLPesqProd)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTFPesqProd, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBPesqProd)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLPesqProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBPesqProd)
                                    .addComponent(jTFPesqProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBPesquisar)
                                    .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLAcampante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLExib, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jBComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jCBItem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBUpdateProduto))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLValue)
                                            .addComponent(jLQuantidade))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jCBQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(jBAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botão que efetua a venda
     *
     * @param evt
     */

    private void jBComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComprarActionPerformed
        String nomeCli, descricao;
        double valor;
        int idCli = 0;

        nomeCli = (jCBCliente.getSelectedItem().toString());
        descricao = (jTADescricao.getText());
        valor = Double.parseDouble(jTFValorTotal.getText());

        try {
            idCli = clidao.getID(nomeCli);
        } catch (Exception ex) {
            Logger.getLogger(telaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }

        vendcont.cadastrar(idCli, valor, descricao);
        JOptionPane.showMessageDialog(jLExib, "Compra efetuada com sucesso!");

        telaVenda obj;
        try {
            obj = new telaVenda();
            obj.setVisible(true);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(telaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBComprarActionPerformed

    /**
     * Botão que adiciona itens á venda
     *
     * @param evt
     */

    private void jBAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddActionPerformed
        String desc, descricao, item;
        double valorTotal, valor, add, vR;
        int qnt;

        item = (jCBItem.getSelectedItem()).toString();

        descricao = jTADescricao.getText();
        qnt = Integer.parseInt(jCBQnt.getSelectedItem().toString());
        valor = Double.parseDouble(jTFValorProduto.getText());
        valorTotal = Float.parseFloat(jTFValorTotal.getText());

        //  setting the description area
        if (descricao.length() > 0) {
            desc = String.format("%s, %dx %s (R$%.2f)", descricao, qnt, item, valor);
            jTADescricao.setText(desc);
        } else {
            desc = String.format("%dx %s (R$%.2f)", qnt, item, valor);
            jTADescricao.setText(desc);
        }

        add = qnt * valor;

        vR = (valorTotal + add);

        //  setting purchase value
        String vT = String.valueOf(vR);
        jTFValorTotal.setText(vT);

        try {
            proddao.listarProduto(jCBItem);
            jCBQnt.setSelectedIndex(0);
            jTFPesqProd.setText("");
            jTFValorProduto.setText("");
        } catch (Exception ex) {
            Logger.getLogger(telaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBAddActionPerformed

    /**
     * Método que pesquisa produtos no BD com informações do jTextField
     *
     * @param evt
     */

    private void jBPesqProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesqProdActionPerformed
        String pesquisa;

        pesquisa = (jTFPesqProd.getText());
        try {
            proddao.pesquisarProduto(pesquisa, jCBItem);
        } catch (Exception ex) {
            Logger.getLogger(telaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBPesqProdActionPerformed

    /**
     * Pesquisa de produtos no BD através de um jTextField
     *
     * @param evt
     */
    private void jTFPesqProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPesqProdActionPerformed
        jBPesqProdActionPerformed(evt);
    }//GEN-LAST:event_jTFPesqProdActionPerformed

    /**
     * Botão que pesquisa clientes no BD com informações do jTextField
     *
     * @param evt
     */

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        String pesquisa;

        pesquisa = (jTFPesquisaCliente.getText());
        try {
            clidao.pesquisarCliente(pesquisa, jCBCliente);
        } catch (Exception ex) {
            Logger.getLogger(telaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

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
     * Pesquisa de clientes no BD através de um jTextField
     *
     * @param evt
     */

    private void jTFPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPesquisaClienteActionPerformed
        jBPesquisarActionPerformed(evt);
    }//GEN-LAST:event_jTFPesquisaClienteActionPerformed

    /**
     * Botão que ao ser clicado atualiza as informações do produto
     *
     * @param evt
     */

    private void jBUpdateProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateProdutoActionPerformed
        String nomeID;
        int id;

        nomeID = jCBItem.getSelectedItem().toString();

        try {
            id = proddao.getID(nomeID);
            proddao.getProdutoQuant(id, jCBQnt, jTFValorProduto, jTFPesqProd, jTFID);
        } catch (Exception ex) {
            Logger.getLogger(telaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBUpdateProdutoActionPerformed

    /**
     * Método que inicializa a tela de venda
     *
     * @param args
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new telaVenda().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(telaVenda.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdd;
    private javax.swing.JButton jBComprar;
    private javax.swing.JButton jBPesqProd;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBUpdateProduto;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JComboBox jCBCliente;
    private javax.swing.JComboBox jCBItem;
    private javax.swing.JComboBox jCBQnt;
    private javax.swing.JLabel jLAcampante;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLExib;
    private javax.swing.JLabel jLItem;
    private javax.swing.JLabel jLPesqProd;
    private javax.swing.JLabel jLQuantidade;
    private javax.swing.JLabel jLValor;
    private javax.swing.JLabel jLValue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTADescricao;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFPesqProd;
    private javax.swing.JTextField jTFPesquisaCliente;
    private javax.swing.JTextField jTFValorProduto;
    private javax.swing.JTextField jTFValorTotal;
    // End of variables declaration//GEN-END:variables
}
