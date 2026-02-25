package com.rpg.model;

import java.util.ArrayList;

public class personaje {
    String nombre;
    String raza;
    int nivel;
    String[] equipoIds;

    public personaje(String nombre, String raza, int nivel, String[] equipoIds) {
        this.nombre = nombre;
        this.raza = raza;
        this.nivel = nivel;
        this.equipoIds = equipoIds;
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

    public String[] getEquipoIds() {
        return equipoIds;
    }

    public void setEquipoIds(String[] equipoIds) {
        this.equipoIds = equipoIds;
    }
}
