package Aplicacion;

import Dominio.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(5, 3);
        System.out.println("La suma es: " + resultado);
    }
}
