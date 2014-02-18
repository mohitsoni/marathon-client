package mesosphere.marathon.client.model.v2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GetAppResponse {
	private App app;

	public App getApp() {
		return app;
	}

	public void setApp(App app) {
		this.app = app;
	}

	@Override
	public String toString() {
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		return gson.toJson(this);
	}
}
