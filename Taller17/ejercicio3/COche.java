public class COche extends Transporte{
    public COche() {
        super("Coche");
    }
    @Override
    public void mover() {
        System.out.println("El coche está circulando por la autopista a motor.");
    }
}
