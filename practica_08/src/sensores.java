import java.util.ArrayList;

public class sensores extends equipos{
    public ArrayList<Integer> regitroTemperatura;
    public ArrayList<Integer> regitroOxigeno;
    public sensores(int numSerie, ArrayList<Integer> regitroTemperatura,ArrayList<Integer> regitroOxigeno  ) {
        super(numSerie);
        this.regitroTemperatura = regitroTemperatura;
        this.regitroOxigeno = regitroOxigeno;
    }

    public void registrarTemperatura (int nuevaTemperatura){
        regitroTemperatura.add(nuevaTemperatura);

    }

    public void registrarOxigeno (int nuevoRegistro){
    }
}
