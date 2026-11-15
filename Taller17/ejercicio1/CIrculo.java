public class CIrculo extends FIgura{
    public final double radio;

    public CIrculo(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }
        this.radio = radio;
    }
}
