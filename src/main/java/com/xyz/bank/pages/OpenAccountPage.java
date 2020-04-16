package com.xyz.bank.pages;

import com.xyz.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By customerNameSelect = By.xpath("//select[@id='userSelect']");
    By currencySelector = By.xpath("//select[@id='currency']");
    By process = By.xpath("//button[contains(text(),'Process')]");

    public void setCustomerNameSelect(String CustomerNameSelect) {
        sendTextToElement(customerNameSelect,CustomerNameSelect);
    }
    public void setCurrencySelector(String CurrencySelector){
        selectByVisibleTextFromDropDown(currencySelector,CurrencySelector);
    }
    public void setProcess(){
        clickOnElement( process);
    }


}