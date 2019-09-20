package es.upm.miw.iwvg.ecosystem.miscellaneous;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    Fraction fraction;

    @BeforeEach
    void createFraction() {
        fraction = new Fraction(6, 3);
    }

    @Test
    void testFractionIntInt() {
        fraction = new Fraction(6, 2);
        assertEquals(6, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
    }

    @Test
    void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testAreEquals() {
        Fraction fractionCloned = new Fraction(6,3);
        assertEquals(true, fraction.areEquals(fractionCloned));
    }

    @Test
    void testDecimal() {
        assertEquals(2, fraction.decimal());
    }

    @Test
    void testEnumerator() {
        assertEquals(3, fraction.getDenominator());
    }

    @Test
    void testNumerator() {
        assertEquals(6, fraction.getNumerator());
    }
}

