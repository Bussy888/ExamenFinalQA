package estructuraAppium.activities;

import estructuraAppium.control.Button;
import estructuraAppium.control.Label;
import org.openqa.selenium.By;

public class UserSection {
    public Button profileConfigButton = new Button(By.id("mymusic.offlinemusicplayer.mp3player.playmusic:id/mine_user_action"));
    public Label profileNameLabel = new Label(By.id("mymusic.offlinemusicplayer.mp3player.playmusic:id/text"));

}
