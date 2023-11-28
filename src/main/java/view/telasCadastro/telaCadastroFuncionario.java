package view.telasCadastro;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import controller.FuncionarioController;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.telaPrincipal;

public class telaCadastroFuncionario extends javax.swing.JFrame {

    public telaCadastroFuncionario() {
        initComponents();
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
        jBCadastrar = new javax.swing.JButton();
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
        jBLimpar = new javax.swing.JButton();
        jLCadUsers = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLExib = new javax.swing.JLabel();
        jBImagem = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();

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

        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
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
                .addGroup(jPDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22)
                        .addComponent(jTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPDadosPessoaisLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTFCPF, jTFEmail, jTFTelefone});

        jPDadosPessoaisLayout.setVerticalGroup(
            jPDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosPessoaisLayout.createSequentialGroup()
                .addGroup(jPDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPDadosPessoaisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTelefone)
                            .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEmail)
                            .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPSexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCPF)
                    .addComponent(jTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPDadosPessoaisLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTFCPF, jTFEmail, jTFTelefone});

        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jLCadUsers.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLCadUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCadUsers.setText("Cadastro de Funcionários");
        jLCadUsers.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLNome.setText("Nome");

        jTFNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jBImagem.setBackground(new java.awt.Color(255, 255, 255));
        jBImagem.setText("Imagem a ser adicionada");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addComponent(jPDadosPessoais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLCadUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLConfSenha)
                                            .addComponent(jLSenha)
                                            .addComponent(jLNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLUsuario))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTFNome, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(jTFUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(jTFSenha)
                                            .addComponent(jTFConfSenha)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLExib)))))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTFConfSenha, jTFNome, jTFSenha, jTFUsuario});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCadUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNome)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLUsuario)
                            .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLSenha)
                            .addComponent(jTFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLConfSenha)
                            .addComponent(jTFConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jBImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLExib)
                .addGap(13, 13, 13)
                .addComponent(jPDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTFConfSenha, jTFNome, jTFSenha, jTFUsuario});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBCadastrar, jBLimpar});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBVoltar, jLCadUsers});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //  BOTÃO QUE CADASTRA O FUNCIONARIO
    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        String name, user, pass, confirmPass,
                phone, mail, sex, CPF;

        FuncionarioController funcont = new FuncionarioController();

        name = jTFNome.getText();
        user = jTFUsuario.getText();
        pass = jTFSenha.getText();
        confirmPass = jTFConfSenha.getText();
        phone = jTFTelefone.getText();
        mail = jTFEmail.getText();
        CPF = jTFCPF.getText();
        sex = null;

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
                    funcont.cadastrar(name, user, pass, confirmPass, phone, mail, sex, CPF);

                    System.out.printf("%s, %s, %s, %s, %s, %s, %s, %s", name, user, pass, confirmPass,
                            phone, mail, CPF, sex);
                    JOptionPane.showMessageDialog(jLExib, "Usuário cadastrado "
                            + "com sucesso!");
                    jBVoltarActionPerformed(evt);
                } catch (Exception ex) {
                    Logger.getLogger(telaCadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(jLExib, "As senhas não são "
                        + "iguais!");
                jTFSenha.setFocusable(true);
            }

        } else {
            JOptionPane.showMessageDialog(jLExib, "Não pode haver informações vazias!");
        }

    }//GEN-LAST:event_jBCadastrarActionPerformed

    //  BOTÃO QUE LIMPA AS INFORMAÇÕES DA TELA
    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTFNome.setText("");
        jTFUsuario.setText("");
        jTFSenha.setText("");
        jTFConfSenha.setText("");
        jTFTelefone.setText("");
        jTFEmail.setText("");
        jTFCPF.setText("");
        rBGSexo.clearSelection();
    }//GEN-LAST:event_jBLimparActionPerformed

    //  BOTÃO QUE VOLTA PARA A TELA PRINCIPAL DO SISTEMA
    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        telaPrincipal set = new telaPrincipal();
        set.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBVoltarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new telaCadastroFuncionario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBImagem;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLCPF;
    private javax.swing.JLabel jLCadUsers;
    private javax.swing.JLabel jLConfSenha;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLExib;
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
    private javax.swing.JPasswordField jTFSenha;
    private javax.swing.JFormattedTextField jTFTelefone;
    private javax.swing.JTextField jTFUsuario;
    private javax.swing.ButtonGroup rBGSexo;
    // End of variables declaration//GEN-END:variables
}
