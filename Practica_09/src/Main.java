import com.rpg.model.ciudades;

public static void main(String[] args){
    try{
        List<String> Lineas = Files.readAllLines(Paths.get("ciudades.txt"));
        List<ciudades> ListaCiudades = new ArrayList<>();
        System.out.println("--Contenido del fichero--");
        for (String linea : Lineas) {
            System.out.println(linea);
            String[] s = linea.split(";");

            ciudades ciudades = new ciudades(
                    s[0],
                    Integer.parseInt(s[1]),
                    s[2],
                    Integer.parseInt(s[3])
            );
            ListaCiudades.add(ciudades);
            System.out.println(ciudades.getPoblacion());
            System.out.println("Total de lineas " + Lineas.size());
        }
        Reader reader = Files.newBufferedReader(Paths.get("ficheros/ciudades.json"));

    }catch (IOException e){
        System.out.println("No se ha podido abrir el archivo.");


    }

}