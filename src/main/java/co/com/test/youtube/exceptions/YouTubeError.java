package co.com.test.youtube.exceptions;

@SuppressWarnings("serial")
public class YouTubeError extends AssertionError {
	public static final String NOT_FOUND_VIDEO = "VIDEO DID NOT HAVE THE SPECIFIED  DURATION ";

	public YouTubeError(String message, Throwable cause) {
		super(message, cause);

	}
}
