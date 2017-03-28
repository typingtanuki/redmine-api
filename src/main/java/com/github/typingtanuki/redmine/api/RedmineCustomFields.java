package com.github.typingtanuki.redmine.api;

import com.github.typingtanuki.redmine.api.auth.RedmineAuth;
import com.github.typingtanuki.redmine.api.internal.ListApiCore;
import com.github.typingtanuki.redmine.model.CustomField;
import com.github.typingtanuki.redmine.model.internal.CustomFieldList;

import java.io.IOException;
import java.util.List;

/**
 * Client for redmine custom fields
 *
 * @author Clerc Mathias
 */
public class RedmineCustomFields extends ListApiCore<CustomField> {
    protected RedmineCustomFields(String serverUrl, RedmineAuth auth) {
        super(serverUrl, auth);
    }

    /**
     * @return all the custom fields in redmine
     * @throws IOException for any connection problem
     */
    @Override
    public List<CustomField> list() throws IOException {
        return rawList().getCustomFields();
    }

    private CustomFieldList rawList() throws IOException {
        StringBuilder url = redmineUrl("custom_fields");
        return GET(url.toString(), CustomFieldList.class);
    }
}
