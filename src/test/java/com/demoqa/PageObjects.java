package com.demoqa;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PageObjects extends Pages{

    protected SelenideElement firstName = $("#firstName"),
            lastName = $("#lastName"),
            userEmail = $("#userEmail"),
            userNumber = $("#userNumber"),
            currentAddress = $("#currentAddress"),
            subjectsInput = $("#subjectsInput"),
            state = $x("(//div[contains(@class, \"css-tlfecz-indicatorContainer\")])[1]"),
            dateOfBirth = $("#dateOfBirthInput"),
            selectYear = $(".react-datepicker__year-select"),
            selectMonth = $(".react-datepicker__month-select"),
            selectDay = $(".react-datepicker__day--031"),
            gender = $("#gender-radio-1~label"),
            hobbies = $("#hobbies-checkbox-3~label"),
            Haryana = $x("//div[text()='Haryana']"),
            maths = $x("//div[text()='Maths']"),
            karnal = $x("//div[text()='Karnal']"),
            submitButton = $("#submit"),
            city = $x("(//div[contains(@class, \"css-tlfecz-indicatorContainer\")])[2]"),
            uploadPicture = $("#uploadPicture"),
            modalWindow = $(".modal-content"),
            table = $(".table");
}
