package parenkov.objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Objects {

    // SearchTests
    private SelenideElement searchField = $("[name=q]");
    private SelenideElement result = $(".eqAnXb h3");

    // HoverTests
    private SelenideElement googleAppsButton = $(".gb_C");
    private SelenideElement hoverHint = $(".gb_Ke");
    private SelenideElement signInButton = $(".gb_3");

    // All tests
    public void openGoogleMainPage() {
        open("https://www.google.com/");
    }

    // SearchTests
    public void doSearch(String value) {
        searchField.setValue(value).pressEnter();
    }

    public void checkResults(String value) {
        result.shouldHave(text(value));
    }

    // HoverTests
    public void toHoverOnButton() {
        googleAppsButton.hover();
    }

    public void toHoverOnOtherButton() {
        signInButton.hover();
    }

    public void checkHoverHint() {
        hoverHint.shouldBe(visible);
        hoverHint.shouldHave(text("Google"));
    }

    public void clickButton() {
        googleAppsButton.click();
    }

    public void checkNotVisibleHoverHint() {
        hoverHint.shouldNotBe(visible);
    }
}
