public class MainExploradorTest {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DEL PRINCIPIO OCP (GESTIÓN DE DOCUMENTOS) ---");

        // 1. Creamos un documento de prueba
        Documento miDocumento = new Documento("Informe Final POO", "Contenido detallado sobre principios SOLID.");

        // 2. Exportamos usando el formato PDF (Extensión 1)
        Explorador exportadorPDF = new ExploradorPDF();
        exportadorPDF.exportar(miDocumento);
    }
}
