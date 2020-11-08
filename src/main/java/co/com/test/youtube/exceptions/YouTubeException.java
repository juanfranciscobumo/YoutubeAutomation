package co.com.test.youtube.exceptions;

@SuppressWarnings("serial")
public class YouTubeException extends AssertionError {
	public static final String NOT_FOUND_VIDEO = "VIDEO DIDN´T HAVE THE SPECIFIED  DURATION ";

	public YouTubeException(String message, Throwable cause) {
		super(message, cause);

	}
}
