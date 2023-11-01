package estructuraWebUI.pageTodoLy;

import org.openqa.selenium.By;
import estructuraWebUI.controls.Button;
import estructuraWebUI.controls.TextBox;

public class SettingsSection {
    public TextBox fullNameInput = new TextBox(By.id("FullNameInput"));
    public Button confirmChangesButton = new Button(By.xpath("//span[text()='Ok']"));
    public Button accountButton = new Button(By.xpath("//a[@href='#settings_Account']"));

    public Button deleteAccountButton = new Button(By.xpath("//input[@name=\"DeleteAccountBtn\"]"));
}