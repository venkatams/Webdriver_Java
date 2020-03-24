package Keys;

import Base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyTests extends BaseTests {

    @Test
    public void EchoKeyTests(){
        var keyPage = homePage.ClickKeyPresses();
        // Using the selenium library for special keys
        keyPage.enterText("A" + Keys.BACK_SPACE);

        assertEquals(keyPage.checkResult(), "You entered: BACK_SPACE");

         }

    @Test
    public void testPi(){
        var keyPage = homePage.ClickKeyPresses();
        keyPage.enterPi();
    }
}
