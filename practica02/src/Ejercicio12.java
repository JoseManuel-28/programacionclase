
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){

        //En España cada persona está identificada con un Documento Nacional de Identidad (DNI)
        // en el que figura un número y una letra, por ejemplo 56999545W.
        // Realiza un programa donde le pidas al usuario SOLO el número del dni y el programa te devuelva la letra.
        // Para calcular la letra solo tienes que dividir el número del DNI entre 23, el resto de esta división
        // se corresponde
        // con la posición de la letra en el abecedario. Utiliza un array para guardar CADA letra del abecedario.

        //Inicializamos scanner ( sc )
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca su DNI cuyo número quedará guardado
        System.out.print("Itroduzca su número de DNI : ");

        //Inicializamos el "DNI" que será el número que le pedimos al usuario por teclado
        int DNI = sc.nextInt();

        //Inicializamos el resto del array
        int rest =0;

        //Inicializamos el array que contiene las letras del dni
        char[] letterDni = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        //indicamos el resto, que es con la division y te da la posicion de la letra
        rest = DNI % 23;

        //Indicamos por pantalla cual es la letra del DNI del usuario
        System.out.println("La letra de su DNI es : "+ letterDni[rest]);
    }
}