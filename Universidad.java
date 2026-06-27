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
        this.estudiantes = new Estudiante[10];
        this.trabajadores = new Trabajador[15];
        this.departamentos = new Departamento[4];
    }



    public void registrarestudiante(Estudiante estudiante) {
        if (this.numestudiantes < this.estudiantes.length) {
            this.estudiantes[this.numestudiantes] = estudiante;
            this.numestudiantes++;
            System.out.println("Estudiante registrado: " + estudiante.getNombre());
        }
    }

    public void contratartrabajador(Trabajador trabajador) {
        if (this.numtrabajadores < this.trabajadores.length) {
            this.trabajadores[this.numtrabajadores] = trabajador;
            this.numtrabajadores++;
            System.out.println("Trabajador contratado: " + trabajador.getNombre());
        }
    }
    public int buscarEstudianteRecursivo(Estudiante estudiante, int indice) {
        if (indice >= this.numestudiantes || this.estudiantes[indice] == null) {
            return -1;
        }
        if (this.estudiantes[indice].equals(estudiante)) {
            return indice;
        }
        return buscarEstudianteRecursivo(estudiante, indice + 1);
    }

    public int buscarTrabajadorRecursivo(Trabajador trabajador, int indice) {
        if (indice >= this.numtrabajadores || this.trabajadores[indice] == null) {
            return -1;
        }
        if (this.trabajadores[indice].equals(trabajador)) {
            return indice;
        }
        return buscarTrabajadorRecursivo(trabajador, indice + 1);
    }

    public int buscarDepartamentoRecursivo(Departamento departamento, int indice) {
        if (indice >= this.departamentos.length || this.departamentos[indice] == null) {
            return -1;
        }
        if (this.departamentos[indice].equals(departamento)) {
            return indice;
        }
        return buscarDepartamentoRecursivo(departamento, indice + 1);
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