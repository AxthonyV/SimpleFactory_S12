package pe.edu.upao.patrones.simplefactory;

public class LaptopGamer extends Laptop {

    public LaptopGamer() {
        super("HP Victus", 2017, "Ryzen 7", 13);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop para Gamer");
        System.out.println("Laptop para Gamer");
        mostrarInformacion();
    }
}
