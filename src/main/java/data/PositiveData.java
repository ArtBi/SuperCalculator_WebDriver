package data;

import org.testng.annotations.DataProvider;

/**
 * Created by RtB on 28.10.2016.
 */
public class PositiveData {
    @DataProvider(name = "multiplication-provider")
    public static Object[][] multiplicationTestProvider() {
        //String urlData ="";
        return new Object[][]{
                {"3", "2","6"},
                {"2", "0","0"},
                {"0", "7","0"},
                {"0.1", "0.2","0,02"},
                {"8", "0.5","4"},
                {"0.5", "8","4"},
                {"0.5", "9","4,5"},
                {"123955", "2566622","318145630010"},
                {"-3", "2","-6"},
                {"-2", "0","0"},
                {"0", "-7","0"},
                {"123955", "-2566622","-318145630010"},
                {"1", "1", "1"},
                {"1", "0", "0"},
                {"0", "0", "0"},
                {"-1", "-1", "1"},
                {"3", "2","6"},
                {"0.1", "3", "0.3"},
                {"0.1", "10", "1"},
        };
    }


    @DataProvider(name = "addition-provider")
    public static Object[][] additionTestProvider() {
        return new Object[][]{
                {"1", "1", "2"},
                {"-1", "-1", "-2"},
                {"-1", "1", "0"},
                {"1", "-1", "0"},
                {"1.1", "1.1","2.2"}// - this test is failed
        };
    }

    @DataProvider(name = "subtraction-provider")
    public static Object[][] subtractionTestProvider() {
        return new Object[][]{
                {"1", "1", "0"},
                {"0", "-1","1"},
                {"0", "1", "-1"},
                {"-1", "-1", "0"},
                {"-1.1", "1.1","-2.2"}, // this test is failed
                {"1.1", "1","0.1"}// - this test is failed
        };
    }

    @DataProvider(name = "division-provider")
    public static Object[][] divisionTestProvider() {
        return new Object[][]{
                {"1", "1", "1"},
                {"2", "1", "2"},
                {"3", "-1", "-3"},
                {"-1", "-1","1"},
                {"3", "2","1.5"},
                {"2", "3", "0.6666666666666666"},
                {"1.1", "1","1.1"},
        };
    }

    @DataProvider(name = "percentage-provider")
    public static Object[][] percentageTestProvider() {
        return new Object[][]{
                {"10", "100","10"},
                {"15", "100","15"},
                {"3.3", "100","3.3"},
                {"3", "200", "6"},
                {"50", "50","25"},
                {"0", "100","0"}
        };
    }
}
