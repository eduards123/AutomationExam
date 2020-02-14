package screens;

import testUI.elements.UIElement;
import static testUI.Utils.By.*;
import static testUI.elements.TestUI.E;

public class MainScreen
{
    private UIElement MainScreenOptions = E(byAccesibilityId("More options"));
    private UIElement AddRecipeOption = E(byAndroidUIAutomator("textContains(\"Add Recipe\")"));
    private UIElement RecipeInput = E(byId("editText"));
    private UIElement RecipeNameRecipe = E(byAndroidUIAutomator("textContains(\"RecipeName\")"));
    private UIElement AddAnItemButton = E(byAndroidUIAutomator("textContains(\"Add an item...\")"));
    private UIElement recipeItemBread = E(byId("android:id/text1"));
    private UIElement deleteRecipeOption = E(byAndroidUIAutomator("textContains(\"Delete Recipe\")"));
    private UIElement ConfirmRecipeOptionDeleteList = E(byId("android:id/button1"));
    private UIElement addARecipeButton = E(byAndroidUIAutomator("textContains(\"Add a recipe...\")"));

    public void ClickOptions()
    {
        MainScreenOptions.click();
    }

    public void setAddRecipeOption() {
        AddRecipeOption.click();
    }

    public void setRecipeInput(String var) {
        RecipeInput.sendKeys(var);
    }

    public void clickAddRecipe(String arg)
    {
        UIElement element = E(byAndroidUIAutomator("textContains(\"" + arg + "\")"));
        element.waitFor(5).untilIsVisible();
        element.click();
    }

    public void setRecipeNameRecipe() {
        RecipeNameRecipe.click();
    }

    public void setAddAnItemButton()
    {
        AddAnItemButton.click();
    }

    public void setRecipeItemBread()
    {
        recipeItemBread.click();
    }

    public void setDeleteRecipeOption()
    {
        deleteRecipeOption.click();
    }

    public void setConfirmRecipeOptionDeleteList() {
        ConfirmRecipeOptionDeleteList.click();
    }

    public void checkLastScreen(String arg)
    {
        UIElement element = E(byAndroidUIAutomator("textContains(\"" + arg + "\")"));
        element.waitFor(5).untilNotVisible();
    }


    public void addARecipe()
    {
        addARecipeButton.click();
    }


}
