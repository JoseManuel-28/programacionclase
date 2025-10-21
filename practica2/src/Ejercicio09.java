import java.util.Scanner;

public class Ejercicio09 {
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
            System.out.println("Introduzca 1 número entero ");
            arrayInt[i] = sc.nextInt();
        }

        int maxNumArray = arrayInt[0];

        for (int a = 0; a < arrayInt.length; a++) {
            if(arrayInt[a] > maxNumArray){
                maxNumArray = arrayInt[a];
            }
        }

        int minNumArray = arrayInt[0];

        for (int b = 0; b < arrayInt.length; b++) {
            if(arrayInt[b] < minNumArray){
                minNumArray = arrayInt[b];
            }
        }

        int indexMaxNumArray = -1;
        int indexMinNumArray = -1;


        for (int c = 0; c < arrayInt.length; c++) {
            if(maxNumArray == arrayInt[c]){
                indexMaxNumArray = c;
            }
            if(minNumArray == arrayInt[c]){
                indexMinNumArray = c;
            }
        }

        System.out.println("Valor máximo: " + maxNumArray + " en la posicíon " + indexMaxNumArray);
        System.out.println("Valor mínimo: " + minNumArray + " en la posicíon " + indexMinNumArray);
    }
}
