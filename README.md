## Introduction

This project is a Java library for communicating with Marathon API. At this point this library supports version v2 of Marathon API, please refer [docs](https://github.com/mesosphere/marathon/blob/master/REST.md) for more details.

## Example

### Initialization

```
String endpoint = "<Marathon's endpoint>";
Marathon marathon = MarathonClient.getInstance(endpoint);
```

### Get apps

```
GetAppsResponse appsResponse = marathon.getApps();
```

### Create app

```
App app = new App();
app.setId("myapp");
app.setCmd("echo hi");
app.setCpus(1.0);
app.setMem(128.0);
app.setInstances(1);
marathon.createApp(app);
```

### Get app

```
GetAppResponse appGet = marathon.getApp("myapp");
```

### Delete app

```
marathon.deleteApp("myapp");
```

## Building

This project is built using [Apache Maven](http://maven.apache.org/).

Run the following command from the root of repository, to build the client JAR:

```
$ mvn clean install
```

## Bugs

Bugs can be reported using Github issues.
