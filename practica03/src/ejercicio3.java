import java.util.Random;

public class ejercicio3 {
    public static void main(String[] args){

       /* Modifica el programa anterior de tal forma que los números que se introducen en el array
        se generen de forma aleatoria (valores entre 1 y 1999).*/


        // Se declara un array de 4 filas y 5 columnas
        int[][] arrayInt =new int[4][5];
        Random arrayRand = new Random();

        // Se rellena el array con números aleatorios del 1 al 999
        for (int i = 0; i <arrayInt.length; i++) {
            for (int a = 0; a < arrayInt[i].length; a++) {
                arrayInt[i][a] = arrayRand.nextInt(1999) +1;

            }
        }
        // Variable para guardar la suma total de todos los valores del array
        // Variable para guardar la suma de cada fila
        int totalSum = 0;
        int filaSum = 0;

        // Se recorre el array para mostrar sus valores y calcular las sumas por fila
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("|-----------|-------------|-------------|-------------|-------------|---------------------------|");

            // Se recorre cada elemento de la fila y se suma el valor actual a la suma de la fila
            for (int a = 0; a < arrayInt[i].length; a++) {
                filaSum += arrayInt[i][a];
                System.out.printf("    " + " %-8d ", arrayInt[i][a]);
            }

            // Se añade la suma de la fila a la suma total
            totalSum += filaSum;
            System.out.printf("     Fila %d: Suma = %-6d\n", i, filaSum);
            System.out.println();
        }
        System.out.println("|----------------|----------------|----------------|----------------|----------------|----------|");

        // Ahora se busca el número mayor en cada columna del array y se toma el primer valor de la columna como punto de partida
        for (int a = 0; a < arrayInt[0].length; a++) {
            int columMayor = arrayInt[0][a];
            for (int i = 0; i < arrayInt.length; i++) {
                if (arrayInt[i][a] > columMayor) {
                    columMayor = arrayInt[i][a];
                }
            }

            // Se muestra el valor mayor encontrado en esa columna
            System.out.printf("  columna "  +  a  +": " + + columMayor + " ");


        }

        // Se muestra la suma total de todos los elementos del array
        System.out.println("  Suma total = " + totalSum);
        System.out.println();
        System.out.println("|----------------|----------------|----------------|----------------|----------------|----------|");

    }
}

