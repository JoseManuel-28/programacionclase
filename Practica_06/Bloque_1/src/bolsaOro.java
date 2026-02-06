import java.util.HashMap;

public class bolsaOro {

    HashMap<String,Integer> oro = new HashMap<>();

    public bolsaOro(){
        oro.put("baldur", 35);
        oro.put("Guldan SaqueaSangre", 57);
        String nombre = "Guldan";

        System.out.println("Oro de " + nombre + " = " + oro.get("Guldan SaqueaSangre" ));
    }
}
