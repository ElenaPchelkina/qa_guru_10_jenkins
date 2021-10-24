package pages;

import components.Calendar;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.String.format;

public class RegistrationPage {

    private Calendar calendar = new Calendar();

    public RegistrationPage openPage(){
        open("/automation-practice-form");

        return this;
    }
    public RegistrationPage typeFirstName(String firstName) {
        $("#firstName").setValue(firstName);

        return this;
    }

    public RegistrationPage typeLastName(String lastName) {
        $("#lastName").setValue(lastName);

        return this;
    }

    public RegistrationPage typeEmail(String email) {
        $("#userEmail").setValue(email);

        return this;
    }

    public RegistrationPage selectGender (String gender) {
        $(format("[name=gender][value=%s]", gender)).parent().click();

        return this;
    }

    public RegistrationPage typePhone (String phone) {
        $("#userNumber").setValue(phone);

        return this;
    }

    public RegistrationPage setDateOfBirth (String day, String month, String year) {
        calendar.setDate(day, month, year);

        return this;

    }

    public RegistrationPage typeSubjects (String subjects){
        $("#subjectsInput").setValue(subjects).pressEnter();

        return this;
    }

    public RegistrationPage selectHobbies (String hobbies){
        $("#hobbiesWrapper").$(byText(hobbies)).click();

        return this;

    }

    public RegistrationPage uploadPicture(){
        $("#uploadPicture").uploadFile(new File("src/test/resources/test.jpg"));

        return this;
    }

    public RegistrationPage typeCurrentAddress(String currentAddress){
        $("#currentAddress"). setValue(currentAddress);

        return this;

    }
    public RegistrationPage selectState (String state){
        $("#react-select-3-input").setValue(state).pressEnter();

        return this;

    }

    public RegistrationPage selectCity (String city){
        $("#react-select-4-input").setValue(city).pressEnter();

        return this;

    }

    public RegistrationPage submitPage(){
        $(byText("Submit")).scrollTo().click();

        return this;

    }

    public RegistrationPage checkResultsValue (String value) {
        $(byClassName("modal-body")).shouldHave(text(value));

        return this;
    }





}
