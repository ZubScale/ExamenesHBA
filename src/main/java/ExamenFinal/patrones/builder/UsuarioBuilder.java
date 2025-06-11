package ExamenFinal.patrones.builder;

import ExamenFinal.modelos.Pelicula;
import ExamenFinal.modelos.Usuario;
import ExamenFinal.modelos.UsuarioEstandar;
import ExamenFinal.modelos.UsuarioPremium;

import java.util.ArrayList;
import java.util.List;

public class UsuarioBuilder {
    private String nombre;
    private int edad;
    private String preferenciaGenero;
    private List<Pelicula> peliculasIniciales = new ArrayList<>();

    public UsuarioBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public UsuarioBuilder setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public UsuarioBuilder setPreferenciaGenero(String genero) {
        this.preferenciaGenero = genero;
        return this;
    }

    public UsuarioBuilder setPeliculasIniciales(List<Pelicula> peliculas) {
        this.peliculasIniciales = peliculas;
        return this;
    }

    public Usuario buildEstandar() {
        return new UsuarioEstandar(nombre, edad, preferenciaGenero, peliculasIniciales);
    }

    public Usuario buildPremium() {
        return new UsuarioPremium(nombre, edad, preferenciaGenero, peliculasIniciales);
    }
}
