import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        //Programa Java que llene un array con 10 números enteros que se leen por teclado.
        // A continuación calcula y muestra la media de los valores positivos
        // y la de los valores negativos del array.

        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[10];
        int totalPositive = 0;
        int totalNegative = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("indiqueme un número positivo o negativo para rellenar el array");
            arrayInt[i] = sc.nextInt();
        }

        for (int a = 0; a < arrayInt.length; a++) {
            if (arrayInt[a] > 0) {
                totalPositive += arrayInt[a];
            } else if (arrayInt[a] < 0) {
                totalNegative += arrayInt[a];
            }
        }

        System.out.println("La suma de los números positivos son " + totalPositive);
        System.out.println("La suma de los números negativos son " + totalNegative);

        int averagePositive = totalPositive/arrayInt.length;
        int averageNegative = totalNegative/arrayInt.length;

        System.out.println("La media de los números positivos es " + averagePositive);
        System.out.println("La media de los números negativos es " + averageNegative);
    }
}
