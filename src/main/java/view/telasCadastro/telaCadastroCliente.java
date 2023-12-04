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

import controller.ClienteController;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.telaPrincipal;

/**
 *
 * @author Davidson
 * @since 11/2023
 *
 * View - tela de cadastro de cliente
 */
public class telaCadastroCliente extends javax.swing.JFrame {

    /**
     * Objeto referente a classe ClienteController a qual cria um controller de
     * Cliente
     */
    ClienteController clicont = new ClienteController();

    /**
     * Método que inicializa os componentes da view
     */
    public telaCadastroCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGTipoCliente = new javax.swing.ButtonGroup();
        jLIdade = new javax.swing.JLabel();
        jLContato = new javax.swing.JLabel();
        jBCadastrar = new javax.swing.JButton();
        jBLimparCad = new javax.swing.JButton();
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
        jBVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLIdade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLIdade.setText("Idade");

        jLContato.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLContato.setText("Contato");

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

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLNome.setText("Nome");

        try {
            jTFContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTFIdade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));

        jLTipoCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLTipoCliente.setText("Tipo de cliente");

        bGTipoCliente.add(jRBCPF);
        jRBCPF.setText("CPF");

        bGTipoCliente.add(jRBCNPJ);
        jRBCNPJ.setText("CNPJ");

        jLCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLCodigo.setText("Código");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLContato)
                                    .addComponent(jLNome))
                                .addGap(177, 177, 177)
                                .addComponent(jLExib, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLCodigo)
                            .addComponent(jTFContato, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jBLimparCad, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
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
                                .addComponent(jRBCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTFCodigo, jTFContato, jTFIdade});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimparCad, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jRBCNPJ, jRBCPF, jTFCodigo, jTFContato, jTFIdade, jTFNome});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botão que limpa as informações da tela
     *
     * @param evt
     */

    private void jBLimparCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparCadActionPerformed
        jTFCodigo.setText(null);
        jTFNome.setText(null);
        jTFIdade.setText(null);
        jTFContato.setText(null);
        bGTipoCliente.clearSelection();
    }//GEN-LAST:event_jBLimparCadActionPerformed

    /**
     * Botão que cadastra o cliente
     *
     * @param evt
     */

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        Integer age;
        String name, telefone, codigo, typeCliente = null;

        age = Integer.valueOf(jTFIdade.getText());
        name = jTFNome.getText();
        telefone = jTFContato.getText();
        codigo = jTFCodigo.getText();

        if (!jRBCPF.isSelected()) {
            if (jRBCNPJ.isSelected()) {
                typeCliente = "Juridico";
            }
        } else {
            typeCliente = "Fisico";
        }

        try {
            clicont.cadastrar(name, age, typeCliente, codigo, telefone);

            System.out.printf("%s, %d, %s, %s, %s", name, age, telefone,
                    typeCliente, codigo);

            JOptionPane.showMessageDialog(jLExib, "Cliente cadastrado com sucesso!");

            jBVoltarActionPerformed(evt);
        } catch (Exception ex) {
            Logger.getLogger(telaCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(jLExib, "Deu errado!");
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
     * Método que inicializa a tela de cadastro de cliente
     *
     * @param args
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new telaCadastroCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGTipoCliente;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLimparCad;
    private javax.swing.JButton jBVoltar;
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
    // End of variables declaration//GEN-END:variables
}
