public class Usuario {
    private String nombre;
    private String apellidos;
    private String codigoPostal;
    private String direccion;
    private String email;
    private String contraseña;

    public Usuario(String no, String ap, String cp, String di, String em, String co){
        nombre = no;
        apellidos = ap;
        codigoPostal = cp;
        direccion = di;
        email = em;
        contraseña = co;

    }
}
