package View.Test;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import controller.DoctorController;
import model.Doctor;

public class DoctorTest {
    DoctorController doctorController ;
    Doctor doctor;

    @Before
    public void init(){ 
         doctorController = new DoctorController();
                    
    }
                    
    @Test
    public void testCase() throws SQLException {

        doctor = doctorController.loginCustomer("dipesh.ratala@gmail.com","dipesh");
        boolean expectedValue = doctor!= null;
        boolean actualValue = true;
        Assert.assertEquals(expectedValue, actualValue);

        
    }

    
    @After
    public void shutDown()
{
        doctorController = null;

}
}
