public class Transporte {
        public String nombre;

        public Transporte(String nombre) {
            this.nombre = nombre;
        }
    public void mover() {
        System.out.println("El medio de transporte " + nombre + " se está desplazando.");
    }
}
