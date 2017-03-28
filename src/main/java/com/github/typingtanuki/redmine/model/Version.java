package com.github.typingtanuki.redmine.model;

import java.util.List;

/**
 * @author Clerc Mathias
 */
public class Version extends Identified {
    private Project project;
    private String description;
    private String status;
    private String sharing;
    private List<CustomField> custom_fields;
    private String created_on;
    private String updated_on;
    private String due_date;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSharing() {
        return sharing;
    }

    public void setSharing(String sharing) {
        this.sharing = sharing;
    }

    public List<CustomField> getCustom_fields() {
        return custom_fields;
    }

    public void setCustom_fields(List<CustomField> custom_fields) {
        this.custom_fields = custom_fields;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    public String getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(String updated_on) {
        this.updated_on = updated_on;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }
}
