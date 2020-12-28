package co.com.test.youtube.questions;

import co.com.test.youtube.pages.LookForAVideoPages;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VideoWasPlayed implements Question<String> {
	private String timeVideo;

	public VideoWasPlayed(String timeVideo) {
		this.timeVideo = timeVideo;
	}

	@Override
	public String answeredBy(Actor actor) {
		return LookForAVideoPages.MUSICPLAYER.of(timeVideo).resolveFor(actor).getText();
	}

	public static VideoWasPlayed inYouTube(String timeVideo) {
		return new VideoWasPlayed(timeVideo);
	}
}
