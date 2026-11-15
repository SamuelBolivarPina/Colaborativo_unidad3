package parte2;

public class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }

    public class Moto extends Vehiculo {
        @Override
        public void mover() {
            super.mover(); // Redundante si hace exactamente lo mismo sin especializar el comportamiento
        }
    }
}
