package com.demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import com.sun.glass.ui.View;
import dev.failsafe.internal.util.Maths;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
//import sun.security.krb5.Config;

import javax.xml.bind.Element;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestClass extends Pages{

    @BeforeAll
    static void beforeAllTests(){
        //Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest(){
        //Предусловие
        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        Selenide.zoom(0.95);
        setValueCss("#firstName","Иван");
        setValueCss("#lastName","Иванов");
        setValueCss("#userEmail","Ivanov@test.com");
        setValueCss("#userNumber","9010203040");
        setValueCss("#currentAddress","Address Is My private Information");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption("1996");
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__day--031").click();
        $("#gender-radio-1~label").click();
        $("#hobbies-checkbox-3~label").click();
        $("#userNumber").setValue("9010203040");
        $("#currentAddress").setValue("Address Is My private Information");
        $x("(//div[contains(@class, \"css-tlfecz-indicatorContainer\")])[1]").scrollIntoView(true);
        $x("(//div[contains(@class, \"css-tlfecz-indicatorContainer\")])[1]").click();
        $x("//div[text()='Haryana']").click();
        setValueCss("#subjectsInput","M");
        $x("//div[text()='Maths']").click();
        $x("(//div[contains(@class, \"css-tlfecz-indicatorContainer\")])[2]").click();
        $("#uploadPicture").uploadFromClasspath("img/img.jpg");
        $x("//div[text()='Karnal']").click();
        $("#submit").scrollIntoView(true);
        $("#submit").click();
        $(".modal-content").shouldBe(Condition.visible);

        checkTextCss(".table","Student Name","Иван Иванов");
        checkTextCss(".table","Student Email","Ivanov@test.com");
        checkTextCss(".table","Gender","Male");
        checkTextCss(".table","Mobile","9010203040");
        checkTextCss(".table","Date of Birth","31 May,1996");
        checkTextCss(".table","Subjects","Maths");
        checkTextCss(".table","Hobbies","Music");
        checkTextCss(".table","Picture","img.jpg");
        checkTextCss(".table","Address","Address Is My private Information");
        checkTextCss(".table","State and City","Haryana Karnal");
    }
}
