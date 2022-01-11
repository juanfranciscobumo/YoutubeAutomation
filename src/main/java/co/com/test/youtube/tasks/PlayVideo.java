package co.com.test.youtube.tasks;

import static co.com.test.youtube.pages.LookForAVideoPages.SKIPADDS;
import static co.com.test.youtube.pages.LookForAVideoPages.VIDEOSEARCHED;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class PlayVideo implements Task {
	private String videoName;

	public PlayVideo(String videoName) {
		this.videoName = videoName;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(VIDEOSEARCHED.of(videoName)),
				Click.on(SKIPADDS));
	}

	public static PlayVideo ofAutorName(String videoName) {
		return Tasks.instrumented(PlayVideo.class, videoName);
	}
}