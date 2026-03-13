package com.rpg.model;

import java.util.ArrayList;

public class personaje {
    String nombre;
    String raza;
    int nivel;
    ArrayList<items> equipo;

    public personaje(String nombre, String raza, int nivel, ArrayList<items> equipo) {
        this.nombre = nombre;
        this.raza = raza;
        this.nivel = nivel;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList<items> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<items> equipo) {
        this.equipo = equipo;
    }
}