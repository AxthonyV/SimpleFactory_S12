package pe.edu.upao.patrones.simplefactory;

public class LaptopBasica extends Laptop {

    public LaptopBasica() {
        super("Thinkpad", 2020, "intel core i5", 14);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Basica");
        System.out.println("Laptop Basica");
        mostrarInformacion();
    }
}
