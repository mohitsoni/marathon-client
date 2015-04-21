package mesosphere.marathon.client.utils;

public class MarathonException extends Exception {
	private static final long serialVersionUID = 1L;
	private int status;
	private String message;
	
	public MarathonException(int status, String message) {
		this.status = status;
		this.message = message;
	}

    /**
     * Gets the HTTP status code of the failure, such as 404.
     */
    public int getStatus() {
        return status;
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
