package cloud.autotests.tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedTests extends TestBase {
    @Test
    @Description("Позитивные проверки перехода на боковые вкладки")
    @DisplayName("DTF_sidebar_tests")
    void generatedTest() {

        step("Check right panel availability", () -> {
            dtfPages.checkRightPanelVisibility();
        });

        step("Open Свежее tab", () -> {
            dtfPages.checkNewBar();
        });

        step("Open Вакансии tab", () -> {
            dtfPages.checkJobBar();
        });

        step("Open Рейтинг DTF tab", () -> {
            dtfPages.checkRatingBar();
        });

        step("Open Подписки tab", () -> {
            dtfPages.checkSubsBar();
        });
    }

    @Test
    @Description("Позитивная проверка поля поиска статей")
    @DisplayName("DTF_search_test")
    void DTFSearchTest() {
        step("Search bar test", () -> {
            dtfPages.checkSearchBarByXboxNews();
        });
    }
}