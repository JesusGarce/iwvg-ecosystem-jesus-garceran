package es.upm.miw.iwvg.ecosystem.miscellaneous;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    void testDecimal() {
        assertEquals(2, fraction.decimal());
    }

    @Test
    void testAdditingFractions() {
        Fraction sum = fraction.additingFractions(new Fraction(2, 2));
        assertEquals(8, sum.getNumerator());
        assertEquals(5, sum.getDenominator());
    }

    @Test
    void testSubtractingFractions() {
        Fraction sum = fraction.subtractingFractions(new Fraction(2, 2));
        assertEquals(4, sum.getNumerator());
        assertEquals(1, sum.getDenominator());
    }

    @Test
    void testAreEqualsTrue() {
        Fraction fractionCloned = new Fraction(6, 3);
        assertTrue(fraction.areEquals(fractionCloned));
    }

    @Test
    void testAreEqualsFalse() {
        Fraction fractionCloned = new Fraction(6, 2);
        assertFalse(fraction.areEquals(fractionCloned));
    }

    @Test
    void testProperFractionTrue() {
        assertTrue(fraction.isProperFraction());
    }

    @Test
    void testProperFractionFalse() {
        Fraction fraction = new Fraction(3, 6);
        assertFalse(fraction.isProperFraction());
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

