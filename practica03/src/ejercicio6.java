import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ejercicio6 {
    public static void main(String[]args){
        /*Modifica el programa anterior de tal forma que no se repita ningún número en el array
        además de que tiene que estar comprendido en un rango entre 20-40.*/

        // Se inicializa un array de 3 filas y 7 columnas
        int[][] arrayInt = new int[3][7];

        // Se crea una lista donde se guardarán los números del 20 al 40
        // Se añaden todos los números al array dinámico (lista)
        List <Integer> number =new ArrayList<>();
        for (int i = 20 ; i<= 40; i++) {
            number.add(i);

        }

        // Se mezclan los números para que estén en orden aleatorio (sin repetirse)
        Collections.shuffle(number);

        //inicializamos el indice para recorrer los números de la lista

        // Se rellena el array con los números ya mezclados
        int index = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            for (int a = 0; a < arrayInt[i].length; a++) {
                arrayInt[i][a] = number.get(index++);
            }
        }

        //se inicializa la ariable para acumular la suma total del array
        //y se inicializa la variable para acumular la suma de cada fila

        int totalSum = 0;
        int filaSum = 0;

        // Se recorre el array para mostrar los valores y calcular las sumas por fila
        // Se acumula el valor en la suma de la fila
        // Se muestra el número con formato para que quede alineado

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("|------------|-------------|-------------|--------------|------------|-------------|------------|--------------------------|------------|");
            for (int a = 0; a < arrayInt[i].length; a++) {
                filaSum += arrayInt[i][a];
                System.out.printf("    " + " %-8d ", arrayInt[i][a]);
            }

            // Se añade la suma de la fila al total general
            totalSum += filaSum;
            System.out.printf("     Fila %d: Suma = %-6d\n", i, filaSum);
            System.out.println();
        }
        System.out.println("|-------------|-------------|-----------|------------|-----------------|-------------|-------------|--------------|------------|-------------|------------------------------------|");

        // Se recorren las columnas para calcular sus sumas
        // Se acumulan los valores de cada columna

        for (int a = 0; a < arrayInt[0].length; a++) {
            int sumColum = 0;
            for (int i = 0; i < arrayInt.length; i++) {
                sumColum += arrayInt[i][a];
            }
            // Se muestra la suma de cada columna

            System.out.printf("  colum "  + a +" " + sumColum);
            totalSum = sumColum + filaSum;
        }

        System.out.println("  El total = " + totalSum);
        System.out.println();
        System.out.println("--------------|-------------|--------------|------------|-------------|-------------|-------------|--------------|------------|-------------|------------------------------------|");

        // Variables para almacenar los valores máximo y mínimo encontrados
        // y variables para guardar la posición (fila y columna) de cada uno
        int minum = arrayInt[0][0];
        int max = arrayInt[0][0];
        int filaMinum = 0;
        int filaMax = 0;
        int columMinum = 0;
        int columMax = 0;

        // Se recorre el array para encontrar el número mayor y el menor
        // si se encuentra un número mayor, se actualiza el máximo
        // si se encuentra un número menor, se actualiza el mínimo
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
