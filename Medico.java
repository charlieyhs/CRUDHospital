package dominios;


public class Medico {
    private String codigoTarjetaProfesional;
    private String especialidad;
    private int aniosExperiencia;
    private String consultorio;
    private String domicilio;

    public String getCodigoTarjetaProfesional() {
        return codigoTarjetaProfesional;
    }

    public void setCodigoTarjetaProfesional(String codigoTarjetaProfesional) {
        this.codigoTarjetaProfesional = codigoTarjetaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Medico{" + "codigoTarjetaProfesional=" + codigoTarjetaProfesional + ", especialidad=" + especialidad + ", a\u00f1osExperiencia=" + aniosExperiencia + ", consultorio=" + consultorio + ", domicilio=" + domicilio + '}';
    }
    
    
    
}
