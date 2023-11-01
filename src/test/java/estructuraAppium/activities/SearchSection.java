package estructuraAppium.activities;

import estructuraAppium.control.Button;
import estructuraAppium.control.TextBox;
import org.openqa.selenium.By;

public class SearchSection {
    public TextBox searchTextBox = new TextBox(By.id("mymusic.offlinemusicplayer.mp3player.playmusic:id/searchView"));
    public Button getSpecificSong(String nameTask){
        Button songNameLabel = new Button(By.xpath("//android.widget.TextView" +
                "[@resource-id=\"mymusic.offlinemusicplayer.mp3player.playmusic:id/title\" and @text='"+nameTask+"']"));
        return songNameLabel;
    }
}
