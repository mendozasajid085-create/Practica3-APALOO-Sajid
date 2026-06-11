public class Universidad {
    private String nombre;
    private String ciudad;
    private int fundacion;
    
    private Estudiante[] estudiantes;
    private Trabajador[] trabajadores;
    private Departamento[] departamentos;
    
    private int numestudiantes = 0;
    private int numtrabajadores = 0;

    public Universidad(String nombre, String ciudad, int fundacion) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fundacion = fundacion;
        this.estudiantes = new Estudiante[1000]; // Capacidades de ejemplo
        this.trabajadores = new Trabajador[500];
        this.departamentos = new Departamento[20];
    }

    public void registrarestudiante(Estudiante estudiante) {
        if (this.numestudiantes < this.estudiantes.length) {
            this.estudiantes[this.numestudiantes] = estudiante;
            this.numestudiantes++;
            System.out.println("Estudiante registrado: " + estudiante.getnombre());
        }
    }

    public void contratartrabajador(Trabajador trabajador) {
        if (this.numtrabajadores < this.trabajadores.length) {
            this.trabajadores[this.numtrabajadores] = trabajador;
            this.numtrabajadores++;
            System.out.println("Trabajador contratado: " + trabajador.getnombre());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Trabajador[] getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(Trabajador[] trabajadores) {
        this.trabajadores = trabajadores;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }
}