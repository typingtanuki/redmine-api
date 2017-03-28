package com.github.typingtanuki.redmine.api;

import com.github.typingtanuki.redmine.api.auth.RedmineAuth;
import com.github.typingtanuki.redmine.api.internal.ListApiCore;
import com.github.typingtanuki.redmine.model.Status;
import com.github.typingtanuki.redmine.model.internal.StatusList;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Client for redmine issue statuses
 *
 * @author Clerc Mathias
 */
public class RedmineStatuses extends ListApiCore<Status> {
    protected RedmineStatuses(String serverUrl, RedmineAuth auth) {
        super(serverUrl, auth);
    }

    /**
     * @return All statuses in redmine
     * @throws IOException for any connection problem
     */
    @Override
    public List<Status> list() throws IOException {
        return rawList().getStatuses();
    }

    private StatusList rawList() throws IOException {
        StringBuilder url = redmineUrl("issue_statuses");
        return GET(url.toString(), StatusList.class);
    }

    /**
     * @return All statuses in redmine which have the meaning of "closed"
     * @throws IOException for any connection problem
     */
    public List<Status> closed() throws IOException {
        List<Status> out = new LinkedList<>();
        List<Status> list = list();
        for (Status status : list) {
            if (status.isClosed()) {
                out.add(status);
            }
        }
        return out;
    }

    /**
     * @return All statuses in redmine which have the meaning of "opened"
     * @throws IOException for any connection problem
     */
    public List<Status> opened() throws IOException {
        List<Status> out = new LinkedList<>();
        List<Status> list = list();
        for (Status status : list) {
            if (!status.isClosed()) {
                out.add(status);
            }
        }
        return out;
    }
}
