public class App {
    public static void main(String[] args) throws Exception {

        Auto auto = new Auto ("Toyota", "Corolla", 2020, 1500, 5, "Gasolina");

        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 2000, 4);

        System.out.println("Información del Auto: ");
        auto.mostrarinfo();

        System.out.println("Mantenimiento del auto: ");
        auto.realizarMantenimiento();

        auto.CalcularcostoMantenimiento(0.5, 500.00);

        System.out.println("Información del Camion");
        camion.mostrarinfo();

        System.out.println("Mantenimiento del Camión: ");
        camion.realizarMantenimiento();

    }
}
