package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDropPage {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void cheсkDragAndDrop() {
        // открыть страницу
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // перенести прямоугольник А на место В
        $(("#column-a")).dragAndDropTo($("#column-b"));
        // проверить, что прямоугольник А на месте В
        $("#column-b").shouldHave(text("A"));
        // проверить, что прямоугольник В на месте А
        $("#column-a").shouldHave(text("B"));
    }
}
