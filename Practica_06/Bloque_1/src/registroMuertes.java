import java.util.ArrayList;

public class registroMuertes {
    public ArrayList<String> registroCombate;
    public registroMuertes(){
        registroCombate = new ArrayList<>();


        registroCombate.add("orco derrotado");
        registroCombate.add("pocion usada");
        registroCombate.add("enemigo dañado");
        registroCombate.add("aliado curado");
        registroCombate.add("item soltado");

        System.out.println(registroCombate.get(2));

    }



}
