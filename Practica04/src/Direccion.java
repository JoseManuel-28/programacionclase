public class Direccion {


    //Atributos
    private static String calle;
    private static int numero;
    private static int codigoPostal;
    private static String localidad;
    private static String provincia;


    //Constructor
    public Direccion ( String ca, int num, int coPo, String loc, String pro){
        this.calle = ca;
        this.numero = num;
        this.codigoPostal = coPo;
        this.localidad = loc;
        this.provincia = pro;
    }


    //Getter
    public static String getCalle() {
        return calle;
    }
    public static int getNumero() {
        return numero;
    }
    public static int getCodigoPostal() {
        return codigoPostal;
    }
    public static String getLocalidad() {
        return localidad;
    }
    public static String getProvincia() {
        return provincia;
    }


    //Setter
    public static void setCalle(String calle) {
        Direccion.calle = calle;
    }
    public static void setNumero(int numero) {
        Direccion.numero = numero;
    }
    public static void setCodigoPostal(int codigoPostal) {
        Direccion.codigoPostal = codigoPostal;
    }
    public static void setLocalidad(String localidad) {
        Direccion.localidad = localidad;
    }
    public static void setProvincia(String provincia) {
        Direccion.provincia = provincia;
    }
}

