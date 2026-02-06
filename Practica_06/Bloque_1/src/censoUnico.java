import java.util.ArrayList;
import java.util.HashSet;

public class censoUnico {
    public HashSet<String> nombreVillanos;

    public  censoUnico (){
        nombreVillanos = new HashSet<>();

        nombreVillanos.add ("Voldemort");
        nombreVillanos.add ("Morgoth");
        nombreVillanos.add ("Morgoth");
        nombreVillanos.add ("sauron");

        System.out.println(nombreVillanos);

        if (nombreVillanos.contains("sauron")){
            nombreVillanos.remove("sauron");
            System.out.println("sauron eliminado");
        }

    }
}

