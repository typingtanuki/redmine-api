package com.github.typingtanuki.redmine.api.internal;

import com.github.typingtanuki.redmine.api.auth.RedmineAuth;
import com.github.typingtanuki.redmine.model.Identified;

import java.io.IOException;
import java.util.List;

/**
 * Provides some useful common operations for lists of Identified resources
 *
 * @author Clerc Mathias
 */
public abstract class ListApiCore<T extends Identified> extends ApiCore {
    public ListApiCore(String serverUrl, RedmineAuth auth) {
        super(serverUrl, auth);
    }

    /**
     * @return all the resources for that endpoint
     * @throws IOException for any connection problem
     */
    public abstract List<T> list() throws IOException;

    /**
     * Returns the resource which matches the specified ID
     *
     * @param id the ID to look for
     * @return the resource or null if none matched
     * @throws IOException for any connection problem
     */
    public T get(Long id) throws IOException {
        List<T> list = list();
        for (T t : list) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }


    /**
     * Returns the resource which matches the specified name
     *
     * @param name the name to look for
     * @return the resource or null if none matched
     * @throws IOException for any connection problem
     */
    public T get(String name) throws IOException {
        List<T> list = list();
        for (T t : list) {
            if (t.getName().equals(name)) {
                return t;
            }
        }
        return null;
    }
}
