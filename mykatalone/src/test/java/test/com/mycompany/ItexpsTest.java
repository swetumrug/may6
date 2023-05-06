/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.mycompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author swetu
 */
public class ItexpsTest {

    private WebDriver driver;

    public ItexpsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testCaseItexps() throws Exception {
        driver.get("https://itexps.com/");
        driver.get("https://www.itexps.net/");
        //Maximize browser window 
        driver.manage().window().maximize();
        driver.findElement(By.id("DrpDwnMn01label")).click();
        driver.findElement(By.id("DrpDwnMn02label")).click();
        driver.findElement(By.id("DrpDwnMn03label")).click();
        driver.findElement(By.id("DrpDwnMn04label")).click();
        driver.findElement(By.id("DrpDwnMn05label")).click();
        driver.findElement(By.id("DrpDwnMn06label")).click();
        driver.close();
    }
}
