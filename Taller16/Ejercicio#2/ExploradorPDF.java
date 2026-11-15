public class ExploradorPDF implements Explorador{
    @Override
    public void exportar(Documento documento) {
        System.out.println("Exportando a PDF: " + documento.getTitulo());
    }
}
