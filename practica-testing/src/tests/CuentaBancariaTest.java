package tests;

import main.CuentaBancaria;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;

public class CuentaBancariaTest {

    @Test
    public void testConstructorYGetters() {
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 1000.0);
        assertEquals("Juan", cuenta.getTitular());
        assertEquals(1000.0, cuenta.getSaldo());
    }

    @Test
    public void testDepositarCorrectamente() {
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 100.0);
        cuenta.depositar(50.0);
        assertEquals(150.0, cuenta.getSaldo());
    }

    @Test
    public void testDepositarCantidadNoValida() {
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 100.0);
        // Prueba cantidad negativa
        assertThrows(IllegalArgumentException.class, () -> {
            cuenta.depositar(-1.0);
        });
        // Prueba cantidad cero
        assertThrows(IllegalArgumentException.class, () -> {
            cuenta.depositar(0);
        });
    }

    @Test
    public void testRetirarCorrectamente() {
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 100.0);
        cuenta.retirar(40.0);
        assertEquals(60.0, cuenta.getSaldo());
    }

    @Test
    public void testRetirarCantidadNoValida() {
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 100.0);
        // Prueba cantidad negativa o cero
        assertThrows(IllegalArgumentException.class, () -> {
            cuenta.retirar(-10.0);
        });
    }

    @Test
    public void testRetirarFondosInsuficientes() {
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 100.0);
        // Intento retirar más de lo que hay (100.0)
        assertThrows(IllegalArgumentException.class, () -> {
            cuenta.retirar(101.0);
        });
    }
}
