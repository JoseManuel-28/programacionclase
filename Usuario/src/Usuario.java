public class Usuario {

    private String nombre;
    private String apellidos;
    private String codigoPostal;
    private String direccion;
    private String email;
    private String contrasena;

    public Usuario(String no, String ap, String cP, String di, String em, String co) {
        nombre = no;
        apellidos = ap;
        codigoPostal = cP;
        direccion = di;
        email = em;
        contrasena = co;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCodigoPostal(){
        return codigoPostal;
    }
    public void setCodigoPostal(String codigoPostal){
        this.codigoPostal = codigoPostal;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getContrasena(){
        return email;
    }
    public void setContrasena(String constrasena){
        this.contrasena = constrasena;
    }
}
