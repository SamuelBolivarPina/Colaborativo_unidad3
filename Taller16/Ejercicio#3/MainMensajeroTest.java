public class MainMensajeroTest {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DEL PRINCIPIO OCP (SISTEMA DE MENSAJERÍA) ---");

        String destinatarioEmail = "samuel@correo.com";
        String destinatarioSMS = "+573001234567";
        String mensajeTexto = "Hola, este es un mensaje de prueba sobre principios SOLID.";

        // 1. Enviando mediante Email (Extensión 1)
        Mensajero mensajeroEmail = new MensajeEmail();
        mensajeroEmail.enviar(destinatarioEmail, mensajeTexto);
    }
}

