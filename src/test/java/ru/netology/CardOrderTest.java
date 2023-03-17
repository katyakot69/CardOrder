package ru.netology;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CardOrderTest {

    @Test
    void shouldPositiveTest() {
        open("http://localhost:9999/");
        $("[data-test-id=name] input").setValue("Волкова Екатерина");
        $("[data-test-id=phone] input").setValue("+79040004961");
        $("[data-test-id=agreement]").click();
        $(".button").click();
        $("[data-test-id=order-success]").shouldHave(text(" Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}
