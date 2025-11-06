import java.util.Random;

public class ejercicio3 {
    public static void main(String[] args){


        System.out.println("--------------------------------------------------------------------------------------------------");
        int[][] arrayInt =new int[4][5];
        Random arrayRand = new Random();
        for (int i = 0; i <arrayInt.length; i++) {
            for (int a = 0; a < arrayInt[i].length; a++) {
                arrayInt[i][a] = arrayRand.nextInt(999) +1;

            }
        }

        int totalSum = 0;

        int filaSum = 0; // Suma de los elementos de la fila

        for (int i = 0; i < arrayInt.length; i++) {
            for (int a = 0; a < arrayInt[i].length; a++) {
                filaSum += arrayInt[i][a]; // Sumar los elementos de la fila
                System.out.printf("    " + " %-8d ", arrayInt[i][a]);
            }

            totalSum += filaSum; // Sumar la fila al total
            System.out.printf("Fila %d: Suma = %-6d\n", i, filaSum);
            System.out.println();
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
        System.out.println("--------------------------------------------------------------------------------------------------");
    }
}

