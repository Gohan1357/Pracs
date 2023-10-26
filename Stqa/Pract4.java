/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stqaprac4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 *
 * @author Ryuske
 */
public class STQAPrac4 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\Sem 5\\Codes\\STQA\\STQA\\STQA\\stqa(1)\\stqa\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://localhost/login_net.php");
driver.manage().window().maximize();
driver.findElement(By.id("user")).sendKeys("Admin");
driver.findElement(By.id("pass")).sendKeys("1234");
driver.findElement(By.id("login")).click();
if(driver.getTitle().contains("welcome")){
System.out.print("Login Successful!");
}
else{
System.out.print("Login Failed!");
}
}
}