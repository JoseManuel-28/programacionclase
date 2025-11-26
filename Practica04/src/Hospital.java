import java.awt.geom.Area;
import java.util.ArrayList;

public class Hospital {
    //Atributo
    private String nombre;
    private String CIF;
    private ArrayList <Area> arrayArea = new ArrayList<Area>();


    //Constructor
    public Hospital (String nom, String CIF, ArrayList<Area> arr){
        this.nombre = nom;
        this.CIF = CIF;
        this.arrayArea = arr;
    }


    //Getter
    public String getNombre() {
        return nombre;
    }
    public String getCIF() {
        return CIF;
    }
    public ArrayList<Area> getArrayArea() {
        return arrayArea;
    }


    //Setter
    public void setNombre(String nombre) {
        Hospital.nombre = nombre;
    }
    public void setCIF(String CIF) {
        Hospital.CIF = CIF;
    }
    public void setArrayArea(ArrayList<Area> arrayArea) {
        Hospital.arrayArea = arrayArea;
    }
}
