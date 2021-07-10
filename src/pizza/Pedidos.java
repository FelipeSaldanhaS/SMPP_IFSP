/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fefes
 */
public class Pedidos {

    /**
     * @return the idpedido
     */
    public int getIdpedido() {
        return idpedido;
    }

    /**
     * @param idpedido the idpedido to set
     */
    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    /**
     * @return the id_sabor
     */
    public int getId_sabor() {
        return id_sabor;
    }

    /**
     * @param id_sabor the id_sabor to set
     */
    public void setId_sabor(int id_sabor) {
        this.id_sabor = id_sabor;
    }

    /**
     * @return the id_func
     */
    public int getId_func() {
        return id_func;
    }

    /**
     * @param id_func the id_func to set
     */
    public void setId_func(int id_func) {
        this.id_func = id_func;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the nome_cliente
     */
    public String getNome_cliente() {
        return nome_cliente;
    }

    /**
     * @param nome_cliente the nome_cliente to set
     */
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    /**
     * @return the statusped
     */
    public String getStatusped() {
        return statusped;
    }

    /**
     * @param statusped the statusped to set
     */
    public void setStatusped(String statusped) {
        this.statusped = statusped;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the nota_fiscal
     */
    public String getNota_fiscal() {
        return nota_fiscal;
    }

    /**
     * @param nota_fiscal the nota_fiscal to set
     */
    public void setNota_fiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    /**
     * @return the hora_inicial
     */
    public String getHora_inicial() {
        return hora_inicial;
    }

    /**
     * @param hora_inicial the hora_inicial to set
     */
    public void setHora_inicial(String hora_inicial) {
        this.hora_inicial = hora_inicial;
    }

    /**
     * @return the hora_final
     */
    public String getHora_final() {
        return hora_final;
    }

    /**
     * @param hora_final the hora_final to set
     */
    public void setHora_final(String hora_final) {
        this.hora_final = hora_final;
    }
    private int idpedido, id_sabor, id_func;
    private double preco;
    private String observacao, telefone, nome_cliente, statusped, placa, endereco, nota_fiscal;
    private String hora_inicial, hora_final;
    private Connection conn;
    
    Pedidos(){
         try{
          String myDriver = "org.gjt.mm.mysql.Driver";
          String myUrl = "jdbc:mysql://localhost/pizzaria";
          Class.forName(myDriver);
          this.conn = DriverManager.getConnection(myUrl, "root", "");
               
      
        }catch(Exception e){
          System.err.println("Erro! ");
          System.err.println(e.getMessage());
        }
    }
    
    public int AlterarPed(){
       int res = 0;        
        String sql = "update pedidos set idpedido = ?, id_sabor = ?, id_func = ?, preco = ?, observacao = ?, telefone = ?, nome_cliente, hora_inicial = ?, hora_final = ?, nota_fiscal = ?, statusped = ?, placa = ?, endereco = ?";
            try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
			preparedStatement.setInt(1, this.idpedido);
			preparedStatement.setInt(2, this.id_sabor);
			preparedStatement.setInt(3, this.id_func);
			preparedStatement.setDouble(4, this.preco);
                        preparedStatement.setString(5, this.observacao);
                        preparedStatement.setString(6, this.telefone);
                        preparedStatement.setString(7, this.nome_cliente);
                        preparedStatement.setString(8, this.hora_inicial);
                        preparedStatement.setString(9, this.hora_final);
                        preparedStatement.setString(10, this.nota_fiscal);
                        preparedStatement.setString(11, this.statusped);
                        preparedStatement.setString(12, this.placa);
                        preparedStatement.setString(13, this.endereco);
			preparedStatement.execute();
                        res = 1;
                        preparedStatement.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
        
        
        return res;
    }
    
    public int CriarPed(){
         int res = 0;        
        String sql = "insert into pedidos (id_sabor, id_func, preco, observacao, telefone, nome_cliente, hora_inicial, hora_final, nota_fiscal, statusped, placa, endereco)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
			preparedStatement.setInt(1, this.idpedido);
			preparedStatement.setInt(2, this.id_sabor);
			preparedStatement.setInt(3, this.id_func);
			preparedStatement.setDouble(4, this.preco);
                        preparedStatement.setString(5, this.observacao);
                        preparedStatement.setString(6, this.telefone);
                        preparedStatement.setString(7, this.nome_cliente);
                        preparedStatement.setString(8, this.hora_inicial);
                        preparedStatement.setString(9, this.hora_final);
                        preparedStatement.setString(10, this.nota_fiscal);
                        preparedStatement.setString(11, this.statusped);
                        preparedStatement.setString(12, this.placa);
                        preparedStatement.setString(13, this.endereco);
			preparedStatement.execute();
                        res = 1;
                        preparedStatement.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
        
        
        return res;
    }
    
    public int ExcluirPed(){
        int res = 0;
        String sql = "delete from pedidos where idpedido = ?";
        try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
            preparedStatement.setInt(1, this.idpedido);
            preparedStatement.execute();
            res = 1;
            preparedStatement.close();
        }catch (SQLException e) {
		e.printStackTrace();
	}
        return res;
    }
    
    public void Sair(){
        
    }
}
