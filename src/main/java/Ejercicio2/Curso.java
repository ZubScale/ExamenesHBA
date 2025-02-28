package Ejercicio2;

import java.util.ArrayList;

class Curso {
    private String nombreCurso;
    private Profesor profesor;
    private ArrayList<Estudiante> listaEstudiantes;

    public Curso(String nombreCurso, Profesor profesor) {
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.listaEstudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    public void mostrarDetallesCurso() {
        System.out.println("Nombre del Curso: " + nombreCurso);
        System.out.println("Profesor: ");
        profesor.mostrarDetalles();
        System.out.println("Lista de Estudiantes: ");
        for (Estudiante estudiante : listaEstudiantes) {
            estudiante.mostrarDetalles();
        }
    }
}
