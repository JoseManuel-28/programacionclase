public class Ejercicio03 {
    public static void main(String[] args) {
        //Crea un array que contenga 5 números. Realiza un programa que te muestre por pantalla
        // SOLO el más pequeño de ellos.

        //Crea un array que contenga 5 números

        int[] arrayint = {1, 2, 3, 4, 5};
        int menor = arrayint[1];

        //Realiza un programa que te muestre por pantalla
        // SOLO el más pequeño de ellos.

        for (int i = 0; i < arrayint.length; i++) {
            if (arrayint[i] < arrayint[1]) {
                menor = arrayint[i];
                System.out.println(menor);
            }
        }
    }
}
