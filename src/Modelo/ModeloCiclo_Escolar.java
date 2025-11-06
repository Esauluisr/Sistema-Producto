package Modelo;

import Conexion.conexion;
import Entidades.Ciclo_Escolar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ModeloCiclo_Escolar {
        public ArrayList<Ciclo_Escolar>getCiclo_Escolar(){
        conexion conn = new conexion();
        Connection con = conn.Conectar();
        Statement stmt=null;
        ResultSet rs=null;
        ArrayList<Ciclo_Escolar> listaCiclos = new ArrayList<>();
        try {
            stmt=con.createStatement();
            rs=stmt.executeQuery("select distinct substring(Ciclo_Escolar,1,12) as Ciclo_Escolar from semestres");
            while(rs.next())
            {
              Ciclo_Escolar ciclo = new Ciclo_Escolar();
              ciclo.setCiclos_Escolares(rs.getString("Ciclo_Escolar"));
              listaCiclos.add(ciclo);
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
        return listaCiclos;
    }
}