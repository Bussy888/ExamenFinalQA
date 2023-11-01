package estructuraWebUI.pageTodoist;

import org.openqa.selenium.By;
import estructuraWebUI.controls.Button;
import estructuraWebUI.controls.TextBox;

public class SignUpPage {
    public TextBox emailTextBox = new TextBox(By.xpath("//input[@type='email']"));
    public TextBox passwordTextBox = new TextBox(By.xpath("//input[@type='password']"));
    public Button signupButton = new Button(By.xpath("//button[@type='submit']"));
}
