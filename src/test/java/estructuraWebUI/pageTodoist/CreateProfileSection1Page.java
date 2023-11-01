package estructuraWebUI.pageTodoist;

import org.openqa.selenium.By;
import estructuraWebUI.controls.Button;
import estructuraWebUI.controls.TextBox;

public class CreateProfileSection1Page {
    public TextBox profileName = new TextBox(By.id("element-0"));
    public Button continueButton = new Button(By.xpath("//button[@type='submit']"));
}
