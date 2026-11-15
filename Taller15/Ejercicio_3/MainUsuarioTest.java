public class MainUsuarioTest {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE SRP EN USUARIO ---");

        // 1. Creamos un usuario (Responsabilidad de datos)
        Usuario usuarioValido = new Usuario("Samuel", "secreto123");
        Usuario usuarioInvalido = new Usuario("Admin", "123");

        // 2. Probamos el servicio de validación (Responsabilidad de validación)
        ValidacionService validador = new ValidacionService();
        boolean esValido1 = validador.validarDatos(usuarioValido);
        boolean esValido2 = validador.validarDatos(usuarioInvalido);

        System.out.println("¿El usuario 1 es válido? " + esValido1); // true
        System.out.println("¿El usuario 2 es válido? " + esValido2); // false (contraseña corta)

        // 3. Probamos el servicio de autenticación (Responsabilidad de autenticación)
        AutenticacionService authService = new AutenticacionService();
        boolean autenticado = authService.autenticar(usuarioValido, "secreto123");

        System.out.println("¿Autenticación exitosa para usuario 1? " + autenticado); // true
    }
}
