/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stqaprac3;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 *
 * @author Ryuske
 */
public class STQAPrac3 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\Sem 5\\Codes\\STQA\\STQA\\STQA\\stqa(1)\\stqa\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");   
driver.manage().window().maximize();
List lists = driver.findElements(By.xpath("//select/option"));
System.out.println("Total no. of lists: " + lists.size());
}
}