package Test;

import controller.CustomerController;
import view.registration;
import model.Customer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.ResourceBundle;

public class Login_Test {
@Test
public void registration(){
Customer newCustomer = new Customer("Paras", "password");
CustomerController customerController = new CustomerController();
Assert.assertEquals(1, customerController.registerCustomer(newCustomer));
}
}