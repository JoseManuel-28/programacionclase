import java.util.Random;

public class ejercicio4 {
    public static void main(String[]args) throws InterruptedException {

        /*Modifica el programa anterior de tal forma que las sumas parciales y la suma
        total aparezcan en la pantalla con un pequeño retraso, dando
        la impresión de que el ordenador se queda “pensando” antes de mostrar los números.*/

        // Línea decorativa para separar visualmente el inicio de la salida
        System.out.println("-------------------------------------------------------------------------------------------------------");

        // Se declara una matriz de 4 filas y 5 columnas
        // y  se crea un objeto Random para generar los números
        int[][] arrayInt =new int[4][5];
        Random arrayRand = new Random();

        // Se rellena el array con números aleatorios entre 1 y 1999
        for (int i = 0; i <arrayInt.length; i++) {
            for (int a = 0; a < arrayInt[i].length; a++) {
                arrayInt[i][a] = arrayRand.nextInt(1999) +1;

            }
        }

        //Se inicializa una variable para acumular la suma total de todos los números
        // y se inicializa una variable para almacenar la suma de cada fila
        int totalSum = 0;
        int filaSum = 0;

        // Recorremos el array para mostrar los números y calcular las sumas por fila
        for (int i = 0; i < arrayInt.length; i++) {
            for (int a = 0; a < arrayInt[i].length; a++) {
                filaSum += arrayInt[i][a];
                System.out.printf("    " + " %-10d ", arrayInt[i][a]);
            }

            // Se añade la suma de la fila al total general
            totalSum += filaSum;

            // Pequeña pausa para dar la impresión de "pensamiento"
            Thread.sleep(500);
            System.out.printf("  Fila %d: Suma = %-6d\n", i, filaSum);
            System.out.println();
            System.out.println("-----------|---------------|------------------|-----------------|--------------|-----------------------");
            System.out.println();
        }
        // Ahora se busca el número mayor de cada columna
        for (int a = 0; a < arrayInt[0].length; a++) {
            int columMayor = arrayInt[0][a];
            for (int i = 0; i < arrayInt.length; i++) {
                if (arrayInt[i][a] > columMayor) {
                    columMayor = arrayInt[i][a];
                }
            }

            Thread.sleep(350);

            // Se muestra el valor máximo encontrado en la columna
            System.out.printf("columna "  +  a  +": " + + columMayor + " ");


        }

        // Pausa final antes de mostrar la suma total
        Thread.sleep(500);

        // Se muestra la suma total de todos los números del array
        System.out.println("| " + "  Suma total" + totalSum);
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------");

    }
}
