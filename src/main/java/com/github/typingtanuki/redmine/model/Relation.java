package com.github.typingtanuki.redmine.model;

/**
 * @author clerc
 * @since 2017/03/30
 */
public class Relation {
    private long id;
    private long issue_id;
    private long issue_to_id;
    private String relation_type;
    private String delay;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIssue_id() {
        return issue_id;
    }

    public void setIssue_id(long issue_id) {
        this.issue_id = issue_id;
    }

    public long getIssue_to_id() {
        return issue_to_id;
    }

    public void setIssue_to_id(long issue_to_id) {
        this.issue_to_id = issue_to_id;
    }

    public String getRelation_type() {
        return relation_type;
    }

    public void setRelation_type(String relation_type) {
        this.relation_type = relation_type;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }
}
