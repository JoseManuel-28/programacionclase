public class Usuario {
    //Atributos
    private String nombre;
    private String apellidos;
    private String codigoPostal;
    private String direccion;
    private String email;
    private String contrasena;

    //Constructor
    public Usuario (String no, String ap, String cP, String di, String em, String co) {
        this.nombre = no;
        this.apellidos = ap;
        this.codigoPostal = cP;
        this.direccion = di;
        this.email = em;
        this.contrasena = co;
    }

    //Métodos get y set
    public String getNombre () {
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
        if (email.contains("@")) {
            this.email = email;
        } else{
            System.out.println("Error: email inválido. NO contiene @");
        }
    }
    public String getContrasena(){
        return email;
    }
    public void setContrasena(String constrasena){
        this.contrasena = constrasena;
    }
    public boolean checkUsuario (String email, String contrasena){
        return this.getEmail().equals(email) && this.contrasena.equals(contrasena);
    }
}
