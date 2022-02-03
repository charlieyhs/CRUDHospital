
package ServerClient;

import datos.Conexion;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import dominios.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <p>Clase Java para hello complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="hello">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Carlos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hello", propOrder = {
    "carlos"
})
public class Hello {

    @XmlElement(name = "Carlos")
    private final String  SQL_SELECT_MEDICOS = "SELECT * FROM medicos";
    private final String  SQL_SELECT_PACIENTES = "SELECT * FROM paciente";
    private Connection conexionTransaccional;
    
    public List<Medico> mostrarMedicos() throws SQLException{
        Connection cone = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Medico objetoMedico = null;
        List<Medico> Listapersonas = new ArrayList<Medico>();

        try {
            cone = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = cone.prepareStatement(SQL_SELECT_MEDICOS);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String CodigoTarjetaProfesional = rs.getString("CodigoTarjetaProfesional");
                String Especialidad = rs.getString("Especialidad");
                int experiencia = rs.getInt("AñosExperiencia");
                String consultorio = rs.getString("Consultorio");
                String domicilio = rs.getString("Domicilio");
                
                objetoMedico = new Medico();
                objetoMedico.setCodigoTarjetaProfesional(CodigoTarjetaProfesional);
                objetoMedico.setEspecialidad(Especialidad);
                objetoMedico.setAniosExperiencia(experiencia);
                objetoMedico.setConsultorio(consultorio);
                objetoMedico.setDomicilio(domicilio);
                
                Listapersonas.add(objetoMedico);
            }
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(cone);
            }

        }
        return Listapersonas;
    }

    public List<Paciente> mostrarPacientes() throws SQLException{
        Connection cone = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Paciente objetoPaciente = null;
        List<Paciente> Listapersonas = new ArrayList<Paciente>();

        try {
            cone = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = cone.prepareStatement(SQL_SELECT_PACIENTES);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String nombres = rs.getString("Nombres");
                String apellidos = rs.getString("Apellidos");
                Date fechaNacimiento = rs.getDate("FechaNacimiento");
                String identificacion = rs.getString("Identificacion");
                String medico = rs.getString("Medico");
                String tratamiento = rs.getString("Tratamiento");
                Double cuotaModeradora = rs.getDouble("CuotaModeradora");
                Date fechaHoraNuevaCita = rs.getDate("FechaHoraNuevaCita");
                String firmaPaciente = rs.getString("FirmaPaciente");
                String fechaLlegadaCita = rs.getString("FechaLlegadaCita");
                
                
                objetoPaciente = new Paciente();
                
                objetoPaciente.setNombres(nombres);
                objetoPaciente.setApellidos(apellidos);
                objetoPaciente.setFechaNacimiento(fechaNacimiento);
                objetoPaciente.setIdentificacion(identificacion);
                objetoPaciente.setMedicoAsignado(medico);
                objetoPaciente.setTratamiento(tratamiento);
                objetoPaciente.setCuotaModeradora(cuotaModeradora);
                objetoPaciente.setFechaNuevaCita(fechaHoraNuevaCita);
                objetoPaciente.setFirmaPaciente(firmaPaciente);
                objetoPaciente.setFechaLlegadaCita(fechaLlegadaCita);
                
                
                Listapersonas.add(objetoPaciente);
            }
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(cone);
            }

        }
        return Listapersonas;
    }

}

