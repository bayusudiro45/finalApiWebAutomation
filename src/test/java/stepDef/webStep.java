package stepDef;

import Pages.WebPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class webStep {

    WebPage webPage;

    public webStep() {
            this.webPage=new WebPage();
    }

    @Given("open page web")
    public void openPageWeb() {
        webPage.openDriver();
    }
    @And("user click login navbar")
    public void userClickLoginNavbar() {
        webPage.loginNavbar();
    }


    @Then("verify user in pop login")
    public void verifyUserInPopLogin() {
        webPage.verifyPopupLogin();
    }

    @And("user input username {string}")
    public void userInputUsername(String usr) {
        webPage.getUsr(usr);
    }

    @And("user input password {string}")
    public void userInputPassword(String pwd) {
        webPage.getpwd(pwd);
    }

    @And("user click login")
    public void userClickLogin() {
        webPage.clickLogin();
    }

    @Then("Verify alart error massage {string}")
    public void verifyErrorMassage(String errMsg) {
        webPage.VerifyInvalidUserName(errMsg);
    }


    @And("user click logout")
    public void userClickLogout() {
        webPage.clickLogOut();
    }

    @And("user click at item {string}")
    public void userClickAtItem(String product) {
        webPage.clickAtItem(product);
    }

    @Then("go to product page")
    public void goToProductPage() {
        webPage.goToProductPage();
    }

    @And("user click add to cart")
    public void userClickAddToCart() {
        webPage.addToCart();
    }

    @Then("go to cart page")
    public void goToCartPage() {
        webPage.goToCartPage();
    }

    @And("user click delete")
    public void userClickDelete() {
        webPage.clickDelete();
    }

    @And("user click Purchase")
    public void userClickPurchase() {
        webPage.userClickPurchase();

    }

    @Then("pop up checkout form")
    public void popUpCheckoutForm() {
        webPage.popUpCheckoutForm();

    }





    @Then("verify user in homepage")
    public void verifyUserInHomepage() {
        webPage.verifyHomepage();
    }


    @And("click the item categories {string}")
    public void clickTheItemCategoriesLaptop(String category) {

       webPage.laptopcategories(category);

    }

    @When("user input name {string}")
    public void userInputName(String name) {
        webPage.inputName(name);
    }

    @And("user input country {string}")
    public void userInputCountry(String country) {
        webPage.inputCountry(country);
    }

    @And("user input city {string}")
    public void userInputCity(String city) {
        webPage.inputCity(city);
    }

    @And("user input card {string}")
    public void userInputCard(String card) {
        webPage.inputCard(card);
    }

    @And("user input month {string}")
    public void userInputMonth(String bulan) {
        webPage.inputMonth(bulan);
    }

    @And("user input year {string}")
    public void userInputYear(String year) {
        webPage.inputYear(year);
    }


    @And("user click bayar")
    public void userClickBayar() {
            webPage.clickPurchase();
    }
}
