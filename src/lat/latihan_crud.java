/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat;
import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author awidia
 */

public class latihan_crud {
     private static Connection connection;
    public static Connection getConnection(){
        if (connection==null){
        try {
            String url = "jdbc:mysql://3306/latihan_crud";
            String user = "root";
            String pass = "";
            
             MysqlDataSource source = new MysqlDataSource();
                source.setUser(user);
                source.setPassword(pass);
                source.setURL(url);

            connection = source.getConnection();
           } catch (SQLException ex){
                System.out.println("Error koneksi database");
        }
 }
        return connection;
    }
}
