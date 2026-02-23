package com.rpg.model;

public class ciudades {
        String nombre;
        int poblacion;
        String clima;
        int riesgo;

        public ciudades(String nombre, int poblacion, String clima, int riesgo) {
            this.nombre = nombre;
            this.poblacion = poblacion;
            this.clima = clima;
            this.riesgo = riesgo;

        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getRiesgo() {
            return riesgo;
        }

        public void setRiesgo(int riesgo) {
            this.riesgo = riesgo;
        }

        public String getClima() {
            return clima;
        }

        public void setClima(String clima) {
            this.clima = clima;
        }

        public int getPoblacion() {
            return poblacion;
        }

        public void setPoblacion(int poblacion) {
            this.poblacion = poblacion;
        }
    }

