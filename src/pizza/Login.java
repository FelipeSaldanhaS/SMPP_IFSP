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
import java.security.*;
import java.math.*;

/**
 *
 * @author fefes
 */
public class Login {
    static int idfunc;
    static int tipoFunc;
    public Connection conn;
    
     Login(){
        
    }
    
    public int FazerLogin(int id, String senhaM){
        int res = 0;
        idfunc = id;
        try
        {
          String myDriver = "org.gjt.mm.mysql.Driver";
          String myUrl = "jdbc:mysql://localhost/pizzaria";
          Class.forName(myDriver);
          Connection conn = DriverManager.getConnection(myUrl, "root", "");
        

        
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.update(senhaM.getBytes(),0,senhaM.length());
        
        String senhaMD5 = new BigInteger(1,m.digest()).toString(16);
        
        String query = "SELECT * FROM loginfuncionario WHERE idfunc = "+id+"";
        
        Statement st = conn.createStatement();
        
        ResultSet rs = st.executeQuery(query);
        
        rs.next();
        
        
        if((rs.getInt("idfunc") == id) &&(rs.getString("senha").equals(senhaMD5))){
            tipoFunc = rs.getInt("tipo");
            if(rs.getInt("tipo") == 1){
                res = 1;
            }
            else if(rs.getInt("tipo") == 2){
                res = 2;
            }
             else if(rs.getInt("tipo") == 3){
                res = 3;
            }
            else{
                res = 0;
                System.out.print("Erro, tipo invalido para esse sistema!");
            }
        }
        rs.close();
        }
        catch (Exception e)
        {
          System.err.println("Erro! ");
          System.err.println(e.getMessage());
        } 
        
        return res;
    }
    
}
