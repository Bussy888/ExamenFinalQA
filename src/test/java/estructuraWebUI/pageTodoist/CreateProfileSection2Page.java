package estructuraWebUI.pageTodoist;

import org.openqa.selenium.By;
import estructuraWebUI.controls.Button;

public class CreateProfileSection2Page {
    public Button personalButton = new Button(By.xpath("//button[@name='Personal']"));

    public Button noHelp = new Button(By.xpath("//input[@data-testid='onboardingworkspace-toggle']/../.."));
    public Button continueButton = new Button(By.xpath("//button[@aria-label='Abrir Todoist']"));
}
