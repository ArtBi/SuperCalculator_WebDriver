package page;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by RtB on 24.10.2016.
 */
public class MainPage {

    private WebDriver driver;
    private ResultHistory historyResults;
    private ElementCalculatorOperator operatorClass;
    private ElementFirstNumberInput elementFirstNumberInput;
    private ElementSecondNumberInput elementSecondNumberInput;
    private ElementButtonGo elementButtonGo;


    public MainPage(WebDriver driver) {
        this.driver = driver;
        init();
    }
    public MainPage init(){
        historyResults =new ResultHistory(driver);
        operatorClass = new ElementCalculatorOperator(driver);
        elementFirstNumberInput = new ElementFirstNumberInput(driver);
        elementSecondNumberInput = new ElementSecondNumberInput(driver);
        elementButtonGo =new ElementButtonGo(driver);
        return this;
    }

    public MainPage typeFirstValue(String firstValue){
        elementFirstNumberInput.typeFirstNumberInputValues(firstValue);
        return this;
    }
    public MainPage typeSecondValue(String secondValue){
        elementSecondNumberInput.typeSecondNumberInputValues(secondValue);
        return this;
    }
    public MainPage typeOperatorValue(String operator){
        operatorClass.selectOperator(operator);
        return this;
    }
    public MainPage pushButton(){
        elementButtonGo.pushButton();
        return this;
    }
    public MainPage waitResult(){
        historyResults.get();
        return this;
    }
    public String getResult(){
        return historyResults.getResult();
    }
    public void getAllResultTable (){
        historyResults.getAllResultTable();
    }
    public MainPage printResultTable(){
        historyResults.printResultTable();
        return this;
    }

}
