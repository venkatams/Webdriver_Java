package Hovers;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HoversPage;

import static org.testng.Assert.*;

public class HoversTests extends BaseTests {

    @Test
    public void testHoversUser1(){
        var hoversPage = homePage.ClickHoversPageLink();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "caption is not displayed");
        assertEquals(caption.getTitle(), "name: user1", "caption does not match");
        assertEquals(caption.getLinkText(), "View profile", "caption link does not match");
        assertTrue(caption.getLink().endsWith("/users/1"), "link does not match");
    }
}
