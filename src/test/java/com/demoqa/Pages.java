package com.demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.util.HashMap;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Pages{

    public void checkText(SelenideElement cssSelector, String fieldName, String fieldValue){
        cssSelector.$(byText(fieldName)).parent().shouldHave(Condition.text(fieldValue));
    }

    public void setValues(SelenideElement fieldName, String fieldValue){
        fieldName.setValue(fieldValue);
    }
    public void clickOnElement(SelenideElement elem){
        elem.click();
    }
    public void openUrl(String url){
        open(url);
        executeJavaScript("$('footer').remove()");
        Selenide.zoom(0.95);
    }
}
