package practica02;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args){

        //Crea un programa en Java que:
        //Pida al usuario por teclado 10 números enteros y los guarde en un array.
        //Recorra el array para encontrar:
        //El valor máximo y la posición en la que aparece.
        //El valor mínimo y la posición en la que aparece.
        //Muestre el resultado en consola, por ejemplo:

        //Inicializas scanner (sc) e inicalizamos el tamaño del array
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[10];

        //recorremos la longitud del array para pedirle por teclado que introduzca el valor de cada
        //posición

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Introduzca 1 número entero ");
            arrayInt[i] = sc.nextInt();
        }
        //Inicializamos el valor maximo del array
        int maxNumArray = arrayInt[0];

        //Volvemos a recorrer el array para obtener el valor maximo del array
        //si el valor del array es mayor, se actualiza
        //el valor máximo

        for (int a = 0; a < arrayInt.length; a++) {
            if(arrayInt[a] > maxNumArray){
                maxNumArray = arrayInt[a];
            }
        }

        //Hacemos el mismo procedimiento pero para obtener el numero minimo de los valores
        //del array ( lo inicializamos pero con el nombre minNumArray,si el valor del array
        //es menor, se actualiza el valor minimo
        int minNumArray = arrayInt[0];

        for (int b = 0; b < arrayInt.length; b++) {
            if(arrayInt[b] < minNumArray){
                minNumArray = arrayInt[b];
            }
        }

        //Inicializamos la posicion del valor maximo y el valor mínimo del array
        //recorremos el array
        int indexMaxNumArray = -1;
        int indexMinNumArray = -1;

        //Recorremos el array pata indicar la media la posicion del número maximo
        for (int c = 0; c < arrayInt.length; c++) {
            if(maxNumArray == arrayInt[c]){
                indexMaxNumArray = c;
            }
            if(minNumArray == arrayInt[c]){
                indexMinNumArray = c;
            }
        }

        //indicamos por pantalla el valor maximo y el valor minimo y la posicion en la que se
        //encuentran
        System.out.println("Valor máximo: " + maxNumArray + " en la posicíon " + indexMaxNumArray);
        System.out.println("Valor mínimo: " + minNumArray + " en la posicíon " + indexMinNumArray);
    }
}
