package co.com.test.youtube.pages;

import net.serenitybdd.screenplay.targets.Target;

public class LookAtTheMenuPage {

    public static final Target LIVE = Target.the("Button menu").locatedBy("//div[@id='guide-inner-content']/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[3]/div/ytd-guide-entry-renderer//yt-formatted-string[.='Live' or .='En vivo']");
    public static final Target TEXT_LIVE = Target.the("Button menu").locatedBy("//yt-formatted-string[@id='title']");

}
