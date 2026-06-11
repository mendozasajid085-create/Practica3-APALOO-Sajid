import java.time.LocalDate;

public class EstudianteGrado extends Estudiante {
    private String titulacion;
    private int creditos;
    private boolean serviciosocial;

    public EstudianteGrado(String nombre, LocalDate fechanacimiento, String direccion, String matricula, double promedio, LocalDate fechaingreso, String titulacion, int creditos, boolean serviciosocial) {
        super(nombre, fechanacimiento, direccion, matricula, promedio, fechaingreso);
        this.titulacion = titulacion;
        this.creditos = creditos;
        this.serviciosocial = serviciosocial;
    }

    public void realizarproyecto() {
        System.out.println("El estudiante " + this.getnombre() + " está desarrollando su proyecto de titulación en modalidad: " + this.titulacion);
    }

    public void solicitartitulacion() {
        if (this.serviciosocial && this.creditos >= 300) {
            System.out.println("Cumples los requisitos. Puedes iniciar el trámite de titulación.");
        } else {
            System.out.println("Te faltan requisitos. Servicio social: " + this.serviciosocial + ", Créditos: " + this.creditos + "/300");
        }
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public boolean isServiciosocial() {
        return serviciosocial;
    }

    public void setServiciosocial(boolean serviciosocial) {
        this.serviciosocial = serviciosocial;
    }
}