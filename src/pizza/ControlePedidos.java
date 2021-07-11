package pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class ControlePedidos extends javax.swing.JFrame {
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    /**
     * Creates new form Pedidos
     */
    public ControlePedidos() {
        initComponents();
        
        
        try
        {
          String myDriver = "org.gjt.mm.mysql.Driver";
          String myUrl = "jdbc:mysql://localhost/pizzaria";
          Class.forName(myDriver);
          Connection conn = DriverManager.getConnection(myUrl, "root", "");
          String query = "";
          if(Login.idfunc != 3){
             query = "SELECT idpedido FROM pedidos";
          }
          else{
             query = "SELECT idpedido FROM pedidos where id_func="+Login.idfunc+"";  
          }
          Statement st = conn.createStatement();
          
          ResultSet rs = st.executeQuery(query);
          
          cmb_IDPedido.removeAllItems();
          
          while(rs.next()){
              cmb_IDPedido.addItem(rs.getInt("idpedido")+"");
          }
          st.close();
          //----------
        }
        catch (Exception e)
        {
          System.err.println("Erro no IDPEDIDOS! ");
          System.err.println(e.getMessage());
        }
        
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
          //----------
        }
        catch (Exception e)
        {
          System.err.println("Erro no IDSABOR! ");
          System.err.println(e.getMessage());
        }
        if(Login.tipoFunc == 1 || Login.tipoFunc == 2){
            
        }else{
            txt_Endereco.setEditable(false);
            txt_Nome.setEditable(false);
            txt_Obs.setEditable(false);
            txt_Tel.setEditable(false);
            txt_HoraI.setEditable(false);
            txt_HoraF.setEditable(false);
            txt_Entrega.setEditable(false);
            txt_Placa.setEditable(false);
            txt_QTD.setEditable(false);
            txt_Nota.setEditable(false);
            cmb_IDSabor.setEnabled(false);
            cmb_IDPedido.setEnabled(false);
            btn_Criar.setEnabled(false);
            btn_Deletar.setEnabled(false);
            btn_Alterar.setText("ATUALIZAR");
            btn_Novo.setEnabled(false);
            System.out.print("O ID do func: "+Login.idfunc);
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

        label1 = new java.awt.Label();
        lbl_Ped = new javax.swing.JLabel();
        lbl_End = new javax.swing.JLabel();
        lbl_Nome = new javax.swing.JLabel();
        lbl_Tel = new javax.swing.JLabel();
        lbl_Entre = new javax.swing.JLabel();
        lbl_Obs = new javax.swing.JLabel();
        lbl_HI = new javax.swing.JLabel();
        lbl_HF = new javax.swing.JLabel();
        txt_Endereco = new javax.swing.JTextField();
        txt_Nome = new javax.swing.JTextField();
        txt_Tel = new javax.swing.JTextField();
        txt_Entrega = new javax.swing.JTextField();
        txt_Obs = new javax.swing.JTextField();
        lbl_Preco = new javax.swing.JLabel();
        txt_Nota = new javax.swing.JTextField();
        lbl_Nota = new javax.swing.JLabel();
        txt_Preco = new javax.swing.JTextField();
        lbl_Status = new javax.swing.JLabel();
        lbl_IDsabor = new javax.swing.JLabel();
        lbl_Sabor = new javax.swing.JLabel();
        txt_Sabor = new javax.swing.JTextField();
        btn_Criar = new javax.swing.JButton();
        btn_Novo = new javax.swing.JButton();
        btn_Alterar = new javax.swing.JButton();
        btn_Deletar = new javax.swing.JButton();
        cmb_IDPedido = new javax.swing.JComboBox<>();
        cmb_IDSabor = new javax.swing.JComboBox<>();
        txt_Status = new javax.swing.JTextField();
        btn_Voltar = new javax.swing.JButton();
        lbl_plac = new javax.swing.JLabel();
        txt_Placa = new javax.swing.JTextField();
        lbl_PrecoIndicado = new javax.swing.JLabel();
        txt_PrecoQTD = new javax.swing.JTextField();
        lbl_qtd = new javax.swing.JLabel();
        txt_QTD = new javax.swing.JTextField();
        btn_Status = new javax.swing.JButton();
        txt_HoraI = new javax.swing.JFormattedTextField();
        txt_HoraF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setText("PEDIDOS");

        lbl_Ped.setText("IdPedido:");

        lbl_End.setText("Endereço:");

        lbl_Nome.setText("Nome:");

        lbl_Tel.setText("Telefone:");

        lbl_Entre.setText("Entregador:");

        lbl_Obs.setText("Observação:");

        lbl_HI.setText("Hora inicial:");

        lbl_HF.setText("Hora final:");

        lbl_Preco.setText("Preço final:");

        lbl_Nota.setText("Nota fiscal:");

        txt_Preco.setEditable(false);
        txt_Preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PrecoActionPerformed(evt);
            }
        });

        lbl_Status.setText("Status:");

        lbl_IDsabor.setText("IdSabor:");

        lbl_Sabor.setText("Sabor:");

        txt_Sabor.setEditable(false);

        btn_Criar.setText("CRIAR");
        btn_Criar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CriarActionPerformed(evt);
            }
        });

        btn_Novo.setText("NOVO");

        btn_Alterar.setText("ALTERAR");
        btn_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AlterarActionPerformed(evt);
            }
        });

        btn_Deletar.setText("DELETAR");
        btn_Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeletarActionPerformed(evt);
            }
        });

        cmb_IDPedido.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_IDPedidoItemStateChanged(evt);
            }
        });
        cmb_IDPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_IDPedidoMouseClicked(evt);
            }
        });

        cmb_IDSabor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_IDSaborItemStateChanged(evt);
            }
        });

        txt_Status.setEditable(false);

        btn_Voltar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_Voltar.setText("<- Voltar");
        btn_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarActionPerformed(evt);
            }
        });

        lbl_plac.setText("Placa:");

        lbl_PrecoIndicado.setText("Preço por quantidade:");

        txt_PrecoQTD.setEditable(false);

        lbl_qtd.setText("Quantidade:");

        txt_QTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_QTDActionPerformed(evt);
            }
        });

        btn_Status.setText("ALTERAR STATUS");
        btn_Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StatusActionPerformed(evt);
            }
        });

        try {
            txt_HoraI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txt_HoraF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_Tel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Tel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Ped)
                                    .addComponent(lbl_End))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Endereco))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_Entre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_Nome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_HI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_HoraI))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_HF)
                            .addComponent(lbl_plac))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txt_Placa))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_HoraF)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Nota)
                                    .addComponent(lbl_Preco)
                                    .addComponent(lbl_Status))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Nota)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_Preco, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                            .addComponent(txt_Status))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Obs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Obs))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_qtd)
                                .addGap(13, 13, 13)
                                .addComponent(txt_QTD))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_PrecoIndicado)
                                .addGap(13, 13, 13)
                                .addComponent(txt_PrecoQTD, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Sabor)
                                .addGap(13, 13, 13)
                                .addComponent(txt_Sabor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_IDsabor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_IDSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmb_IDPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(625, 625, 625)
                .addComponent(btn_Status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Criar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Novo))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Deletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Voltar))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Ped)
                    .addComponent(cmb_IDPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_IDsabor)
                    .addComponent(cmb_IDSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_End)
                    .addComponent(txt_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Sabor)
                    .addComponent(txt_Sabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nome)
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_PrecoIndicado)
                    .addComponent(txt_PrecoQTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Tel)
                    .addComponent(txt_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_qtd)
                    .addComponent(txt_QTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Entre)
                    .addComponent(txt_Entrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Obs)
                    .addComponent(txt_Obs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_HI)
                    .addComponent(txt_HoraI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_HF)
                            .addComponent(txt_HoraF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Nota))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Preco)
                            .addComponent(txt_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_plac))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Status)
                            .addComponent(txt_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_Alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Criar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_Novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btn_Deletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_PrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PrecoActionPerformed

    private void btn_CriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CriarActionPerformed
        // TODO add your handling code here:
       Pedidos p = new Pedidos();
       String Nome = txt_Nome.getText();
       int IDsabor = Integer.parseInt(cmb_IDSabor.getSelectedItem()+"");
       String Observe = txt_Obs.getText();
       String Endereco = txt_Endereco.getText();
       String Telefone = txt_Tel.getText();
       int ID_Entregador = Integer.parseInt(txt_Entrega.getText());
       int Quantidade = Integer.parseInt(txt_QTD.getText());
       String Hora_I = txt_HoraI.getText();
       String Hora_F = txt_HoraF.getText();
       String Placa = txt_Placa.getText();
       String Nota = txt_Nota.getText();
       double Preco = Double.parseDouble(txt_Preco.getText());
       String Status = txt_Status.getText();
       
       p.setHora_inicial(Hora_I);
       p.setHora_final(Hora_F);
       p.setId_sabor(IDsabor);
       p.setNome_cliente(Nome);
       p.setObservacao(Observe);
       p.setId_func(ID_Entregador);
       p.setQuantidade(Quantidade);
       p.setPlaca(Placa);
       p.setNota_fiscal(Nota);
       p.setEndereco(Endereco);
       p.setTelefone(Telefone);
       p.setPreco(Preco);
       p.setStatusped(Status);
       
       int res = p.CriarPed();
       
       if(res == 1){
           showMessageDialog(null, "Inserido com sucesso!");
       }
    }//GEN-LAST:event_btn_CriarActionPerformed

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

    private void cmb_IDPedidoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_IDPedidoItemStateChanged
        // TODO add your handling code here:
        try
        {
          String myDriver = "org.gjt.mm.mysql.Driver";
          String myUrl = "jdbc:mysql://localhost/pizzaria";
          Class.forName(myDriver);
          Connection conn = DriverManager.getConnection(myUrl, "root", "");
          
          String query = "SELECT * FROM pedidos WHERE idpedido ="+cmb_IDPedido.getSelectedItem()+"";
          
          Statement st = conn.createStatement();
          
          ResultSet rs = st.executeQuery(query);
          
          rs.next();
          
          txt_Nome.setText(rs.getString("nome_cliente"));
          txt_Obs.setText(rs.getString("observacao"));
          txt_HoraI.setText(rs.getString("hora_inicial"));
          txt_HoraF.setText(rs.getString("hora_final"));
          txt_Nota.setText(rs.getString("nota_fiscal"));
          txt_Status.setText(rs.getString("statusped"));
          txt_Placa.setText(rs.getString("placa"));
          txt_Preco.setText(rs.getDouble("preco")+"");
          txt_QTD.setText(rs.getInt("quantidade")+"");
          cmb_IDSabor.setSelectedItem(rs.getInt("id_sabor")+"");
          txt_Endereco.setText(rs.getString("endereco"));
          txt_Tel.setText(rs.getString("telefone"));
          txt_Entrega.setText(rs.getInt("id_func")+"");
          
          //System.out.print("Modo que imprime mascara: "+txt_HoraI.getText());
          
          st.close();
          
        }
        catch (Exception e)
        {
          System.err.println("Erro no itemchanged! ");
          System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_cmb_IDPedidoItemStateChanged

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
          txt_PrecoQTD.setText(rs.getString("preco"));
          st.close();
          
        }
        catch (Exception e)
        {
          System.err.println("Erro no itemchanged Sabor! ");
          System.err.println(e.getMessage());
        }
        
    }//GEN-LAST:event_cmb_IDSaborItemStateChanged

    private void cmb_IDPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_IDPedidoMouseClicked
        // TODO add your handling code here:
        if(Login.tipoFunc == 1 || Login.tipoFunc == 2){
        cmb_IDPedido.removeAllItems();
        try
        {
          String myDriver = "org.gjt.mm.mysql.Driver";
          String myUrl = "jdbc:mysql://localhost/pizzaria";
          Class.forName(myDriver);
          Connection conn = DriverManager.getConnection(myUrl, "root", "");
          
          String query = "SELECT * FROM pedidos";
          
          Statement st = conn.createStatement();
          
          ResultSet rs = st.executeQuery(query);
          
          while(rs.next()){
              cmb_IDPedido.addItem(rs.getInt("idpedido")+"");
              
          }
          st.close();
          
        }
        catch (Exception e)
        {
          System.err.println("Erro no mouse click! ");
          System.err.println(e.getMessage());
        }
        }
    }//GEN-LAST:event_cmb_IDPedidoMouseClicked

    private void btn_StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StatusActionPerformed
        // TODO add your handling code here:
        if((txt_Status.getText().equals("Entregando"))){
            txt_Status.setText("Entregue");
        }else if((txt_Status.getText().equals("Entregue"))){
            txt_Status.setText("Entregando");
        }else{
           txt_Status.setText("Entregando"); 
        }
    }//GEN-LAST:event_btn_StatusActionPerformed

    private void txt_QTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_QTDActionPerformed
        // TODO add your handling code here:
        int qtde = Integer.parseInt(txt_QTD.getText());
        double precoI = Double.parseDouble(txt_PrecoQTD.getText());
        txt_Preco.setText((qtde*precoI)+"");
    }//GEN-LAST:event_txt_QTDActionPerformed

    private void btn_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AlterarActionPerformed
        // TODO add your handling code here:
       if(Login.tipoFunc != 3){
        Pedidos p = new Pedidos();
        int IDPedido = Integer.parseInt(cmb_IDPedido.getSelectedItem().toString());
        String Nome = txt_Nome.getText();
        int IDsabor = Integer.parseInt(cmb_IDSabor.getSelectedItem()+"");
        String Observe = txt_Obs.getText();
        String Endereco = txt_Endereco.getText();
        String Telefone = txt_Tel.getText();
        int ID_Entregador = Integer.parseInt(txt_Entrega.getText());
        int Quantidade = Integer.parseInt(txt_QTD.getText());
        String Hora_I = txt_HoraI.getText();
        String Hora_F = txt_HoraF.getText();
        String Placa = txt_Placa.getText();
        String Nota = txt_Nota.getText();
        double Preco = Double.parseDouble(txt_Preco.getText());
        String Status = txt_Status.getText();

        p.setIdpedido(IDPedido);
        p.setHora_inicial(Hora_I);
        p.setHora_final(Hora_F);
        p.setId_sabor(IDsabor);
        p.setNome_cliente(Nome);
        p.setObservacao(Observe);
        p.setId_func(ID_Entregador);
        p.setQuantidade(Quantidade);
        p.setPlaca(Placa);
        p.setNota_fiscal(Nota);
        p.setEndereco(Endereco);
        p.setTelefone(Telefone);
        p.setPreco(Preco);
        p.setStatusped(Status);

        int res = p.AlterarPed();

        if(res == 1){
            showMessageDialog(null, "Gerente/Atendente:Alterado com sucesso!");
        }
       }
        else{
           Entregador e = new Entregador();
           int IDPedido = Integer.parseInt(cmb_IDPedido.getSelectedItem().toString());
           String Status = txt_Status.getText();
           
           e.setIdpedido(IDPedido);
           e.setStatusped(Status);

           int res = e.AlterarPed();
           if(res == 1){
             showMessageDialog(null, "Entregador:Alterado com sucesso!");
         }
        }
    }//GEN-LAST:event_btn_AlterarActionPerformed

    private void btn_DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeletarActionPerformed
        // TODO add your handling code here:
        Pedidos p = new Pedidos();
        int IDPedido = Integer.parseInt(cmb_IDPedido.getSelectedItem().toString());
        
        p.setIdpedido(IDPedido);
        
        int res = p.ExcluirPed();
        if(res == 1){
           showMessageDialog(null, "Excluido com sucesso!");
       }
    }//GEN-LAST:event_btn_DeletarActionPerformed

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
            java.util.logging.Logger.getLogger(ControlePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlePedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Alterar;
    private javax.swing.JButton btn_Criar;
    private javax.swing.JButton btn_Deletar;
    private javax.swing.JButton btn_Novo;
    private javax.swing.JButton btn_Status;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JComboBox<String> cmb_IDPedido;
    private javax.swing.JComboBox<String> cmb_IDSabor;
    private java.awt.Label label1;
    private javax.swing.JLabel lbl_End;
    private javax.swing.JLabel lbl_Entre;
    private javax.swing.JLabel lbl_HF;
    private javax.swing.JLabel lbl_HI;
    private javax.swing.JLabel lbl_IDsabor;
    private javax.swing.JLabel lbl_Nome;
    private javax.swing.JLabel lbl_Nota;
    private javax.swing.JLabel lbl_Obs;
    private javax.swing.JLabel lbl_Ped;
    private javax.swing.JLabel lbl_Preco;
    private javax.swing.JLabel lbl_PrecoIndicado;
    private javax.swing.JLabel lbl_Sabor;
    private javax.swing.JLabel lbl_Status;
    private javax.swing.JLabel lbl_Tel;
    private javax.swing.JLabel lbl_plac;
    private javax.swing.JLabel lbl_qtd;
    private javax.swing.JTextField txt_Endereco;
    private javax.swing.JTextField txt_Entrega;
    private javax.swing.JFormattedTextField txt_HoraF;
    private javax.swing.JFormattedTextField txt_HoraI;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_Nota;
    private javax.swing.JTextField txt_Obs;
    private javax.swing.JTextField txt_Placa;
    private javax.swing.JTextField txt_Preco;
    private javax.swing.JTextField txt_PrecoQTD;
    private javax.swing.JTextField txt_QTD;
    private javax.swing.JTextField txt_Sabor;
    private javax.swing.JTextField txt_Status;
    private javax.swing.JTextField txt_Tel;
    // End of variables declaration//GEN-END:variables
}
