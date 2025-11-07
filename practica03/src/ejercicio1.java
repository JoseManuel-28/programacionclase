public class ejercicio1 {
    public static void main(String[] args){

        // Define un array de números tipo double de 3 filas por 7 columnas con nombre doub y asigna los
        // valores según la siguiente tabla. Muestra el contenido de todos los elementos del array
        // dispuestos en forma de tabla como se muestra en la figura.

        //Inicializamos el array de tipo double para indiccar las 3 filas y las 7 columnas
       double[][] arraydoub = {
                {0 , 30 , 2 , 1 , 1 , 5 },
                {75 , 1 , 1 , 1 , 0 , 1 },
                {1 , 1 , -2 , 9 , 1 , 11 ,}
       };
       //Indicamos por pantalla el borde superior de la tabla con un simple "SOUT"
        System.out.println("|----------|---------|---------|---------|---------|----------|----------|");
        System.out.println(" array num  " + "columna 0 " + "columna 1 " + "columna 2 " + "columna 3 " + "columna 4  " + "columna 5  ");

        //Recooremos el array para recorrer las filas y columnas e introducimos las filas del medio para que aparente
        //ser una tabala, volvemos a recorrer el array para hacer que aparezcan algunos huecos en blanco diciendole
        // si es == 1, si no, que aparezca por pantalla
        for (int i = 0; i < arraydoub.length; i++) {
            System.out.println("|----------|---------|---------|---------|---------|----------|----------|");
            System.out.print("  fila " +  i  + "        ");
            for (int a = 0; a < arraydoub[i].length; a++) {
                if (arraydoub[i][a] == 1) {
                    System.out.print("          ");
                } else {
                    System.out.printf(" %-9.0f", arraydoub[i][a]);
                }
            }

            //Hacemos un salto de linea para que no esté junto
            System.out.println();
        }
        //Cerramos la tabla con el borde inferior
        System.out.println("|----------|---------|---------|---------|---------|----------|----------|");
    }
}
