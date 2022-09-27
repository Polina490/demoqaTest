package com.demoqa;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import testData.DataTesting;

public class TestClass extends PageObjects{

    DataTesting dataTesting = new DataTesting();

    @Test
    void fillFormTest(){
        //Предусловие
        openUrl("https://demoqa.com/automation-practice-form");
        //Услоаие
        setValues(firstName,dataTesting.firstName);
        setValues(lastName,dataTesting.lastName);
        setValues(userEmail,dataTesting.email);
        setValues(userNumber,dataTesting.phoneNumber);
        setValues(currentAddress,dataTesting.address);
        clickOnElement(dateOfBirth);
        selectYear.selectOption(dataTesting.yearOfBirth);
        selectMonth.selectOption(dataTesting.month);
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
        checkText(table,"Student Name",dataTesting.firstName + " " +dataTesting.lastName);
        checkText(table,"Student Email",dataTesting.email);
        checkText(table,"Gender","Male");
        checkText(table,"Mobile",dataTesting.phoneNumber);
        checkText(table,"Date of Birth","31 "+ dataTesting.month+","+dataTesting.yearOfBirth);
        checkText(table,"Subjects","Maths");
        checkText(table,"Hobbies","Music");
        checkText(table,"Picture","img.jpg");
        checkText(table,"Address",dataTesting.address);
        checkText(table,"State and City","Haryana Karnal");
    }
}
