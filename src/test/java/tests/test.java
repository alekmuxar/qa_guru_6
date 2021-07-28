package tests;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.driver;

public class test {
    @Test
    void findTest() {

        open("https://vk.com/");
        $("#index_email").click();
        $("#index_email").val("xxxxx");
        $("#index_pass").click();
        $("#index_pass").val("xxxxx");
        $("#index_login_button").click();
        sleep(3000);
        $(".side_bar_inner").$(byText("Файлы")).click();
        sleep(3000);
        ElementsCollection files = $$(".docs_action_icon.docs_delete_row");

        for (SelenideElement element: files) {
            element.click();
        }
    }
}
