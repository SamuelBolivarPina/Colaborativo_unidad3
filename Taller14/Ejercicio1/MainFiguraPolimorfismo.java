public class MainFiguraPolimorfismo {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA TALLER 14: POLIMORFISMO EN FIGURAS ---");

        // Referencia de la clase base apuntando a un objeto Circulo
        FIgura miFigura = new CIrculo(4.0);
        miFigura.calcularArea(); // Ejecuta el método de Circulo

        // La misma referencia ahora apunta a un objeto Rectangulo (Polimorfismo dinámico)
        miFigura = new Rectangulo(5.0, 3.0);
        miFigura.calcularArea(); // Ejecuta el método de Rectangulo
    }
}
