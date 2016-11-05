package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by RtB on 24.10.2016.
 */
public class ElementFirstNumberInput {


    private WebDriver driver;

    public ElementFirstNumberInput(WebDriver driver) {  this.driver = driver; }

    public void typeFirstNumberInputValues(By by,String firstValue){
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys((firstValue));
    }

}
