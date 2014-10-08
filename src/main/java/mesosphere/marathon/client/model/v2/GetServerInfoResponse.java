package mesosphere.marathon.client.model.v2;

import mesosphere.marathon.client.utils.ModelUtils;

import java.util.Collection;

public class GetServerInfoResponse {
    private String frameworkId;
    private String leader;
    private String name;
    private String version;
    private HttpConfig http_config;
    private EventSubscriber event_subscriber;
    private MarathonConfig marathon_config;
    private ZookeeperConfig zookeeper_config;

    public String getFrameworkId() {
        return frameworkId;
    }

    public void setFrameworkId(String frameworkId) {
        this.frameworkId = frameworkId;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public HttpConfig getHttp_config() {
        return http_config;
    }

    public void setHttp_config(HttpConfig http_config) {
        this.http_config = http_config;
    }

    public EventSubscriber getEvent_subscriber() {
        return event_subscriber;
    }

    public void setEvent_subscriber(EventSubscriber event_subscriber) {
        this.event_subscriber = event_subscriber;
    }

    public MarathonConfig getMarathon_config() {
        return marathon_config;
    }

    public void setMarathon_config(MarathonConfig marathon_config) {
        this.marathon_config = marathon_config;
    }

    public ZookeeperConfig getZookeeper_config() {
        return zookeeper_config;
    }

    public void setZookeeper_config(ZookeeperConfig zookeeper_config) {
        this.zookeeper_config = zookeeper_config;
    }

    public class ZookeeperConfig {
        private String zk;
        private String zk_hosts;
        private String zk_path;
        private String zk_state;
        private Integer zk_timeout;
        private ZkFutureTimeout zk_future_timeout;

        public class ZkFutureTimeout {
            private Integer duration;

            public Integer getDuration() {
                return duration;
            }

            public void setDuration(Integer duration) {
                this.duration = duration;
            }

            @Override
            public String toString() {
                return ModelUtils.toString(this);
            }
        }

        public String getZk() {
            return zk;
        }

        public void setZk(String zk) {
            this.zk = zk;
        }

        public String getZk_hosts() {
            return zk_hosts;
        }

        public void setZk_hosts(String zk_hosts) {
            this.zk_hosts = zk_hosts;
        }

        public String getZk_path() {
            return zk_path;
        }

        public void setZk_path(String zk_path) {
            this.zk_path = zk_path;
        }

        public String getZk_state() {
            return zk_state;
        }

        public void setZk_state(String zk_state) {
            this.zk_state = zk_state;
        }

        public Integer getZk_timeout() {
            return zk_timeout;
        }

        public void setZk_timeout(Integer zk_timeout) {
            this.zk_timeout = zk_timeout;
        }

        public ZkFutureTimeout getZk_future_timeout() {
            return zk_future_timeout;
        }

        public void setZk_future_timeout(ZkFutureTimeout zk_future_timeout) {
            this.zk_future_timeout = zk_future_timeout;
        }

        @Override
        public String toString() {
            return ModelUtils.toString(this);
        }
    }

    public class MarathonConfig {
        private Boolean checkpoint;
        private String executor;
        private Integer failover_timeout;
        private Boolean ha;
        private String hostname;
        private Integer local_port_max;
        private Integer local_port_min;
        private String master;
        private String mesos_role;
        private String mesos_user;
        private Integer reconciliation_initial_delay;
        private Integer reconciliation_interval;
        private Integer task_launch_timeout;

        public String getExecutor() {
            return executor;
        }

        public void setExecutor(String executor) {
            this.executor = executor;
        }

        public Integer getFailover_timeout() {
            return failover_timeout;
        }

        public void setFailover_timeout(Integer failover_timeout) {
            this.failover_timeout = failover_timeout;
        }

        public Boolean getHa() {
            return ha;
        }

        public void setHa(Boolean ha) {
            this.ha = ha;
        }

        public String getHostname() {
            return hostname;
        }

        public void setHostname(String hostname) {
            this.hostname = hostname;
        }

        public Integer getLocal_port_max() {
            return local_port_max;
        }

        public void setLocal_port_max(Integer local_port_max) {
            this.local_port_max = local_port_max;
        }

        public Integer getLocal_port_min() {
            return local_port_min;
        }

        public void setLocal_port_min(Integer local_port_min) {
            this.local_port_min = local_port_min;
        }

        public String getMaster() {
            return master;
        }

        public void setMaster(String master) {
            this.master = master;
        }

        public String getMesos_role() {
            return mesos_role;
        }

        public void setMesos_role(String mesos_role) {
            this.mesos_role = mesos_role;
        }

        public String getMesos_user() {
            return mesos_user;
        }

        public void setMesos_user(String mesos_user) {
            this.mesos_user = mesos_user;
        }

        public Integer getReconciliation_initial_delay() {
            return reconciliation_initial_delay;
        }

        public void setReconciliation_initial_delay(Integer reconciliation_initial_delay) {
            this.reconciliation_initial_delay = reconciliation_initial_delay;
        }

        public Integer getReconciliation_interval() {
            return reconciliation_interval;
        }

        public void setReconciliation_interval(Integer reconciliation_interval) {
            this.reconciliation_interval = reconciliation_interval;
        }

        public Integer getTask_launch_timeout() {
            return task_launch_timeout;
        }

        public void setTask_launch_timeout(Integer task_launch_timeout) {
            this.task_launch_timeout = task_launch_timeout;
        }

        public Boolean getCheckpoint() {
            return checkpoint;
        }

        public void setCheckpoint(Boolean checkpoint) {
            this.checkpoint = checkpoint;
        }

        @Override
        public String toString() {
            return ModelUtils.toString(this);
        }
    }

    public class EventSubscriber {
        private String type;
        private Collection<String> http_endpoints;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Collection<String> getHttp_endpoints() {
            return http_endpoints;
        }

        public void setHttp_endpoints(Collection<String> http_endpoints) {
            this.http_endpoints = http_endpoints;
        }

        @Override
        public String toString() {
            return ModelUtils.toString(this);
        }
    }

    public class HttpConfig {
        private String assets_path;
        private String http_port;
        private String https_port;

        public String getAssets_path() {
            return assets_path;
        }

        public void setAssets_path(String assets_path) {
            this.assets_path = assets_path;
        }

        public String getHttp_port() {
            return http_port;
        }

        public void setHttp_port(String http_port) {
            this.http_port = http_port;
        }

        public String getHttps_port() {
            return https_port;
        }

        public void setHttps_port(String https_port) {
            this.https_port = https_port;
        }

        @Override
        public String toString() {
            return ModelUtils.toString(this);
        }
    }

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }
}
