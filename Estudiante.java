import java.time.LocalDate;

public class Estudiante extends Persona {
    private String matricula;
    private double promedio;
    private LocalDate fechaingreso;

    public Estudiante(String nombre, LocalDate fechanacimiento, String direccion, String matricula, double promedio, LocalDate fechaingreso) {
        super(nombre, fechanacimiento, direccion);
        this.matricula = matricula;
        this.promedio = promedio;
        this.fechaingreso = fechaingreso;
    }

    public void inscribirmateria(String materia) {
        System.out.println("Inscripción realizada. El estudiante " + this.getnombre() + " se inscribió a la materia: " + materia);
    }

    public double calcularbeca() {
        if (this.promedio >= 9.0) {
            return 3000.0;
        } else if (this.promedio >= 8.0 && this.promedio < 9.0) {
            return 2000.0;
        } else {
            return 1000.0;
        }
    }

    //Getters y setters
    public void setMatricula(String matricula){this.matricula=matricula;}
    public String getMatricula(){return matricula;}

    public void setPromedio(double promedio){this.promedio=promedio;}
    public double getPromedio(){return promedio;}

    public void setFechaIngreso(LocalDate fechaingreso){this.fechaingreso=fechaingreso;}
    public LocalDate getFechaIngreso(){return fechaingreso;}


}