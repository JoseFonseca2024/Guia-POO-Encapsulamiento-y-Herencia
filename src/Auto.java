public class Auto extends VehiculoPasajeros {
    private String tipoCombustible;

    public Auto (String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoComustible) {
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible = tipoComustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double CalcularcostoMantenimiento (double costoporkilometro, double kilomentrosrecorridos) {
        System.out.println("El costo por kilometro es: "+costoporkilometro);
        System.out.println("Los kilometros recorridos han sido. "+kilomentrosrecorridos+" KM");
        double Totalcosto = costoporkilometro * kilomentrosrecorridos;
        System.out.println("El costo total del mantenimiento es: "+Totalcosto);
        return Totalcosto;
    }

    @Override
    public void mostrarinfo() {
        super.mostrarinfo();
        System.out.println("Tipo de Combustible: " + tipoCombustible);
    }

    @Override
    public void realizarMantenimiento () {
        super.realizarMantenimiento();
        System.out.println("Realizando cambio de aceite");
        System.out.println("Rellenando liquido de frenos");
        System.out.println("Haciendo nivelación de llantas");
        System.out.println("Haciendo revisión de válvula de gasolina");
    }
}
