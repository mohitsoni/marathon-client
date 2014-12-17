package mesosphere.marathon.client.utils;

public class MarathonException extends Exception {
	private static final long serialVersionUID = 1L;
	private int status;
	private String message;
	
	public MarathonException(int status, String message) {
		this.status = status;
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message + " (http status: " + status + ")";
	}

	@Override
	public String toString() {
		return message + " (http status: " + status + ")";
	}
}
