package com.github.typingtanuki.redmine.model.internal;

import com.github.typingtanuki.redmine.model.Issue;

import java.util.LinkedList;
import java.util.List;

/**
 * Internal type used for deserialization purpose only
 *
 * @author Clerc Mathias
 */
public class IssueList {
    private List<Issue> issues = new LinkedList<>();
    private int total_count = 0;
    private int offset = 0;
    private int limit = 0;

    public List<Issue> getIssues() {
        return issues;
    }

    @Deprecated
    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    public int getTotalCount() {
        return total_count;
    }

    @Deprecated
    public int getTotal_count() {
        return total_count;
    }

    @Deprecated
    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public int getOffset() {
        return offset;
    }

    @Deprecated
    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    @Deprecated
    public void setLimit(int limit) {
        this.limit = limit;
    }
}
