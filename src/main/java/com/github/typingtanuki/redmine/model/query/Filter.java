package com.github.typingtanuki.redmine.model.query;

import com.github.typingtanuki.redmine.model.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Filter to restrict which issues to show (issues API only)
 *
 * @author Clerc Mathias
 */
public class Filter {
    /**
     * How redmine represents "any" in the REST requests
     */
    private static final String ANY = "*";
    /**
     * How redmine represents "not" in the REST requests
     */
    private static final String NOT = "!";
    /**
     * How redmine represents "none" in the REST requests
     */
    private static final String NONE = NOT + ANY;

    /**
     * All the filters so far to apply to the request
     */
    private Map<String, Object> filters = new LinkedHashMap<>();

    /**
     * @return the filters to be applied to the query
     */
    public Set<Map.Entry<String, Object>> filters() {
        return filters.entrySet();
    }

    /**
     * Only issues matching one or more tracker(s)
     */
    public void isTracker(Tracker... tracker) {
        filters.put("tracker_id", idList(tracker));
    }

    /**
     * Issues from any tracker
     */
    public void isAnyTracker() {
        filters.put("tracker_id", ANY);
    }

    /**
     * Only issues matching one or more project(s)
     */
    public void isProject(Project... project) {
        filters.put("project_id", idList(project));
    }

    /**
     * Issues from any project
     */
    public void isAnyProject() {
        filters.put("project_id", ANY);
    }

    /**
     * Only issues matching one or more assignee(s)
     */
    public void isAssignee(User... assignee) {
        filters.put("assigned_to_id", idList(assignee));
    }

    /**
     * Only issues having an assignee (any)
     */
    public void isAnyAssignee() {
        filters.put("assigned_to_id", ANY);
    }

    /**
     * Only issues matching one or more version(s)
     */
    public void isVersion(Version... version) {
        filters.put("fixed_version_id", idList(version));
    }

    /**
     * Only issues matching one or more status(es)
     */
    public void isStatus(Status... status) {
        filters.put("status_id", idList(status));
    }

    /**
     * Issues, in any status
     */
    public void isAnyStatus() {
        filters.put("status_id", ANY);
    }

    /**
     * Only issues having once of the specified values in the given custom field
     */
    public void isCustom(CustomField field, Object... values) {
        filters.put("cf_" + field.getId(), objectList(values));
    }

    /**
     * Only issues having a value (any) for the specified custom field
     */
    public void isAnyCustom(CustomField field) {
        filters.put("cf_" + field.getId(), ANY);
    }

    /**
     * Only issues not having a value for the specified custom field
     */
    public void isNoneCustom(CustomField field) {
        filters.put("cf_" + field.getId(), NONE);
    }

    /**
     * @returns All ids joined into a single list
     */
    private String idList(Identified... identified) {
        StringBuilder out = new StringBuilder();
        for (Identified i : identified) {
            if (out.length() > 0) {
                out.append(",");
            }
            out.append(i.getId());
        }
        return out.toString();
    }

    /**
     * @return All values joined into a single list
     */
    private String objectList(Object... values) {
        StringBuilder out = new StringBuilder();
        for (Object v : values) {
            if (out.length() > 0) {
                out.append(",");
            }
            out.append(v);
        }
        return out.toString();
    }
}
