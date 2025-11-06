package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class conexion {
    
    //conexion con el servidor
    //private static final String URL = "jdbc:mysql://65.99.225.56/cbtised3_asistenciareloj";
    //private static final String USERNAME = "cbtised3_UrelojCheador";
    //private static final String PASSWORD = "#W_bMR3BA=F*";
    
    //conexion local
    private static final String URL = "jdbc:mysql://localhost:3306/almacencendi";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private Connection con = null;

    public Connection Conectar() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);

            //JOptionPane.showMessageDialog(null,"Se genero exitosamente");
            return con;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion no establecida " + e);
        }

        return con;

    }

    public PreparedStatement prepareStatement(String insert_into_registro_nombredirecciontelef) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
