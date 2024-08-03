package GFG_Maven.GFG_Maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

public class SimpleService {

// Main driver method
    public static void main(String args[]) throws InterruptedException
    {
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\Users\\krishna reddy\\Downloads\\new\\chromedriver-win64\\chromedriver.exe");
 
        ChromeDriver driver = new ChromeDriver();
       
        driver.get("https://fitpeo.com");
       
        driver.get("https://fitpeo.com/revenue-calculator");
       
      //  driver.findElement(By.linkText("Core Java")).click();
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 100)");
       // driver.findElement(By.id(":R57alklff9da:")).sendKeys("820");  
        WebElement Slider = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]"));
        Thread.sleep(3000);

       Actions moveSlider = new Actions(driver);
        Action action = moveSlider.dragAndDropBy(Slider, (int) 94, 0).build();

        action.perform();
       
        WebElement cptCheckbox99091 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/label/span[1]/input")); // Replace with actual XPath
        WebElement cptCheckbox99454 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/label/span[1]/input")); // Replace with actual XPath
        WebElement cptCheckbox99474 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/label/span[1]/input")); // Replace with actual XPath
        WebElement cptCheckbox994744 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[8]/label/span[1]/input")); // Replace with actual XPath

       

        cptCheckbox99091.click();
        cptCheckbox99454.click();
        cptCheckbox99474.click();
        cptCheckbox994744.click();

        WebElement textField = driver.findElement(By.xpath("//input[@type='text' and contains(@class, 'slider-text-field')]"));
        textField.click();
        textField.clear();
        textField.sendKeys("560");

       
        Thread.sleep(2000);

       
        WebElement sliderValueElement = driver.findElement(By.xpath("//span[contains(@class, 'slider-value')]"));
        String sliderValue = sliderValueElement.getText();
        if (sliderValue.equals("560")) {
            System.out.println("Slider value correctly updated to 560");
        } else {
            System.out.println("Slider value is incorrect: " + sliderValue);
        }
        WebElement totalReimbursementHeader = driver.findElement(By.xpath("//header[contains(text(), 'Total Recurring Reimbursement for all Patients Per Month:')]"));
        WebElement totalReimbursementValue = totalReimbursementHeader.findElement(By.xpath("following-sibling::span"));
        String totalReimbursementText = totalReimbursementValue.getText();
        if (totalReimbursementText.contains("$110700")) {
            System.out.println("Total Recurring Reimbursement is correctly displayed as $110700");
        } else {
            System.out.println("Total Recurring Reimbursement is incorrect: " + totalReimbursementText);
        }
    }
}

