package tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import page.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

/**
 * Created by abylozor on 10/25/2016.
 */

public class TestBase{

    protected static WebDriver webDriver;
    protected static MainPage mainPage;

    @BeforeSuite(groups = {"SetUP"})
    @Parameters({"test-uri","browser","sys"})
    public void setUp(@Optional("localhost:8080")String url, @Optional("FF")String browser, @Optional("PC")String sys) throws Exception {
        initDriver(sys,browser);
        openURI(url);
        mainPage =new MainPage(webDriver);
    }

    private void initDriver(String sys,String browser) {
        if (sys.equalsIgnoreCase("MAC")){
            if (browser.equalsIgnoreCase("FF")) {
                System.setProperty("webdriver.gecko.driver", "tools//selenium//geckodriver");
                webDriver = new FirefoxDriver();
            }
            if (browser.equalsIgnoreCase("CHROME")) {
                System.setProperty("webdriver.chrome.driver", "tools//selenium//chromedriver");
                webDriver = new ChromeDriver();
            }
        }
        else {
            if (browser.equalsIgnoreCase("FF")) {
                System.setProperty("webdriver.gecko.driver", "tools\\selenium\\geckodriver.exe");
                webDriver = new FirefoxDriver();
            }
            if (browser.equalsIgnoreCase("CHROME")) {
                System.setProperty("webdriver.chrome.driver", "tools\\selenium\\chromedriver.exe");
                webDriver = new ChromeDriver();
            }
        }
    }

    @AfterSuite(groups = {"SetUP"})
    public void afterSuite(){
        webDriver.close();
    }

    protected void openURI(String uri){
        webDriver.get(uri);
        webDriver.manage().window().maximize();
    }
}

