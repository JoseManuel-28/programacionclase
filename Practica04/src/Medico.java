public class Medico {


    //Atributos
    private static String DNI;
    private static String nombre;
    private static  int edad;
    private static String sexo;
    private static double sueldoBruto;
    private static String anoDeinicio;
    private Area area;


    //Constructor
    public Medico (String DNI, String nom, int ed, String sex, double sB, String anDeIn, Area ar ){
        this.DNI = DNI;
        this.nombre = nom;
        this.edad = ed;
        this.sexo = sex;
        this.sueldoBruto = sB;
        this.anoDeinicio = anDeIn;
        this.area =ar;
        area.contadorNumMedicos();
    }


    //Getter
    public static String getDNI() {
        return DNI;
    }
    public static String getNombre() {
        return nombre;
    }
    public static int getEdad() {
        return edad;
    }
    public static String getSexo() {
        return sexo;
    }
    public static double getSueldoBruto() {
        return sueldoBruto;
    }
    public static String getAnoDeinicio() {
        return anoDeinicio;
    }
    public Area getArea() {
        return area;
    }


    //Setter
    public static void setNombre(String nombre) {
        Medico.nombre = nombre;
    }
    public static void setEdad(int edad) {
        Medico.edad = edad;
    }
    public static void setSexo(String sexo) {
        Medico.sexo = sexo;
    }
    public static void setSueldoBruto(double sueldoBruto) {
        Medico.sueldoBruto = sueldoBruto;
    }
    public static void setAnoDeinicio(String anoDeinicio) {
        Medico.anoDeinicio = anoDeinicio;
    }
    public void setArea(Area area) {
        this.area = area;
    }
}
