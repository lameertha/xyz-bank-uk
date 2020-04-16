package com.xyz.bank.pages;

import com.xyz.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By yourName = By.xpath("//select[@id='userSelect']");
    By loginBtn = By.xpath("//button[@class='btn btn-default']");

    public void setYourName(String YourName){
        selectByVisibleTextFromDropDown(yourName,YourName);
    }
    public void setLoginBtn(){
        clickOnElement(loginBtn);
    }

}