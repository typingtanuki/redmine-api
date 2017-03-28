package com.github.typingtanuki.redmine.api.auth;

import org.jboss.resteasy.client.jaxrs.BasicAuthentication;

/**
 * Use this authentication method if you want to log in with an API key.
 * <p>
 * Your API key can be found in your redmine profile after login in
 *
 * @author Clerc Mathias
 */
public class ApiKey implements RedmineAuth {
    private final String apiKey;

    public ApiKey(String apiKey) {
        super();

        this.apiKey = apiKey;
    }

    @Override
    public BasicAuthentication token() {
        //Redmine API allows to log in with the api key as the name and anything as the password
        return new BasicAuthentication(apiKey, "--");
    }
}
