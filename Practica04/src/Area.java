public class Area {


    /*
    Aera a1 = new Area (...)
    Area a2 = new Area (...)
    Arraylist <Area> areas = { a1, a2, a3 }0
     */

    //Atributos
    private String nombre;
    private String identificador;
    private int planta;
    private Hospital hospital;
    private int numMedicos;


    //Constuctor
    public Area (String nom, String ident, int pla, Hospital h){
        this.nombre = nom;
        this.identificador = ident;
        this.planta = pla;
        this.hospital = h;
        this.numMedicos = 0;
    }

    public void contadorNumMedicos() {
        this.numMedicos++;
    }


    //Getter
    public String getNombre() {
        return nombre;
    }
    public String getIdentificador() {
        return identificador;
    }
    public int getPlanta() {
        return planta;
    }
    public Hospital getHospital() {
        return hospital;
    }
    public int getNumMedicos() {
        return numMedicos;
    }


    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public void setPlanta(int planta) {
        this.planta = planta;
    }
    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
