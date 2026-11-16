package Taller14.Ejercicio1;
public class Rectangulo extends Taller14.Ejercicio1.Figura {
    public double base;
    public double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("Área del Rectángulo (base " + base + ", altura " + altura + "): " + area);
    }
}
