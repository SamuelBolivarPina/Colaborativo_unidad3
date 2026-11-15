public class Descuento {
    public double aplicar(String tipo, double precio, double valor) {
        if (tipo.equals("PORCENTAJE")) {
            return precio - (precio * valor / 100);
        } else if (tipo.equals("FIJO")) {
            return precio - valor;
        }
        return precio;
        // Problema: otro tipo de descuento obliga a modificar este método.
    }
}
