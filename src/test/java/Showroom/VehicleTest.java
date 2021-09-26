package Showroom;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {
    @Test
        public void transport() {
            Vehicle testVehicle = new Car() {
                @Override
                public String engine() {
                    return null;
                }

                @Override
                public String transmission() {
                    return null;
                }
            };
            assertEquals("Vroom Vroom", testVehicle.transport(), "Vroom Vroom");
        }
    }
