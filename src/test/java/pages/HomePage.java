package pages;

import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class HomePage {

    public void naviger_vers_home_page(String url){


        Utility.driver.get(url);
        Utility.driver.manage().window().maximize();
        Utility.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Utility.driver.findElement(By.xpath("//button[normalize-space()='Accepter']")).click();

    }

    public void acceder_a_mon_compte(){

     //   Utility.driver.findElement(By.xpath("//a[@aria-label='Login']")).click();

        Utility.driver.findElement(By.cssSelector(".ct-account-item")).click();



    }


    public void acceder_menu_ByName(String pageName){

        WebDriverWait wait = new WebDriverWait(Utility.driver, Duration.ofSeconds(10));
       WebElement element_lien = wait.until
               (ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='menu-main-menu']//a[normalize-space()='"+pageName+"']")));
       element_lien.click();

    }
    public void wait_and_close(){


        Utility.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Utility.driver.close();
        Utility.driver.quit();
    }

}
