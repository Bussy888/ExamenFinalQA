package estructuraWebUI.pageTodoLy;

import estructuraAppium.control.TextBox;
import org.openqa.selenium.By;
import estructuraWebUI.controls.Button;

public class MainPage {
    public Button loginButton = new Button(By.xpath("//img[@src='/Images/design/pagelogin.png']"));
    public Button signUpButton = new Button(By.xpath("//img[@src='/Images/design/pagesignup.png']"));
    public TextBox errorSignUp = new TextBox(By.id("ErrorMessageText"));
}
