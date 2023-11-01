package estructuraWebUI.pageTodoist;

import org.openqa.selenium.By;
import estructuraWebUI.controls.Button;
import estructuraWebUI.controls.TextBox;

public class ConfigurationSection {
    public Button nameProfileButton = new Button(By.xpath("//input[@name='name']"));

    public TextBox nameProfileText = new TextBox(By.xpath("//input[@name='name']"));
    public Button actualizarButton = new Button(By.xpath("//button[@type='submit']"));
    public Button cerrarConfigButton = new Button(By.xpath("//button[contains(@aria-label, 'Cerrar config')]"));
}
