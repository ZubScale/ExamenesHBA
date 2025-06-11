package ExamenFinal.modelos;

public class UsuarioEstandar extends Usuario {
    public UsuarioEstandar(String nombre, int edad, String preferenciaGenero,
                           java.util.List<Pelicula> peliculasIniciales) {
        super(nombre, edad, preferenciaGenero, peliculasIniciales);
    }

    @Override
    public void verContenido() {
        System.out.println(nombre + " puede ver hasta 5 películas por semana.");
    }
}
