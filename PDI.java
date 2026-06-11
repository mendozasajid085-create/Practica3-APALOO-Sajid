import java.time.LocalDate;

public class PDI extends Trabajador {
    private String categoria;
    private String especialidad;
    private int horasdocencia;
    private Doctor doctor;

    public PDI(String nombre, LocalDate fechanacimiento, String direccion, LocalDate fechaingreso, double salario, String puesto, String categoria, String especialidad, int horasdocencia, Doctor doctor) {
        super(nombre, fechanacimiento, direccion, fechaingreso, salario, puesto);
        this.categoria = categoria;
        this.especialidad = especialidad;
        this.horasdocencia = horasdocencia;
        this.doctor = doctor; 
    }

    public void investigar(String tema) {
        System.out.println("El profesor " + this.getnombre() + " está realizando una investigación sobre: " + tema);
    }

    public void impartirclase() {
        System.out.println("El profesor " + this.getnombre() + " impartió clase. Tiene asignadas " + this.horasdocencia + " horas de docencia.");
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHorasdocencia() {
        return horasdocencia;
    }

    public void setHorasdocencia(int horasdocencia) {
        this.horasdocencia = horasdocencia;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}