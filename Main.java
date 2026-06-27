import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("INTEGRACIÓN: ESTUDIANTE Y CUENTA AHORRO");
        
        Estudiante estudianteuno = new Estudiante(
            "Axel Kevin", 
            LocalDate.of(2003, 5, 15), 
            "Calle Arabella 6767", 
            "MAT-202301", 
            9.2, 
            LocalDate.of(2023, 8, 1)
        );
        
        CuentaAhorro cuentaestudiante = new CuentaAhorro("AH-555666", 0.0, 10000.0, 4.5);
        
        estudianteuno.setCuentaahorro(cuentaestudiante);
        
        double montoBeca = estudianteuno.calcularbeca();
        System.out.println("El estudiante " + estudianteuno.getNombre() + " ha obtenido una beca de: $" + montoBeca);
        estudianteuno.getCuentaahorro().depositar(montoBeca);
        
        System.out.println("Saldo de " + estudianteuno.getNombre() + ": $" + estudianteuno.getCuentaahorro().consultarSaldo());
        
        System.out.println("\n=== PRUEBAS DE MEJORAS EN CUENTA DE AHORRO ===");
        System.out.println("Aplicando intereses al saldo...");
        estudianteuno.getCuentaahorro().aplicarInteres();
        System.out.println("Saldo de " + estudianteuno.getNombre() + " después de intereses: $" + estudianteuno.getCuentaahorro().consultarSaldo());

        System.out.println("Probando restricción de límite de retiro (Límite: $" + estudianteuno.getCuentaahorro().getMontoLimite() + "):");
        System.out.println("Intentando retirar $12,000.0...");
        estudianteuno.getCuentaahorro().retirar(12000.0);
        
        System.out.println("Intentando retirar $2,000.0...");
        estudianteuno.getCuentaahorro().retirar(2000.0);
        System.out.println("Saldo final de " + estudianteuno.getNombre() + ": $" + estudianteuno.getCuentaahorro().consultarSaldo());


        System.out.println("\n=== INTEGRACIÓN: TRABAJADOR Y CUENTA CORRIENTE ===");
        
        Trabajador trabajadoruno = new Trabajador(
            "Ana Gómez", 
            LocalDate.of(1985, 10, 20), 
            "Av. Central 456", 
            LocalDate.of(2015, 2, 1), 
            15000.0, 
            "Administrativo"
        );
        
        CuentaCorriente cuentatrabajador = new CuentaCorriente("CC-999888", 5000.0, 0.02);
        
        trabajadoruno.setCuentacorriente(cuentatrabajador);
        
        System.out.println("Pagando salario mensual a " + trabajadoruno.getNombre() + "...");
        trabajadoruno.getCuentacorriente().depositar(trabajadoruno.getSalario());
        
        trabajadoruno.getCuentacorriente().girarCheque(2000.0);

        System.out.println("\n=== PRUEBAS DE BÚSQUEDA RECURSIVA ===");
        
        Universidad universidad = new Universidad("Universidad Autonoma Metropolitana", "Unidad Iztapalapa", 1950);
        
        // Registrar estudiante y contratar trabajador
        universidad.registrarestudiante(estudianteuno);
        universidad.contratartrabajador(trabajadoruno);
        
        // Búsqueda de estudiante existente
        System.out.println("Buscando estudiante 'Axel Kevin'...");
        int posEstudiante = universidad.buscarEstudianteRecursivo(estudianteuno, 0);
        if (posEstudiante != -1) {
            System.out.println("Estudiante encontrado en la posición: " + posEstudiante);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
        
        // Búsqueda de trabajador existente
        System.out.println("Buscando trabajador 'Ana Gómez'...");
        int posTrabajador = universidad.buscarTrabajadorRecursivo(trabajadoruno, 0);
        if (posTrabajador != -1) {
            System.out.println("Trabajador encontrado en la posición: " + posTrabajador);
        } else {
            System.out.println("Trabajador no encontrado.");
        }
        
        // Búsqueda de estudiante inexistente
        Estudiante estudianteFalso = new Estudiante(
            "Juan Perez", 
            LocalDate.of(2000, 1, 1), 
            "Calle Falsa 123", 
            "MAT-999999", 
            8.5, 
            LocalDate.of(2023, 8, 1)
        );
        System.out.println("Buscando estudiante 'Juan Perez'...");
        int posFalso = universidad.buscarEstudianteRecursivo(estudianteFalso, 0);
        if (posFalso != -1) {
            System.out.println("Estudiante encontrado en la posición: " + posFalso);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }
}