package Test;
import controller.CustomerController;

import View.Registration;

import model.Customer;

import org.junit.After;

import org.junit.Test;

import org.junit.Assert;



import java.util.ResourceBundle;



public class RegistrationTesting {

@Test

public void registration(){

Customer newCustomer = new Customer("Shashanka", "Dhungana", "9860617197", "Boudha", "shashanka", "password");

CustomerController customerController = new CustomerController();

Assert.assertEquals(1, customerController.registerCustomer(newCustomer));

}

}