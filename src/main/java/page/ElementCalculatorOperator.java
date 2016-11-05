package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by RtB on 24.10.2016.
 */
public class ElementCalculatorOperator {

    private  WebDriver driver;

    public ElementCalculatorOperator(WebDriver driver) {
        this.driver = driver;
    }

    public void  selectOperator(By by,String operator) {
        driver.findElement(by).sendKeys(operator);
    }


}
