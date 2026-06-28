package pe.edu.upao.patrones.simplefactory;

public class LaptopProfesional extends Laptop {

    public LaptopProfesional() {
        super("Macbook Pro", 2022, "Apple Silicon M2", 16);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Profesional");
        System.out.println("Laptop para Profesional");
        mostrarInformacion();
    }
}
