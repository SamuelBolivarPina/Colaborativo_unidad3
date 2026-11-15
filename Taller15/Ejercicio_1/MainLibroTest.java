public class MainLibroTest {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE SRP EN LIBRO ---");

        // 1. Creamos la instancia del libro (Responsabilidad de datos)
        Libro miLibro = new Libro();
        miLibro.titulo = "El Principito";
        miLibro.autor = "Antoine de Saint-Exupéry";

        // 2. Probamos el servicio de reportes (Responsabilidad de reportes)
        ReporteLibroService reporteService = new ReporteLibroService();
        reporteService.generarReporte(miLibro);

        // 3. Probamos el repositorio (Responsabilidad de persistencia)
        LibroRepository repository = new LibroRepository();
        repository.guardar(miLibro);
    }
}
