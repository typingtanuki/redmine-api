package com.github.typingtanuki.redmine.model.internal;

import com.github.typingtanuki.redmine.model.Status;

import java.util.LinkedList;
import java.util.List;

/**
 * Internal type used for deserialization purpose only
 *
 * @author Clerc Mathias
 */
public class StatusList {
    private List<Status> statuses = new LinkedList<>();

    public List<Status> getStatuses() {
        return statuses;
    }

    @Deprecated
    public List<Status> getIssue_statuses() {
        return statuses;
    }

    @Deprecated
    public void setIssue_statuses(List<Status> issue_statuses) {
        this.statuses = issue_statuses;
    }
}
