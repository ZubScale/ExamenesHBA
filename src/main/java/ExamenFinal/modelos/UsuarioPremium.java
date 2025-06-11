package ExamenFinal.modelos;

public class UsuarioPremium extends Usuario {
    public UsuarioPremium(String nombre, int edad, String preferenciaGenero,
                          java.util.List<Pelicula> peliculasIniciales) {
        super(nombre, edad, preferenciaGenero, peliculasIniciales);
    }

    @Override
    public void verContenido() {
        System.out.println(nombre + " puede ver películas ilimitadas.");
    }
}
