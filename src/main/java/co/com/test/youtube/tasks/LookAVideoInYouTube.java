package co.com.test.youtube.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.test.youtube.pages.LookForAVideoPages.*;

public class LookAVideoInYouTube implements Task {
	private String videoName;

	public LookAVideoInYouTube(String videoName) {
		this.videoName = videoName;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(videoName).into(LBLSEARCH), 
				Click.on(BTNSEARCH));
	}

	public static LookAVideoInYouTube withName(String videoName) {
		return Tasks.instrumented(LookAVideoInYouTube.class, videoName);
	}
}