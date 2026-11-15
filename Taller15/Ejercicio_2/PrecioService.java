public class PrecioService {
    public static final double IVA = 0.19;

    public double calcularPrecioFinal(Producto producto) {
        return producto.getPrecioBase() * (1 + IVA);
    }
}
