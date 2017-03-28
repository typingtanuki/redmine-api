package com.github.typingtanuki.redmine.model.query;

/**
 * Possible associations to fetch together with the issues (issues API only)
 *
 * @author Clerc Mathias
 */
public enum Association {
    CHILDREN("children"),
    ATTACHMENTS("attachments"),
    RELATIONS("relations"),
    WATCHERS("watchers"),
    JOURNAL("journals"),
    CHANGESET("changesets");

    private String value;

    Association(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
