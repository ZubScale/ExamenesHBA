package Ejercicio2;

class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + " Edad: " + edad);
    }

}
class Profesor extends Persona {
    double salario;

    public Profesor(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + " Edad: " + edad + " Salario: " + salario);
    }
}

class Estudiante extends Persona {
    double promedio;

    public Estudiante(String nombre, int edad, double promedio) {
        super(nombre, edad);
        this.promedio = promedio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + " Edad: " + edad + " Promedio: " + promedio);
    }
}