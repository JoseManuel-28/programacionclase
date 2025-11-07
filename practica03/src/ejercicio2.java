import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        /*Escribe un programa que solicite 20 números enteros. Estos números debemos de introducirlo en un array
        de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y en las columnas
        el mayor número de la columna. La suma total debe aparecer en la esquina inferior derecha.*/

        /*Scanner sc = new Scanner(System.in);
        int [][] arrayInt = new int[4][5];

        for (int i = 0; i < arrayInt.length; i++) {
            for (int a = 0; a < arrayInt.length; a++) {
                System.out.println("indiqueme 1 número entero 20 veces");
                arrayInt[i][a] = sc.nextInt();
            }
        }*/

        int[][] arrayInt ={
                {5, 7, 9, 10, 34},
                {12, 45, 67, 18, 56},
                {23, 57, 78, 12, 69},
                {4, 8, 90, 46, 96}
        };

        System.out.println("|------------|-------------|-------------|-------------|--------------|------------------|");

        int totalSum = 0;

        int filaSum = 0; // Suma de los elementos de la fila

        for (int i = 0; i < arrayInt.length; i++) {
            for (int a = 0; a < arrayInt[i].length; a++) {
                filaSum += arrayInt[i][a]; // Sumar los elementos de la fila
                System.out.printf("    " + " %-8d ", arrayInt[i][a]);
            }

            totalSum += filaSum; // Sumar la fila al total
            System.out.printf(" Fila %d: Suma = %-6d\n", i, filaSum);
            System.out.println("|------------|-------------|-------------|-------------|--------------|------------------|");
        }
        for (int a = 0; a < arrayInt[0].length; a++) {
            int columMayor = arrayInt[0][a];
            for (int i = 0; i < arrayInt.length; i++) { // Recorrer las filas
                if (arrayInt[i][a] > columMayor) {
                    columMayor = arrayInt[i][a];
                }
            }

            System.out.printf("columna "  +  a  +": " + + columMayor + " ");

            }

        System.out.println("  Suma total" + totalSum);
        System.out.println("|------------|-------------|-------------|-------------|--------------|------------------|");
    }
}



