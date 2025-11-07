import java.util.Random;

public class ejercicio5 {
    public static void main(String[]args){
        /*Crear un programa que cuando se le introduzca números enteros rellene un array
         de 6 filas por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
          A continuación, el programa deberá:

        Dar la posición del número máximo y mínimo
        La suma total de todas las filas y columnas
        La suma de todas las columnas
        La suma de todas las filas.
         */

        // Se declara un array de 6 filas y 10 columnas y se inicializa
        // Random para generar los números aleatorios
        int[][] arrayInt = new int[6][10];
        Random arrayRand = new Random();

        // Se rellena el array con números aleatorios del 0 al 1000
        for (int i = 0; i < arrayInt.length; i++) {
            for (int a = 0; a < arrayInt[i].length; a++) {
                arrayInt[i][a] = arrayRand.nextInt(1001);
            }
        }

        // Variable para almacenar la suma total de todos los números del array y
        // la variable para almacenar la suma de cada fila
        int totalSum = 0;
        int filaSum = 0;

        // Se recorre el array para mostrar su contenido y calcular las sumas por fila
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("|------------|-------------|-------------|--------------|------------|-------------|------------|--------------|------------|------------|---------------------------------------|");
            for (int a = 0; a < arrayInt[i].length; a++) {
                filaSum += arrayInt[i][a];
                System.out.printf("    " + " %-8d ", arrayInt[i][a]);
            }

            // Se añade la suma de la fila al total general
            totalSum += filaSum;
            System.out.printf("     Fila %d: Suma = %-6d\n", i, filaSum);
            System.out.println();
        }

        // Se calcula la suma de cada columna
        System.out.println("--------------|-------------|--------------|------------|-------------|-------------|-------------|--------------|------------|-------------|------------------------------------|");
        for (int a = 0; a < arrayInt[0].length; a++) {
            int sumColum = 0;
            for (int i = 0; i < arrayInt.length; i++) {
                sumColum += arrayInt[i][a];
            }

            // Se muestra la suma de la columna actual
            System.out.printf("  colum "  + a +" " + sumColum);
            totalSum = sumColum + filaSum;
        }

        System.out.println("  El total = " + totalSum);
        System.out.println();
        System.out.println("--------------|-------------|--------------|------------|-------------|-------------|-------------|--------------|------------|-------------|------------------------------------|");

        //se inicializan las  variables para guardar el valor mínimo y máximo encontrados
        //y tambien se inicializan las variables
        // para guardar la posición (fila y columna) del mínimo y del máximo
        int minum = arrayInt[0][0];
        int max = arrayInt[0][0];
        int filaMinum = 0;
        int filaMax = 0;
        int columMinum = 0;
        int columMax = 0;

        // Se recorre el array para encontrar el número mayor y el menor
        // si se encuentra un valor mayor, se actualizan las variables del máximo
        // Si se encuentra un valor menor, se actualizan las variables del mínimo
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
        System.out.println("El número menor es " + minum + " posicion " + filaMinum + "" + columMinum);

    }
}
