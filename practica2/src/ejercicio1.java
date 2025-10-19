import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        System.out.println("test");
        // Crea una array de 10 posiciones de números pedidos por teclado
        Scanner scanner = new Scanner(System.in);
        int[] arrayint = new int[10];
        for (int i = 0; i < arrayint.length; i++){
            System.out.println("introduce un valor");
            arrayint[i] = scanner.nextInt();
        }
        }
    }
