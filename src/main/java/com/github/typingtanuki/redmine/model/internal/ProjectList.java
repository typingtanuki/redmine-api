package com.github.typingtanuki.redmine.model.internal;

import com.github.typingtanuki.redmine.model.Project;

import java.util.List;

/**
 * Internal type used for deserialization purpose only
 *
 * @author Clerc Mathias
 */
public class ProjectList {
    private List<Project> projects;

    private int total_count = 0;
    private int offset = 0;
    private int limit = 0;

    public List<Project> getProjects() {
        return projects;
    }

    @Deprecated
    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
