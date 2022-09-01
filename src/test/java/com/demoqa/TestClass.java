package com.demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
//import sun.security.krb5.Config;

import static com.codeborne.selenide.Selenide.*;

public class TestClass extends PageObjects{

    @Test
    void fillFormTest(){
        //Предусловие
        openUrl("https://demoqa.com/automation-practice-form");
        //Услоаие
        setValues(firstName,"Иван");
        setValues(lastName,"Иванов");
        setValues(userEmail,"Ivanov@test.com");
        setValues(userNumber,"9010203040");
        setValues(currentAddress,"Address Is My private Information");
        clickOnElement(dateOfBirth);
        selectYear.selectOption("1996");
        selectMonth.selectOption("May");
        clickOnElement(selectDay);
        clickOnElement(gender);
        clickOnElement(hobbies);
        state.scrollIntoView(true);
        clickOnElement(state);
        clickOnElement(Haryana);
        setValues(subjectsInput,"M");
        clickOnElement(maths);
        clickOnElement(city);
        uploadPicture.uploadFromClasspath("img/img.jpg");
        clickOnElement(karnal);
        submitButton.scrollIntoView(true);
        clickOnElement(submitButton);
        modalWindow.shouldBe(Condition.visible);
        //Проверка
        checkText(table,"Student Name","Иван Иванов");
        checkText(table,"Student Email","Ivanov@test.com");
        checkText(table,"Gender","Male");
        checkText(table,"Mobile","9010203040");
        checkText(table,"Date of Birth","31 May,1996");
        checkText(table,"Subjects","Maths");
        checkText(table,"Hobbies","Music");
        checkText(table,"Picture","img.jpg");
        checkText(table,"Address","Address Is My private Information");
        checkText(table,"State and City","Haryana Karnal");
    }
}
