package com.github.typingtanuki.redmine.api;

import com.github.typingtanuki.redmine.api.auth.RedmineAuth;
import com.github.typingtanuki.redmine.api.internal.ListApiCore;
import com.github.typingtanuki.redmine.model.Tracker;
import com.github.typingtanuki.redmine.model.internal.TrackerList;

import java.io.IOException;
import java.util.List;

/**
 * @author Clerc Mathias
 */
public class RedmineTrackers extends ListApiCore<Tracker> {
    protected RedmineTrackers(String serverUrl, RedmineAuth auth) {
        super(serverUrl, auth);
    }

    /**
     * @return All the trackers in redmine
     * @throws IOException for any connection problem
     */
    @Override
    public List<Tracker> list() throws IOException {
        return rawList().getTrackers();
    }

    private TrackerList rawList() throws IOException {
        StringBuilder url = redmineUrl("trackers");
        return GET(url.toString(), TrackerList.class);
    }
}
