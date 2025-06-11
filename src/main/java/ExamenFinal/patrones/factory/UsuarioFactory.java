package ExamenFinal.patrones.factory;

import java.util.List;

import ExamenFinal.modelos.Usuario;
import ExamenFinal.modelos.UsuarioPremium;
import ExamenFinal.modelos.UsuarioEstandar;
import ExamenFinal.modelos.Pelicula;


public class UsuarioFactory {
    public Usuario crearUsuario(String tipo, String nombre, int edad, String genero, List<Pelicula> peliculas) {
        if (tipo.equalsIgnoreCase("estandar")) {
            return new UsuarioEstandar(nombre, edad, genero, peliculas);
        } else if (tipo.equalsIgnoreCase("premium")) {
            return new UsuarioPremium(nombre, edad, genero, peliculas);
        }
        return null;
    }
}
