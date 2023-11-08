package view;

import controller.VendaController;
import javax.swing.JOptionPane;

/**
 * @author : Davidson Teixeira Filho
 * @date : 26/01/2023
 */
/**
 *
 * @author Davidson
 */
public class telaVenda extends javax.swing.JFrame {

    public telaVenda() {
        setTitle("Efetuar compra");
        initComponents();
//        ListarLideres ll = new ListarLideres();
//        ll.pesquisar(jCBLider);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLAcampante = new javax.swing.JLabel();
        jCBCliente = new javax.swing.JComboBox();
        jBPesquisar = new javax.swing.JButton();
        jTFPesquisa = new javax.swing.JTextField();
        jBComprar = new javax.swing.JButton();
        jLValor = new javax.swing.JLabel();
        jTFValor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLItem = new javax.swing.JLabel();
        jLQuantidade = new javax.swing.JLabel();
        jLValue = new javax.swing.JLabel();
        jTFValue = new javax.swing.JTextField();
        jBAdd = new javax.swing.JButton();
        jLDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescricao = new javax.swing.JTextArea();
        jLPesqProd = new javax.swing.JLabel();
        jBPesqProd = new javax.swing.JButton();
        jTFPesqProd = new javax.swing.JTextField();
        jCBItem = new javax.swing.JComboBox();
        jBUpdate = new javax.swing.JButton();
        jCBQnt = new javax.swing.JComboBox();
        jBVoltar = new javax.swing.JButton();
        jLExib = new javax.swing.JLabel();

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

        jTFPesquisa.setToolTipText("Pesquisar em acampantes");
        jTFPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPesquisaActionPerformed(evt);
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

        jTFValor.setText("0");
        jTFValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFValorActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLItem.setText("Item");

        jLQuantidade.setText("Quantidade");

        jLValue.setText("Valor");

        jTFValue.setEditable(false);

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

        jBUpdate.setText("Atualizar dados");
        jBUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUpdateActionPerformed(evt);
            }
        });

        jCBQnt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jBVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gerenciamentocaixa/setaVoltarIcone.png"))); // NOI18N
        jBVoltar.setBorder(null);
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
                        .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                        .addComponent(jBUpdate))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLValue)
                                            .addComponent(jTFValue, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLQuantidade)
                                            .addComponent(jCBQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLPesqProd)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTFPesqProd, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBPesqProd)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))))
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
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBPesquisar)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jCBItem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBUpdate))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLValue)
                                            .addComponent(jLQuantidade))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jCBQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(jBAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addComponent(jBComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //  BOTÃO QUE FAZ A PESQUISA DOS NOMES DE ACAMPANTES NO BD
    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
//        PesquisarAcampante pesq = new PesquisarAcampante();
//
//        pesq.pesquisar(jTFPesquisa, jCBAcampantes);
    }//GEN-LAST:event_jBPesquisarActionPerformed

    //  PESQUISA DOS NOMES DE ACAMPANTES NO BD POR ENTER
    private void jTFPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPesquisaActionPerformed
        jBPesquisarActionPerformed(evt);
    }//GEN-LAST:event_jTFPesquisaActionPerformed

    //  BOTÃO QUE EFETUA A COMPRA ATRAVÉS
    private void jBComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComprarActionPerformed
        String pesquisa, descricao;
        double valor;
        
        VendaController vendcont = new VendaController();

        pesquisa = (jCBCliente.getSelectedItem().toString());
        descricao = (jTADescricao.getText());
        valor = Double.parseDouble(jTFValor.getText());
        JOptionPane.showMessageDialog(jLExib, "Compra efetuada com sucesso!");

        telaVenda obj = new telaVenda();
        obj.setVisible(true);
        dispose();

        /*
         AlterarSaldo atualizar = new AlterarSaldo();
         atualizar.alterarSaldo(jCBAcampantes, jLExib, valor);

         try {

         //  busca e atualização de saldo na tabela ACAMPANTE
         Connection con = new Conexao().getConnection();

         //  registro de depósito na tabela COMPRA
         if (atualizar.total < valor) {
         System.err.println("Saldo insuficiente!");
         JOptionPane.showMessageDialog(jLExib, String.format("Saldo insuficiente! Não foi possível efetuar a compra!\n Você possui um saldo de R$%.2f", atualizar.total));
         } else {
         Statement state = con.createStatement();

         String sel = "select id from acampante where nome='" + pesquisa + "'";

         ResultSet r = state.executeQuery(sel);
         r.next();
         int id = r.getInt("id");
         System.out.println(id);

         String insert = "insert into compra(valor, id_acamp, lider_caixa, saldo_inicial, saldo_final, descricao) values (?,?,?,?,?,?)";
         System.out.println("Connection established!");

         PreparedStatement input = con.prepareStatement(insert);

         input.setDouble(1, valor);
         input.setInt(2, id);
         input.setString(3, lider);
         input.setDouble(4, atualizar.total);
         input.setDouble(5, atualizar.novoTotal);
         input.setString(6, descricao);

         input.executeUpdate();

         input.close();
         System.out.println("Connection closed!");

         dispose();
         telaVenda obj = new telaVenda();
         obj.setVisible(true);

         System.out.printf("O novo total é de R$%.2f\n", atualizar.novoTotal);
         JOptionPane.showMessageDialog(jLExib, String.format("Compra efetuada com sucesso! O novo saldo do acampante %s é de R$%.2f", pesquisa, atualizar.novoTotal));
         }


         } catch (SQLException ex) {
         System.err.println(ex);
         } catch (Exception ex) {
         System.out.println(ex);;
         }
         */
    }//GEN-LAST:event_jBComprarActionPerformed

    //  EFETUA A COMPRA ATRAVÉS DO ENTER
    private void jTFValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFValorActionPerformed
        jBComprarActionPerformed(evt);
    }//GEN-LAST:event_jTFValorActionPerformed

    //  BOTÃO QUE ADICIONA ITENS Á COMPRA
    private void jBAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddActionPerformed
        String desc, descricao, item;
        double valorTotal, valor, add, vR;
        int qnt;

        item = (jCBItem.getSelectedItem()).toString();

        /*
         if (jTFValue.getText().isEmpty()) {
         try {
         Connection con = new Conexao().getConnection();
         Statement stm = con.createStatement();

         String sql = "select valor from produto where nome='" + item + "'";
         //System.out.println(sql);
         ResultSet rs = stm.executeQuery(sql);
         while (rs.next()) {
         double value = rs.getDouble("valor");

         String inter = String.valueOf(value);
         jTFValue.setText(inter);
         }
         } catch (SQLException ex) {
         System.err.println(ex);

         } catch (Exception ex) {
         Logger.getLogger(telaVenda.class
         .getName()).log(Level.SEVERE, null, ex);
         }
         }
         */
        descricao = jTADescricao.getText();
        qnt = Integer.parseInt(jCBQnt.getSelectedItem().toString());
        valor = Double.parseDouble(jTFValue.getText());
        valorTotal = Float.parseFloat(jTFValor.getText());

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
        jTFValor.setText(vT);

        jCBItem.removeAllItems();
        jCBItem.addItem("------");
        jCBQnt.setSelectedIndex(0);
        jTFPesqProd.setText("");
        jTFValue.setText("");
    }//GEN-LAST:event_jBAddActionPerformed

    //  BOTÃO QUE PESQUISA DENTRO DA TABELA PRODUTO
    private void jBPesqProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesqProdActionPerformed
        //PesquisarProduto pp = new PesquisarProduto();
        //pp.pesquisar(jTFPesqProd, jCBItem);
    }//GEN-LAST:event_jBPesqProdActionPerformed

    //  PESQUISA DENTRO DA TABELA PRODUTO POR ENTER
    private void jTFPesqProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPesqProdActionPerformed
        jBPesqProdActionPerformed(evt);
    }//GEN-LAST:event_jTFPesqProdActionPerformed

    //  BOTÃO QUE ATUALIZA AS INFORMAÇÕES DO PRODUTO
    private void jBUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateActionPerformed
        String item = (jCBItem.getSelectedItem().toString());

        /*
         try {
         Connection con = new Conexao().getConnection();
         Statement stm = con.createStatement();

         String sql = "select valor from produto where nome='" + item + "'";
         //System.out.println(sql);
         ResultSet rs = stm.executeQuery(sql);
         while (rs.next()) {
         double value = rs.getDouble("valor");

         String inter = String.valueOf(value);
         jTFValue.setText(inter);
         }
         } catch (SQLException ex) {
         System.err.println(ex);

         } catch (Exception ex) {
         Logger.getLogger(telaVenda.class
         .getName()).log(Level.SEVERE, null, ex);
         }
         */
    }//GEN-LAST:event_jBUpdateActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        telaPrincipal set = new telaPrincipal();
        set.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaVenda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaVenda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaVenda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaVenda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdd;
    private javax.swing.JButton jBComprar;
    private javax.swing.JButton jBPesqProd;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBUpdate;
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
    private javax.swing.JTextField jTFPesqProd;
    private javax.swing.JTextField jTFPesquisa;
    private javax.swing.JTextField jTFValor;
    private javax.swing.JTextField jTFValue;
    // End of variables declaration//GEN-END:variables
}
