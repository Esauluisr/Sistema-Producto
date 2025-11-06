package Modelo;

import Conexion.conexion;
import Entidades.Empleados;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ModeloEmpleados {
    
    
        public ArrayList<Empleados>getEmpleados(){
        conexion conn = new conexion();
        Connection con = conn.Conectar();
        Statement stmt=null;
        ResultSet rs=null;
        ArrayList<Empleados> listaEmpleados = new ArrayList<>();
        try {
            stmt=con.createStatement();
            rs=stmt.executeQuery("select nombre_empleado from horario_semestre");
            while(rs.next())
            {
              Empleados empleado = new Empleados();
              empleado.setNombres(rs.getString("nombre_empleado"));
              listaEmpleados.add(empleado);
            }
        } catch (SQLException ex) {
            
        }            finally {
            try {
                // Cerrar ResultSet, PreparedStatement y Connection en el orden adecuado
                if (rs != null) {
                    rs.close();
                }
                if(stmt != null) {
                   stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return listaEmpleados;
    }
}