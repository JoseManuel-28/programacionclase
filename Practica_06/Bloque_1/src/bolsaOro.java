import java.util.HashMap;

public class bolsaOro {

    HashMap<String,Integer> oro = new HashMap<>();

    public bolsaOro(){
        oro.put("baldur", 35);
        oro.put("Guldan SaqueaSangre", 57);

        System.out.println("mana de guldan SaqueaSangre = " + oro.get("Guldan SaqueaSangre" ));
    }
}
