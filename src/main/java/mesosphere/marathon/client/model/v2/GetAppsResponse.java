package mesosphere.marathon.client.model.v2;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GetAppsResponse {
	private List<App> apps;

	public List<App> getApps() {
		return apps;
	}

	public void setApps(List<App> apps) {
		this.apps = apps;
	}

	@Override
	public String toString() {
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		return gson.toJson(this);
	}

}
