package Test;

import controller.ScheduleController;
import View.Schedule;
import model.ModelSchedule;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.ResourceBundle;

public class Login_Test {
@Test
public void registration(){
Schedule newSchedule = new Schedule("Paras", "password");
ScheduleController customerController = new ScheduleController();
Assert.assertEquals(1, ScheduleController.registerSchedule(newSchedule));
}
}