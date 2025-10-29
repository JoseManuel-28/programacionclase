package practica02;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {

        //Programa Java que guarda en un array 10 números enteros que se leen por teclado.
        // A continuación se recorre el array
        // y calcula cuántos números son positivos, cuántos negativos y cuántos ceros.

        //Inicializamos scanner para los valores del usuario se guarden
        Scanner sc = new Scanner(System.in);

        //Inicializamos el array y le ponemos 10 indices
        int[] arrayInt = new int[10];

        //inicializamos los valores positivo, negativo y ceros
        int positivos = 0, negativos = 0, ceros = 0;

        //recorremos el array y le pedimos por teclado 10 números que desee
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("indique los 10 números que desee");
            arrayInt[i] = sc.nextInt();
        }

        //Volvemos a recorrer el array para que nos digan cuales son los números positivos, negativos y ceros
        for(int b = 0; b < arrayInt.length; b++) {
            if ( arrayInt[b] > 0){
                positivos++;
            } else if (arrayInt[b] < 0) {
                negativos++;
            }else{
                ceros++;
            }
        }

        //Por ultimo introducimos por pantalla cuantos números positivos, negativos y ceros hay
        System.out.println("Los números positivos son " + positivos);
        System.out.println("Los números negativos son " + negativos);
        System.out.println("Los ceros son " + ceros);
    }
}
