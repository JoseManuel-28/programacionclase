import java.awt.geom.Area;
import java.util.ArrayList;

public class Hospital {
    //Atributo
    private static String nombre;
    private static String CIF;
    private static ArrayList <Area> arrayArea = new ArrayList<>();


    //Constructor
    public Hospital (String nom, String CIF, ArrayList arr){
        this.nombre = nom;
        this.CIF = CIF;
        this.arrayArea = arr;
    }


    //Getter
    public static String getNombre() {
        return nombre;
    }
    public static String getCIF() {
        return CIF;
    }
    public static ArrayList<Area> getArrayArea() {
        return arrayArea;
    }


    //Setter
    public static void setNombre(String nombre) {
        Hospital.nombre = nombre;
    }
    public static void setCIF(String CIF) {
        Hospital.CIF = CIF;
    }
    public static void setArrayArea(ArrayList<Area> arrayArea) {
        Hospital.arrayArea = arrayArea;
    }
}
