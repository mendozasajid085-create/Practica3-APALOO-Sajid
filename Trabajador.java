import java.time.LocalDate;
import java.time.Period;

public class Trabajador extends Persona {
    private LocalDate fechaingreso;
    private double salario;
    private String puesto;
    private CuentaCorriente cuentacorriente; 

    public Trabajador(String nombre, LocalDate fechanacimiento, String direccion, LocalDate fechaingreso, double salario, String puesto) {
        super(nombre, fechanacimiento, direccion);
        this.fechaingreso = fechaingreso;
        this.salario = salario;
        this.puesto = puesto;
        this.cuentacorriente = null; 
    }

    public int calcularantiguedad() {
        return Period.between(this.fechaingreso, LocalDate.now()).getYears();
    }

    public void solicitarvacaciones() {
        System.out.println(this.getNombre() + " ha solicitado vacaciones.");
    }

    public void setFechaingreso(LocalDate fechaingreso) { this.fechaingreso = fechaingreso; }
    public LocalDate getFechaingreso() { return fechaingreso; }
    
    public void setSalario(double salario) { this.salario = salario; }
    public double getSalario() { return salario; }

    public void setPuesto(String puesto) { this.puesto = puesto; }
    public String getPuesto() { return puesto; }

    public void setCuentacorriente(CuentaCorriente cuentacorriente) { this.cuentacorriente = cuentacorriente; }
    public CuentaCorriente getCuentacorriente() { return cuentacorriente; }
}