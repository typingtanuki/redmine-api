package com.github.typingtanuki.redmine.model;

import java.util.List;

/**
 * @author Clerc Mathias
 */
public class CustomField extends Identified {
    private Object value;

    private String customized_type;
    private String field_format;
    private String default_value;
    private boolean visible;
    private boolean searchable;
    private boolean is_filter;
    private boolean multiple;
    private boolean is_required;
    private List<Tracker> trackers;
    private String regexp;
    private List<Object> roles;
    private List<Object> possible_values;
    private int min_length;
    private int max_length;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public boolean isMultiple() {
        return multiple;
    }

    public void setMultiple(boolean multiple) {
        this.multiple = multiple;
    }

    public String getCustomized_type() {
        return customized_type;
    }

    public void setCustomized_type(String customized_type) {
        this.customized_type = customized_type;
    }

    public String getField_format() {
        return field_format;
    }

    public void setField_format(String field_format) {
        this.field_format = field_format;
    }

    public String getDefault_value() {
        return default_value;
    }

    public void setDefault_value(String default_value) {
        this.default_value = default_value;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public List<Tracker> getTrackers() {
        return trackers;
    }

    public void setTrackers(List<Tracker> trackers) {
        this.trackers = trackers;
    }

    public String getRegexp() {
        return regexp;
    }

    public void setRegexp(String regexp) {
        this.regexp = regexp;
    }

    public boolean isSearchable() {
        return searchable;
    }

    public void setSearchable(boolean searchable) {
        this.searchable = searchable;
    }

    public boolean isIs_filter() {
        return is_filter;
    }

    public void setIs_filter(boolean is_filter) {
        this.is_filter = is_filter;
    }

    public List<Object> getRoles() {
        return roles;
    }

    public void setRoles(List<Object> roles) {
        this.roles = roles;
    }

    public int getMin_length() {
        return min_length;
    }

    public void setMin_length(int min_length) {
        this.min_length = min_length;
    }

    public int getMax_length() {
        return max_length;
    }

    public void setMax_length(int max_length) {
        this.max_length = max_length;
    }

    public boolean isIs_required() {
        return is_required;
    }

    public void setIs_required(boolean is_required) {
        this.is_required = is_required;
    }

    public List<Object> getPossible_values() {
        return possible_values;
    }

    public void setPossible_values(List<Object> possible_values) {
        this.possible_values = possible_values;
    }
}
