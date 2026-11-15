public class ReporteLibroService {
    public void generarReporte(Libro libro) {
        System.out.println("Reporte del libro: " + libro.gettitulo() + " | Autor: " + libro.getAutor());
    }
}
