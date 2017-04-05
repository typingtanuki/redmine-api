package com.github.typingtanuki.redmine.model;

import java.util.List;

/**
 * @author Clerc Mathias
 */
public class Issue {
    private int id;
    private Project project;
    private Tracker tracker;
    private Status status;
    private Priority priority;
    private User author;
    private User assigned_to;
    private Category category;
    private Version fixed_version;
    private Parent parent;

    private String subject;
    private String description;

    private double done_ratio;
    private double spent_hours;
    private double total_spent_hours;
    private double estimated_hours;
    private double total_estimated_hours;

    private List<CustomField> custom_fields;

    private String created_on;
    private String updated_on;
    private String closed_on;

    private String start_date;

    private List<Issue> children;
    private List<String> attachments;
    private List<Relation> relations;
    private List<Changeset> changesets;
    private List<Journal> journals;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Tracker getTracker() {
        return tracker;
    }

    public void setTracker(Tracker tracker) {
        this.tracker = tracker;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public User getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(User assigned_to) {
        this.assigned_to = assigned_to;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Version getFixed_version() {
        return fixed_version;
    }

    public void setFixed_version(Version fixed_version) {
        this.fixed_version = fixed_version;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDone_ratio() {
        return done_ratio;
    }

    public void setDone_ratio(double done_ratio) {
        this.done_ratio = done_ratio;
    }

    public double getSpent_hours() {
        return spent_hours;
    }

    public void setSpent_hours(double spent_hours) {
        this.spent_hours = spent_hours;
    }

    public double getTotal_spent_hours() {
        return total_spent_hours;
    }

    public void setTotal_spent_hours(double total_spent_hours) {
        this.total_spent_hours = total_spent_hours;
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

    public String getClosed_on() {
        return closed_on;
    }

    public void setClosed_on(String closed_on) {
        this.closed_on = closed_on;
    }

    public List<CustomField> getCustom_fields() {
        return custom_fields;
    }

    public void setCustom_fields(List<CustomField> custom_fields) {
        this.custom_fields = custom_fields;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public double getEstimated_hours() {
        return estimated_hours;
    }

    public void setEstimated_hours(double estimated_hours) {
        this.estimated_hours = estimated_hours;
    }

    public double getTotal_estimated_hours() {
        return total_estimated_hours;
    }

    public void setTotal_estimated_hours(double total_estimated_hours) {
        this.total_estimated_hours = total_estimated_hours;
    }

    public List<Issue> getChildren() {
        return children;
    }

    public void setChildren(List<Issue> children) {
        this.children = children;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<String> attachments) {
        this.attachments = attachments;
    }

    public List<Changeset> getChangesets() {
        return changesets;
    }

    public void setChangesets(List<Changeset> changesets) {
        this.changesets = changesets;
    }

    public List<Journal> getJournals() {
        return journals;
    }

    public void setJournals(List<Journal> journals) {
        this.journals = journals;
    }

    public List<Relation> getRelations() {
        return relations;
    }

    public void setRelations(List<Relation> relations) {
        this.relations = relations;
    }

    @Override
    public String toString() {
        return "Issue #" + id + " - " + subject;
    }
}
