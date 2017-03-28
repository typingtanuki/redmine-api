package com.github.typingtanuki.redmine.api.auth;

import org.jboss.resteasy.client.jaxrs.BasicAuthentication;

/**
 * Use this authentication method if you want to log in with your username and password instead of an API keyS
 *
 * @author Clerc Mathias
 */
public class User implements RedmineAuth {
    private final String username;
    private final String password;

    public User(String username, String password) {
        super();

        this.username = username;
        this.password = password;
    }

    @Override
    public BasicAuthentication token() {
        return new BasicAuthentication(username, password);
    }
}
