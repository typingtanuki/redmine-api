package com.github.typingtanuki.redmine.model;

/**
 * @author Clerc Mathias
 */
public class Tracker extends Identified {
    private Status default_status;

    public Status getDefault_status() {
        return default_status;
    }

    public void setDefault_status(Status default_status) {
        this.default_status = default_status;
    }
}
