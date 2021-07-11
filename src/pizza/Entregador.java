/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author fefes
 */
public class Entregador extends Pedidos{
        
       @Override
       public int AlterarPed(){
       int res = 0;        
        String sql = "UPDATE pedidos SET hora_final = CURRENT_TIMESTAMP(), statusped = ? WHERE idpedido = ?";
            try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                        preparedStatement.setString(1, getStatusped());
                        preparedStatement.setInt(2, getIdpedido());
			preparedStatement.execute();
                        res = AlterarAposPed();
                        preparedStatement.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
        return res;
    }
    
}
