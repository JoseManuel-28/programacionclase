import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args){

        //Crea un programa que:
        //Cree una lista de enteros (ArrayList<Integer>).
        //Pida números por teclado hasta que el usuario introduzca un número negativo (ese no se añade).
        //Muestre por pantalla todos los números de la lista y la suma total de los mismos.

        //Inicializamos scanner, el array, el contador, y el sumatorio
        Scanner scanner = new Scanner(System.in);
        int[] arrayInt = new int[50];
        int number;
        int counter = 0;
        int sumNumArray = 0;

        //Pedimos al usuario que introduzca un número ( negativo para que acabe )
        while (true) {
            System.out.println("Introduzca un número ( negativo para salir ): ");
            number = scanner.nextInt();

            //Si el número es negativo se sale
            if (number < 0) {
                break;
            }

            // Añadir el número al array y aumentar el contador acumulamos la suma de los números
            arrayInt[counter] = number;
            counter++;
            sumNumArray += number;
        }

        // Mostrar los números introducidos en el array
        System.out.println("Los números introducidos son:");
        for (int i = 0; i < counter; i++) {
            System.out.println(arrayInt[i]);
        }

        // Mostrar la suma total de los números
        System.out.println("La suma total es: " + sumNumArray);
    }
}
