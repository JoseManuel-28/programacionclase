import java.util.Random;

public class ejercicio5 {
    public static void main(String[]args){
        /*Crear un programa que cuando se le introduzca números enteros rellene un array de 6 filas por 10 columnas
         con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
          A continuación, el programa deberá:

        Dar la posición del número máximo y mínimo
        La suma total de todas las filas y columnas
        La suma de todas las columnas
        La suma de todas las filas.
         */


        int[][] arrayInt = new int[6][10];
        Random arrayRand = new Random();

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < arrayInt.length; i++) {
            for (int a = 0; a < arrayInt[i].length; a++) {
                arrayInt[i][a] = arrayRand.nextInt(1001);
            }
        }

        int totalSum = 0;
        int filaSum = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            for (int a = 0; a < arrayInt[i].length; a++) {
                filaSum += arrayInt[i][a]; // Sumar los elementos de la fila
                System.out.printf("    " + " %-8d ", arrayInt[i][a]);
            }
            totalSum += filaSum; // Sumar la fila al total
            System.out.printf("     Fila %d: Suma = %-6d\n", i, filaSum);
            System.out.println();
        }

        for (int a = 0; a < arrayInt[0].length; a++) {
            int sumColum = 0;
            for (int i = 0; i < arrayInt.length; i++) {
                sumColum += arrayInt[i][a];
            }

            System.out.printf("  columna "  + a +" " + sumColum);
            totalSum = sumColum + filaSum;
        }

        System.out.println("  El total = " + totalSum);
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        int minum = arrayInt[0][0];
        int max = arrayInt[0][0];
        int filaMinum = 0;
        int filaMax = 0;
        int columMinum = 0;
        int columMax = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            for (int a = 0; a < arrayInt[i].length; a++) {
                if ( arrayInt[i][a] > max){
                    max = arrayInt[i][a];
                    filaMax = i;
                    columMax = a;
                } else if (arrayInt[i][a] < minum ) {
                    minum = arrayInt[i][a];
                    filaMinum = i;
                    columMinum = a;
                }

            }
        }

        System.out.println("El número mayor es " + max + " posicion " + filaMax + "" + columMax);
        System.out.println("El número mayor es " + minum + " posicion " + filaMinum + "" + columMinum);

    }
}
