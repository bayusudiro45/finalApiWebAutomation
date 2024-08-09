package Pages;

import helper.utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.AddHasCasting;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.utility.driver;
import static helper.utility.getDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class WebPage {

    By loginNavbar=By.id("login2");
    By popUpLogin=By.id("logInModalLabel");
    By input_username=By.id("loginusername");
    By input_password=By.id("loginpassword");
    By loginBtn=By.xpath("//button[contains(text(),'Log in')]");
    By Homepage=By.id("nameofuser");
    private boolean acceptNextAlert;
    private WebDriverWait wait;
    By err_msg(String errmsg) {
        return By.xpath("//*[contains(text(),' " + errmsg + "')]");
    }



    public void openDriver(){
        driver.get("https://www.demoblaze.com/");
    }

    public void loginNavbar(){
        driver.findElement(loginNavbar).click();
    }

    public void verifyPopupLogin(){
        driver.findElement(popUpLogin).isDisplayed();
    }

    public void getUsr(String usr) {
        driver.findElement(input_username).sendKeys(usr);
    }


    public void getpwd (String pwd){
        driver.findElement(input_password).sendKeys(pwd);
    }
    public void clickLogin(){
        driver.findElement(loginBtn).click();
    }

    public void clickLogOut(){

        driver.get("https://www.demoblaze.com/index.html");
    }

    public void verifyHomepage(){
        driver.findElement(Homepage).isDisplayed();
    }


    public void VerifyInvalidUserName(String errMsg){
        switch (errMsg) {
            case "Invalid user name":
                assertEquals("Invalid user name", errMsg);
                break;
            case "wrong password":
                assertEquals("wrong password", errMsg);
                break;
            case "Please fill out Username and Password.":
                assertEquals("Please fill out Username and Password.", errMsg);
                break;
            default:
                fail("Unexpected error message: " + errMsg);
        }

    }

    public void laptopcategories(String category){



        WebElement element = driver.findElement(By.xpath("//a[@id='itemc' and contains(text(),'" + category + "')]"));

        // Click on the element
        element.click();
    }



    public void clickAtItem(String product) {




        // Construct the XPath expression with the product variable
        String xpathExpression = "//a[text()='" + product + "']";

        // Wait for the element to be clickable
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExpression)));

        // Click the link
        link.click();
    }

    public void goToProductPage(){
        driver.get("https://www.demoblaze.com/prod.html?idp_=1");
    }



    public void addToCart(){
        driver.findElement(By.xpath("//a[normalize-space()='Add to cart']")).click();
//        assertEquals("Product added.", closeAlertAndGetItsText());
    }


//    private String closeAlertAndGetItsText() {
//        try {
//            Alert alert = driver.switchTo().alert();
//            String alertText = alert.getText();
//            if (acceptNextAlert) {
//                alert.accept();
//            } else {
//                alert.dismiss();
//            }
//            return alertText;
//        } finally {
//            acceptNextAlert = true;
//        }
//    }
//

    public void goToCartPage(){
        driver.findElement(By.id("cartur")).click();
    }

    public void clickDelete(){
        driver.findElement(By.linkText("Delete"));
}


    public void userClickPurchase(){
        driver.findElement(By.xpath("//div[@id='page-wrapper']/div/div[2]/button")).click();
    }

    public void popUpCheckoutForm(){
        driver.findElement(By.id("orderModalLabel")).isDisplayed();
    }

    public void inputName(String name){
        driver.findElement(By.id("name")).sendKeys(name);
    }
    public void inputCountry(String input_country){
        driver.findElement(By.id("country")).sendKeys(input_country);
    }

    public void inputCity(String city){
        driver.findElement(By.id("city")).sendKeys(city);
    }

    public void inputCard(String card){
        driver.findElement(By.id("card")).sendKeys(card);
    }

    public  void inputMonth(String bulan){
        driver.findElement(By.id("month")).sendKeys(bulan);
    }
    public  void inputYear(String year){
        driver.findElement(By.id("year")).sendKeys(year);
    }

    public void clickPurchase(){
        driver.findElement(By.xpath("//div[@id='orderModal']/div/div/div[3]/button[2]")).click();


    }


}



