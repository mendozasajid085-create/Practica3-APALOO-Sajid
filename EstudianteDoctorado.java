import java.time.LocalDate;

public class EstudianteDoctorado extends Estudiante {
    private String programa;
    private String tematesis;
    private String directortesis;

    public EstudianteDoctorado(String nombre, LocalDate fechanacimiento, String direccion, String matricula, double promedio, LocalDate fechaingreso, String programa, String tematesis, String directortesis) {
        super(nombre, fechanacimiento, direccion, matricula, promedio, fechaingreso);
        this.programa = programa;
        this.tematesis = tematesis;
        this.directortesis = directortesis;
    }

    public void realizartesis() {
        System.out.println("Trabajando en la tesis: '" + this.tematesis + "' bajo la dirección de " + this.directortesis);
    }

    public void publicararticulo() {
        System.out.println("El estudiante del programa " + this.programa + " ha enviado un artículo sobre " + this.tematesis);
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getTematesis() {
        return tematesis;
    }

    public void setTematesis(String tematesis) {
        this.tematesis = tematesis;
    }

    public String getDirectortesis() {
        return directortesis;
    }

    public void setDirectortesis(String directortesis) {
        this.directortesis = directortesis;
    }
}