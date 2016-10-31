package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by RtB on 24.10.2016.
 */
public class ElementSecondNumberInput {
    private static By secondValueLocator = By.xpath("*//input[@ng-model='second']");

    private  WebDriver driver;

    public ElementSecondNumberInput(WebDriver driver) {
        this.driver = driver;
    }

    public void typeSecondNumberInputValues(String secondValue) {
        //WebDriver driver = MainPage.getDriver();
        //String s = "";
        driver.findElement(secondValueLocator).clear();
        driver.findElement(secondValueLocator).sendKeys(secondValue);
    }
}
