public class Medico {
    //Atributos
    private String DNI;
    private String nombre;
    private int edad;
    private String sexo;
    private double sueldoBruto;
    private String anoDeinicio;
    private Area area;
    private int aniosDeAntiguedad;


    //Constructor
    public Medico (String DNI, String nom, int ed, String sex, double sB, String anDeIn, Area ar, int aniosDeAntiguedad ){
        this.DNI = DNI;
        this.nombre = nom;
        this.edad = ed;
        this.sexo = sex;
        this.sueldoBruto = sB;
        this.anoDeinicio = anDeIn;
        this.area =ar;

        area.contadorNumMedicos();
        this.calcularSueldoNeto(45.5);
    }

    public double calcularSueldoNeto(double retencion){
        double quitarSueldo = (100*retencion)/this.sueldoBruto;
        return this.sueldoBruto - quitarSueldo;
    }

    public boolean esMayorDeEdad(int mayoriaDeEdad){
        return this.edad >= mayoriaDeEdad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getAnoDeinicio() {
        return anoDeinicio;
    }

    public void setAnoDeinicio(String anoDeinicio) {
        this.anoDeinicio = anoDeinicio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

}
