public class Circulo extends  Figura {
    public double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("Área del Círculo (radio " + radio + "): " + area);
    }
}