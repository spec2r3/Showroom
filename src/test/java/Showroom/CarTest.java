package Showroom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    @DisplayName("Tests the doors")
    public void doors() {

        Car TestCar = new Car() {
            @Override
            public String engine() {
                return null;
            }

            @Override
            public String transmission() {
                return null;
            }
        };

        assertEquals("Has Doors", Car.doors(), "Has Doors");

    }
}