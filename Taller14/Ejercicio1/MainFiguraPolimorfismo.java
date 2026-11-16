
package Taller14.Ejercicio1;
public class MainFiguraPolimorfismo {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA TALLER 14: POLIMORFISMO EN FIGURAS ---");

        // Referencia de la clase base apuntando a un objeto Circulo
        Taller14.Ejercicio1.Figura miFigura = new Taller14.Ejercicio1.Circulo(4.0);
        miFigura.calcularArea(); // Corregido el nombre del método a calcularArea()

        // La misma referencia ahora apunta a un objeto Rectangulo (Polimorfismo dinámico)
        miFigura = new Taller14.Ejercicio1.Rectangulo(5.0, 3.0);
        miFigura.calcularArea(); // Corregido el nombre del método a calcularArea()
    }
}
