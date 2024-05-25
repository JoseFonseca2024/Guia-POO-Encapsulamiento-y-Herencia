public class Camion extends VehiculoCarga {
    private int numEjes;

    public Camion (String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes) {
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes = numEjes;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes (int numEjes) {
        this.numEjes = numEjes;
    }

    @Override
    public void mostrarinfo () {
        super.mostrarinfo();
        System.out.println("Numero de Ejes: " +numEjes);
    }

    @Override
    public void realizarMantenimiento () {
        super.realizarMantenimiento();
        System.out.println("Realizando revisión de suspenciones");
        System.out.println("Revisando sistemas de frenos");
        System.out.println("Realizando cambio de llantas");
        System.out.println("Revisanddo el escape de gases");
    }
}
