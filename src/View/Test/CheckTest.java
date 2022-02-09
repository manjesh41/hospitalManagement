package View.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckTest {
    
    @Test
    public void main() {
        String Password;
        Password = "ADMIN";
        extracted(Password);
    }

    private void extracted(String Username) {
        assertEquals("PARAS", Username);
    }
}
