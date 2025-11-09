package practica02;

public class Ejercicio02 {
    public static void main(String[] args){
        //Muestra por pantalla todos los elementos de un array de números enteros
        //separados por un espacio.

        int[] arrayint = {1,2,3,4,5,6,7,8,9,10};

        //separados por un espacio.

        for (int i = 0; i < arrayint.length; i++){
            System.out.print(" " + arrayint[i]);
        }
    }
}
