package ExampleTest;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import java.util.concurrent.TimeUnit;

public class ExampleTest {
    @Test
    public void SampleTest() throws InterruptedException {
        open("https://ilswebreact-develop.azurewebsites.net/");
        $(".login-form").should(Condition.appear);
        $("#login").setValue("rekame2869@seinfaq.com");
        $("#password").setValue("XRCa91zn4fsJzcHW");
        $("button[type=submit]").click();
        $("svg[data-src*=left-arrow]").should(Condition.appear);
        TimeUnit.SECONDS.sleep(10);
    }


    @Test
    public void SampleTestNoData() throws  InterruptedException {
        open("https://ilswebreact-develop.azurewebsites.net/");
        $(".login-form").should(Condition.appear);
        $("button[type=submit]").click();
        $("input[class*=error]").should(Condition.appear);
        $("span[class*=password][class*=status-error]").should(Condition.appear);
        TimeUnit.SECONDS.sleep(10);
    }


    @Test
    public void SampleTestInvalidData() throws  InterruptedException {
        open("https://ilswebreact-develop.azurewebsites.net/");
        $(".login-form").should(Condition.appear);
        $("#login").setValue("SampleText");
        $("#password").setValue("SamplePass");
        $("button[type=submit]").click();
        $("div[class*=notification-notice-error]").should(Condition.appear);
        TimeUnit.SECONDS.sleep(10);
    }
}
