package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }

    @Test
    void suma() {
        assertEquals(5, calc.suma(2, 3));
        assertEquals(-1, calc.suma(2, -3));
    }

    @Test
    void resta() {
        assertEquals(1, calc.resta(4, 3));
        assertEquals(-7, calc.resta(-4, 3));
    }

    @Test
    void multiplicacion() {
        assertEquals(6, calc.multiplicacion(2, 3));
        assertEquals(0, calc.multiplicacion(5, 0));
    }

    @Test
    void division() {
        assertEquals(2, calc.division(6, 3));
        assertThrows(IllegalArgumentException.class, () -> calc.division(5, 0));
    }

    @Test
    void esPar() {
        assertTrue(calc.esPar(4));
        assertFalse(calc.esPar(3));
    }

    @Test
    void maximo() {
        assertEquals(9, calc.maximo(9, 3, 5));
        assertEquals(7, calc.maximo(4, 7, 1));
        assertEquals(6, calc.maximo(2, 5, 6));
        assertEquals(6, calc.maximo(6, 6, 6));
    }

    @Test
    void esDivisible() {
        assertTrue(calc.esDivisible(10, 2));
        assertFalse(calc.esDivisible(10, 3));
        assertThrows(IllegalArgumentException.class, () -> calc.esDivisible(10, 0));
    }
}