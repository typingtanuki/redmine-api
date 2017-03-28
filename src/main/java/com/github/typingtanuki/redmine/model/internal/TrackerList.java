package com.github.typingtanuki.redmine.model.internal;

import com.github.typingtanuki.redmine.model.Tracker;

import java.util.LinkedList;
import java.util.List;

/**
 * Internal type used for deserialization purpose only
 *
 * @author Clerc Mathias
 */
public class TrackerList {
    private List<Tracker> trackers = new LinkedList<>();

    public List<Tracker> getTrackers() {
        return trackers;
    }

    @Deprecated
    public void setTrackers(List<Tracker> trackers) {
        this.trackers = trackers;
    }
}
