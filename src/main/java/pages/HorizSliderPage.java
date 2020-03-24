package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizSliderPage {
    private WebDriver driver;
    By sliderCtrl = By.xpath("//div[@class='sliderContainer']//input");
    By range = By.id("range");

    public HorizSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void MoveSliderRight(String value){

        //float index=Float.parseFloat(getSliderValue());

        while (!getSliderValue().equals(value)) {
            driver.findElement(sliderCtrl).sendKeys(Keys.ARROW_RIGHT);
            //index=Float.parseFloat(driver.findElement(range).getText());
        }

        System.out.println("The slider range is " + driver.findElement(range).getText());
    }

    public String getSliderValue(){
        return driver.findElement(range).getText();
    }

}
