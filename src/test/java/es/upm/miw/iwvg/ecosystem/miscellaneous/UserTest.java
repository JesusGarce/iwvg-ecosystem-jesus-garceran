package es.upm.miw.iwvg.ecosystem.miscellaneous;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void createUser() {
        user = new User(1, "Pablo", "Garcia");
    }

    @Test
    void testUser() {
        user = new User(2, "Jesús", "Garcerán");
        assertEquals(2, user.getNumber());
        assertEquals("Jesús", user.getName());
        assertEquals("Garcerán", user.getFamilyName());
    }

    @Test
    void testFullName() {
        assertEquals("Pablo Garcia", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("P.", user.initials());
    }

    @Test
    void testFullInitials() {
        assertEquals("P.G.", user.fullInitials());
    }

    @Test
    void testFamilyName() {
        assertEquals("Garcia", user.getFamilyName());
    }

    @Test
    void testName() {
        assertEquals("Pablo", user.getName());
    }

    @Test
    void testNumber() {
        assertEquals(1, user.getNumber());
    }

}
