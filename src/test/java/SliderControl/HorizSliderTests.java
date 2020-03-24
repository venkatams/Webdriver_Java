package SliderControl;

import Base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HorizSliderTests extends BaseTests {

    @Test
    public void testHorizSlider(){
        var horizSliderPage = homePage.ClickHorizontalSliderLink();
        horizSliderPage.MoveSliderRight("4");
    }
}
