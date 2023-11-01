package estructuraWebUI.pageTodoist;

import org.openqa.selenium.By;
import estructuraWebUI.controls.Button;
import estructuraWebUI.controls.TextBox;

public class LoginPage {
    public TextBox emailTextBox = new TextBox(By.xpath("//input[contains(@placeholder, 'email')]"));
    public TextBox passwordTextBox = new TextBox(By.xpath("//input[contains(@placeholder, 'contrase')]"));
    public Button loginButton = new Button(By.xpath("//button[@data-gtm-id]"));
}
