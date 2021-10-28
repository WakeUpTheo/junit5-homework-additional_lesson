package parenkov.tests;

import org.junit.jupiter.api.Test;
import parenkov.objects.Objects;

public class HoverTest extends TestBase {

    Objects search = new Objects();

    @Test
    void googleHoverTest0() {

        search.openGoogleMainPage();
        search.toHoverOnButton();
        search.checkHoverHint();
        search.clickButton();
        search.checkDisappearingHoverHint();
    }

    @Test
    void googleHoverTest1() {

        search.openGoogleMainPage();
        search.toHoverOnButton();
        search.checkHoverHint();
        search.clickButton();
        search.checkDisappearingHoverHint();
    }

    @Test
    void googleHoverTest2() {

        search.openGoogleMainPage();
        search.toHoverOnButton();
        search.checkHoverHint();
        search.clickButton();
        search.checkDisappearingHoverHint();
    }

    @Test
    void googleHoverTest3() {

        search.openGoogleMainPage();
        search.toHoverOnButton();
        search.checkHoverHint();
        search.clickButton();
        search.checkDisappearingHoverHint();
    }
}
