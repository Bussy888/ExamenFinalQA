package estructuraWebUI.pageTodoLy;

import org.openqa.selenium.By;
import estructuraWebUI.controls.Button;

public class MenuSection{
        public Button logoutButton = new Button(By.xpath("//a[text()='Logout']"));
        public Button settings = new Button(By.xpath("//a[text()='Settings']"));



}
