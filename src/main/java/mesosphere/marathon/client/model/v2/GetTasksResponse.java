package mesosphere.marathon.client.model.v2;

import java.util.Collection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GetTasksResponse {
	private Collection<Task> tasks;

	public Collection<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Collection<Task> tasks) {
		this.tasks = tasks;
	}

	@Override
	public String toString() {
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		return gson.toJson(this);
	}
}
