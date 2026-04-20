package main;

public class CuentaBancaria {

    private String titular;
    private double saldo;
    // Constructor: inicializa el titular y el saldo
    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    // Devuelve el saldo actual
    public double getSaldo() {
        return saldo;
    }
    // Deposita dinero. Lanza excepción si la cantidad es 0 o negativa
    public void depositar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a depositar debe ser pos");
        }
        saldo += cantidad;
    }
    // Retira dinero. Lanza excepción si la cantidad es inválida o no hay fondos
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a retirar debe ser positivo");
        }
        if (cantidad > saldo) {
            throw new IllegalArgumentException("Fondos insuficientes.");
        }
        saldo -= cantidad;
    }

    public String getTitular() {
        return titular;
    }
}