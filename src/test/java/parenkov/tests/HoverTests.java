package parenkov.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import parenkov.objects.Objects;

public class HoverTests {

    Objects search = new Objects();

    // Тесты для проверки появления/пропадания всплывающей подсказки у кнопки "Приложения Google"
    // в правом верхнем углу главной страницы Google.
    // У всплывающей подсказки менятеся видимость при наведении на нее курсора мыши:
    // по дефолту: visibility: hidden; display: none
    // при наведении курсора: visibility: visible
    // То есть всплывающая подсказка - объект с изменяющимся состоянием. Но при использовании static
    // для selenide элементов в page objects проблем при параллельной работе не замечено,
    // возможно всплывающая подсказка не очень удачный для этого пример.

    // Тесты 1, 2, 3 запускаются в одном потоке (последовательно) за счет аннотаций Junit
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
