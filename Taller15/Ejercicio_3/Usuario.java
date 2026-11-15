public class Usuario {
    public String nombre;
    public String contrasena;

    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }
    public String getNombre(){
        return nombre;
    }
    public String getContrasena(){
        return contrasena;
    }
}
