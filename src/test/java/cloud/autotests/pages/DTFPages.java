package cloud.autotests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DTFPages {

    private final SelenideElement DTFNewBar = $(".sidebar-tree-list-item", 1);
    private final SelenideElement DTFJobBar = $(".sidebar-tree-list-item", 2);
    private final SelenideElement DTFRatingBar = $(".sidebar-tree-list-item", 3);
    private final SelenideElement DTFSubsBar = $(".sidebar-tree-list-item", 4);


    public void checkRightPanelVisibility() {
        $(".layout__left-column").shouldBe(Condition.visible);
    }

    public void checkNewBar() {
        DTFNewBar.click();
        $(".feed__chunk").shouldBe(Condition.visible);
    }
    public void checkJobBar() {
        DTFJobBar.click();
        $(".v-header__title").shouldHave(Condition.text("Вакансии"));
    }
    public void checkRatingBar() {
        DTFRatingBar.click();
        $(".subsite_head__name").shouldHave(Condition.text("Рейтинг сообществ и блогов"));
    }
    public void checkSubsBar() {
        DTFSubsBar.click();
        $(".ui-tabs__content").shouldHave(Condition.text("Подписки"));
    }

    public void checkSearchBarByXboxNews () {
        $(".v-text-input__input").setValue("xbox").pressEnter();
        $(".feed").shouldHave(Condition.text("Подробности патча 1.5 и версий Cyberpunk 2077 для PS5 и Xbox Series X|S: главное со стрима CD Projekt RED "));

    }

}
