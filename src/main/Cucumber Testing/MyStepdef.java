
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class MyStepdef {


    public String Make;
    public String Model;
    public String enquiry;
    @Given("I enter details of the car")
    public void igotoenquire(String Carenquiry) {

        enquiry=Carenquiry;

    }

    @And("I enter BMW as car Make and M{int} as the car Model")
    public void iEnterBMWAsCarMakeAndMAsTheCarModel() {

        Sports testCar = new Sports(500,"BMW","M4");

    }

    @Then("I should see the car specifications")
    public void iShouldSeeTheCarSpecifications() {
        testCar.getMake();
        testCar.getMade();
        testCar.getBhp();
    }
}
