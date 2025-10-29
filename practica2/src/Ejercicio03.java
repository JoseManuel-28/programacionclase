public class Ejercicio03 {
    public static void main(String[] args) {
        //Crea un array que contenga 5 números. Realiza un programa que te muestre por pantalla
        // SOLO el más pequeño de ellos.

        //Crea un array que contenga 5 números
        int[] arrayint = {7, 2, 9, 12, 1};

        //Realiza un programa que te muestre por pantalla
        // SOLO el más pequeño de ellos.

        // Inicializamos el número con el primero numero del array
        // que vamos a ir comparando cuando vayamos recorriendo el array
        int numMenor = arrayint[0];

        for (int i = 0; i < arrayint.length; i++) {
            //Vamos comparando el valor de cada índice con
            // el numero que hemos incializado antes
            if(arrayint[i] < numMenor){
                //Si el valor que estamos comparando es menor al número, lo sustituimos
                numMenor = arrayint[i];
            }
        }

        System.out.println("El valor menor del array es: " + numMenor);

    }
}
