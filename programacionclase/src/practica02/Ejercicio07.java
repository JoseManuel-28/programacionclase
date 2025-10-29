package practica02;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        //Programa Java que llene un array con 10 números enteros que se leen por teclado.
        // A continuación calcula y muestra la media de los valores positivos
        // y la de los valores negativos del array.

        //Inicializamos scanner (sc), la longitud de la array, el total de los números positivos
        //y el total de los números negativos
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[10];
        int totalPositive = 0;
        int totalNegative = 0;

        //Recorremos la longitud del array (i) para que el usuario lo rellene de números positivos y negativos
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("indiqueme un número positivo o negativo para rellenar el array");
            arrayInt[i] = sc.nextInt();
        }

        //Volvemos a recorrer el array (a) para calcular la suma de todos los números positivos y negativos
        for (int a = 0; a < arrayInt.length; a++) {
            if (arrayInt[a] > 0) {
                totalPositive += arrayInt[a];
            } else if (arrayInt[a] < 0) {
                totalNegative += arrayInt[a];
            }
        }

        //Indicamos por pantalla la suma de los números positivos y negativos
        System.out.println("La suma de los números positivos son " + totalPositive);
        System.out.println("La suma de los números negativos son " + totalNegative);

        //Inicializamos la media de los los números positivos y negativos
        int averagePositive = totalPositive/arrayInt.length;
        int averageNegative = totalNegative/arrayInt.length;

        //Indicamos por pantalla la media de los números positivos y los nùmeros negativos
        System.out.println("La media de los números positivos es " + averagePositive);
        System.out.println("La media de los números negativos es " + averageNegative);
    }
}
