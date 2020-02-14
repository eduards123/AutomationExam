package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.MainScreen;
import testUI.Configuration;

import static testUI.UIOpen.open;
import static testUI.Utils.AppiumHelps.sleep;

public class StepDefinition {

    private MainScreen screen = new MainScreen();

    @Given("I open the app")
    public void i_open_the_app()
    {
        Configuration.useAllure = true;
        Configuration.automationType = Configuration.ANDROID_PLATFORM;
        Configuration.androidAppPath = "src/test/resources/groceries-app.apk";
        open();
    }

//clicks settings and add recipe
    @When("I add a new recipe through settings button with name {string}")
    public void iAddANewRecipeThroughSettingsButtonWithName(String arg0)
    {
        screen.ClickOptions();
        sleep(3000);
        screen.setAddRecipeOption();
        sleep(2000);
    }
//inputs the text
    @Then("I see the new recipe added with name {string}")
    public void iSeeTheNewRecipeAddedWithName(String arg0)
    {
        screen.setRecipeInput(arg0);
        sleep(2000);
        screen.clickAddRecipe("ADD RECIPE");
        sleep(2000);
    }

    @When("I enter the recipe {string}")
    public void iEnterTheRecipe(String arg0)
    {
        screen.setRecipeNameRecipe();
        sleep(2000);
    }

    @And("I add a new ingredient {string}")
    public void iAddANewIngredient(String arg0)
    {
        screen.setAddAnItemButton();
        sleep(2000);
    }

    @Then("I see the new added ingredient {string}")
    public void iSeeTheNewAddedIngredient(String arg0)
    {
        screen.setRecipeItemBread();
        sleep(2000);
    }

    @And("I delete the the recipe")
    public void iDeleteTheTheRecipe()
    {
        screen.ClickOptions();
        sleep(3000);
        screen.setDeleteRecipeOption();
        sleep(2000);
        screen.setConfirmRecipeOptionDeleteList();
        sleep(2000);
    }


    @Then("I check if there is {string}")
    public void iCheckIfThereIs(String arg0)
    {
        screen.checkLastScreen(arg0);
        sleep(3000);
    }


    @When("I add new recipe through button")
    public void iAddNewRecipeThroughButton()
    {
        screen.addARecipe();
        sleep(2000);
    }
}
