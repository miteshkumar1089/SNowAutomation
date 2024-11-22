package Pages;

import Utilities.ReadingPropertiesFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Loginpage {
    WebDriver driver;
   ReadingPropertiesFile propObj= new ReadingPropertiesFile();

    public static By userName= By.cssSelector("input.form-control");
    public static By password= By.cssSelector("input.form-control[type='password']");
    public static By submitButton= By.cssSelector(".btn.btn-primary");

    public Loginpage(WebDriver driver){
        this.driver = driver;

    }
    public void fillingLoginDetails(String userID, String passwd) throws IOException, IOException {
        driver.findElement(userName).sendKeys(userID);
        driver.findElement(password).sendKeys(passwd);
        driver.findElement(submitButton).click();
        driver.get(propObj.readFromPropertiesFile("CreateIncidentRequestedItemUrl"));
    }

}
