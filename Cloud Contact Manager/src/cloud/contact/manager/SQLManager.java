/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cloud.contact.manager;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author djack
 */
public class SQLManager {
    
    public static final String URL = "jdbc:mysql://localhost:3309/isunah_prog2";
    public static final String USER = "root";
    public static final String CLAVE = "1234";
    
    public Connection conexion()
    {
        Connection con = null;
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
           //System.out.println("Conectado");
        } catch (Exception e) {
            //System.out.println("No Conectado");
            JOptionPane.showMessageDialog(null,"Error al conectar al servidor debido a "+ e.getMessage());
        }
        return con;
    }
    
    public void querys(String query)
    {
        try
        {
            PreparedStatement state= conexion().prepareStatement(query);
            state.execute();
        }
        catch(Exception e)
        {
            
        }
    }

}
