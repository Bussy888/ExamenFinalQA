package estructuraAppium.activities;

import estructuraAppium.control.Button;
import estructuraAppium.control.Label;
import estructuraAppium.control.TextBox;
import org.openqa.selenium.By;

public class HomeActivity {
    public Button newTask = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    public Label titleItem = new Label(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));

    public Label noItemsAdded = new Label(By.id("com.vrproductiveapps.whendo:id/noNotesText"));


}
