package estructuraWebUI.testSuite;

import estructuraWebUI.pageTodoLy.CentralSection;
import estructuraWebUI.pageTodoLy.LoginSection;
import estructuraWebUI.pageTodoLy.MainPage;
import estructuraWebUI.pageTodoLy.SignUpSection;
import estructuraWebUI.session.Session;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Random;

public class TodoLyTest {

    MainPage mainPage = new MainPage();
    SignUpSection signUp = new SignUpSection();
    LoginSection login = new LoginSection();
    CentralSection centralSection = new CentralSection();
    Random rand = new Random();
    public int random = rand.nextInt();
    String name = "Mateo Michel";
    String email = "mateomichel"+random+"@examenfinal.com";
    String password = "Contra12345";//Pass12345

    @AfterEach
    public void close(){
        Session.getInstance().closeSession();
    }

    @BeforeEach
    public void open(){
        Session.getInstance().getBrowser().get("https://todo.ly/");
    }
    @Test
    public void loginTesting() throws InterruptedException {
        mainPage.signUpButton.click();
        Thread.sleep(1000);
        signUp.emailTextbox.setText(email);
        signUp.passwordTextbox.setText(password);
        signUp.fullNameTextbox.setText(name);
        signUp.acceptTermsButton.click();
        signUp.signUpButton.click();
        Thread.sleep(1000);
        Assertions.assertTrue(centralSection.openSettingsButton.isControlDisplayed(), "ERROR no se pudo iniciar sesion");

        centralSection.logoutButton.click();
        mainPage.signUpButton.click();
        signUp.emailTextbox.setText(email);
        signUp.passwordTextbox.setText(password);
        signUp.fullNameTextbox.setText(name);
        signUp.acceptTermsButton.click();
        signUp.signUpButton.click();
        Thread.sleep(2000);
        Assertions.assertTrue(signUp.signUpButton.isControlDisplayed(), "ERROR No se creo la cuenta anteriormente");

    }
}
