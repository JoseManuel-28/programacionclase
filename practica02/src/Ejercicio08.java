package programacionclase.src.practica02;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args){

        //Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas personas tienen
        //una altura superior a la media y cuántas tienen una altura inferior a la media.
        //El valor de N se pide por teclado y debe ser entero positivo.

        //Inicializamos scanner (sc)
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que indique el número de personas
        //e inicializamos el array (número que indica el usuario)
        System.out.println("Indíqueme el número de personas");
        int arrayLength = sc.nextInt();
        int[] arrayPerson = new int[arrayLength];

        //Recorremos la longitud del array y le pedimos que introduzca la altura de la persona en centímetros
        //inicializando la altura de las personas para que las añanda el usuario
        for (int i = 0; i < arrayPerson.length; i++){
            System.out.println("Indíqueme la altura de la persona en centímetros");
            int heightPerson = sc.nextInt();
            arrayPerson[i] = heightPerson;
        }

        //Inicializamos el número para sumar (sumNumArray) y recorremos la longitud del array para sumar dicho numero
        //con la array
        int sumNumArray = 0;

        for (int a = 0; a < arrayPerson.length; a++) {
            sumNumArray += arrayPerson[a];
        }

        //Inicializamos la altura media utilizando el número que ha quedado en "sumNumArray" divido
        //entre la longitud del array
        int averageHeight = sumNumArray/arrayPerson.length;

        //Inicializamos a 0 la altura superior a la media y la inferior para utilizarlas como contador
        //recorremos el array y comparamos el contenido con la mayor altura media, si es mayor
        //sumamos 1 al contador personHighAverage, si es menor sumamos 1 al contador personLessAverage
        int personHighAverage = 0;
        int personLessAverage = 0;
        for (int b = 0; b < arrayPerson.length; b++) {
            if(arrayPerson[b] > averageHeight){
                personHighAverage++;
            } else if (arrayPerson[b] < averageHeight) {
                personLessAverage++;
            }
        }

        //Se indica por pantalla la altura media cuantas personas son superiores a la media
        //y cuantas son inferiores a la media
        System.out.println("La altura media del número de personas es " + averageHeight);
        System.out.println("Hay " + personHighAverage + " superior a la media");
        System.out.println("Hay " + personLessAverage + " inferior a la media");
    }
}
