public class ExploradorWord implements Explorador{
    @Override
    public void exportar(Documento documento) {
        System.out.println("Exportando a Word: " + documento.getTitulo());
    }
}
