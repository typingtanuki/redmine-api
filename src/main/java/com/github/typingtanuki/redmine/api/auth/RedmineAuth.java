package com.github.typingtanuki.redmine.api.auth;

import org.jboss.resteasy.client.jaxrs.BasicAuthentication;

/**
 * Interface corresponding to the different supported ways to connect through the redmine REST API
 *
 * @author Clerc Mathias
 */
public interface RedmineAuth {
    /**
     * Returns the authentication token used by the REST client to connect to the server
     */
    BasicAuthentication token();
}
