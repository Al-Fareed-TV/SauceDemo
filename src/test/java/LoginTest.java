
import org.openqa.selenium.SessionNotCreatedException;
import org.testng.annotations.Test;
import pages.Login;


public class LoginTest {

    @Test
    public void testLogin() throws SessionNotCreatedException {
        try {
            Login login = new Login();
            login.LoginUser();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }


}
