import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private  String nombre;
    private  LocalDate fechanacimiento;
    private  String direccion;

    public Persona(String nombre, LocalDate fechanacimiento, String direccion) {
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.direccion = direccion;
    }

    public boolean esAdultoMayor() {
        return obtenerEdad() >= 60;
    }

    public int obtenerEdad() {
        return Period.between(this.fechanacimiento, LocalDate.now()).getYears();
    }
    //Getters y setters

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public LocalDate getFechaNacimiento() { return fechanacimiento; }
    public void setFechaNacimiento(LocalDate fechanacimiento) { this.fechanacimiento = fechanacimiento; }
    
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + obtenerEdad() + ", direccion=" + direccion + "]";
    }
}