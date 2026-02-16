import java.util.ArrayList;

public class biomas {
    public String nombre;
    public int numAnimales;
    public String tipo;
    public ArrayList<equipos> equipos;

    public biomas (String nombre, int numAnimales, String tipo, ArrayList<equipos> equipos){
        this.nombre = nombre;
        this.numAnimales = numAnimales;
        this.tipo = tipo;
        this.equipos = new ArrayList<>();
    }
}
