package ExamenFinal.modelos;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    protected String nombre;
    protected int edad;
    protected String genero;
    protected List<Pelicula> peliculasVistas;

    public Usuario(String nombre, int edad, String genero, List<Pelicula> peliculasIniciales) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peliculasVistas = new ArrayList<>(peliculasIniciales);
    }

    public abstract void verContenido();

    public void agregarPeliculaVista(Pelicula p) {
        peliculasVistas.add(p);
    }

    public void mostrarPeliculasVistas() {
        System.out.println("Películas vistas por " + nombre + ":");
        for (Pelicula p : peliculasVistas) {
            System.out.println(" - " + p);
        }
    }
}
