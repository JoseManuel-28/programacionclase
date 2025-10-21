import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        //Programa Java que llene un array con 10 números enteros que se leen por teclado.
        // A continuación calcula y muestra la media de los valores positivos
        // y la dae los valores negativos del array.

        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[10];
        int positivos = 0, negativos = 0;
        int sumNumArray = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("indiqueme 10 números para rellenar el array");
            arrayInt[i] = sc.nextInt();
        }
        for (int a = 0; a < arrayInt.length; a++) {
            if (arrayInt[a] > 0) {
                positivos++;
            } else if (arrayInt[a] < 0) {
                negativos++;
            }
        }
    }
}
