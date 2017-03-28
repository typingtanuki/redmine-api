package com.github.typingtanuki.redmine.model.internal;

import com.github.typingtanuki.redmine.model.Version;

import java.util.LinkedList;
import java.util.List;

/**
 * Internal type used for deserialization purpose only
 *
 * @author Clerc Mathias
 */
public class VersionList {
    private List<Version> versions = new LinkedList<>();

    private int total_count = 0;
    private int offset = 0;
    private int limit = 0;

    public List<Version> getVersions() {
        return versions;
    }

    public void setVersions(List<Version> versions) {
        this.versions = versions;
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
