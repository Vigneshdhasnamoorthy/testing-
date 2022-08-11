package Datadriven;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.util.Assert;
import Base.base_class_page;
public class data extends base_class_page {
@Test(dataProvider = "Credentials1")
public void loginTest(String username,String password) {
driver.findElement(By.id("txtUsername")).sendKeys(username);
driver.findElement(By.id("txtPassword")).sendKeys(password);
driver.findElement(By.id("btnLogin")).click();
String actualURL=driver.getCurrentUrl();
String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/dashboard"; AssertJUnit.assertEquals(actualURL, expectedURL);
}
}
