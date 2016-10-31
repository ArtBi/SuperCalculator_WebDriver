package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by RtB on 24.10.2016.
 */
public class ElementButtonGo {
    private static By buttonLocator = By.xpath("//*[@id='gobutton']");

    private  WebDriver driver;

    public ElementButtonGo(WebDriver driver) {
        this.driver = driver;
    }

    public void pushButton() {
        driver.findElement(buttonLocator).click();
    }
}
