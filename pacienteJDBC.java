
package datos;


import dominios.Paciente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class pacienteJDBC {
    
    private Connection conexionTransaccional;
    
    private static final String SQL_SELECT = "SELECT * FROM paciente";
    private static final String SQL_INSERT = "INSERT INTO paciente(Nombres,Apellidos,FechaNacimiento,Identificacion,Medico,Tratamiento, cuotaModeradora,FechaHoraNuevaCita) VALUES(?,?,?,?,?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM paciente WHERE Identificacion=?";
    private static final String SQL_UPDATE = "UPDATE paciente SET Nombres=?, Apellidos=?, FechaNacimiento=?, Medico=?, Tratamiento=?, CuotaModeradora=?, FechaHoraNuevaCita=? WHERE Identificacion=?";
    private static final String SQL_UPDATE_FIRMA = "UPDATE paciente set FirmaPaciente=?,FechaLlegadaCita=? WHERE Identificacion=? AND Medico =?";
    public pacienteJDBC() {
    }
    public pacienteJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }
    public void insertWhere(Paciente objetoPaciente) throws SQLException{
        Connection conexion = null;
        PreparedStatement stmt = null;
        try{
            conexion = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conexion.prepareStatement(SQL_UPDATE_FIRMA);
        
            stmt.setString(1,objetoPaciente.getFirmaPaciente());
            stmt.setString(2,objetoPaciente.getFechaLlegadaCita());
            stmt.setString(3,objetoPaciente.getIdentificacion());
            stmt.setString(4,objetoPaciente.getMedicoAsignado());
            
            stmt.executeUpdate();
        }finally{
            Conexion.close(stmt);
            
            if (this.conexionTransaccional == null) {
                Conexion.close(conexion);
            }
        }
        
    }
    public int insert(Paciente objetoPaciente) throws SQLException {
        Connection conexion = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conexion = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conexion.prepareStatement(SQL_INSERT);
            stmt.setString(1,objetoPaciente.getNombres() );
            stmt.setString(2,objetoPaciente.getApellidos());
            stmt.setDate(3,objetoPaciente.getFechaNacimiento());
            stmt.setString(4,objetoPaciente.getIdentificacion());
            stmt.setString(5,objetoPaciente.getMedicoAsignado());
            stmt.setString(6,objetoPaciente.getTratamiento());
            stmt.setDouble(7,objetoPaciente.getCuotaModeradora());
            stmt.setDate(8,objetoPaciente.getFechaNuevaCita());
            
            
            stmt.executeUpdate();
            

        }finally {
            Conexion.close(stmt);
            
            if (this.conexionTransaccional == null) {
                Conexion.close(conexion);
            }
        }
        return rows;
    }
    public int update(Paciente objetoPaciente) throws SQLException {

        Connection conexion = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conexion = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("Ejecutando Query: " + SQL_UPDATE);
            stmt = conexion.prepareStatement(SQL_UPDATE);
            stmt.setString(1,objetoPaciente.getNombres());
            stmt.setString(2,objetoPaciente.getApellidos());
            stmt.setDate(3,objetoPaciente.getFechaNacimiento());
            stmt.setString(4,objetoPaciente.getMedicoAsignado());
            stmt.setString(5,objetoPaciente.getTratamiento());
            stmt.setDouble(6,objetoPaciente.getCuotaModeradora());
            stmt.setDate(7,objetoPaciente.getFechaNuevaCita());
            stmt.setString(8,objetoPaciente.getIdentificacion());

            rows = stmt.executeUpdate();
            System.out.println("Registros Actualizados: " + rows);

        }finally {
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conexion);
            }
        }
        return rows;
    }

    public int delete(Paciente objetoPaciente) throws SQLException {
        Connection conexion = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conexion = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_DELETE);
            stmt = conexion.prepareStatement(SQL_DELETE);
            stmt.setString(1, objetoPaciente.getIdentificacion());
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
