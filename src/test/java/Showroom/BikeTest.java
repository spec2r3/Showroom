package Showroom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @Test
    @DisplayName("Test no Doors")
    public void nodoors() {
        Bike TestBike = new Bike() {
            @Override
            public String engine() {
                return null;
            }

            @Override
            public String transmission() {
                return null;
            }
        };


    }
}