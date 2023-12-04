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

import view.telasAlteracao.*;
import DAO.ClienteDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import view.telaPrincipal;

/**
 *
 * @author Davidson
 * @since 11/2023
 *
 * View - tela de delete de cliente
 */
public class telaDeletarCliente extends javax.swing.JFrame {

    /**
     * Objeto referente a classe ClienteDAO a qual possui manipulação do Banco
     * de Dados
     */
    ClienteDAO clidao = new ClienteDAO();

    /**
     * Método que inicializa os componentes da view
     *
     * @throws Exception
     */
    public telaDeletarCliente() throws Exception {
        initComponents();
        clidao.listarCliente(jCBClientes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGTipoCliente = new javax.swing.ButtonGroup();
        jLIdade = new javax.swing.JLabel();
        jLContato = new javax.swing.JLabel();
        jBDeletar = new javax.swing.JButton();
        jLExib = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jTFContato = new javax.swing.JFormattedTextField();
        jTFIdade = new javax.swing.JFormattedTextField();
        jLTipoCliente = new javax.swing.JLabel();
        jRBCPF = new javax.swing.JRadioButton();
        jRBCNPJ = new javax.swing.JRadioButton();
        jLCodigo = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jCBClientes = new javax.swing.JComboBox();
        jBVoltar = new javax.swing.JButton();
        jBPesquisar = new javax.swing.JButton();
        jTFPesquisar = new javax.swing.JTextField();
        jBAtualizar = new javax.swing.JButton();
        jLClientes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLIdade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLIdade.setText("Idade");

        jLContato.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLContato.setText("Contato");

        jBDeletar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBDeletar.setText("Deletar cliente");
        jBDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeletarActionPerformed(evt);
            }
        });

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLNome.setText("Nome");

        jTFNome.setEditable(false);
        jTFNome.setFocusable(false);

        jTFContato.setEditable(false);
        try {
            jTFContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTFContato.setFocusable(false);

        jTFIdade.setEditable(false);
        jTFIdade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));
        jTFIdade.setFocusable(false);

        jLTipoCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLTipoCliente.setText("Tipo de cliente");

        bGTipoCliente.add(jRBCPF);
        jRBCPF.setText("CPF");
        jRBCPF.setFocusable(false);

        bGTipoCliente.add(jRBCNPJ);
        jRBCNPJ.setText("CNPJ");
        jRBCNPJ.setFocusable(false);

        jLCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLCodigo.setText("Código");

        jTFCodigo.setEditable(false);
        jTFCodigo.setFocusable(false);

        jCBClientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------" }));
        jCBClientes.setToolTipText("");

        jBVoltar.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jBVoltar.setText("<");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

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

        jBAtualizar.setText("Atualizar informações");
        jBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarActionPerformed(evt);
            }
        });

        jLClientes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLClientes.setText("Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jBDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLIdade)
                                            .addComponent(jTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLTipoCliente)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRBCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRBCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(63, 63, 63))
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLContato)
                                    .addComponent(jLNome))
                                .addGap(177, 177, 177)
                                .addComponent(jLExib, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLCodigo)
                            .addComponent(jTFContato, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLClientes)
                            .addComponent(jCBClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jBAtualizar)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTFCodigo, jTFContato, jTFIdade});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBClientes)
                    .addComponent(jBAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIdade)
                    .addComponent(jLTipoCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRBCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRBCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFIdade))
                .addGap(18, 18, 18)
                .addComponent(jLCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLContato)
                    .addComponent(jLExib, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFContato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jBDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jRBCNPJ, jRBCPF, jTFCodigo, jTFContato, jTFIdade, jTFNome});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botão que deleta um cliente no BD e volta para a tela principal
     *
     * @param evt
     */

    private void jBDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeletarActionPerformed
        String name;
        int id;

        name = jCBClientes.getSelectedItem().toString();

        try {
            id = clidao.getID(name);
            clidao.deleteCliente(id);

            JOptionPane.showMessageDialog(jLExib, "Cliente apagado com sucesso!");

            telaPrincipal obj;
            obj = new telaPrincipal();
            obj.setVisible(true);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(telaDeletarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBDeletarActionPerformed

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
     * Botão que pesquisa clientes no BD com informações do jTextField
     *
     * @param evt
     */

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        String pesquisa;

        pesquisa = (jTFPesquisar.getText());
        try {
            clidao.pesquisarCliente(pesquisa, jCBClientes);
        } catch (Exception ex) {
            Logger.getLogger(telaAlterarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

    /**
     * Pesquisa de clientes no BD através de um jTextField
     *
     * @param evt
     */

    private void jTFPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPesquisarActionPerformed
        jBPesquisarActionPerformed(evt);
    }//GEN-LAST:event_jTFPesquisarActionPerformed

    /**
     * Botão que ao ser clicado atualiza as informações do cliente
     *
     * @param evt
     */

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        String nomeID;
        int id;

        nomeID = jCBClientes.getSelectedItem().toString();

        try {
            id = clidao.getID(nomeID);
            clidao.getCliente(id, jTFNome, jTFIdade, jRBCPF, jRBCNPJ, jTFCodigo, jTFContato);
        } catch (Exception ex) {
            Logger.getLogger(telaAlterarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBAtualizarActionPerformed

    /**
     * Método que inicializa a tela de delete de cliente
     *
     * @param args
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            try {
                new telaDeletarCliente().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(telaDeletarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGTipoCliente;
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBDeletar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JComboBox jCBClientes;
    private javax.swing.JLabel jLClientes;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLContato;
    private javax.swing.JLabel jLExib;
    private javax.swing.JLabel jLIdade;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLTipoCliente;
    private javax.swing.JRadioButton jRBCNPJ;
    private javax.swing.JRadioButton jRBCPF;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JFormattedTextField jTFContato;
    private javax.swing.JFormattedTextField jTFIdade;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFPesquisar;
    // End of variables declaration//GEN-END:variables
}
