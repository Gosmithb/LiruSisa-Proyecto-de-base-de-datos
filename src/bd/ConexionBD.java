package bd;

import java.sql.*;

public class ConexionBD extends clases.Utilerias {

    public ResultSet rs;
    public Statement st;
    public Connection con;

    public ConexionBD() {
        try {
            this.con = null;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String user = "sa";
            String pass = "contramagica";
            String baseDatos = "LIRU_SISA";
            
            String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=" +
                    baseDatos + ";user=" + user + ";password=" + pass + ";";
            
            this.con = DriverManager.getConnection(connectionUrl);
            
            System.out.println("Se conectó la base de datos");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
