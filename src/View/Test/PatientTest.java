package View.Test;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import controller.CustomerController;
import model.Customer;

public class PatientTest {
    CustomerController customerController ;
    Customer customer;

    @Before
    public void init(){
        customerController = new CustomerController();

    }

    @Test
    public void testCase() throws SQLException {

        customer = customerController.loginCustomer("paras@gmail.com","1234");
        boolean expectedValue = customer!= null;
        boolean actualValue = true;
        Assert.assertEquals(expectedValue, actualValue);


    }


    @After
    public void shutDown()
    {
        customerController = null;

    }
}

