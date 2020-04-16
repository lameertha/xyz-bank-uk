package com.xyz.bank.testsuite;

import com.xyz.bank.loadproperty.LoadProperty;
import com.xyz.bank.pages.*;
import com.xyz.bank.testbase.TestBase;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BankTest1 extends TestBase {

    HomePage homePage=new HomePage();
    CustomersPage customersPage=new CustomersPage();
    CustomerLoginPage customerLoginPage=new CustomerLoginPage();
    BankManagerLoginPage bankManagerLoginPage=new BankManagerLoginPage();
    AddCustomerPage addCustomerPage=new AddCustomerPage();
    AccountPage accountPage=new AccountPage();
    OpenAccountPage openAccountPage=new OpenAccountPage();
    BankTestPage bankTestPage=new BankTestPage();
    LoadProperty loadProperty=new LoadProperty();

  /*  @Test
    @Parameters({"FirstName","LastName","PostCode"})
    public void bankManagerShouldAddCustomerSuccessfully(String FirstName,String PostCode,String LastName){
        homePage.clickOnBankManagerLoginBtn();
        bankManagerLoginPage.setAddCustomerFeature();
        addCustomerPage.setFirstName(FirstName);
        addCustomerPage.setLastName(LastName);
        addCustomerPage.setPostCode(PostCode);
        addCustomerPage.setAddCustomer();
        Alert alert=driver.switchTo().alert();
        alert.accept();


    }*/
    @Test
    @Parameters({"CustomerNameSelect","CurrencySelector"})

    public void bankManagerShouldOpenAccountSuccessfully(String CustomerNameSelect,String CurrencySelector){
        homePage.clickOnBankManagerLoginBtn();
        bankManagerLoginPage.setOpenAccountFeature();
        openAccountPage.setCustomerNameSelect(CustomerNameSelect);
        openAccountPage.setCurrencySelector(CurrencySelector);
        openAccountPage.setProcess();
        Alert alert=driver.switchTo().alert();
        alert.accept();



    }
   /* @Test
    @Parameters({"YourName"})
    public void customerShouldLoginAndLogoutSucessfully(String YourName) {
        homePage.clickOnCustomerLoginBtn();
        customerLoginPage.setYourName(YourName);
        customerLoginPage.setLoginBtn();

        String expectedResult = "Harry Potter";
        String actualResult = accountPage.setWelcomeMessage();
        Assert.assertEquals(expectedResult, actualResult);
        customersPage.setLogOutBtn();
    }
    @Test
    @Parameters({"YourName","AmountShouldBeDeposit"})

    public void customerShouldDepositMoneySucessfully(String YourName,String AmountShouldBeDeposit){
        homePage.clickOnCustomerLoginBtn();
        customerLoginPage.setYourName(YourName);
        customerLoginPage.setLoginBtn();
        accountPage.setDeposit();
        accountPage.setAmountShouldBeDeposit(AmountShouldBeDeposit);
        accountPage.setDepositBtn();
        String expectedResult = "Deposit Successful";
        String actualResult = accountPage.setDepositSuccessfulMessage();
        Assert.assertEquals(expectedResult, actualResult);

    }
    @Test
    @Parameters({"YourName","AmountToBeWithdrawn"})
    public void customerShouldWidrawMoneySucessfully(String YourName,String AmountToBeWithdrawn){
        homePage.clickOnCustomerLoginBtn();
        customerLoginPage.setYourName(YourName);
        customerLoginPage.setLoginBtn();
        accountPage.setWithdrawal();
        accountPage.setAmountToBeWithdrawn(AmountToBeWithdrawn);
        accountPage.setWithdrawBtn();
        // String expectedResult = "Transaction successful";
        // String actualResult = accountPage.getTextFromElement(By.linkText("Transaction successful"));
        // Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    @Parameters({"SearchCustomer"})
    public void bankManagerShouldDeleteCustomerSuccessFully(String SearchCustomer){
        homePage.clickOnBankManagerLoginBtn();
        bankTestPage.setCustomerFeature();
        bankTestPage.setSearchCustomer(SearchCustomer);
        bankTestPage.setDeleteBtn();

    }*/
}
