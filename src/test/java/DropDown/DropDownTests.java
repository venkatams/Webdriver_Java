package DropDown;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTests {

    @Test
    public void testSelectedOption() {
        var dropdown = homePage.ClickDropDownLink();

        String option = "Option 1";
        dropdown.selectFromDropDown(option);
        var SelectedOptions = dropdown.getSelectedOptions();
        assertEquals(SelectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(SelectedOptions.contains(option), "Incorrect option selected");
    }
}
