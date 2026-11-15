public class MainProductoTest {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE SRP EN PRODUCTO ---");

        // 1. Creamos la instancia del producto (Responsabilidad de datos)
        Producto miProducto = new Producto("Laptop Gamer", 3500000.0);

        // 2. Usamos el servicio de precios (Responsabilidad de cálculos y lógica de negocio)
        PrecioService precioService = new PrecioService();
        double precioConIva = precioService.calcularPrecioFinal(miProducto);

        // 3. Usamos el servicio de etiquetas (Responsabilidad de presentación / impresión)
        EtiquetaService etiquetaService = new EtiquetaService();
        etiquetaService.generarEtiqueta(miProducto);

        System.out.println("Precio final (con IVA): $" + precioConIva);
    }
}
