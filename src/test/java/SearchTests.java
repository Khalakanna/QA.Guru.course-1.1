import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {

    @Test
    void AppleSearchTest() {
        open("https://www.google.com/");

        $(byName("q")).setValue("apple").pressEnter();

        $("#search").shouldHave(text("apple.com"));
    }

    @Test
    void selenideSearchTest() {
        open("https://www.google.com/");

        $(byName("q")).setValue("Selenide").pressEnter();

        $("#search").shouldHave(text("selenide.org"));
    }
}

// comment for pull request
