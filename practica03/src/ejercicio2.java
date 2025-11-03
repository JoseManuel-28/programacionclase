import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        /*Escribe un programa que solicite 20 números enteros. Estos números debemos de introducirlo en un array
        de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y en las columnas
        /el mayor número de la columna. La suma total debe aparecer en la esquina inferior derecha.*/

        /*Scanner sc = new Scanner(System.in);
        int [][] arrayInt = new int[4][5];

        for (int i = 0; i < arrayInt.length; i++) {
            for (int a = 0; a < arrayInt.length; a++) {
                System.out.println("indiqueme 1 número entero 20 veces");
                arrayInt[i][a] = sc.nextInt();
            }
        }*/

        int[][] arrayInt = {
                {5, 7, 9, 10, 34},
                {12, 45, 67, 18, 56},
                {23, 57, 78, 12, 69},
                {4, 8, 90, 46, 96}
        };

        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < arrayInt.length; i++) {
            for (int a = 0; a < arrayInt[i].length; a++) {
                System.out.printf( "  " + " %-6d ", arrayInt[i][a]);
            }
            System.out.print( " fila " + i);
            System.out.println();
        }

        System.out.println("columna 0 " + "Columna 1 " + "Columna 2 " + "Columna 3 " + "Columna 4 " + "  TOTAL");
        System.out.println("----------------------------------------------------------");
        }
    }



