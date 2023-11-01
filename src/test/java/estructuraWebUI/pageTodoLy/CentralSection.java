package estructuraWebUI.pageTodoLy;

import org.openqa.selenium.By;
import estructuraWebUI.controls.Button;

public class CentralSection {
    public Button openSettingsButton = new Button(By.xpath("//a[text()='Settings']"));
    public Button logoutButton = new Button(By.id("ctl00_HeaderTopControl1_LinkButtonLogout"));
}
