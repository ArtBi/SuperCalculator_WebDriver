package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by RtB on 24.10.2016.
 */
public class ElementFirstNumberInput {
    private By firstValueLocator = By.xpath("*//input[@ng-model='first']");

    private WebDriver driver;

    public ElementFirstNumberInput(WebDriver driver) {  this.driver = driver; }

    public void typeFirstNumberInputValues(String firstValue){
        driver.findElement(firstValueLocator).clear();
        driver.findElement(firstValueLocator).sendKeys((firstValue));
    }

}
