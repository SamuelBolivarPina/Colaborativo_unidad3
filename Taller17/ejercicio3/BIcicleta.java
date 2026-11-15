public class BIcicleta extends Transporte{

        public BIcicleta() {
            super("Bicicleta");
        }
    @Override
    public void mover() {
        System.out.println("La bicicleta está avanzando mediante el pedaleo en la ciclorruta.");
    }
}
