public class LibroRepository {
    public void guardar(Libro libro) {
        System.out.println("Guardando '" + libro.gettitulo() + "' en la base de datos...");
    }
}
