package com.github.typingtanuki.redmine.api;

import com.github.typingtanuki.redmine.api.auth.RedmineAuth;

/**
 * The entry point of the library, instance it once and then use it to generate clients for each endpoint.
 * <p>
 * This class as well as each client can be saved, reused and are thread safe.
 *
 * @author Clerc Mathias
 */
public class Redmine {
    private final String serverUrl;
    private final RedmineAuth auth;

    /**
     * Create the redmine entry point
     *
     * @param serverUrl the URL to the redmine server, including the <code>http://</code> prefix and port if needed
     * @param auth      the mean of authenticating to redmine
     */
    public Redmine(String serverUrl, RedmineAuth auth) {
        this.serverUrl = serverUrl;
        this.auth = auth;
    }

    /**
     * @return Client for the issues endpoint
     */
    public RedmineIssues issues() {
        return new RedmineIssues(serverUrl, auth);
    }

    /**
     * @return Client for the trackers endpoint
     */
    public RedmineTrackers trackers() {
        return new RedmineTrackers(serverUrl, auth);
    }

    /**
     * @return Client for the status endpoint
     */
    public RedmineStatuses status() {
        return new RedmineStatuses(serverUrl, auth);
    }

    /**
     * @return Client for the custom fields endpoint
     */
    public RedmineCustomFields customFields() {
        return new RedmineCustomFields(serverUrl, auth);
    }

    /**
     * @return Client for the versions endpoint
     */
    public RedmineVersions versions() {
        return new RedmineVersions(serverUrl, auth);
    }

    /**
     * @return Client for the projects endpoint
     */
    public RedmineProjects projects() {
        return new RedmineProjects(serverUrl, auth);
    }
}
