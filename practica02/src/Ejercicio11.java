
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){

        //Escribe un programa java que invierta el orden de los valores de un array.
        // Por invertir el orden de los valores de un array, me refiero que el último pasa a ser el primero,
        // el penúltimo el segundo y así sucesivamente. PRUEBA CON UN ARRAY DE TAMAÑO 6.

        //Inicializamos Scanner ( sc ) y el array de tamaño 6
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[6];

        //Le pedimos al usuario que introduzca 6 numeros por teclado y recorremos el array
        System.out.println("Introduzca 6 números:");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            arrayInt[i] = sc.nextInt();
        }

        //Muestra por pantalla el array original
        System.out.println("Array original: ");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }

        //Se invierte  el orden de los elementos
        int[] invierte = arrayInt;
        for (int i = 0; i < arrayInt.length / 2; i++) {
            if (invierte[i] == arrayInt[arrayInt.length / 2] - 1 - i){
                System.out.println("array invertido" + invierte);
            }
        }

        //Se muestra por pantalla el array invertido
        System.out.println("Array invertido:");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
    }
}

