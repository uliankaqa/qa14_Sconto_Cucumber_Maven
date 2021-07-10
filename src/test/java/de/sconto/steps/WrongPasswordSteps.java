package de.sconto.steps;

import de.sconto.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.page;

public class WrongPasswordSteps implements En {

    LoginPage loginPage;

    public WrongPasswordSteps() {
        When("I insert user credentials",(DataTable table)->{
            loginPage = page(LoginPage.class);

            List<Map<String,String>> dataTable = table.asMaps();

            String email = dataTable.get(0).get("email");
            String password = dataTable.get(0).get("password");

            loginPage.invalidPasswordInput(email,password);
        });

        Then("I should see error message", () ->{
            loginPage.errorPasswordMessage();

        } );
    }
}


//Given I am on the Homepage
//    When I click on the login icon
//    Then I see Login page
//
//    When I insert  user credentials
//    | email | password |
//    | ulitruli@gmail.com | 12|
//
//    And I click on login button
//    Then I should see error message

