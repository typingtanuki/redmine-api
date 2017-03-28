package com.github.typingtanuki.redmine.model.internal;

import com.github.typingtanuki.redmine.model.Issue;

/**
 * Internal type used for deserialization purpose only
 *
 * @author Clerc Mathias
 */
public class IssueSingle {
    private Issue issue;

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }
}
