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
public class Funcionario {
    
    public int getIdfunc() {
        return idfunc;
    }

    public void setIdfunc(int idfunc) {
        this.idfunc = idfunc;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
     public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    private int idfunc, tipo;
    private String cpf, nome, endereco, email, senha, telefone;
    static Connection conn;
    
    Funcionario() {
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
    
    public int AlterarFunc(){
       int res = 0;        
        String sql = "update loginfuncionario set senha = MD5(?), cpf = ?, idfunc = ?, nome = ?, endereco = ?, telefone = ?, email = ? WHERE idfunc = ?";
            try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
			preparedStatement.setString(1, this.senha);
			preparedStatement.setString(2, this.cpf);
			preparedStatement.setInt(3, this.idfunc);
                        preparedStatement.setString(4, this.nome);
                        preparedStatement.setString(5, this.endereco);
                        preparedStatement.setString(6, this.telefone);
                        preparedStatement.setString(7, this.getEmail());
                        preparedStatement.setInt(8, this.idfunc);
			preparedStatement.execute();
                        res = 1;
                        preparedStatement.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
        
        
        return res;
    }
    
    public int CriarFunc(){
        int res = 0;
        String sql = "insert into loginfuncionario(senha,tipo,cpf,idfunc,nome,endereco,telefone,email)values(MD5(?),?,?,?,?,?,?,?)";
        try(PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
			
			preparedStatement.setString(1, this.senha);
			preparedStatement.setInt(2, this.tipo);
			preparedStatement.setString(3, this.cpf);
			preparedStatement.setInt(4, this.idfunc);
                        preparedStatement.setString(5, this.nome);
                        preparedStatement.setString(6, this.endereco);
                        preparedStatement.setString(7, this.telefone);
                        preparedStatement.setString(8, this.getEmail());
			//executando comando sql
			
			preparedStatement.execute();
                        res = 1;
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
                        System.err.println(e.getMessage());
		}
        
        
        return res;
    }
    

    public int ExcluirFunc(){
        int res = 0;
        String sql = "delete from loginfuncionario where idfunc = ?";
        try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
            preparedStatement.setInt(1, this.idfunc);
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
