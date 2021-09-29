package Showroom;
import java. util. Scanner;
import io.cucumber.core.gherkin.Feature;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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
    @Given("I go to enquire")
    public void iGoToEnquire() {
        assertEquals(Car.enquiry(),"I go to enquire");
    }
    @Given("I enter BMW as car Make and M4 as the car Model")
    public void i_enter_bmw_as_car_make_and_m4_as_the_car_model() {
        Sports testCar = new Sports(500,"BMW","M4");
    }
    @Then("I should see the car specifications")
    public void i_should_see_the_car_specifications() {
        Sports testCar = new Sports(500,"BMW","M4");
        testCar.getMake();
        testCar.getModel();
        testCar.getBhp();

    }

}