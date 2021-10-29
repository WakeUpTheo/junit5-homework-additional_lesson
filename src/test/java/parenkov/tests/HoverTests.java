package parenkov.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import parenkov.objects.Objects;

public class HoverTests extends TestBase {

    Objects search = new Objects();

    @Test
    void googleHoverTest0() {
        search.openGoogleMainPage();
        search.checkNotVisibleHoverHint();
        search.toHoverOnButton();
        search.checkHoverHint();
        search.toHoverOnOtherButton();
        search.checkNotVisibleHoverHint();
    }

    @Execution(value = ExecutionMode.SAME_THREAD)
    @Test
    void googleHoverTest1() {
        search.openGoogleMainPage();
        search.clickButton();
        search.checkNotVisibleHoverHint();
        search.clickButton();
        search.checkNotVisibleHoverHint();
    }

    @Execution(value = ExecutionMode.SAME_THREAD)
    @Test
    void googleHoverTest2() {
        search.openGoogleMainPage();
        search.clickButton();
        search.toHoverOnOtherButton();
        search.toHoverOnButton();
        search.checkHoverHint();
    }

    @Execution(value = ExecutionMode.SAME_THREAD)
    @Test
    void googleHoverTest3() {
        search.openGoogleMainPage();
        search.checkNotVisibleHoverHint();
        search.toHoverOnButton();
        search.checkHoverHint();
        search.clickButton();
        search.checkNotVisibleHoverHint();
    }
}
