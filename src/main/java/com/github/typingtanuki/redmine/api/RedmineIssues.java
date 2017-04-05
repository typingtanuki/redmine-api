package com.github.typingtanuki.redmine.api;

import com.github.typingtanuki.redmine.api.auth.RedmineAuth;
import com.github.typingtanuki.redmine.api.internal.ApiCore;
import com.github.typingtanuki.redmine.model.Issue;
import com.github.typingtanuki.redmine.model.internal.IssueList;
import com.github.typingtanuki.redmine.model.internal.IssueSingle;
import com.github.typingtanuki.redmine.model.query.Association;
import com.github.typingtanuki.redmine.model.query.Filter;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Client for the issues list in redmine
 *
 * @author Clerc Mathias
 */
public class RedmineIssues extends ApiCore {
    protected RedmineIssues(String serverUrl, RedmineAuth auth) {
        super(serverUrl, auth);
    }

    /**
     * @param limit  the number of entries to return, recommended 25, max 100
     * @param offset the offset
     * @param filter the filters to apply to the issue list
     * @return all the issues matching the filter in redmine
     */
    public List<Issue> list(int limit,
                            int offset,
                            Filter filter) throws IOException {
        return rawList(limit, offset, filter).getIssues();
    }

    private IssueList rawList(int limit,
                              int offset,
                              Filter filter) throws IOException {
        StringBuilder url = redmineUrl("issues");

        //Add the query parameters for the limit and offset
        addParameter(url, false, "limit", limit);
        addParameter(url, true, "offset", offset);

        for (Map.Entry<String, Object> parameter : filter.filters()) {
            addParameter(url, true, parameter.getKey(), parameter.getValue());
        }

        return GET(url.toString(), IssueList.class);
    }

    /**
     * @param id           the ID of the issue to fetch
     * @param associations the associations to fetch with the issue
     * @return The given issue
     */
    public Issue get(int id, Association... associations) throws IOException {
        StringBuilder url = redmineUrl("issues", id);

        addParameter(url, false, "include", handleAssociations(associations));

        IssueSingle single = GET(url.toString(), IssueSingle.class);
        return single.getIssue();
    }

    private String handleAssociations(Association[] associations) {
        StringBuilder out = new StringBuilder();
        for (Association association : associations) {
            if (out.length() != 0) {
                out.append(",");
            }
            out.append(association.getValue());
        }
        return out.toString();
    }
}
