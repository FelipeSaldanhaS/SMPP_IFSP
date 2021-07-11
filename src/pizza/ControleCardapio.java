/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author fefes
 */
public class ControleCardapio extends javax.swing.JFrame {

    /**
     * Creates new form ControleCardapio
     */
    public ControleCardapio() {
        initComponents();
        
        try
        {
          String myDriver = "org.gjt.mm.mysql.Driver";
          String myUrl = "jdbc:mysql://localhost/pizzaria";
          Class.forName(myDriver);
          Connection conn = DriverManager.getConnection(myUrl, "root", "");
          
          String query = "SELECT idsabor FROM cardapio";
          
          Statement st = conn.createStatement();
          
          ResultSet rs = st.executeQuery(query);
          
          cmb_IDSabor.removeAllItems();
          while(rs.next()){
              cmb_IDSabor.addItem(rs.getInt("idsabor")+"");
          }
                  st.close();

        }
        catch (Exception e)
        {
          System.err.println("Erro! ");
          System.err.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Titulo = new java.awt.Label();
        lbl_IDSABOR = new javax.swing.JLabel();
        cmb_IDSabor = new javax.swing.JComboBox<>();
        txt_Sabor = new javax.swing.JTextField();
        lbl_Sabor = new javax.swing.JLabel();
        txt_Preco = new javax.swing.JTextField();
        lbl_Preco = new javax.swing.JLabel();
        txt_Deletar = new javax.swing.JButton();
        btn_Criar = new javax.swing.JButton();
        txt_Novo = new javax.swing.JButton();
        btn_Alterar = new javax.swing.JButton();
        btn_Voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_Titulo.setText("CARDÁPIO");

        lbl_IDSABOR.setText("IDSabor:");

        cmb_IDSabor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_IDSaborItemStateChanged(evt);
            }
        });
        cmb_IDSabor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_IDSaborMouseClicked(evt);
            }
        });

        lbl_Sabor.setText("Sabor:");

        lbl_Preco.setText("Preço:");

        txt_Deletar.setText("DELETAR");
        txt_Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DeletarActionPerformed(evt);
            }
        });

        btn_Criar.setText("CRIAR");
        btn_Criar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CriarActionPerformed(evt);
            }
        });

        txt_Novo.setText("NOVO");
        txt_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NovoActionPerformed(evt);
            }
        });

        btn_Alterar.setText("ALTERAR");
        btn_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AlterarActionPerformed(evt);
            }
        });

        btn_Voltar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_Voltar.setText("<- Voltar");
        btn_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Criar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_Deletar))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_IDSABOR)
                    .addComponent(lbl_Sabor)
                    .addComponent(lbl_Preco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_Sabor)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmb_IDSabor, 0, 116, Short.MAX_VALUE)
                        .addGap(201, 201, 201))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_Preco)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Voltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_IDSABOR)
                    .addComponent(cmb_IDSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Sabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Sabor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Preco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Criar)
                    .addComponent(btn_Alterar))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Novo)
                    .addComponent(txt_Deletar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DeletarActionPerformed
        Cardapio c = new Cardapio();
        int IDSabor = Integer.parseInt(cmb_IDSabor.getSelectedItem().toString());
        
        c.setIdsabor(IDSabor);
        
        int res = c.ExcluirItemCardapio();
        if(res == 1){
           showMessageDialog(null, "Excluido com sucesso!");
       }
        
    }//GEN-LAST:event_txt_DeletarActionPerformed

    private void btn_CriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CriarActionPerformed
       Cardapio c = new Cardapio();
       String Sabor = txt_Sabor.getText();
       double Preco = Double.parseDouble(txt_Preco.getText());
       
       c.setSabor(Sabor);
       c.setPreco(Preco);
       int res = c.IncluirItemCardapio();
       
       if(res == 1){
           showMessageDialog(null, "Inserido com sucesso!");
       }
    }//GEN-LAST:event_btn_CriarActionPerformed

    private void txt_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NovoActionPerformed
        // TODO add your handling code here:
          txt_Sabor.setText("");
          txt_Preco.setText("");

    }//GEN-LAST:event_txt_NovoActionPerformed

    private void btn_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AlterarActionPerformed
       Cardapio c = new Cardapio();
       int IDSabor = Integer.parseInt(cmb_IDSabor.getSelectedItem().toString());
       String Sabor = txt_Sabor.getText();
       double Preco = Double.parseDouble(txt_Preco.getText());
       
       c.setIdsabor(IDSabor);
       c.setSabor(Sabor);
       c.setPreco(Preco);
       int res = c.AlterarItemCardapio();
       
       if(res == 1){
           showMessageDialog(null, "Alterado com sucesso!");
       }
    }//GEN-LAST:event_btn_AlterarActionPerformed

    private void cmb_IDSaborMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_IDSaborMouseClicked
        // TODO add your handling code here:
        cmb_IDSabor.removeAllItems();
        try
        {
          String myDriver = "org.gjt.mm.mysql.Driver";
          String myUrl = "jdbc:mysql://localhost/pizzaria";
          Class.forName(myDriver);
          Connection conn = DriverManager.getConnection(myUrl, "root", "");
          
          String query = "SELECT idsabor FROM cardapio";
          
          Statement st = conn.createStatement();
          
          ResultSet rs = st.executeQuery(query);
          
          
          while(rs.next()){
              cmb_IDSabor.addItem(rs.getInt("idsabor")+"");
          }
                  st.close();

        }
        catch (Exception e)
        {
          System.err.println("Erro! ");
          System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_cmb_IDSaborMouseClicked

    private void cmb_IDSaborItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_IDSaborItemStateChanged
        // TODO add your handling code here:
        try
        {
          String myDriver = "org.gjt.mm.mysql.Driver";
          String myUrl = "jdbc:mysql://localhost/pizzaria";
          Class.forName(myDriver);
          Connection conn = DriverManager.getConnection(myUrl, "root", "");
          
          String query = "SELECT * FROM cardapio WHERE idsabor ="+cmb_IDSabor.getSelectedItem()+"";
          
          Statement st = conn.createStatement();
          
          ResultSet rs = st.executeQuery(query);
          
          rs.next();
          
          txt_Sabor.setText(rs.getString("sabor"));
          txt_Preco.setText(rs.getString("preco"));
          
          st.close();
          
        }
        catch (Exception e)
        {
          System.err.println("Erro! ");
          System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_cmb_IDSaborItemStateChanged

    private void btn_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarActionPerformed
        // TODO add your handling code here:
        if(Login.tipoFunc == 1){
            this.setVisible(false);
            new MenuGerente().setVisible(true);
            this.dispose();
        }
        else if (Login.tipoFunc == 2){
            this.setVisible(false);
            new MenuAtendente().setVisible(true);
            this.dispose();
        }else{
            this.setVisible(false);
            new MenuEntregador().setVisible(true);
            this.dispose(); 
        }
    }//GEN-LAST:event_btn_VoltarActionPerformed

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
            java.util.logging.Logger.getLogger(ControleCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleCardapio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Alterar;
    private javax.swing.JButton btn_Criar;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JComboBox<String> cmb_IDSabor;
    private javax.swing.JLabel lbl_IDSABOR;
    private javax.swing.JLabel lbl_Preco;
    private javax.swing.JLabel lbl_Sabor;
    private java.awt.Label lbl_Titulo;
    private javax.swing.JButton txt_Deletar;
    private javax.swing.JButton txt_Novo;
    private javax.swing.JTextField txt_Preco;
    private javax.swing.JTextField txt_Sabor;
    // End of variables declaration//GEN-END:variables
}
