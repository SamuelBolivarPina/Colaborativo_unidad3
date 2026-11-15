public class MainVehiculoPolimorfico {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA TALLER 14: POLIMORFISMO CON VEHÍCULOS ---");

        // Referencia de la clase base Vehiculo apuntando a un Coche
        Vehiculo miVehiculo = new Coche();
        miVehiculo.mover(); // Ejecuta el método de Coche

        // La misma referencia ahora apunta a una Bicicleta (Polimorfismo dinámico)
        miVehiculo = new Bicicleta();
        miVehiculo.mover(); // Ejecuta el método de Bicicleta
    }
}
