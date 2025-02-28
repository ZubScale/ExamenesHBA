package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Profesor profesor = new Profesor(" Carlos Tejeda", 45, 50000.0);
        Estudiante estudiante1 = new Estudiante("Carlos Limon", 20, 8.9);
        Estudiante estudiante2 = new Estudiante("Hugo Buentello", 22, 9.5);
        Estudiante estudiante3 = new Estudiante("Juan Perez", 21, 7.5);
        Estudiante estudiante4 = new Estudiante("Jose Luna", 23, 8.5);



        Curso curso = new Curso("Introducción a la Programación", profesor);
        curso.agregarEstudiante(estudiante1);
        curso.agregarEstudiante(estudiante2);
        curso.agregarEstudiante(estudiante3);
        curso.agregarEstudiante(estudiante4);

        curso.mostrarDetallesCurso();
    }
}
