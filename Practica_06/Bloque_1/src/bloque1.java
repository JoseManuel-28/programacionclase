import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class bloque1 {

    public ArrayList<String> registroMuerte() {
        System.out.println("Ejercicio 1: " + "\n");

        //Se crea un ArrayList en el que se guardaran lo que pasará en el combate
        ArrayList<String> registroCombate = new ArrayList<>();

        //Se añaden con .add los 5 "eventos" que van a pasar en combate
        registroCombate.add("orco derrotado");
        registroCombate.add("pocion usada");
        registroCombate.add("enemigo dañado");
        registroCombate.add("aliado curado");
        registroCombate.add("item soltado");

        /*Se reproduce por pantalla el índice 2 de los eventos añadidos anteriormente
        en el combate*/
        System.out.println(registroCombate.get(2));

        System.out.println("--------------------------");
        //Aqui devuelve el ArrayList para poder usarlo en otros lados
        return registroCombate;
    }

    public HashSet<String> censoUnico (){
        System.out.println("ejercicio 2:" + "\n");

        //Creas un Hashet de tipo String que sea nombreVillanos
        HashSet<String> nombreVillanos = new HashSet<>();

        //Añades el nombre de los villanos con .add dentro del Hashet<>
        nombreVillanos.add ("Voldemort");
        nombreVillanos.add ("Morgoth");
        nombreVillanos.add ("Morgoth");
        nombreVillanos.add ("sauron");

        System.out.println(nombreVillanos);
        System.out.println("-----------------------------");
        return nombreVillanos;


    }

    public void bolsaOro() {
        System.out.println("Ejercicio 3:" + "\n");

        HashMap<String, Integer> oro = new HashMap<>();

        oro.put("baldur", 35);
        oro.put("Guldan SaqueaSangre", 57);

        for (String nombre : oro.keySet()){
            System.out.println("oro de " + nombre + " : " + oro.get(nombre));
        }

        System.out.println("--------------------------");
    }

    public void limpiezaCalabozo (ArrayList<String> registro) {
        System.out.println("Ejercicio 4:" + "\n");
        System.out.println("antes " + registro);
        registro.remove(0);
        registro.add("Dragon invocado");
        System.out.println("ahora " + registro);
        System.out.println("-----------------------------");
    }

    public void mercadoHechizos() {
        System.out.println("Ejercicio 5 : " + "\n");

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
        System.out.println("----------------------------");
    }

    public void expulsionReino (HashSet<String> nombreVillanos){
        System.out.println("Ejercicio 6: " + "\n");
        if (nombreVillanos.contains("sauron")){
            nombreVillanos.remove("sauron");
            System.out.println("sauron eliminado");
        }
        System.out.println("-------------------------");
    }

}
