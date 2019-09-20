package es.upm.miw.iwvg.ecosystem.miscellaneous;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {
    private Point point;

    @BeforeEach
    void before() {
        point = new Point(2, 3);
    }

    @Test
    void testPointIntInt() {
        assertEquals(2, point.getX());
        assertEquals(3, point.getY());
    }

    @Test
    void testPointInt() {
        point = new Point(2);
        assertEquals(2, point.getX());
        assertEquals(2, point.getY());
    }

    @Test
    void testPoint() {
        point = new Point();
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
    }

    @Test
    void testPointPoint() {
        Point pointCloned = new Point(point);
        assertEquals(2, pointCloned.getX());
        assertEquals(3, pointCloned.getY());
    }

    @Test
    void testModule() {
        assertEquals(3.6055, point.module(), 10e-5);
    }

    @Test
    void testPhase() {
        assertEquals(0.9828, point.phase(), 10e-5);
    }

    @Test
    void testIncreaseX() {
        point.increaseX();
        assertEquals(3, point.getX());
    }

    @Test
    void testIncreaseY() {
        point.increaseY();
        assertEquals(4, point.getY());
    }

    @Test
    void testDecreaseX() {
        point.decreaseX();
        assertEquals(1, point.getX());
    }

    @Test
    void testDecreaseY() {
        point.decreaseY();
        assertEquals(2, point.getY());
    }

    @Test
    void testTranslateOrigin() {
        this.point.translateOrigin(new Point(1, 1));
        assertEquals(1, point.getX());
        assertEquals(2, point.getY());
    }

}
