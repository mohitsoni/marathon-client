package mesosphere.marathon.client.model.v2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DeleteAppTaskResponse {
	private Task task;

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	@Override
	public String toString() {
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		return gson.toJson(this);
	}

}
