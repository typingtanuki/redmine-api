# Simple Java API for Redmine

## Scope

This API is currently limited to version 3.3.2 of redmine (http://www.redmine.org/).

Some APIs might work with other versions of redmine, especially those marked as **Stable** by redmine, but no test was done on those versions.

Currently only those APIs have been implemented:
 
 * Custom fields - Read only
 * Issues - Read only
   * Filters - Quite extensive support but not full
   * Associations - All available
 * Projects - Read only
 * Statuses - Read only
 * Trackers - Read only
 * Versions - Read only
 
 ## Types
 
 All returned types are typed to the best of my knowledge, for custom fields they will be deserialized to the most fitting java equivalent of what the redmine API is returning
 
 ## How to use
 
 ### Creating the main instance
 
```java
Redmine redmine = new Redmine("http://my.redmine:3000", new User("user", "password"));
```

This will return you an instance of the main redmine client.
You can also log in using an api key like this:

```java
Redmine redmine = new Redmine("http://my.redmine:3000", new ApiKey("my-api-key"));
```

To use a specific API of redmine, you can call one of the methods from the Redmine instance to build the corresponding client:

```java
RedmineIssues issuesClient = redmine.issues();
```

To list issues matching a specific set of filters, you can do the following:

```java
Filter filter = new Filter();
//Issues only in the tracker "tracker1"
filter.isTracker(redmine.trackers().get("tracker1"));
//And only without the custom field "myCustomField"
filter.isNoneCustom(redmine.customFields().get("myCustomField"));
//Currently assigned 
filter.isAnyAssignee();

List<Issues> issues = issuesClient.list(100, 0, filter);
```

### License

Released under [MIT](LICENSE). Copyright (c) Clerc Mathias