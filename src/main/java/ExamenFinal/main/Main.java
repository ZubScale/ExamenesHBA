package ExamenFinal.main;

import ExamenFinal.modelos.Pelicula;
import ExamenFinal.modelos.Usuario;
import ExamenFinal.patrones.builder.UsuarioBuilder;
import ExamenFinal.patrones.factory.UsuarioFactory;
import ExamenFinal.patrones.singleton.CatalogoPeliculas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CatalogoPeliculas catalogo = CatalogoPeliculas.getInstancia();

        Pelicula p1 = new Pelicula("Inception", 2012, "Ciencia ficción", 9.0);
        Pelicula p2 = new Pelicula("Interstellar", 2010, "Ciencia ficción", 8.6);
        Pelicula p3 = new Pelicula("El Padrino", 1972, "Crimen", 9.2);
        Pelicula p4 = new Pelicula("Titanic", 1997, "Romance", 7.8);
        Pelicula p5 = new Pelicula("Joker", 2019, "Drama", 8.4);
        Pelicula p6 = new Pelicula("Moana", 2018, "Animada", 8.5);
        Pelicula p7 = new Pelicula("Cars", 2005, "Animada", 10.0);
        Pelicula p8 = new Pelicula("Depredador", 1980, "Suspenso?", 9.9);
        Pelicula p9 = new Pelicula("El exorsismo", 1975, "Terror", 6.0);
        Pelicula p10 = new Pelicula("FNAF", 2023, "TError", 8.9);


        catalogo.agregarPelicula(p1);
        catalogo.agregarPelicula(p2);
        catalogo.agregarPelicula(p3);
        catalogo.agregarPelicula(p4);
        catalogo.agregarPelicula(p5);
        catalogo.agregarPelicula(p6);
        catalogo.agregarPelicula(p7);
        catalogo.agregarPelicula(p8);
        catalogo.agregarPelicula(p9);
        catalogo.agregarPelicula(p10);


        UsuarioBuilder builder = new UsuarioBuilder();
        UsuarioFactory factory = new UsuarioFactory();

        Usuario u1 = builder.setNombre("Ana")
                .setEdad(25)
                .setPreferenciaGenero("Drama")
                .setPeliculasIniciales(Arrays.asList(p4, p5))
                .buildEstandar();

        Usuario u2 = factory.crearUsuario("premium", "Carlos", 30, "Ciencia ficción", Arrays.asList(p1));
        Usuario u3 = factory.crearUsuario("premium", "Hugo", 21, "Animada", Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));

        Usuario u4 = builder.setNombre("Cale")
                .setEdad(77)
                .setPreferenciaGenero("Accion")
                .setPeliculasIniciales(Arrays.asList(p1,p2,p3))
                .buildPremium();

        u1.verContenido();
        u2.verContenido();
        u3.verContenido();
        u4.verContenido();


        u1.agregarPeliculaVista(p2);
        u2.agregarPeliculaVista(p3);
        u2.agregarPeliculaVista(p5);
        u2.agregarPeliculaVista(p9);
        u2.agregarPeliculaVista(p10);
        u2.agregarPeliculaVista(p1);
        u2.agregarPeliculaVista(p2);
        u4.mostrarPeliculasVistas(p6);
        u4.mostrarPeliculasVistas(p9);
        u4.mostrarPeliculasVistas(p10);


        u1.mostrarPeliculasVistas();
        u2.mostrarPeliculasVistas();
        u3.mostrarPeliculasVistas();
        u4.mostrarPeliculasVistas();


    }
}
