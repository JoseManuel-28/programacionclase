import java.util.HashMap;
import java.util.Map;

public class mercadoHechizos {
    HashMap<String, Double> mana = new HashMap<>();

    public mercadoHechizos(){
        mana.put("Ariamis", 60.5);
        mana.put("Ingward", 39.0);
        mana.put("Radagon", 50.1);
        mana.put("Malenia", 43.8);

        for(Map.Entry<String, Double> mana : mana.entrySet()){
            if(mana.getValue() > 50){
                System.out.println(mana.getKey() + " tiene " + mana.getValue() + " de mana ");
            }
        }

    }
}
