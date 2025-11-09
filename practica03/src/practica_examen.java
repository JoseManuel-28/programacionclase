import java.util.Scanner;

public class practica_examen {
    public static void main(String[]args){
        /* sc = new Scanner (System.in);
        System.out.println("Introduzca su nombre ");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre);*/

        /*int x = 144;
        int y = 999;
        int suma = x + y;
        int resta = x - y;
        int division = y / x;
        int multiplicacion = x * y;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(division);
        System.out.println(multiplicacion);*/

        /*String nombre = "Juan perez";
        String direccion = "barriada la granja plaza ubrique";
        int teléfono = 634651836;

        System.out.println(nombre);
        System.out.println(direccion);
        System.out.println(teléfono);*/

        /*double euros = 90;
        double conversor = 166.386;
        double pesetas = euros * conversor;

        System.out.println(pesetas);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("indiqueme 1 número :");
        int numeros = sc.nextInt();
        System.out.println("indiqueme otro número");
        int número2 = sc.nextInt();

        int multiplicacion = numeros * número2;
        System.out.println("la multiplicacion de los números dados es " + multiplicacion);

    }
}
