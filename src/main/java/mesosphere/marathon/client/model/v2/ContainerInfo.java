package mesosphere.marathon.client.model.v2;

import java.util.ArrayList;
import java.util.Collection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ContainerInfo {
	private String image;
	private Collection<String> options;

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Collection<String> getOptions() {
		return options;
	}

	public void setOptions(Collection<String> options) {
		this.options = options;
	}

	public void addOption(String option) {
		if (options == null) {
			options = new ArrayList<String>();
		}
		options.add(option);
	}

	@Override
	public String toString() {
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		return gson.toJson(this);
	}

}
