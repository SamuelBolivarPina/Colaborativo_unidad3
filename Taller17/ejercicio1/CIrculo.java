public class CIrculo extends FIgura{
    public double radio;
    public CIrculo(double radio) {
        this.radio = radio;
    }
@Override
    public double calculararea() {
        return Math.PI * radio * radio;
    }
}
