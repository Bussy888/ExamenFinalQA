package estructuraAppium.testSuite;

import estructuraAppium.activities.HomeActivity;
import estructuraAppium.activities.PopUpDeleteItem;
import estructuraAppium.activities.TaskConfig;
import estructuraAppium.session.Session;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CUDItemTest {
    HomeActivity homeActivity = new HomeActivity();
    TaskConfig taskConfig = new TaskConfig();
    PopUpDeleteItem deleteItem = new PopUpDeleteItem();
    String itemName = "Whiskey And Rain";

    @Test
    public void verifyPlaySongFromSearchbar() throws InterruptedException {
        //CREATE
        homeActivity.newTask.click();
        taskConfig.title.setText(itemName);
        taskConfig.notes.setText("Aqui va un descripcion o nota");
        taskConfig.saveItemButton.click();
        Thread.sleep(5000);
        Assertions.assertEquals(itemName, homeActivity.titleItem.getText(),"No se creo el item: "+itemName );

        //UPDATE
        String newItemName = "Beer And Sun";
        homeActivity.titleItem.click();
        taskConfig.title.clearSetText(newItemName);
        taskConfig.saveItemButton.click();
        Assertions.assertEquals(newItemName, homeActivity.titleItem.getText(),"No se creo el item: "+newItemName );

        //DELETE
        homeActivity.titleItem.click();
        taskConfig.deleteItem.click();
        deleteItem.confirmDelete.click();
        Assertions.assertTrue(homeActivity.noItemsAdded.isControlDisplayed(), "No se borro el item");


    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }
}
