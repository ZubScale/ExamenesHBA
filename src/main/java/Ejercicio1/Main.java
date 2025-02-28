package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Automovil("Toyota", "Corolla", "2020", 4));
        vehiculos.add(new Motocicleta("Honda", "CBR500R", "2019", "Deportivo"));
        vehiculos.add(new Automovil ( "Mazda", "CX-7", "2018", 2));
        vehiculos.add(new Motocicleta("Honda", "FZ-2.0", "2019", "Naked"));
        vehiculos.add(new Motocicleta("Honda", "CBR500R", "2019", "Deportivo"));
        vehiculos.add(new Automovil("Toyota", "Corolla", "2020", 4));


        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarDetalles();
        }
    }
}
