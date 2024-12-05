package RechercheProduits;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RechercheHomeTest {

    // Cette classe represente la suite de tests
    // Ici, nous allons appeler les methodes de Selenium Webdriver en creant l'objet
    // Les methodes sont les cas de tests, ie : le nom de la methode est le titre du cas de test

    ChromeDriver  curseur = new ChromeDriver();

  //  @Test
   public  void   recherche_Produit_Existant(){

   // code selenium pour naviger vers la page web et chercher le produit
    curseur.get("https://shop-in.ovh/");

    curseur.findElement(By.xpath("//button[@aria-label='Search']")).click();

      // Cette attente impplicite permet a Selenium d'attendre qq seconde en attendant que tout les elements webs soient rechargés
      // Dans ce cas on attends au maximum 10 secondes

      curseur.findElement(By.xpath("//input[@placeholder='Recherche']")).sendKeys("T-Shirt");

      curseur.findElement(By.xpath("//button[@aria-label='Bouton de recherche']")).click();

      // La validation du resultat attendu par rapport au resultat actuel se fait a l'aide Junit

     String resultat_actuel = curseur.findElement(By.xpath("//h1[@class='page-title']")).getText();

     String resultat_attendu = "Résultats de recherche pour HHHHHHHHH";

     Assertions.assertEquals(resultat_attendu,resultat_actuel);

       }

  // @Test
    public  void   recherche_Produit_Existant_avec_ENTER(){

        // code selenium pour naviger vers la page web et chercher le produit

        curseur.get("https://shop-in.ovh/");

      WebElement   btn_elemnt = curseur.findElement(By.xpath("//button[@aria-label='Search']"));

       btn_elemnt.click();












        curseur.findElement(By.xpath("//input[@placeholder='Recherche']")).sendKeys("T-Shirt" + Keys.ENTER);
    }

   @Test
    public  void   recherche_Produit_Inxistant(){


        // code selenium pour naviger vers la page web et chercher le produit


    }


    @AfterEach

    public void cloture(){

        curseur.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        curseur.close();
        curseur.quit();

    }





}
