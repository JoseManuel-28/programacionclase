import java.util.Scanner;

public class practicate_home {
    public static void main(String[] args) {
        /*
               pide un nombre por teclado y haz que te salude.
               Por ejemplo, si introduces "Fernando", la respuesta debe ser hola fernando!
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca su nombre por pantalla");
        String  nombre = sc.next();

        System.out.println(" ¡ hola " + nombre + " !");
    }
}
