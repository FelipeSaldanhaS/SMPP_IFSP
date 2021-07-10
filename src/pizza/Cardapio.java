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
public class Cardapio {

    public int getIdsabor() {
        return idsabor;
    }

    public void setIdsabor(int idsabor) {
        this.idsabor = idsabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    private int idsabor;
    private String sabor;
    private double preco;
    private Connection conn;
    
    Cardapio(){
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
    
    public int IncluirItemCardapio(){
        int res = 0;
        return res;
    }
    
    public int ExcluirItemCardapio(){
        int res = 0;
        return res;
    }
    
    public int AlterarItemCardapio(){
        int res = 0;
        return res;
    }
    
}
