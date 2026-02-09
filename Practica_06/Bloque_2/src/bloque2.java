import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

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
    }

}