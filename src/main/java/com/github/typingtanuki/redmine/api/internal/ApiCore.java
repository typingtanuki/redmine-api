package com.github.typingtanuki.redmine.api.internal;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.typingtanuki.redmine.api.auth.RedmineAuth;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

/**
 * Small wrapper around the REST client to make code more manageable
 *
 * @author Clerc Mathias
 */
public abstract class ApiCore {
    private static final String JSON_EXT = ".json";

    private static ObjectMapper MAPPER = new ObjectMapper();
    private final RedmineAuth auth;

    private String serverUrl;

    /**
     * @param serverUrl the server URL with http/https prefix
     * @param auth      the mean of authenticating (can be null)
     */
    public ApiCore(String serverUrl, RedmineAuth auth) {
        this.serverUrl = serverUrl;
        this.auth = auth;
    }

    protected <T> T GET(String url, Class<T> clazz) throws IOException {
        Client client = ResteasyClientBuilder.newClient();

        WebTarget resource = client.target(url);
        if (auth != null) {
            resource.register(auth.token());
        }

        Invocation.Builder request = resource.request();
        request.accept(MediaType.APPLICATION_JSON);

        Response response = request.get();

        if (response.getStatusInfo().getStatusCode() >= 400) {
            throw new IOException("Connection server failed with error: " + response.getStatusInfo().getStatusCode() + " for URL " + url);
        }

        String body = response.readEntity(String.class);
        return MAPPER.readerFor(clazz).readValue(body);
    }

    protected StringBuilder redmineUrl(Object... parts) {
        StringBuilder url = new StringBuilder();
        url.append(serverUrl);
        for (Object part : parts) {
            url.append("/").append(part);
        }
        url.append(JSON_EXT);
        return url;
    }

    protected void addParameter(StringBuilder url, boolean hasParam, String name, Object value) {
        if (hasParam) {
            url.append("&");
        } else {
            url.append("?");
        }

        url.append(name).append("=").append(value);
    }
}
