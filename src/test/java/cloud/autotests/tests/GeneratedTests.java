package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

//

public class GeneratedTests extends TestBase {
    @Test
    @Description("Проверка")
    @DisplayName("DTF_tests")
    void generatedTest() {
        step("Open dtf.ru", () -> {
            open("https://dtf.ru/");
        });

        step("Check right panel availability", () -> {
            $(".layout__left-column").shouldBe(Condition.exist);
        });

        step("Open Свежее tab", () -> {
            $(".sidebar-tree-list-item", 1).click();
            $(".feed__chunk").shouldBe(Condition.exist);
        });

        step("Open Вакансии tab", () -> {
            $(".sidebar-tree-list-item", 2).click();
            $(".v-header__title").shouldHave(Condition.text("Вакансии"));
        });

        step("Open Рейтинг DTF tab", () -> {
            $(".sidebar-tree-list-item", 3).click();
            $(".subsite_head__name").shouldHave(Condition.text("Рейтинг сообществ и блогов"));
        });

        step("Open Подписки tab", () -> {
            $(".sidebar-tree-list-item", 4).click();
            $(".ui-tabs__content").shouldHave(Condition.text("Подписки"));
        });
    }
}