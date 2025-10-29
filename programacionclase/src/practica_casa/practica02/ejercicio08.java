package practica_casa.practica02;

import java.util.Scanner;

public class ejercicio08 {
    public static void main(String[] args){
        /*Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas personas tienen
        una altura superior a la media y cuántas tienen una altura inferior a la media.
        El valor de N se pide por teclado y debe ser entero positivo. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Indiqueme el número de personas");
        int numPersons = sc.nextInt();
        int[] arrayPersons = new int[numPersons];

        for (int i = 0; i < arrayPersons.length; i++) {
            while (true) {
                System.out.println("indiqueme la altura de la persona " + (i + 1));
                int personHeight = sc.nextInt();
                if (personHeight >= 100 && personHeight <= 300) {
                    arrayPersons[i] = personHeight;
                    break;
                } else {
                    System.out.println("Altura no valida");
                }
            }
        }

        int sumNumPersons = 0;
        for (int a = 0; a < arrayPersons.length; a++) {
            sumNumPersons += arrayPersons[a];
        }

        int average = sumNumPersons / arrayPersons.length;
        System.out.println("La media de la altura de las personas es " + average);
    }
}
