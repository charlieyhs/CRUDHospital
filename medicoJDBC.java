package datos;

import dominios.Medico;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class medicoJDBC {
    
    private Connection conexionTransaccional;
    
    private static final String SQL_SELECT = "SELECT * FROM medicos";
    private static final String SQL_INSERT = "INSERT INTO medicos(CodigoTarjetaProfesional, Especialidad,AñosExperiencia,Consultorio,Domicilio) VALUES(?,?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM medicos WHERE CodigoTarjetaProfesional=?";
    private static final String SQL_UPDATE = "UPDATE medicos SET Especialidad=?, AñosExperiencia=?, Consultorio=?, Domicilio=? WHERE CodigoTarjetaProfesional=?";

    public medicoJDBC() {
    }
    public medicoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }
    
    public int insert(Medico medico) throws SQLException {
        Connection conexion = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conexion = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conexion.prepareStatement(SQL_INSERT);
            stmt.setString(1, medico.getCodigoTarjetaProfesional());
            stmt.setString(2, medico.getEspecialidad());
            stmt.setInt(3, medico.getAniosExperiencia());
            stmt.setString(4, medico.getConsultorio());
            stmt.setString(5, medico.getDomicilio());
            
            System.out.println("Ejecutando query: " + SQL_INSERT);
            stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);

        }finally {
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conexion);
            }
        }
        return rows;
    }
    public int update(Medico medico) throws SQLException {

        Connection conexion = null;
        PreparedStatement stmt = null;
        int rows = 0;
        //UPDATE medicos SET Especialidad=? AñosExperiencia=? Consultorio=? Domicilio=? WHERE CodigoTarjetaProfesional=?";
        try {
            conexion = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("Ejecutando Query: " + SQL_UPDATE);
            stmt = conexion.prepareStatement(SQL_UPDATE);
            stmt.setString(1, medico.getEspecialidad());
            stmt.setInt(2, medico.getAniosExperiencia());
            stmt.setString(3, medico.getConsultorio());
            stmt.setString(4,medico.getDomicilio());
            stmt.setString(5, medico.getCodigoTarjetaProfesional());
            
            rows = stmt.executeUpdate();            

        }finally {
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conexion);
            }
        }
        return rows;
    }

    public int delete(Medico medico) throws SQLException {
        Connection conexion = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conexion = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_DELETE);
            stmt = conexion.prepareStatement(SQL_DELETE);
            stmt.setString(1, medico.getCodigoTarjetaProfesional());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados: " + rows);
        }finally {
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conexion);
            }
        }
        return rows;

    }
}
