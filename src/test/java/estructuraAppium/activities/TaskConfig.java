package estructuraAppium.activities;

import estructuraAppium.control.Button;
import estructuraAppium.control.TextBox;
import org.openqa.selenium.By;

public class TaskConfig {
    public TextBox title = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox notes = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button saveItemButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    public Button deleteItem = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));

}
