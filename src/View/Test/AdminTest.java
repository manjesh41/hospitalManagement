package View.Test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class AdminTest {
    @Test
    public void view() {
        String Password;
        Password = "ADMIN";
        assertEquals("ADMIN", Password);
    }
    @Test
    public void view1() {
        String Username;
        Username = "ADMIN";
        assertEquals("ADMIN", Username);
    }

}
