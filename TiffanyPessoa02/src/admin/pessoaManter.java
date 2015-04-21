
package admin;

import dao.PessoaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Pessoa;

public class pessoaManter extends javax.swing.JFrame {

    List<Pessoa> lista;
    Integer posicao;
    
    public pessoaManter() {
        initComponents();
          PessoaDAO dao = new PessoaDAO();
        lista = dao.listar();
        posicao = 0;
      
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        primeiro = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        proximo = new javax.swing.JButton();
        ultimo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        sexo = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        cadastrar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        btnir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegação"));

        primeiro.setText("Primeiro");
        primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeiroActionPerformed(evt);
            }
        });

        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        proximo.setText("Proximo");
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });

        ultimo.setText("Ultimo");
        ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(primeiro)
                        .addGap(76, 76, 76)
                        .addComponent(proximo)
                        .addGap(0, 86, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(anterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ultimo)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primeiro)
                    .addComponent(proximo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anterior)
                    .addComponent(ultimo))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel1.setText("Codigo :");

        jLabel2.setText("Nome :");

        jLabel3.setText("Sexo :");

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Feminino", "Masculino" }));
        sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações "));

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastrar)
                .addGap(110, 110, 110)
                .addComponent(consultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(excluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limpar)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(consultar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluir)
                    .addComponent(limpar))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        btnir.setText("Ir para listagem");
        btnir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(codigo)
                                    .addComponent(nome)
                                    .addComponent(sexo, 0, 129, Short.MAX_VALUE))))
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(btnir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnir)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoActionPerformed

    private void primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeiroActionPerformed
      if (lista.size() > 0)
      {
      posicao = 0 ;
     
     Pessoa elemento = lista.get(0);
     codigo.setText(elemento.getCodigo().toString());
     nome.setText(elemento.getNome());
     sexo.setSelectedItem(elemento.getSexo());
     
    }                                    

    }//GEN-LAST:event_primeiroActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        Pessoa item = new Pessoa();
        if(nome.getText().isEmpty() || sexo.getSelectedIndex()==0)
        {
              JOptionPane.showMessageDialog(null, "Preencha todos os campos! ");
            
        }
        else 
        {
      item.setNome(nome.getText());
//      item.setCodigo(Integer.parseInt(codigo.getText()));
      item.setSexo(sexo.getSelectedItem().toString());
      PessoaDAO  dao = new PessoaDAO();
      //chama o inserir
      boolean deucerto= dao.inserir(item);
      if(deucerto==true)
      {
          JOptionPane.showMessageDialog(rootPane, "Cadastrado com sucesso");
      }
      else
      {
          JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar");
      }
      lista.add(item); 
      Limpar();
        }
    }//GEN-LAST:event_cadastrarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
       if (codigo.getText().isEmpty()== false){
          PessoaDAO dao = new PessoaDAO();
         
         Boolean deucerto = dao.excluir(lista.get(posicao));
         if(deucerto == true)
         {
             JOptionPane.showMessageDialog(rootPane, "excluido com sucesso");
             
         lista= dao.listar();
           Limpar();
         }
         else {
             JOptionPane.showMessageDialog(rootPane, "erro ao excluir");
         }
        
        }
        
   
    }//GEN-LAST:event_excluirActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        String nome1 = JOptionPane.showInputDialog("digite o nome :");
         boolean encontrou = false;
         Pessoa elemento = lista.get(0);
         for (Pessoa pessoa : lista) {
             if (nome1.equals(pessoa.getNome()))
             {
                 encontrou = true ; 
                 break;
             }
         }
         if (encontrou == true)
         {
             JOptionPane.showMessageDialog(null," achou");
             codigo.setText(elemento.getCodigo().toString());
             nome.setText(elemento.getNome());
             sexo.setSelectedItem(elemento.getSexo());
         }
         else
         {
             JOptionPane.showMessageDialog(null,"  nao achou");
         }
       
    }//GEN-LAST:event_consultarActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
         codigo.setText(null);
    nome.setText(null);
    sexo.setSelectedIndex(0);
    }//GEN-LAST:event_limparActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
              
    if (lista.size() > 0 && posicao > 0)
    {
        posicao = posicao - 1 ;
        Pessoa elemento = lista.get(posicao);
        codigo.setText(elemento.getCodigo().toString());
        nome.setText(elemento.getNome());
        sexo.setSelectedItem(elemento.getSexo());
     
    }
    else{
        JOptionPane.showMessageDialog(null,"nao tem anterior");
    }
    
    }//GEN-LAST:event_anteriorActionPerformed

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
            if (lista.size() > 0)
          if (posicao != (lista.size()-1 ))
      
          {
          posicao = posicao + 1;
            
     Pessoa elemento = lista.get(posicao);
     codigo.setText(elemento.getCodigo().toString());
     nome.setText(elemento.getNome());
     sexo.setSelectedItem(elemento.getSexo());
   
          } 
          else 
          {
              JOptionPane.showMessageDialog(null," nao tem proximo");
          }
    }//GEN-LAST:event_proximoActionPerformed

    private void ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimoActionPerformed
        if(lista.size() > 0 )
    {
        posicao = lista.size() -1;
      Pessoa elemento = lista.get(posicao);
     codigo.setText(elemento.getCodigo().toString());
     nome.setText(elemento.getNome());
     sexo.setSelectedItem(elemento.getSexo());
    }
    }//GEN-LAST:event_ultimoActionPerformed

    private void btnirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnirActionPerformed
         pessoaListar tela = new pessoaListar();
      tela.setVisible(true);
     
    }//GEN-LAST:event_btnirActionPerformed

    private void Limpar (){
    codigo.setText(null);
    nome.setText(null);
    sexo.setSelectedIndex(0);
    }
    
    
    
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
            java.util.logging.Logger.getLogger(pessoaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pessoaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pessoaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pessoaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pessoaManter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JButton btnir;
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton consultar;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField nome;
    private javax.swing.JButton primeiro;
    private javax.swing.JButton proximo;
    private javax.swing.JComboBox sexo;
    private javax.swing.JButton ultimo;
    // End of variables declaration//GEN-END:variables
}
