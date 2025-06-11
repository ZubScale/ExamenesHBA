package ExamenFinal.patrones.singleton;

import ExamenFinal.modelos.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class CatalogoPeliculas {
    private static CatalogoPeliculas instancia;
    private List<Pelicula> peliculas;

    private CatalogoPeliculas() {
        peliculas = new ArrayList<>();
    }

    public static CatalogoPeliculas getInstancia() {
        if (instancia == null) {
            instancia = new CatalogoPeliculas();
        }
        return instancia;
    }

    public void agregarPelicula(Pelicula p) {
        peliculas.add(p);
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }
}
