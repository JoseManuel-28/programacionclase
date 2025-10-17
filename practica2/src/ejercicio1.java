import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        System.out.println("test");
        // Crea una array de 10 posiciones de números pedidos por teclado
        Scanner scanner = new Scanner(System.in);
        int[] arrayint = new int[10];
        // le das una longitud a la variable
        System.out.println("introduzca un valor");
        for (int i = 0; i < arrayint.length; i++){
            // Recorre la array de 1 en 1 hasta llegar a la longitud de la array
            arrayint[i] = scanner.nextInt();
            System.out.println("Introduzca otro valor");
            // le pides que introduca un número
        }
        for (int i = 0; i < arrayint.length; i++) {
            // vuelves a recorrer la array
            System.out.println("indice "+i+" valor: "+ arrayint[i]);
            // imprime por pantalla en el indice el valor
        }
    }
}
