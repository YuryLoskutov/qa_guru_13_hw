package cloud.autotests.tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;

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
    void dtfSearchTest() {
        step("Search bar test", () -> {
            dtfPages.checkSearchBarByXboxNews();
        });
    }

    @Test
    @Description("Позитивная проверка переходв в раздел комметариев")
    @DisplayName("DTF_comment_section_test")
    void dtfCommentSectionTest () {
        step("Go to comment section test", () -> {
            dtfPages.checkCommentSection();
        });
    }

    @Test
    @Description("Позитивная проверка наличия счётчика голосов у поста")
    @DisplayName("DTF_vote_counter_check_test")
    void dtfVoteCounterCheckTest() {
        dtfPages.checkVoteCounter();
    }

    @Test
    @Description("Проверка разворачивания и сворачивания списка разделов на боковой панели")
    @DisplayName("DTF_show_more_button_check_test")
    void dtfShowMoreButtonCheck () {
        dtfPages.checkShowMoreButton();
    }

}