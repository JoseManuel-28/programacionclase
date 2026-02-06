import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class bloque1 {
    public ArrayList<String> registroMuerte() {
        ArrayList<String> registroCombate = new ArrayList<>();


        registroCombate.add("orco derrotado");
        registroCombate.add("pocion usada");
        registroCombate.add("enemigo dañado");
        registroCombate.add("aliado curado");
        registroCombate.add("item soltado");

        System.out.println(registroCombate.get(2));
        return registroCombate;
    }

    public void mercadoHechizos() {
        HashMap<String, Double> mana = new HashMap<>();
        mana.put("Ariamis", 60.5);
        mana.put("Ingward", 39.0);
        mana.put("Radagon", 50.1);
        mana.put("Malenia", 43.8);

        for (Map.Entry<String, Double> entrada : mana.entrySet()) {

            if (entrada.getValue() > 50) {
                System.out.println(entrada.getKey() + " tiene " + entrada.getValue() + " de mana ");
            }
        }
    }
    public void limpiezaCalabozo () {
        ArrayList<String> registro = registroMuerte();
        System.out.println("antes " + registro);
        registro.remove(0);
        registro.add("Dragon invocado");
        System.out.println("ahora " + registro);
    }
}

/*registroMuerte registro = new registroMuerte();

        System.out.println("Antes " + registro.registroCombate);

        registro.registroCombate.remove(0);

        registro.registroCombate.add("Dragon invocado");

        System.out.println("Ahora " + registro.registroCombate);*/