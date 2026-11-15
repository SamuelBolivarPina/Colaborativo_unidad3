public class AutenticacionService {
    public boolean autenticar(Usuario usuario, String contrasenaIngresada) {
        return usuario.getContrasena().equals(contrasenaIngresada);
    }
}
