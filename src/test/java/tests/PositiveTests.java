package tests;
import data.PositiveData;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by abylozor on 10/25/2016.
 */
public class PositiveTests extends TestBase{

    @Test(priority = 10,groups = { "PositiveTests" })
    public static void printResultTableToConsole(){
        mainPage.printResultTable();
    }

    @Test(priority = 1,groups = { "PositiveTests" }, dataProvider = "multiplication-provider",dataProviderClass = PositiveData.class)
    public static void multiplicationOfNegativeNumbers (String firstParam, String secondParam, String expectedResult){
        Assert.assertEquals(
                mainPage.typeFirstValue(firstParam)
                        .typeSecondValue(secondParam)
                        .typeOperatorValue("*")
                        .pushButton()
                        .waitResult()
                        .getResult()
                ,expectedResult
                ,"Not equeals: ");
    }

    @Test(priority = 1,groups = { "PositiveTests" }, dataProvider = "addition-provider",dataProviderClass = PositiveData.class)
    public static void additionTest(String firstParam, String secondParam, String expectedResult){
        Assert.assertEquals(
                mainPage.typeFirstValue(firstParam)
                        .typeSecondValue(secondParam)
                        .typeOperatorValue("+")
                        .pushButton()
                        .waitResult()
                        .getResult()
                ,expectedResult
                ,"Not equeals: ");
    }
    @Test(priority = 1,groups = { "PositiveTests" }, dataProvider = "subtraction-provider",dataProviderClass = PositiveData.class)
    public static void subtractionTest(String firstParam, String secondParam, String expectedResult){
        Assert.assertEquals(
                mainPage.typeFirstValue(firstParam)
                        .typeSecondValue(secondParam)
                        .typeOperatorValue("-")
                        .pushButton()
                        .waitResult()
                        .getResult()
                ,expectedResult
                ,"Not equeals: ");
    }
    @Test(priority = 1,groups = { "PositiveTests" }, dataProvider = "division-provider",dataProviderClass = PositiveData.class)
    public static void divisionTest(String firstParam, String secondParam, String expectedResult){
        Assert.assertEquals(
                mainPage.typeFirstValue(firstParam)
                        .typeSecondValue(secondParam)
                        .typeOperatorValue("/")
                        .pushButton()
                        .waitResult()
                        .getResult()
                ,expectedResult
                ,"Not equeals: ");
    }
    @Test(priority = 1,groups = { "PositiveTests" }, dataProvider = "multiplication-provider",dataProviderClass = PositiveData.class)
    public static void multiplicationTest(String firstParam, String secondParam, String expectedResult){
        Assert.assertEquals(
                mainPage.typeFirstValue(firstParam)
                        .typeSecondValue(secondParam)
                        .typeOperatorValue("*")
                        .pushButton()
                        .waitResult()
                        .getResult()
                ,expectedResult
                ,"Not equeals: ");
    }
    @Test(priority = 1,groups = { "PositiveTests" }, dataProvider = "percentage-provider",dataProviderClass = PositiveData.class)
    public static void percentageTest(String firstParam, String secondParam, String expectedResult){
        Assert.assertEquals(
                mainPage.typeFirstValue(firstParam)
                        .typeSecondValue(secondParam)
                        .typeOperatorValue("%")
                        .pushButton()
                        .waitResult()
                        .getResult()
                ,expectedResult
                ,"Not equeals: ");
    }


}
