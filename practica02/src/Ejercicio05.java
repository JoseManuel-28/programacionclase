package programacionclase.src.practica02;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {

        //Crea un array de números donde le indicamos por teclado el tamaño del array,
        //rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla el
        //valor de cada posición y la suma de todos los valores

        //Inicializamos un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca el tamaño del array
        System.out.println(" Indíqueme el tamaño del array");
        int arrayLength = sc.nextInt();

        //Inicializamos el array
        int[] arrayInt = new int[arrayLength];

        //Rellenamos el array con números aleatorios entre 1 - 9
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int) (Math.random() * 9 + 1);
        }

        //Recorremos el array y mostramos por pantalla la posicion y el valor
        for (int a = 0; a < arrayInt.length; a++) {
            System.out.println("La posicion es " + a + " El valor es " + arrayInt[a]);
        }

        //Inicializamos sumNumArray ( para sumar los valores )
        int sumNumArray = 0;

        //Recorremos el array sumando todos los valores
        for(int b = 0; b < arrayInt.length; b++){
            sumNumArray += arrayInt[b];
        }

        //Introducimos por pantalla la suma de los valores
        System.out.println(" La suma de los valores es " + sumNumArray);
    }
}
