public class MainTransporteLSP {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA TALLER 17: PRINCIPIO LSP (TRANSPORTE) ---");

        // Sustitución de Liskov en acción
        Transporte transporte1 = new COche();
        Transporte transporte2 = new BIcicleta();

        procesarMovimiento(transporte1);
        procesarMovimiento(transporte2);
    }
}
