package tests;

import data.NegativeData;
import data.PositiveData;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by abylozor on 10/25/2016.
 */
public class NegativeTests extends TestBase{

    @Test(priority = 10,groups = { "NegativeTests" })
    public static void printResultTableToConsole(){
        mainPage.printResultTable();
    }

    @Test(priority = 1,groups = { "NegativeTests" }, dataProvider = "multiplication-provider",dataProviderClass = NegativeData.class)
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

    @Test(priority = 1,groups = { "NegativeTests" }, dataProvider = "addition-provider",dataProviderClass = NegativeData.class)
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
    @Test(priority = 1,groups = { "NegativeTests" }, dataProvider = "subtraction-provider",dataProviderClass = NegativeData.class)
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
    @Test(priority = 1,groups = { "NegativeTests" }, dataProvider = "division-provider",dataProviderClass = NegativeData.class)
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
    @Test(priority = 1,groups = { "NegativeTests" }, dataProvider = "multiplication-provider",dataProviderClass = NegativeData.class)
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
    @Test(priority = 1,groups = { "NegativeTests" }, dataProvider = "percentage-provider",dataProviderClass = NegativeData.class)
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
