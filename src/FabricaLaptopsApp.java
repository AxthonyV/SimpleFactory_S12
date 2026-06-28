package pe.edu.upao.patrones.simplefactory;

public class FabricaLaptopsApp {

    private SimpleLaptopFactory factory;

    public FabricaLaptopsApp(SimpleLaptopFactory factory) {
        this.factory = factory;
    }
    public void probarLaptop(String tipo) {
        Laptop laptop = factory.crearLaptop(tipo);
        if (laptop != null) {
            laptop.ejecutarPrueba();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SimpleLaptopFactory factory = new SimpleLaptopFactory();
        FabricaLaptopsApp app = new FabricaLaptopsApp(factory);

        System.out.println("BIENVENIDOS A LA FABRICA DE LAPTOPS");
        System.out.println();
        app.probarLaptop("gamer");
        app.probarLaptop("basica");
        app.probarLaptop("profesional");
    }
}
