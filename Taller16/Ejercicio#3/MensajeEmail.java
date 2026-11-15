public class MensajeEmail extends Mensajero{
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando email a " + destinatario + ": " + mensaje);
    }
}
