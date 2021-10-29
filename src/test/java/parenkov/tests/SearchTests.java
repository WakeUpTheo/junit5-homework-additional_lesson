package parenkov.tests;

import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import parenkov.objects.Objects;

public class SearchTests {

    Objects search = new Objects();

    @ValueSource(strings = {
            "Github",
            "Habr",
            "Stack Overflow",
            "Telegram"
    })
    @Execution(value = ExecutionMode.SAME_THREAD)
    @ParameterizedTest
    void googleSearchTest(String searchQuery) {
        search.openGoogleMainPage();
        search.doSearch(searchQuery);
        search.checkResults(searchQuery);
    }
}
