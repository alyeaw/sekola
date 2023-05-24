/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SMKN4 BANDUNG
 */
public class koneksi {
    private static Connection conn;
    public static Connection getConnection(){
        if(conn==null){
            try{
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                conn=DriverManager.getConnection("http://localhost/phpmyadmin/index.php?route=/database/structure&db=db_jual","root","");
            } catch (SQLException ex){
                Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
    return conn;
    }
    
}
