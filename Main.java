import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad("UAM", "CDMX", 1973);
        Departamento depto = new Departamento("Ciencias Básicas", "CB01", "Edificio T", 10);

        EstudianteGrado est1 = new EstudianteGrado("Axel", LocalDate.of(2007, 5, 11), "Calle Arabella", "220101", 9.5, LocalDate.of(2021, 8, 1), "Tesis", 310, true);
        
        Doctor doc = new Doctor("Sistemas Computacionales", "UNAM", 2024);
        PDI prof1 = new PDI("Dr. Alejandro", LocalDate.of(1980, 2, 10), "Av Central", LocalDate.of(2010, 1, 15), 25000, "Titular", "A", "Programación", 20, doc);

        uni.registrarestudiante(est1);
        uni.contratartrabajador(prof1);
        depto.asignarprofesor(prof1);
        
        System.out.println("Beca de Emmanuel: $" + est1.calcularbeca());
        est1.solicitartitulacion();
        prof1.investigar("Inteligencia Artificial");
    }
}