public class REctangulo extends FIgura{
    public double base;
    public double altura;

    public REctangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calculararea() {
        return base * altura;
    }
}
