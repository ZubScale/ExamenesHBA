package Ejercicio1;

class Vehiculo {

    String marca;
    String modelo;
    String año;

    public Vehiculo(String marca, String modelo, String año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año);
    }
}

//  Autom
class Automovil extends Vehiculo {
    int numeroPuertas;

    public Automovil(String marca, String modelo, String año, int numeroPuertas) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", Número de puertas: " + numeroPuertas);
    }
}

//  Moto
class Motocicleta extends Vehiculo {
    String tipo;

    public Motocicleta(String marca, String modelo, String año, String tipo) {
        super(marca, modelo, año);
        this.tipo = tipo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", Tipo: " + tipo);
    }
}
