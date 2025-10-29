package practica_casa.practica02;

import java.util.Scanner;

public class ejercicio09 {
    public static void main(String[] args){

        //Crea un programa en Java que:
        //Pida al usuario por teclado 10 números enteros y los guarde en un array.
        //Recorra el array para encontrar:
        //El valor máximo y la posición en la que aparece.
        //El valor mínimo y la posición en la que aparece.
        //Muestre el resultado en consola, por ejemplo:

        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[10];
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("indiqueme 1 número entero");
            arrayInt[i] = sc.nextInt();
        }

        int maxValueArray = arrayInt[0];

        for (int a = 0; a < arrayInt.length; a++) {
            if ( arrayInt[a] > maxValueArray){
                maxValueArray = arrayInt[a];
            }

        }

        int minValueArray = arrayInt[0];

        for (int b = 0; b < arrayInt.length; b++) {
            if (arrayInt[b] < minValueArray) {
                minValueArray = arrayInt[b];
            }
        }

        System.out.println("El valor máximo del array es " + maxValueArray);
        System.out.println("El valor mínimo del array es " + minValueArray);
    }
}
