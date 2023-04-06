package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SolutionEnterprisePage {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void verificationEnterprisePage() {
        // открыть страницу
        open("https://github.com/");
        // навести курсор на Solutions
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        // нажать Enterprise
        $$(".HeaderMenu-dropdown-link").findBy(text("Enterprise")).click();
        // проверить заголовок
        $(".enterprise-hero").shouldHave(text("Build like the best"));
    }
}
