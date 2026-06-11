public class Doctor {
    private String especialidad;
    private String universidad;
    private int anioobtencion;

    public Doctor(String especialidad, String universidad, int anioobtencion) {
        this.especialidad = especialidad;
        this.universidad = universidad;
        this.anioobtencion = anioobtencion;
    }

    public boolean validartitulo() {
        return true;
    }

    public void registrartitulo() {
        System.out.println("El título de doctor en " + especialidad + " ha sido registrado.");
    }
    //
    public void setEspecialidad (String especialidad){this.especialidad=especialidad;}
    public String getEspecialidad (){return especialidad;}

    public String getUniversidad() {return universidad;}
    public void setUniversidad(String universidad) {this.universidad = universidad;}

    public int getAnioobtencion() {return anioobtencion;}
    public void setAnioobtencion(int anioobtencion) {this.anioobtencion = anioobtencion;}
}