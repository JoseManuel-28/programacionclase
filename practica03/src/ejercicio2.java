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

        //Inicializamos el array y le introducimos nosotros los valores
        int[][] arrayInt ={
                {5, 7, 9, 10, 34},
                {12, 45, 67, 18, 56},
                {23, 57, 78, 12, 69},
                {4, 8, 90, 46, 96}
        };

        //Indicamos el borde superior de la tabla
        System.out.println("|------------|-------------|-------------|-------------|--------------|------------------|");

        //Inicializamos el total de la suma y la suma de las filas desde 0 para iniciar la suma
        int totalSum = 0;
        int filaSum = 0; // Suma de los elementos de la fila

        //Recorremos el array para acceder a las columnas y las filas para sumar las filas
        for (int i = 0; i < arrayInt.length; i++) {
            for (int a = 0; a < arrayInt[i].length; a++) {
                filaSum += arrayInt[i][a];
                System.out.printf("    " + " %-8d ", arrayInt[i][a]);
            }

            //Sumamos el total de la fila y añadimos más lineas para dar la sensacion de tabla
            totalSum += filaSum;
            System.out.printf(" Fila %d: Suma = %-6d\n", i, filaSum);
            System.out.println("|------------|-------------|-------------|-------------|--------------|------------------|");
        }

        //Recorremos el array para encontrar el mayor de la columna
        for (int a = 0; a < arrayInt[0].length; a++) {
            int columMayor = arrayInt[0][a];
            for (int i = 0; i < arrayInt.length; i++) {
                if (arrayInt[i][a] > columMayor) {
                    columMayor = arrayInt[i][a];
                }
            }

            // se imprime por pantalla el mayor de la columna
            System.out.printf("columna "  +  a  +": " + + columMayor + " ");

            }

        //se imprime por pantalla la suma total
        System.out.println("  Suma total" + totalSum);
        System.out.println("|------------|-------------|-------------|-------------|--------------|------------------|");
    }
}



