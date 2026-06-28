package pe.edu.upao.patrones.simplefactory;

public abstract class Laptop {

    private String marcaYModelo;
    private int anioDeFabricacion;
    private String procesador;
    private int tamanoDePantalla;

    public Laptop(String marcaYModelo, int anioDeFabricacion,
                  String procesador, int tamanoDePantalla) {
        this.marcaYModelo = marcaYModelo;
        this.anioDeFabricacion = anioDeFabricacion;
        this.procesador = procesador;
        this.tamanoDePantalla = tamanoDePantalla;
    }

    public abstract void ejecutarPrueba();
    public void mostrarInformacion() {
        System.out.println("Marca y Modelo: " + marcaYModelo);
        System.out.println("Año de Fabricacion: " + anioDeFabricacion);
        System.out.println("Procesador: " + procesador);
        System.out.println("Tamaño de la Pantalla: " + tamanoDePantalla);
    }

    public String getMarcaYModelo() { return marcaYModelo; }
    public void setMarcaYModelo(String marcaYModelo) { this.marcaYModelo = marcaYModelo; }
    public int getAnioDeFabricacion() { return anioDeFabricacion; }
    public void setAnioDeFabricacion(int anioDeFabricacion) { this.anioDeFabricacion = anioDeFabricacion; }
    public String getProcesador() { return procesador; }
    public void setProcesador(String procesador) { this.procesador = procesador; }
    public int getTamanoDePantalla() { return tamanoDePantalla; }
    public void setTamanoDePantalla(int tamanoDePantalla) { this.tamanoDePantalla = tamanoDePantalla; }
}
