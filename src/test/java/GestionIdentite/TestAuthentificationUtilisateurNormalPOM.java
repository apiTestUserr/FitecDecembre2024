package GestionIdentite;

import Utilities.Utility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class TestAuthentificationUtilisateurNormalPOM {
    // POM ici c'est page object model qui est different du pom.xml
    HomePage hp = new HomePage();
    LoginPage lp = new LoginPage();
    @BeforeEach
    public void init(){
        Utility.driver = new ChromeDriver();
        hp.naviger_vers_home_page("https://shop-in.ovh/");
        hp.acceder_a_mon_compte();
   }
    //@Test
    public void authentification_identifiants_valides(){
        lp.login("amira","amirabenahmed01");
   }
  //  @Test
    public void authentification_identifiants_Ivalides(){
        lp.login("amira","hhhhhhhhhhhh");

        Assertions.assertTrue(lp.get_message_erreur_texte().contains("mot de passe ne correspond pas"));
    }


    @Test
    public void authentification_compte_pas_inscrit(){
        lp.login("yyyyyyyy","hhhhhhhhhhhh");

        Assertions.assertTrue(lp.get_message_erreur_texte().contains("n’est pas hhhhhhhhh sur ce site. "));
    }
    @AfterEach
    public void tearDown(){
     hp.wait_and_close();
    }
}
