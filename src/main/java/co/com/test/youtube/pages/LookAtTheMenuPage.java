package co.com.test.youtube.pages;

import net.serenitybdd.screenplay.targets.Target;

public class LookAtTheMenuPage {

    public static final Target BTN_GUIDE_ICON = Target.the("Button menu").locatedBy("//div[@id='start']/yt-icon-button[2]");
    public static final Target LIVE = Target.the("Button live").locatedBy("//div[@id='guide-inner-content']/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[3]/div/ytd-guide-entry-renderer//yt-formatted-string[.='Live' or .='En vivo']");
    public static final Target TEXT_LIVE = Target.the("Text live").locatedBy("//div[@id='inner-header-container']/div[1]/ytd-channel-name/div");

}
