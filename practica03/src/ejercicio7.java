import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ejercicio7 {
        public static void main(String[] args) {
            // Se crea un objeto Scanner para leer datos del usuario
            Scanner sc = new Scanner(System.in);

            // Se pide al usuario el valor mínimo
            System.out.print("Introduce el valor mínimo: ");
            int min = sc.nextInt();

            // Se pide al usuario el valor maximo
            System.out.print("Introduce el valor máximo: ");
            int max = sc.nextInt();

            // Se comprueba que el valor máximo sea mayor que el mínimo
            if (min >= max) {
                System.out.println("El valor máximo debe ser mayor que el mínimo.");
                return;
            }

            // Se crea una lista para guardar todos los números del rango indicado
            List<Integer> numeros = new ArrayList<>();
            for (int i = min; i <= max; i++) {
                numeros.add(i);
            }

            // Se mezclan los números de la lista para que estén en orden aleatorio
            Collections.shuffle(numeros);

            // Se crea un array del mismo tamaño que la lista
            int[] array = new int[numeros.size()];
            for (int i = 0; i < numeros.size(); i++) {
                array[i] = numeros.get(i);
            }

            // Se muestran los números generados sin repetición
            System.out.println("Números generados (sin repetir):");
            for (int n : array) {
                System.out.print(n + " ");
            }
            System.out.println();

            // Se inicializa una variable para acumular la suma de los números
            double suma = 0;
            for (int n : array) {
                suma += n;
            }
            double media = suma / array.length;

            System.out.println("La media aritmética es: " + media);

            //TODO NO SE LOCALIZAR LOS NÚMEROS PRIMOS Y LO HE DEJAO EN BLANCO
        }
    }
