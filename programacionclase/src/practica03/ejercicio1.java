package practica03;

public class ejercicio1 {
    public static void main(String[] args){

        // Define un array de números tipo double de 3 filas por 7 columnas con nombre doub y asigna los
        // valores según la siguiente tabla. Muestra el contenido de todos los elementos del array
        // dispuestos en forma de tabla como se muestra en la figura.

       double[][] arraydoub = {
                {0, 30, 2, 0, 0, 5},
                {70, 0, 0, 0, 0, 0},
                {0, 0, -2, 9, 0, 11,}
       };
       //TODO poner %11s para espaciado
        System.out.println("array num " + " columna 0 " + " columna 1 " + " columna 2 " + " columna 3 " + " columna 4 " + " columna 0 ");
        for (int i = 0; i < arraydoub.length; i++) {
            System.out.print("fila " +  i  + " | ");
            for (int a = 0; a < arraydoub[i].length; a++) {
                System.out.print(arraydoub[i][a]);
            }
            System.out.println();
        }
    }
}
