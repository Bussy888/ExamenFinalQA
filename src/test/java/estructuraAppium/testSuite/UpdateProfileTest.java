package estructuraAppium.testSuite;

import estructuraAppium.activities.MainMusicPlayer;
import estructuraAppium.activities.ProfileConfiguration;
import estructuraAppium.activities.UserSection;
import estructuraAppium.session.Session;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UpdateProfileTest {
     MainMusicPlayer musicPlayer = new MainMusicPlayer();
     UserSection userSection = new UserSection();
     ProfileConfiguration profileConfig = new ProfileConfiguration();
     public String name = "Mateo Michel";
     public String bio = "Esto es una biografia";
    @Test
    public void verifyUpdateProfile() throws InterruptedException {
        musicPlayer.acceptButton.click();
        musicPlayer.userSectionButton.click();
        Thread.sleep(2500);
        userSection.profileConfigButton.click();
        profileConfig.batteryImageButton.click();
        profileConfig.nameTextBox.setText(name);
        profileConfig.biographyTextBox.setText(bio);
        profileConfig.nextButton.click();
        Thread.sleep(2000);
        Assertions.assertEquals(name, userSection.profileNameLabel.getText(),"No se actualizo el" +
                " nombre de usuario a: "+name );
    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }
}
