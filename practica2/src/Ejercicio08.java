import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args){

        //Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas personas tienen
        // una altura superior a la media y cuántas tienen una altura inferior a la media.
        // El valor de N se pide por teclado y debe ser entero positivo.
        Scanner sc = new Scanner(System.in);
        int arrayLenght = sc.nextInt();
        int[] arrayPerson = new int[arrayLenght];

        for(int i = 0; i < arrayPerson.length; i++){
            System.out.println("Indique por teclado el número de personas que desee");
            arrayPerson[i] = sc.nextInt();
        }
    }
}
