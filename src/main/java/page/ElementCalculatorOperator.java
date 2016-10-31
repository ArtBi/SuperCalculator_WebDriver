package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by RtB on 24.10.2016.
 */
public class ElementCalculatorOperator {
    private static By operatorLocator = By.xpath("*//select[@ng-model='operator']");

    private  WebDriver driver;

    public ElementCalculatorOperator(WebDriver driver) {
        this.driver = driver;
    }

    public void  selectOperator(String operator) {
        driver.findElement(operatorLocator).sendKeys(operator);
    }


}
