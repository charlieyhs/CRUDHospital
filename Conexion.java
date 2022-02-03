package datos;

import java.sql.*;

public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost/hospital";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "root";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }
    
    public static void close(ResultSet re){
        try {
            re.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void close(PreparedStatement stat){
        try {
            stat.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void close(Connection con){
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
