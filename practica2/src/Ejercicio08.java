import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args){

        //Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas personas tienen
        // una altura superior a la media y cuántas tienen una altura inferior a la media.
        // El valor de N se pide por teclado y debe ser entero positivo.
        Scanner sc = new Scanner(System.in);

        System.out.println("Indíqueme el número de personas");
        int arrayLength = sc.nextInt();
        int[] arrayPerson = new int[arrayLength];

        for (int i = 0; i < arrayPerson.length; i++){
            System.out.println("Indíqueme la altura de la persona en centímetros");
            int heightPerson = sc.nextInt();
            arrayPerson[i] = heightPerson;
        }

        int sumNumArray = 0;

        for (int a = 0; a < arrayPerson.length; a++) {
            sumNumArray += arrayPerson[a];
        }

        int averageHeight = sumNumArray/arrayPerson.length;

        int personHighAverage = 0;
        int personLessAverage = 0;
        for (int b = 0; b < arrayPerson.length; b++) {
            if(arrayPerson[b] > averageHeight){
                personHighAverage++;
            } else if (arrayPerson[b] < averageHeight) {
                personLessAverage++;
            }
        }

        System.out.println("La altura media del número de personas es " + averageHeight);
        System.out.println("Hay " + personHighAverage + " superior a la media");
        System.out.println("Hay " + personLessAverage + " inferior a la media");
    }
}
