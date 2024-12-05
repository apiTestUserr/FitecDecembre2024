package pages;

import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {



    // Creation d'une methode generique login qui va accepter tout les jdd et qui localise les elements web du login



    public void login(String username, String password){

        Utility.driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        Utility.driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        Utility.driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
    }


   public String  get_message_erreur_texte(){


    String  texte_actuel =  Utility.driver.findElement(By.xpath("//main[@id='main']//li[1]")).getText();

    return texte_actuel;

    }



}
