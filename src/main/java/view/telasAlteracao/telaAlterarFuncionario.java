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

import DAO.FuncionarioDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.telaPrincipal;

/**
 *
 * @author Davidson
 * @since 11/2023
 *
 * View - tela de alteração de funcionário
 */
public class telaAlterarFuncionario extends javax.swing.JFrame {

    /**
     * Objeto referente a classe FuncionarioDAO a qual possui manipulação do
     * Banco de Dados
     */
    FuncionarioDAO funcdao = new FuncionarioDAO();

    /**
     * Método que inicializa os componentes da view
     *
     * @throws Exception
     */
    public telaAlterarFuncionario() throws Exception {
        initComponents();
        funcdao.listarFuncionario(jCBFuncionarios);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rBGSexo = new javax.swing.ButtonGroup();
        jTFSenha = new javax.swing.JPasswordField();
        jTFConfSenha = new javax.swing.JPasswordField();
        jLUsuario = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jLSenha = new javax.swing.JLabel();
        jLConfSenha = new javax.swing.JLabel();
        jBAlterar = new javax.swing.JButton();
        jPDadosPessoais = new javax.swing.JPanel();
        jLTelefone = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jTFEmail = new javax.swing.JTextField();
        jPSexo = new javax.swing.JPanel();
        jRBMasculino = new javax.swing.JRadioButton();
        jRBFeminino = new javax.swing.JRadioButton();
        jTFTelefone = new javax.swing.JFormattedTextField();
        jTFCPF = new javax.swing.JFormattedTextField();
        jLCPF = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLExib = new javax.swing.JLabel();
        jCBFuncionarios = new javax.swing.JComboBox();
        jBVoltar = new javax.swing.JButton();
        jBPesquisar = new javax.swing.JButton();
        jTFPesquisar = new javax.swing.JTextField();
        jBAtualizar = new javax.swing.JButton();
        jLFuncionários = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Usuário");
        setResizable(false);

        jLUsuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLUsuario.setText("Usuário");

        jTFUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLSenha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLSenha.setText("Senha");

        jLConfSenha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLConfSenha.setText("Confirmar senha");

        jBAlterar.setText("Alterar funcionário");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jPDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLTelefone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLTelefone.setText("Telefone");

        jLEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLEmail.setText("E-mail");

        jTFEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jPSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        rBGSexo.add(jRBMasculino);
        jRBMasculino.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jRBMasculino.setText("Masculino");

        rBGSexo.add(jRBFeminino);
        jRBFeminino.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jRBFeminino.setText("Feminino");

        javax.swing.GroupLayout jPSexoLayout = new javax.swing.GroupLayout(jPSexo);
        jPSexo.setLayout(jPSexoLayout);
        jPSexoLayout.setHorizontalGroup(
            jPSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSexoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBMasculino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBFeminino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPSexoLayout.setVerticalGroup(
            jPSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSexoLayout.createSequentialGroup()
                .addComponent(jRBMasculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRBFeminino)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try {
            jTFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jTFCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLCPF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLCPF.setText("CPF");

        javax.swing.GroupLayout jPDadosPessoaisLayout = new javax.swing.GroupLayout(jPDadosPessoais);
        jPDadosPessoais.setLayout(jPDadosPessoaisLayout);
        jPDadosPessoaisLayout.setHorizontalGroup(
            jPDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFCPF))
                    .addGroup(jPDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFEmail)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jPSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPDadosPessoaisLayout.setVerticalGroup(
            jPDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(jPDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTelefone)
                            .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEmail)
                            .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jPSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCPF)
                    .addComponent(jTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPDadosPessoaisLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTFCPF, jTFEmail, jTFTelefone});

        jLNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLNome.setText("Nome");

        jTFNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jCBFuncionarios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------" }));
        jCBFuncionarios.setToolTipText("");

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

        jLFuncionários.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLFuncionários.setText("Funcionários");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLConfSenha)
                            .addComponent(jLSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLUsuario)
                            .addComponent(jLNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(jTFConfSenha)
                            .addComponent(jTFUsuario)
                            .addComponent(jTFNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLExib))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLFuncionários)
                            .addComponent(jCBFuncionarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jBAtualizar)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLExib)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLFuncionários)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBFuncionarios)
                    .addComponent(jBAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUsuario)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSenha)
                    .addComponent(jTFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLConfSenha)
                    .addComponent(jTFConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jPDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTFConfSenha, jTFNome, jTFSenha, jTFUsuario});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botão que efetua a atualização do funcionário no BD e atualiza a tela
     *
     * @param evt
     */

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        String name, user, pass, confirmPass,
                phone, mail, sex, CPF;
        int idFunc;

        name = jTFNome.getText();
        user = jTFUsuario.getText();
        pass = jTFSenha.getText();
        confirmPass = jTFConfSenha.getText();
        phone = jTFTelefone.getText();
        mail = jTFEmail.getText();
        CPF = jTFCPF.getText();
        sex = null;

        String nomeAntigo = jCBFuncionarios.getSelectedItem().toString();

        if (jRBMasculino.isSelected()) {
            sex = "Masculino";
        } else if (jRBFeminino.isSelected()) {
            sex = "Feminino";
        }

        if (name.length() > 0 & user.length() > 0
                & pass.length() > 0 & confirmPass.length() > 0
                & CPF.length() == 14 & phone.length() == 15
                & mail.length() > 0 & sex != null) {

            if (confirmPass.equals(pass)) {

                try {
                    idFunc = funcdao.getID(nomeAntigo);
                    funcdao.updateFuncionario(idFunc, name, user, pass, confirmPass, phone, mail, sex, CPF);
                    JOptionPane.showMessageDialog(jLExib, "Funcionário atualizado "
                            + "com sucesso!");

                    telaAlterarFuncionario screen = new telaAlterarFuncionario();
                    screen.setVisible(true);
                    dispose();
                } catch (Exception ex) {
                    Logger.getLogger(telaAlterarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(jLExib, "As senhas não são "
                        + "iguais!");
                jTFSenha.setFocusable(true);
            }

        } else {
            JOptionPane.showMessageDialog(jLExib, "Não pode haver informações vazias!");
        }

    }//GEN-LAST:event_jBAlterarActionPerformed

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
     * Botão que pesquisa funcionários no BD com informações do jTextField
     *
     * @param evt
     */

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        String pesquisa;

        pesquisa = jTFPesquisar.getText();

        try {
            funcdao.pesquisarFuncionario(pesquisa, jCBFuncionarios);
        } catch (Exception ex) {
            Logger.getLogger(telaAlterarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

    /**
     * Pesquisa de funcionários no BD através de um jTextField
     *
     * @param evt
     */

    private void jTFPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPesquisarActionPerformed
        jBPesquisarActionPerformed(evt);
    }//GEN-LAST:event_jTFPesquisarActionPerformed

    /**
     * Botão que ao ser clicado atualiza as informações do funcionário
     *
     * @param evt
     */

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        String nome;
        int id;

        nome = jCBFuncionarios.getSelectedItem().toString();

        try {
            id = funcdao.getID(nome);
            funcdao.getFuncionario(id, jTFNome, jTFUsuario, jTFSenha, jTFConfSenha, jTFTelefone, jTFEmail, jRBMasculino, jRBFeminino, jTFCPF);
        } catch (Exception ex) {
            Logger.getLogger(telaAlterarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBAtualizarActionPerformed

    /**
     * Método que inicializa a tela de alteração de funcionário
     *
     * @param args
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new telaAlterarFuncionario().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(telaAlterarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JComboBox jCBFuncionarios;
    private javax.swing.JLabel jLCPF;
    private javax.swing.JLabel jLConfSenha;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLExib;
    private javax.swing.JLabel jLFuncionários;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JPanel jPDadosPessoais;
    private javax.swing.JPanel jPSexo;
    private javax.swing.JRadioButton jRBFeminino;
    private javax.swing.JRadioButton jRBMasculino;
    private javax.swing.JFormattedTextField jTFCPF;
    private javax.swing.JPasswordField jTFConfSenha;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFPesquisar;
    private javax.swing.JPasswordField jTFSenha;
    private javax.swing.JFormattedTextField jTFTelefone;
    private javax.swing.JTextField jTFUsuario;
    private javax.swing.ButtonGroup rBGSexo;
    // End of variables declaration//GEN-END:variables
}
