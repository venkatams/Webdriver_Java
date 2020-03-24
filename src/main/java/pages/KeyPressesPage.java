package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String str){
        driver.findElement(inputField).sendKeys(str);
    }

    public String checkResult(){
        return driver.findElement(resultText).getText();
    }

    public void enterPi(){
        enterText(Keys.chord(Keys.ALT,  "227") + "= 3.1415");

    }
}
