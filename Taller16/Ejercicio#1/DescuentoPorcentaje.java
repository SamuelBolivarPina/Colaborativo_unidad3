public class DescuentoPorcentaje extends Descuento{
    public double porcentaje; // por ejemplo 20 = 20%

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicar(double precio) {
        return precio - (precio * porcentaje / 100);
    }
}
