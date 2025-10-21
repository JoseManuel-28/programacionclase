



public class Ejercicio04 {
    public static void main(String[] args) {
        //Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100.
        //Obtén la suma de todos ellos y la media.

        //Creamos un array de números de 100 posiciones
        int[] arrayInt = new int[100];

        // Recorremos el array y rellenamos cada posicion con numeros de 1 a 100
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i + 1;
        }
        //Una vez rellenamos el array volvemos a recorrerlo para
        // sumar su contenido

        // Inicializamos el numero que vamos a utilizar para el sumatorio
        int sumNumArray = 0;

        // Recorremos el array y sumamos cada número
        for (int a = 0; a < arrayInt.length; a++) {
            sumNumArray += arrayInt[a];
        }

        // Obtenemos la media del contenido del array
        int mediaNumArray = sumNumArray / arrayInt.length;

        System.out.println("La suma del array es: " + sumNumArray + "\n" + "La media del array es: " + mediaNumArray);
    }
}
