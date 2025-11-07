import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ejercicio6 {
    public static void main(String[]args){
        /*Modifica el programa anterior de tal forma que no se repita ningún número en el array
        además de que tiene que estar comprendido en un rango entre 20-40.*/


        int[][] arrayInt = new int[3][7];

        List <Integer> number =new ArrayList<>();
        for (int i = 20 ; i<= 40; i++) {
            number.add(i);

        }
        Collections.shuffle(number);

        int index = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            for (int a = 0; a < arrayInt[i].length; a++) {
                arrayInt[i][a] = number.get(index++);
            }
        }

        int totalSum = 0;
        int filaSum = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("|------------|-------------|-------------|--------------|------------|-------------|------------|--------------------------|------------|");
            for (int a = 0; a < arrayInt[i].length; a++) {
                filaSum += arrayInt[i][a]; // Sumar los elementos de la fila
                System.out.printf("    " + " %-8d ", arrayInt[i][a]);
            }
            totalSum += filaSum; // Sumar la fila al total
            System.out.printf("     Fila %d: Suma = %-6d\n", i, filaSum);
            System.out.println();
        }
        System.out.println("|-------------|-------------|-----------|------------|-----------------|-------------|-------------|--------------|------------|-------------|------------------------------------|");
        for (int a = 0; a < arrayInt[0].length; a++) {
            int sumColum = 0;
            for (int i = 0; i < arrayInt.length; i++) {
                sumColum += arrayInt[i][a];
            }

            System.out.printf("  colum "  + a +" " + sumColum);
            totalSum = sumColum + filaSum;
        }

        System.out.println("  El total = " + totalSum);
        System.out.println();
        System.out.println("--------------|-------------|--------------|------------|-------------|-------------|-------------|--------------|------------|-------------|------------------------------------|");

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
        System.out.println("El número menor es " + minum + " posicion " + filaMinum + "" + columMinum);

    }
}
