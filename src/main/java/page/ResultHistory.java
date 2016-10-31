package page;


import java.util.ArrayList;
import helpermethods.CustomLoadableComponent;
import helpermethods.PageLoad;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * Created by abylozor on 10/25/2016.
 */
public  class ResultHistory extends CustomLoadableComponent<ResultHistory> {
    private final WebDriver driver;
    private By tableResultLocator = By.xpath("*//table/tbody/tr");


    public ResultHistory(WebDriver driver) {
            this.driver = driver;
    }

    private List<TableRow> resultTable = new ArrayList<TableRow>();


    public String getResult() {
        TableRow tableRow= new TableRow(driver);
        resultTable.add(tableRow);
        return tableRow.getResults();
    }

    @Override
    protected void isLoaded() throws Error{
        if(!PageLoad.newRowHasAdded(this.driver, tableResultLocator)) {
            throw new Error("ResultHistory was not successfully loaded");
        }
    }

    @Override
    protected void load() {}


    public List<TableRow> getAllResultTable(){
        int count=driver.findElements(tableResultLocator).size();
        for (int i = 1; i <= count; i++) {
            TableRow tableRow =new TableRow(driver, i);
            resultTable.add(tableRow);
        }
        return resultTable;
    }

    public void printResultTable(){
        for (TableRow t :resultTable){
            System.out.println(t);
        }
        //System.out.println(resultTable);
        //return this;
    }

    public class TableRow {

        private String time;
        private String expression;
        private String result;


        TableRow(WebDriver driver){
            this.time=driver.findElement(By.xpath("*//table/tbody/tr[1]/td[1]")).getText();
            this.expression=driver.findElement(By.xpath("*//table/tbody/tr[1]/td[2]")).getText();
            this.result=driver.findElement(By.xpath("*//table/tbody/tr[1]/td[3]")).getText();
        }
        TableRow(WebDriver driver,int i){
            this.time=driver.findElement(By.xpath("*//table/tbody/tr["+i+"]/td[1]")).getText();
            this.expression=driver.findElement(By.xpath("*//table/tbody/tr["+i+"]/td[2]")).getText();
            this.result=driver.findElement(By.xpath("*//table/tbody/tr["+i+"]/td[3]")).getText();
        }

        public String getTime(){
            return time;
        }
        public String getExpression(){
            return expression;
        }
        public String getResults(){
            return result;
        }

        @Override
        public String toString() {
            String text ="Time: "+time+"| Expression: "+ expression+"| Result: "+result;
            return text;
        }

    }




}
