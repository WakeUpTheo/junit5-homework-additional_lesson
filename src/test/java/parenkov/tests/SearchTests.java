package parenkov.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import parenkov.objects.Objects;

public class SearchTests extends TestBase {

    Objects search = new Objects();

    @ValueSource(strings = {
            "Github",
            "Habr",
            "Stack Overflow",
            "Telegram"
    })

    @ParameterizedTest
    void googleSearchTest(String searchQuery) {
        search.openGoogleMainPage();
        search.doSearch(searchQuery);
        search.checkResults(searchQuery);
    }
}
