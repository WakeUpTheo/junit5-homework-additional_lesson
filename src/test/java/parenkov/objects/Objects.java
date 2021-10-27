package parenkov.objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Objects {

    private SelenideElement searchField = $("[name=q]");
    private SelenideElement result = $(".eqAnXb h3");

    public void openGoogle() {
        open("https://www.google.com/");
    }

    public void doSearch(String value) {
        searchField.setValue(value).pressEnter();
    }

    public void checkResults(String value) {
        result.shouldHave(text(value));
    }
}
