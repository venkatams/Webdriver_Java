package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage ClickFormAuthentication(){
        ClickLink("Form Authentication");
        return (new LoginPage(driver));
    }

    public DropDownPage ClickDropDownLink(){
        ClickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public HoversPage ClickHoversPageLink(){
        ClickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage ClickKeyPresses(){
        ClickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizSliderPage ClickHorizontalSliderLink(){
        ClickLink("Horizontal Slider");
        return new HorizSliderPage(driver);
    }

    private void ClickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
