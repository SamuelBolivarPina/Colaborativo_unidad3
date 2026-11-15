public class ValidacionService {
    public boolean validarDatos(Usuario usuario) {
        return usuario.getNombre() != null
                && !usuario.getNombre().isBlank()
                && usuario.getContrasena() != null
                && usuario.getContrasena().length() >= 6;
    }
}
