package com.rpg.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rpg.model.personaje;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class JsonHelper {
    public static void leerPersonajes(){
        System.out.println("");
        System.out.println("--Personajes--");
        System.out.println("");
        try{
            Reader reader = Files.newBufferedReader(Paths.get("ficheros/personaje.json"));
            List<personaje> listaPersonaje = new Gson().fromJson(
                    reader,
                    new TypeToken<List<personaje>>(){}.getType()
            );
            for (personaje personaje : listaPersonaje){
                System.out.println("Nombre del personaje : " + personaje.getNombre());
                System.out.println("Raza del personaje " + personaje.getRaza());
                System.out.println("Nivel del personaje " + personaje.getNivel());
                System.out.println("Id del equipo del personaje " + personaje.getEquipo());

            }
            reader.close();

        }catch (IOException e){
            System.out.println("No se ha podido abrir el archivo.");
        }


    }


}