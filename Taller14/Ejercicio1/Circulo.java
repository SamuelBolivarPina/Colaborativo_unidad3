package Taller14.Ejercicio1;

public class Circulo extends Taller14.Ejercicio1.Figura {
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