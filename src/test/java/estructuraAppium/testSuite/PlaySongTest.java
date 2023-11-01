package estructuraAppium.testSuite;

import estructuraAppium.activities.MainMusicPlayer;
import estructuraAppium.activities.PlayerSection;
import estructuraAppium.activities.SearchSection;
import estructuraAppium.session.Session;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PlaySongTest {
    MainMusicPlayer mainMusicPlayer = new MainMusicPlayer();
    SearchSection searchSection = new SearchSection();
    PlayerSection playerSection = new PlayerSection();
    //Introducir el nombre de la cancion de manera precisa
    String songName = "Whiskey And Rain";

    @Test
    public void verifyPlaySongFromSearchbar() throws InterruptedException {
        mainMusicPlayer.acceptButton.click();
        mainMusicPlayer.searchButton.click();
        searchSection.searchTextBox.click();
        searchSection.searchTextBox.setText(songName);
        searchSection.getSpecificSong(songName).click();
        Thread.sleep(5000);
        Assertions.assertEquals(songName, playerSection.nameSongLabel.getText(),"No se reproduce la cancion: "+songName );

    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }
}
