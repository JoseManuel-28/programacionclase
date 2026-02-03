import java.util.ArrayList;

public class limpiezaCalabozo {
    public ArrayList<String>registroCombate;

    public limpiezaCalabozo() {
        registroCombate = new ArrayList<>();

        registroCombate.add("orco derrotado");
        registroCombate.add("pocion usada");
        registroCombate.add("enemigo dañado");
        registroCombate.add("aliado curado");
        registroCombate.add("item soltado");

        registroCombate.remove(0);

        registroCombate.add("Dragon avistado");
        System.out.println(registroCombate.get(4));

    }
}
