package Showroom;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.*;
import org.junit.jupiter.api.DisplayName;

public class SportsTest {

    @Test
    @DisplayName("Tests Car Specifications")
    public void CarSpec() {
        Sports testCar = new Sports(650,"BMW","M5 Comp");
        assertEquals(650, testCar.getBhp(),"False");
        assertEquals("BMW", testCar.getMake(),"False");
        assertEquals("M5 Comp", testCar.getModel(),"False");
    }

    @Test
    @DisplayName("Tests Car Specifications")
    public void CarSpec1() {
        Sports testCar = new Sports("BMW","M5 Comp");
        assertEquals(500, testCar.getBhp(),"False");
        assertEquals("BMW", testCar.getMake(),"False");
        assertEquals("M5 Comp", testCar.getModel(),"False");
    }

    @Test
    @DisplayName("Tests Car Specifications")
    public void CarSpec2() {
        Sports testCar = new Sports("BMW");
        assertEquals(500, testCar.getBhp(), "False");
        assertEquals("BMW", testCar.getMake(),"False");
        assertEquals("M4", testCar.getModel(),"False");
    }

    @Test
    @DisplayName("Tests Car Specifications")
    public void CarSpec3() {
        Sports testCar = new Sports();
        assertEquals(500, testCar.getBhp(), "False");
        assertEquals("BMW", testCar.getMake(),"False");
        assertEquals("M4", testCar.getModel(),"False");
    }

    @Test
    public void getBhp() {
    }

    @Test
    public void getMake() {
    }

    @Test
    public void getModel() {
    }
}