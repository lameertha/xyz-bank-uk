package com.xyz.bank.pages;

import com.xyz.bank.utility.Utility;
import org.openqa.selenium.By;

public class BankTestPage extends Utility {
    By customerFeature= By.xpath("//button[contains(text(),'Customers')]");
    By searchCustomer=By.xpath("//input[@placeholder='Search Customer']");
    By deleteBtn=By.xpath("//body[@class='ng-scope']/div[@class='ng-scope']/div[@class='container-fluid ng-scope']/div[2]");
    public void setCustomerFeature(){
        clickOnElement(customerFeature);
    }
    public void setSearchCustomer(String SearchCustomer){
        sendTextToElement(searchCustomer,SearchCustomer);
    }
    public void setDeleteBtn(){
        clickOnElement(deleteBtn);
    }
}


