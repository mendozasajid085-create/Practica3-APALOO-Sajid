public class PAS extends Trabajador {
    private String area;
    private int nivel;
    private String turno;

    public PAS(String nombre, LocalDate fechanacimiento, String direccion, LocalDate fechaingreso, double salario, String puesto, String area, int nivel, String turno) {
        super(nombre, fechanacimiento, direccion, fechaingreso, salario, puesto);
        this.area = area;
        this.nivel = nivel;
        this.turno = turno;
    }

    public void administrarrecursos() {
        System.out.println("Administrando recursos del área: " + this.area);
    }

    public void generarreporte() {
        System.out.println("Generando reporte del personal del área " + this.area);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}