package mesosphere.marathon.client.model.v2;

import mesosphere.marathon.client.utils.ModelUtils;

public class Port {
	private Integer containerPort;
	private Integer hostPort;
	private Integer servicePort;
	private String protocol;

	public Port(Integer containerPort) {
		this.containerPort = containerPort;
	}
	
	public Integer getContainerPort() {
		return containerPort;
	}

	public void setContainerPort(Integer containerPort) {
		this.containerPort = containerPort;
	}

	public Integer getHostPort() {
		return hostPort;
	}

	public void setHostPort(Integer hostPort) {
		this.hostPort = hostPort;
	}

	public Integer getServicePort() {
		return servicePort;
	}

	public void setServicePort(Integer servicePort) {
		this.servicePort = servicePort;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}
}