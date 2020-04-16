package com.xyz.bank.pages;

import com.xyz.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    By firstName= By.xpath("//input[@placeholder='First Name']");
    By lastName=By.xpath("//input[@placeholder='Last Name']");
    By postCode=By.xpath("//input[@placeholder='Post Code']");
    By AddCustomer=By.xpath("//button[@class='btn btn-default']");
    By alertBox=By.xpath("//button[@class='btn btn-default']");
    public void setFirstName(String FirstName){
        sendTextToElement(firstName,FirstName);
    }
    public void setLastName(String LastName){
        sendTextToElement(lastName,LastName);
    }
    public void setPostCode(String PostCode){
        sendTextToElement(postCode,PostCode);
    }
    public void setAddCustomer(){
        clickOnElement(AddCustomer);
    }
    public void setAlertBox(){clickOnElement(alertBox);

    }
}