package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;






public class Register {
	HeaderSection header=new HeaderSection();
	RegisterPage register=new RegisterPage();
	AccountSuccessPage account=new  AccountSuccessPage();

	@Given("^I launch the application$")
	public void i_launch_the_application()  {
		
		Base.driver.get(Base.reader.getUrl());
	    
	}

	@Given("^I navigate to Account Registration page$")
	public void i_navigate_to_Account_Registration_page()  {
		Elements.click(HeaderSection.myAccountLink);
		Elements.click(HeaderSection.register);
		
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable dataTable)  {
		RegisterPage.enterAllRegistrationDetails(dataTable);
	    
	}

	@When("^I select the Privacy Policy$")
	public void i_select_the_Privacy_Policy() {
		Elements.click(RegisterPage.privacyPolicy);
	}

	@When("^I click on Continue button$")
	public void i_click_on_Continue_button()  {
		Elements.click(RegisterPage.continueButton);

	}

	@Then("^I should see that the User Account has successfully created$")
	public void i_should_see_that_the_User_Account_has_successfully_created()  {
		Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.successBreadcrumb));

	   
	}


}
