package co.com.test.youtube.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.youtube.com/")
public class LookForAVideoPages extends PageObject {

	public static final Target LBLSEARCH = Target.the("Search lavel").located(By.cssSelector("input[id='search']"));
	public static final Target BTNSEARCH = Target.the("Search button").located(By.id("search-icon-legacy"));
	public static final Target VIDEOSEARCHED = Target.the("Video searched").locatedBy(
			"//ytd-video-renderer/div/div/div/div/h3/a/yt-formatted-string[contains(text(),'{0}')]");
	public static final Target SKIPADDS = Target.the("Skip adds").locatedBy("//div[@id='skip-button:5']/span");

	public static final Target MUSICPLAYER = Target.the("Music player").locatedBy("//span[.='{0}']");

}
