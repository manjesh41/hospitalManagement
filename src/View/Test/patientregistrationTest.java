package View.Test;
import controller.CustomerController;
import model.Customer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class patientregistrationTest {
    CustomerController customerController;
    Customer customer;
    @Before
    public void init(){
        customerController = new CustomerController();
        customer = new Customer(
                "Biendra",
                "KC",
                "ktm",
                "98123456",
                "bikendo",
                "234"
        );
    }

    @Test
    public void Testingregistration(){
        int expectedResult = 1;
        int actualResult = customerController.registerCustomer(customer);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testAdd(){
        int expectedResult = 1;
        int actualResult = customerController.registerCustomer(customer);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @After
    public void breakdown(){
        customerController = null;
        customer = null;
    }
}