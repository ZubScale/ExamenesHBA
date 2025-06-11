package ExamenFinal.modelos;

public class Pelicula {
    private String titulo;
    private int año;
    private String genero;
    private double calificacion;

    public Pelicula(String titulo, int año, String genero, double calificacion) {
        this.titulo = titulo;
        this.año = año;
        this.genero = genero;
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "----------" + titulo + " (" + año + ") - " + genero + " - " + calificacion + "----------";
    }
    public String getTitulo() { return titulo; }

}
