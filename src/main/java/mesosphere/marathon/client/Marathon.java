package mesosphere.marathon.client;

import java.util.List;

import javax.inject.Named;

import mesosphere.marathon.client.model.v2.App;
import mesosphere.marathon.client.model.v2.DeleteAppTaskResponse;
import mesosphere.marathon.client.model.v2.DeleteAppTasksResponse;
import mesosphere.marathon.client.model.v2.Deployment;
import mesosphere.marathon.client.model.v2.GetAppResponse;
import mesosphere.marathon.client.model.v2.GetAppTasksResponse;
import mesosphere.marathon.client.model.v2.GetAppsResponse;
import mesosphere.marathon.client.model.v2.GetServerInfoResponse;
import mesosphere.marathon.client.model.v2.GetTasksResponse;
import mesosphere.marathon.client.model.v2.Group;
import mesosphere.marathon.client.model.v2.Result;
import mesosphere.marathon.client.utils.MarathonException;
import feign.RequestLine;

public interface Marathon {
    // Apps
	@RequestLine("GET /v2/apps")
	GetAppsResponse getApps();

	@RequestLine("GET /v2/apps/{id}")
	GetAppResponse getApp(@Named("id") String id) throws MarathonException;

	@RequestLine("GET /v2/apps/{id}/tasks")
	GetAppTasksResponse getAppTasks(@Named("id") String id);

	@RequestLine("GET /v2/tasks")
	GetTasksResponse getTasks();

	@RequestLine("POST /v2/apps")
	App createApp(App app) throws MarathonException;

	@RequestLine("PUT /v2/apps/{app_id}")
	void updateApp(@Named("app_id") String appId, App app);

	@RequestLine("DELETE /v2/apps/{id}")
	Result deleteApp(@Named("id") String id) throws MarathonException;

	@RequestLine("DELETE /v2/apps/{app_id}/tasks?host={host}&scale={scale}")
	DeleteAppTasksResponse deleteAppTasks(@Named("app_id") String appId,
			@Named("host") String host, @Named("scale") String scale);

	@RequestLine("DELETE /v2/apps/{app_id}/tasks/{task_id}?scale={scale}")
	DeleteAppTaskResponse deleteAppTask(@Named("app_id") String appId,
			@Named("task_id") String taskId, @Named("scale") String scale);

    // Groups
	@RequestLine("POST /v2/groups")
	Result createGroup(Group group) throws MarathonException;
	
	@RequestLine("DELETE /v2/groups/{id}")
	Result deleteGroup(@Named("id") String id) throws MarathonException;
	
	@RequestLine("GET /v2/groups/{id}")
	Group getGroup(@Named("id") String id) throws MarathonException;

    // Tasks

    // Deployments
	@RequestLine("GET /v2/deployments")
	List<Deployment> getDeployments();
	
	@RequestLine("DELETE /v2/deployments/{deploymentId}")
	void cancelDeploymentAndRollback(@Named("deploymentId") String id);
	
	@RequestLine("DELETE /v2/deployments/{deploymentId}?force=true")
	void cancelDeployment(@Named("deploymentId") String id);

    // Event Subscriptions

    // Queue

    // Server Info
    @RequestLine("GET /v2/info")
    GetServerInfoResponse getServerInfo();

    // Miscellaneous
}
