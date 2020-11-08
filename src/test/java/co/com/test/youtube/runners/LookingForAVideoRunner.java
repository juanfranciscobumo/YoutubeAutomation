package co.com.test.youtube.runners;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/look_video.feature", 
glue = "co/com/test/youtube/stepdefinitions", 
snippets = CAMELCASE)
public class LookingForAVideoRunner {
}
