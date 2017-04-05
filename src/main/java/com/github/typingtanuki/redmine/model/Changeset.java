package com.github.typingtanuki.redmine.model;

/**
 * @author clerc
 * @since 2017/03/30
 */
public class Changeset {
    private String revision;
    private User user;
    private String comments;
    private String committed_on;

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCommitted_on() {
        return committed_on;
    }

    public void setCommitted_on(String committed_on) {
        this.committed_on = committed_on;
    }
}
