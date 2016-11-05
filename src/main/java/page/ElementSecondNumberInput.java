package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by RtB on 24.10.2016.
 */
public class ElementSecondNumberInput {

    private  WebDriver driver;

    public ElementSecondNumberInput(WebDriver driver) {
        this.driver = driver;
    }

    public void typeSecondNumberInputValues(By by,String secondValue) {
        //WebDriver driver = MainPage.getDriver();
        //String s = "";
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(secondValue);
    }
}
