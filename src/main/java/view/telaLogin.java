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

import javax.swing.JOptionPane;

/**
 *
 * @author Davidson
 * @since 11/2023
 *
 * View - tela de login
 */
public class telaLogin extends javax.swing.JFrame {

    public telaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLUser = new javax.swing.JLabel();
        jLPassword = new javax.swing.JLabel();
        jBLogin = new javax.swing.JButton();
        jTFUser = new javax.swing.JTextField();
        jBClean = new javax.swing.JButton();
        jLDescricao = new javax.swing.JLabel();
        jLExib = new javax.swing.JLabel();
        jTFPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLUser.setText("Usuário:");

        jLPassword.setText("Senha: ");

        jBLogin.setText("Entrar");
        jBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoginActionPerformed(evt);
            }
        });

        jBClean.setText("Limpar");
        jBClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCleanActionPerformed(evt);
            }
        });

        jLDescricao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDescricao.setText("Informe o seu usuário e senha para entrar.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBLogin)
                        .addGap(9, 9, 9)
                        .addComponent(jBClean))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLExib, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLUser, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFUser, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLDescricao)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUser)
                    .addComponent(jTFUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLExib, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPassword)
                    .addComponent(jTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLogin)
                    .addComponent(jBClean))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botão que efetua o login no sistema utilizando o login padrão
     *
     * @param evt
     */
    private void jBLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoginActionPerformed
        String user, senha;

        user = jTFUser.getText();
        senha = jTFPassword.getText();

        if ((user.equals("admin")) && senha.equals("admin")) {
            JOptionPane.showMessageDialog(jLExib, "Bem-vindo " + user);
            telaPrincipal screen = new telaPrincipal();
            screen.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(jLExib, "Entre com usuário e senha válidos!");
        }
    }//GEN-LAST:event_jBLoginActionPerformed

    /**
     * Botão que limpa as informações da tela
     *
     * @param evt
     */
    private void jBCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCleanActionPerformed
        jTFUser.setText("");
        jTFPassword.setText("");
    }//GEN-LAST:event_jBCleanActionPerformed

    /**
     * Método que inicia a view
     *
     * @param args
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new telaLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBClean;
    private javax.swing.JButton jBLogin;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLExib;
    private javax.swing.JLabel jLPassword;
    private javax.swing.JLabel jLUser;
    private javax.swing.JPasswordField jTFPassword;
    private javax.swing.JTextField jTFUser;
    // End of variables declaration//GEN-END:variables
}
