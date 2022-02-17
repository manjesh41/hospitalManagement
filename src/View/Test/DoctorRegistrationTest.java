package View.Test;
import controller.DoctorController;
import model.Doctor;
import model.Doctor;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class DoctorRegistrationTest {
    DoctorController doctorController;
    Doctor doctor;
    @Before
    public void init(){
        doctorController = new DoctorController();
        doctor = new Doctor(
                "Paras",
                "Ayer",
                "Dhangadhi",
                "1234",
                "doctor",
                "ayer",
                "123"
        );

    }

    @Test
    public void Testingregistration(){
        int expectedResult = 1;
        int actualResult = doctorController.registerCustomer(doctor);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testAdd(){
        int expectedResult = -1;
        int actualResult = doctorController.registerCustomer(doctor);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @After
    public void breakdown(){
        doctorController = null;
        doctor = null;
    }
}