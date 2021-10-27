package parenkov.objects;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Objects {

    public void openGoogle() {
        open("https://www.google.com/");
    }

    public void doSearch(String value) {
        $("[name=q]").setValue(value).pressEnter();
    }

    public void checkResults(String value) {
        $(".eqAnXb h3").shouldHave(text(value));
    }

}
