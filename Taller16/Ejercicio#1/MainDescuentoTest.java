public class MainDescuentoTest {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DEL PRINCIPIO OCP (SISTEMA DE DESCUENTOS) ---");

        double precioOriginal = 200.0;

        // 1. Aplicando descuento por porcentaje (20%)
        Descuento descuentoPorcentaje = new DescuentoPorcentaje(20.0);
        double precioFinalPorcentaje = descuentoPorcentaje.aplicar(precioOriginal);
    }
}
