package com.rpg.utils;

import com.rpg.model.ciudades;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TxtHelper {
    public static void leerCiudad(){
        try{
            List<String> Lineas = Files.readAllLines(Paths.get("ficheros/ciudades.txt"));
            List<ciudades> ListaCiudades = new ArrayList<>();
            System.out.println("--Contenido del fichero--");
            System.out.println("");
            Lineas.remove(0);
            for (String linea : Lineas) {

                String[] s = linea.split(";");

                ciudades ciudades = new ciudades(
                        s[0],
                        Integer.parseInt(s[1]),
                        s[2],
                        Integer.parseInt(s[3])
                );
                ListaCiudades.add(ciudades);
                System.out.println("Ciudad: " + ciudades.getNombre()+", "+ ciudades.getPoblacion()+", "+ ciudades.getClima()+", "+ ciudades.getRiesgo());
                System.out.println("Total de lineas " + Lineas.size());
            }

        }
        catch (IOException e){
            System.out.println("No se ha podido abrir el archivo.");
        }
    }
}
