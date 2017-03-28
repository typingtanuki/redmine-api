package com.github.typingtanuki.redmine.api;

import com.github.typingtanuki.redmine.api.auth.RedmineAuth;
import com.github.typingtanuki.redmine.api.internal.ListApiCore;
import com.github.typingtanuki.redmine.model.Project;
import com.github.typingtanuki.redmine.model.internal.ProjectList;

import java.io.IOException;
import java.util.List;

/**
 * Client for the redmine projects
 *
 * @author Clerc Mathias
 */
public class RedmineProjects extends ListApiCore<Project> {
    protected RedmineProjects(String serverUrl, RedmineAuth auth) {
        super(serverUrl, auth);
    }

    /**
     * @return all the projects in redmine
     * @throws IOException
     */
    @Override
    public List<Project> list() throws IOException {
        return rawList().getProjects();
    }

    private ProjectList rawList() throws IOException {
        StringBuilder url = redmineUrl("projects");
        return GET(url.toString(), ProjectList.class);
    }
}
