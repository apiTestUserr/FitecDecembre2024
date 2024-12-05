package GestionPanier;

import Utilities.Utility;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

public class AchatProduitDepuisBoutique {



    HomePage hp = new HomePage();
    @BeforeEach
    public void init(){
        Utility.driver = new ChromeDriver();
        hp.naviger_vers_home_page("https://shop-in.ovh/");
    }


    @Test

    public void achat_produit_existant_depuis_boutique() {

      hp.acceder_menu_ByName("Boutique");

      // Rajouter le code de choisir un produit et le rajouter au panier

    }




}
