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
public class Gerente extends Funcionario {
    @Override
    public int AlterarFunc(){
       int res = 0;        
        String sql = "update loginfuncionario set senha = MD5(?), tipo = ?, cpf = ?, idfunc = ?, nome = ?, endereco = ?, telefone = ?, email = ? WHERE idfunc = ?";
            try(PreparedStatement preparedStatement = Funcionario.conn.prepareStatement(sql)){
			preparedStatement.setString(1, getSenha());
			preparedStatement.setInt(2, getTipo());
			preparedStatement.setString(3, getCpf());
			preparedStatement.setInt(4, getIdfunc());
                        preparedStatement.setString(5, getNome());
                        preparedStatement.setString(6, getEndereco());
                        preparedStatement.setString(7, getTelefone());
                        preparedStatement.setString(8, getEmail());
                        preparedStatement.setInt(9, getIdfunc());
			preparedStatement.execute();
                        res = 1;
                        preparedStatement.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
        
        
        return res;
    }    
}
