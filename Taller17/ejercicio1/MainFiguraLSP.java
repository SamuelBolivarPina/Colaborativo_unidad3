public class MainFiguraLSP {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA TALLER 17: PRINCIPIO LSP (FIGURAS) ---");

        // Sustitución de Liskov: La referencia base (Figura) es sustituida por las clases derivadas
        FIgura figura1 = new CIrculo(5.0);
        FIgura figura2 = new REctangulo(4.0, 6.0);

        imprimirArea(figura1); // Funciona perfectamente con Círculo
        imprimirArea(figura2); // Funciona perfectamente con Rectángulo
    }
    // Método que opera en términos de la clase base (Figura), cumpliendo el LSP
    public static void imprimirArea(FIgura figura) {
        System.out.println("El área calculada es: " + figura.calculararea());
    }
}
