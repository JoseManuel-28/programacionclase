import java.awt.geom.Area;
import java.util.ArrayList;

public class Hospital {
    //Atributo
    private String nombre;
    private String CIF;
    private ArrayList<Area> arrayArea;


    //Constructor
    public Hospital (String nom, String CIF){
        this.nombre = nom;
        this.CIF = CIF;
        this.arrayArea = new ArrayList();
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
        this.nombre = nombre;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public void setArrayArea(ArrayList<Area> arrayArea) {
        this.arrayArea = arrayArea;
    }
}
