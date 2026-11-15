public class Libro {
    public String titulo;
    public String autor;

    public String gettitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }
    public void generarReporte() {
        System.out.println("Reporte: " + titulo + " - " + autor);
    }
    public void guardarEnBaseDeDatos() {
        System.out.println("Guardando libro en la base de datos...");
    }
}
