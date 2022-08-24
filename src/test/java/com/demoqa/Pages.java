package com.demoqa;

import com.codeborne.selenide.Condition;

import java.util.Objects;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Pages {

    public void checkTextCss(String cssSelector,String fieldName, String fieldValue){
        $(cssSelector).$(byText(fieldName)).parent().shouldHave(Condition.text(fieldValue));
    }

    public void setValueCss(String fieldName, String fieldValue){
        $(fieldName).setValue(fieldValue);
    }
}
