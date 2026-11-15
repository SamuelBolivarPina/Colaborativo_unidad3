public class MainPersonaPolimorfismo {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA TALLER 14: POLIMORFISMO CON PERSONAS ---");

        // Referencia de la clase base Persona apuntando a distintos objetos (Polimorfismo dinámico)
        Persona persona;

        persona = new Persona();
        persona.presentarse(); // Muestra el mensaje general

        persona = new Estudiante();
        persona.presentarse(); // Muestra el mensaje específico de Estudiante

        persona = new Profesor();
        persona.presentarse(); // Muestra el mensaje específico de Profesor
    }
}
