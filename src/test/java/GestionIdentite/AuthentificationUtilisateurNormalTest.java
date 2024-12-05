package GestionIdentite;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AuthentificationUtilisateurNormalTest{

    ChromeDriver driver = new ChromeDriver();

   @Test
    public void authentification_avec_identifiants_valides(){

       driver.get("https://shop-in.ovh/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

      driver.findElement(By.xpath("//button[normalize-space()='Accepter']")).click();

      driver.findElement(By.xpath("//a[@aria-label='Login']")).click();
      driver.findElement(By.xpath("//input[@id='username']")).sendKeys("amira");
      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("amirabenahmed01");
      driver.findElement(By.xpath("//button[@name='login']")).click();


    }


    @Test
    public void authentification_avec_identifiants_Ivalides(){

        driver.get("https://shop-in.ovh/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//button[normalize-space()='Accepter']")).click();

        driver.findElement(By.xpath("//a[@aria-label='Login']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("amira");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("hhhhhhhhh");
        driver.findElement(By.xpath("")).click();


    }


}
