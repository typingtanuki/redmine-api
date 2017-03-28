package com.github.typingtanuki.redmine.api;

import com.github.typingtanuki.redmine.api.auth.RedmineAuth;
import com.github.typingtanuki.redmine.api.internal.ApiCore;
import com.github.typingtanuki.redmine.model.Project;
import com.github.typingtanuki.redmine.model.Version;
import com.github.typingtanuki.redmine.model.internal.VersionList;

import java.io.IOException;
import java.util.List;

/**
 * Client for redmine versions
 * <p>
 * In redmine versions are by project. This API will also list shared versions from other projects visible from this one.
 *
 * @author Clerc Mathias
 */
public class RedmineVersions extends ApiCore {
    protected RedmineVersions(String serverUrl, RedmineAuth auth) {
        super(serverUrl, auth);
    }

    /**
     * @param project the project to list versions for
     * @return All versions in redmine for the specified project
     * @throws IOException for any connection problems
     */
    public List<Version> list(Project project) throws IOException {
        return rawList(project).getVersions();
    }

    private VersionList rawList(Project project) throws IOException {
        StringBuilder url = redmineUrl("projects/" + project.getId() + "/versions");
        return GET(url.toString(), VersionList.class);
    }

    /**
     * @param project the project to list versions for
     * @param id      the ID of the version to look for
     * @return The version matching the specified ID or null
     * @throws IOException for any connection problems
     */
    public Version get(Project project, Long id) throws IOException {
        List<Version> list = list(project);
        for (Version version : list) {
            if (version.getId() == id) {
                return version;
            }
        }
        return null;
    }

    /**
     * @param project the project to list versions for
     * @param name    the name of the version to look for
     * @return The version matching the specified name or null
     * @throws IOException for any connection problems
     */
    public Version get(Project project, String name) throws IOException {
        List<Version> list = list(project);
        for (Version version : list) {
            if (version.getName().equals(name)) {
                return version;
            }
        }
        return null;
    }
}
