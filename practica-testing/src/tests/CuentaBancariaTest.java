package tests;

import main.CuentaBancaria;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CuentaBancariaTest {

    @Test
    public void testDepositoValido() {
        CuentaBancaria cuenta = new CuentaBancaria("Ana", 100.0);
        cuenta.depositar(50.0);
        assertEquals(150.0, cuenta.getSaldo(), 0.001);
    }
}
