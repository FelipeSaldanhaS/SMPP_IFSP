package pizza;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class MenuGerente extends javax.swing.JFrame {

    /**
     * Creates new form MenuGerente
     */
    public MenuGerente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_AbrirFunc = new java.awt.Button();
        btn_Sair = new java.awt.Button();
        lbl_Gerente = new java.awt.Label();
        btn_AbrirPedidos = new java.awt.Button();
        btn_AbrirCardapio = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn_AbrirFunc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_AbrirFunc.setLabel("Funcionários");
        btn_AbrirFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AbrirFuncActionPerformed(evt);
            }
        });

        btn_Sair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_Sair.setLabel("Sair");
        btn_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SairActionPerformed(evt);
            }
        });

        lbl_Gerente.setAlignment(java.awt.Label.CENTER);
        lbl_Gerente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_Gerente.setName("Menu Gerente"); // NOI18N
        lbl_Gerente.setText("Menu Gerente");

        btn_AbrirPedidos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_AbrirPedidos.setLabel("Pedidos");
        btn_AbrirPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AbrirPedidosActionPerformed(evt);
            }
        });

        btn_AbrirCardapio.setActionCommand("Cardápio");
        btn_AbrirCardapio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_AbrirCardapio.setLabel("Cardápio");
        btn_AbrirCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AbrirCardapioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_Sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_AbrirCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_AbrirFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_AbrirPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Gerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbl_Gerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(btn_AbrirPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_AbrirFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_AbrirCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AbrirFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AbrirFuncActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ControleFuncionario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_AbrirFuncActionPerformed

    private void btn_AbrirPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AbrirPedidosActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ControlePedidos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_AbrirPedidosActionPerformed

    private void btn_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SairActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btn_SairActionPerformed

    private void btn_AbrirCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AbrirCardapioActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ControleCardapio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_AbrirCardapioActionPerformed

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
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn_AbrirCardapio;
    private java.awt.Button btn_AbrirFunc;
    private java.awt.Button btn_AbrirPedidos;
    private java.awt.Button btn_Sair;
    private java.awt.Label lbl_Gerente;
    // End of variables declaration//GEN-END:variables
}
