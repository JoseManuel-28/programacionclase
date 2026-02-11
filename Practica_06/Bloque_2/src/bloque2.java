import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class bloque2 {

    public void repositorioGremios (){

        System.out.println("Ejercicio 7 ");

        /*Creamos un HasMap donde "String" es el nombre del gremio
        y ArrayList<String> es la lista de miembros del gremio*/
        HashMap<String, ArrayList<String>> nombreGremio = new HashMap<String, ArrayList<String>>();

        //Creamos la lista de miembros "magos"
        ArrayList<String> magos = new ArrayList<>();
        magos.add("gandalf");
        magos.add("houdini");
        magos.add("copperfield");

        //Creamos la lista de miembros "caballeros"
        ArrayList<String> caballeros = new ArrayList<>();
        caballeros.add("lancelot");
        caballeros.add("arturo");
        caballeros.add("carlomagno");

        //Guardamos las listas en el HashMap asociadas a su gremio
        nombreGremio.put("magos", magos);
        nombreGremio.put("caballeros", caballeros);

        //Llamamos a la funcion imprimir gremio para mostrar los miembros del gremio de magos
        imprimirGremio(nombreGremio, "magos");
    }

    //Creamos el metodo que recibe el HashMap y el nombre de un gremio y muestra sus miembros
    public void imprimirGremio (HashMap<String, ArrayList<String>> nombreGremio, String buscar){

        //Comprobamos si el HashMap contiene lo que buscamos del gremio
        if (nombreGremio.containsKey(buscar)){

            //Imprime el titulo del gremio
            System.out.println("\n " + buscar);

            //Recorremos la lista de miembros del gremio
            for (String miembro : nombreGremio.get(buscar)){

                //Imprime cada miembro
                System.out.println("- " + miembro);
            }

            //Si el gremio no existe mostramos este mensaje de error
        }else {
            System.out.println("No existe el nombre de gremio");
        }
        System.out.println("---------------------");
    }

    public void sistemaLoot () {
        System.out.println("ejercicio 8 " + "\n");

        // creamos un hashmap con string y un hashset llamado monstruo
        HashMap<String, HashSet<String>> mostruo = new HashMap<>();

        //Creamos el hashset llamado trasgo
        HashSet<String> trasgo = new HashSet<>();

        //Le añadimos a trasgo los item con espada oxidada duplicados
        trasgo.add("espada oxidada");
        trasgo.add("espada oxidada");
        trasgo.add("set de ladron");

        //Guardamos trasgo dentro de monstruo
        mostruo.put("trasgo", trasgo);

        //Aparece por pantalla el loot de trasgo
        System.out.println("Monstruo loot" + "\n" + " - " + trasgo + " - ");
        System.out.println("---------------------");
    }


    public void estadisticas (){
        System.out.println("Ejercicio 9 " + "\n");

        //Creamos el hashmap con un hashmap dentro llamado jugador
        HashMap<String, HashMap<String, Integer>> jugador = new HashMap<>();

        //el hashmap de dentro se va a llamar estadisticasKonan
        HashMap<String, Integer> estadisticasKonan = new HashMap<>();

        //le añades a konan las estadisticas de fuerza y destreza que son 26 las 2
        estadisticasKonan.put("fuerza", 26);
        estadisticasKonan.put("destreza", 26);

        // y dentro del hashmap de jugador se guarda a konan con sus estadisticas
        jugador.put("konan", estadisticasKonan);

        //Si en jugador se encuentra konan
        if (jugador.containsKey("konan")){

            //Inicializamos fuerza que es la fuerza de konan + 2 que le añadimos
            int fuerza = estadisticasKonan.get("fuerza") + 2;

            //Se guarda fuerza en estadisticasKonan
            estadisticasKonan.put("fuerza", fuerza);
        }
        System.out.println("Las estadisticas de konan son: " + " \n " + " fuerza = " + estadisticasKonan.get("fuerza"));
    }

    public void buscadorTraidores (){
        System.out.println("Ejercicio 10 " + "\n");
        //Creamos un HashMap de string con un array list llamada gramios
        HashMap<String, ArrayList<String>> gremios = new HashMap<>();

        //Ahora creamos el array list con el nombre de los gremios y añadimos a las personas
        ArrayList<String> creyentes = new ArrayList<>();
        creyentes.add("Pedro");
        creyentes.add("Andrés");
        creyentes.add("Santiago el Mayor ");
        creyentes.add("Juan");

        //volvemos a crear el arraylist con más nombres
        ArrayList<String>noCreyentes = new ArrayList<>();
        noCreyentes.add("Felipe");
        noCreyentes.add("Bartolomé ");
        noCreyentes.add("Tomás");
        noCreyentes.add("Mateo ");

        //y por ultimo el arraylist de otro gremio
        ArrayList<String>dudosos = new ArrayList<>();
        dudosos.add("Santiago");
        dudosos.add("Simón el Cananeo ");
        dudosos.add("Judas");
        dudosos.add("Tadeo");

        //Introducimos los gremios dentro del hash map
        gremios.put("creyentes", creyentes);
        gremios.put("no creyentes", noCreyentes);
        gremios.put("dudosos", dudosos);

        /*inicializamos un boolean con el nombre encontrado que sea igual a falso
         porque no sabemos si judas está en algun gremio*/
        boolean encontrado = false;

        //Recorremos los gremios y la lista de personas del gremio
        for (String gremio : gremios.keySet()){
            ArrayList<String> lista = gremios.get(gremio);

            //Si en la lista está judas aparece por pantalla ese mensaje de print y lo "elimina
            if (lista.contains("Judas")){
                System.out.println("Judas estaba en el gremio " +  gremio );
                gremios.remove("Judas");
                encontrado = true;
                break;
            }
        }

        //Si es distinto de encontrado pues entonces judas no se ha encontrado
        if (!encontrado) {
            System.out.println("Judas no encontrado");
        }

        //Aparece por pantalla los gremios con la lista completa
        System.out.println(gremios);
    }
}