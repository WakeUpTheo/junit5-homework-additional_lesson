package parenkov.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import parenkov.objects.Objects;

public class ParallelTests extends TestBase {

    Objects search = new Objects();

    @ValueSource(strings = {"Github", "Habr", "Stack Overflow", "Telegram"})
    @ParameterizedTest(name = "Google search: {0}")
    void googleTest(String searchQuery) {
        search.openGoogle();
        search.doSearch(searchQuery);
        search.checkResults(searchQuery);
    }
}
