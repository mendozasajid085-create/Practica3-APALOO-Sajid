public class Departamento {
    private String nombre;
   private String codigo;
   private String ubicacion;
    private PDI[] profesores;
    private int numprofesores;

    public Departamento(String nombre, String codigo, String ubicacion, int capacidadprofesores) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.profesores = new PDI[capacidadprofesores];
        this.numprofesores = 0;
    }

    public void asignarprofesor(PDI profesor) {
        if (this.numprofesores < this.profesores.length) {
            this.profesores[this.numprofesores] = profesor;
            this.numprofesores++;
            System.out.println("Profesor " + profesor.getNombre() + " asignado al departamento " + this.nombre);
        } else {
            System.out.println("El departamento está lleno.");
        }
    }

    public void listarpersonal() {
        System.out.println("--- Personal del Departamento " + this.nombre + " ---");
        for (int i = 0; i < this.numprofesores; i++) {
            System.out.println(this.profesores[i].toString());
        }
    }

    public int buscarProfesorRecursivo(PDI profesor, int indice) {
        if (indice >= this.numprofesores || this.profesores[indice] == null) {
            return -1;
        }
        if (this.profesores[indice].equals(profesor)) {
            return indice;
        }
        return buscarProfesorRecursivo(profesor, indice + 1);
    }


    public void setNombre(String nombre){this.nombre=nombre;}
    public String getNombre(){return nombre;}

    public void setCodigo(String codigo){this.codigo=codigo;}
    public String getCodigo(){return codigo;}

    public void setUbicacion(String ubicacion){this.ubicacion=ubicacion;}
    public String getUbicacion(){return ubicacion;}

    public void setprofesores(PDI[] profesores){this.profesores=profesores;}
    public PDI[] getProfesores(){return profesores;}

}