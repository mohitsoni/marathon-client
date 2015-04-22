package mesosphere.marathon.client.model.v2;

import mesosphere.marathon.client.utils.ModelUtils;

import java.util.Collection;

public class HealthCheck {
	private String command;
	private Integer gracePeriodSeconds;
	private Integer intervalSeconds;
	private Integer maxConsecutiveFailures;
	private Integer portIndex;
	private Integer timeoutSeconds;
	private boolean ignoreHttp1xx;
	private String path;
	private String protocol;

	public Integer getGracePeriodSeconds() {
		return gracePeriodSeconds;
	}

	public void setGracePeriodSeconds(Integer gracePeriodSeconds) {
		this.gracePeriodSeconds = gracePeriodSeconds;
	}

	public Integer getIntervalSeconds() {
		return intervalSeconds;
	}

	public void setIntervalSeconds(Integer intervalSeconds) {
		this.intervalSeconds = intervalSeconds;
	}

	public Integer getMaxConsecutiveFailures() {
		return maxConsecutiveFailures;
	}

	public void setMaxConsecutiveFailures(Integer maxConsecutiveFailures) {
		this.maxConsecutiveFailures = maxConsecutiveFailures;
	}

	public Integer getPortIndex() {
		return portIndex;
	}

	public void setPortIndex(Integer portIndex) {
		this.portIndex = portIndex;
	}

	public Integer getTimeoutSeconds() {
		return timeoutSeconds;
	}

	public void setTimeoutSeconds(Integer timeoutSeconds) {
		this.timeoutSeconds = timeoutSeconds;
	}

	public boolean isIgnoreHttp1xx() {
		return ignoreHttp1xx;
	}

	public void setIgnoreHttp1xx(boolean ignoreHttp1xx) {
		this.ignoreHttp1xx = ignoreHttp1xx;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}
}
