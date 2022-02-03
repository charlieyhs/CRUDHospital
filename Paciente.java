
package dominios;

import java.sql.Date;
        
public class Paciente {
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private String identificacion;
    private String medicoAsignado;
    private String tratamiento;
    private double cuotaModeradora;
    private Date fechaNuevaCita;
    private String firmaPaciente = "";
    private String fechaLlegadaCita = "";

    public String getFirmaPaciente() {
        return firmaPaciente;
    }

    public void setFirmaPaciente(String firmaPaciente) {
        this.firmaPaciente = firmaPaciente;
    }

    public String getFechaLlegadaCita() {
        return fechaLlegadaCita;
    }

    public void setFechaLlegadaCita(String fechaLlegadaCita) {
        this.fechaLlegadaCita = fechaLlegadaCita;
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getMedicoAsignado() {
        return medicoAsignado;
    }

    public void setMedicoAsignado(String medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public double getCuotaModeradora() {
        return cuotaModeradora;
    }

    public void setCuotaModeradora(double cuotaModeradora) {
        this.cuotaModeradora = cuotaModeradora;
    }

    public Date getFechaNuevaCita() {
        return fechaNuevaCita;
    }

    public void setFechaNuevaCita(Date fechaNuevaCita) {
        this.fechaNuevaCita = fechaNuevaCita;
    }

    @Override
    public String toString() {
        return "clientes{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + ", identificacion=" + identificacion + ", medicoAsignado=" + medicoAsignado + ", tratamiento=" + tratamiento + ", cuotaModeradora=" + cuotaModeradora + ", fechaNuevaCita=" + fechaNuevaCita + '}';
    }
    
    
}
