package parenkov.objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Objects {

    private static SelenideElement searchField = $("[name=q]");
    private static SelenideElement result = $(".eqAnXb h3");
    private static SelenideElement googleAppsButton = $(".gb_C");
    private static SelenideElement hoverHint = $(".gb_Ke");

    public void openGoogleMainPage() {

        open("https://www.google.com/");
    }

    public void doSearch(String value) {

        searchField.setValue(value).pressEnter();
    }

    public void checkResults(String value) {

        result.shouldHave(text(value));
    }

    public void toHoverOnButton() {
        googleAppsButton.hover();
    }

    public void checkHoverHint() {
        hoverHint.shouldBe(visible);
        hoverHint.shouldHave(text("Google"));
    }

    public void clickButton() {
        googleAppsButton.click();
    }

    public void checkDisappearingHoverHint() {
        hoverHint.shouldNotBe(visible);
    }
}
