public class MainDescuentoTest {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DEL PRINCIPIO OCP (SISTEMA DE DESCUENTOS) ---");

        double precioOriginal = 200.0;

        // 1. Aplicando descuento por porcentaje (20%)
        Descuento descuentoPorcentaje = new DescuentoPorcentaje(20.0);
        double precioFinalPorcentaje = descuentoPorcentaje.aplicar(precioOriginal);

        System.out.println("Precio original: $" + precioOriginal);
        System.out.println("Aplicando 20% de descuento -> Precio final: $" + precioFinalPorcentaje);

        // 2. Aplicando descuento fijo ($30)
        Descuento descuentoFijo = new DescuentoFijo(30.0);
        double precioFinalFijo = descuentoFijo.aplicar(precioOriginal);

        System.out.println("Aplicando descuento fijo de $30 -> Precio final: $" + precioFinalFijo);
    }
}
