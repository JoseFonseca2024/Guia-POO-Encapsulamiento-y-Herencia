public class VehiculoCarga extends Vehiculo{

private int capacidadCarga;

public VehiculoCarga (String marca, String modelo, int año, int kilometraje, int capacidadCarga) {
    super(marca , modelo, año, kilometraje);
    this.capacidadCarga = capacidadCarga;
}

public int getCapacidadCarga() {
    return capacidadCarga;
}

public void setCapacidadCarga (int capacidadCarga) {
    this.capacidadCarga = capacidadCarga;
}

@Override
public void mostrarinfo() {
    super.mostrarinfo();
    System.out.println("Capacidad de carga: " +capacidadCarga+ " Kg");
}


}
