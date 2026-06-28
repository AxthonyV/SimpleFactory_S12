package pe.edu.upao.patrones.simplefactory;

public class SimpleLaptopFactory {

    public Laptop crearLaptop(String tipo) {
        Laptop laptop = null;

        if (tipo.equals("gamer")) {
            laptop = new LaptopGamer();
        } else if (tipo.equals("basica")) {
            laptop = new LaptopBasica();
        } else if (tipo.equals("profesional")) {
            laptop = new LaptopProfesional();
        }

        return laptop;
    }
}
