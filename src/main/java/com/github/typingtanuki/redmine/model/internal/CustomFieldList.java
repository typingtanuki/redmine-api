package com.github.typingtanuki.redmine.model.internal;

import com.github.typingtanuki.redmine.model.CustomField;

import java.util.LinkedList;
import java.util.List;

/**
 * Internal type used for deserialization purpose only
 *
 * @author Clerc Mathias
 */
public class CustomFieldList {
    private List<CustomField> custom_fields = new LinkedList<>();

    public List<CustomField> getCustomFields() {
        return custom_fields;
    }

    @Deprecated
    public List<CustomField> getCustom_fields() {
        return custom_fields;
    }

    @Deprecated
    public void setCustom_fields(List<CustomField> custom_fields) {
        this.custom_fields = custom_fields;
    }
}
