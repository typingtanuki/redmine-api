package com.github.typingtanuki.redmine.model;

/**
 * @author Clerc Mathias
 */
public class Status extends Identified {
    private boolean def;
    private boolean closed;

    public boolean isDefault() {
        return def;
    }

    public void setDefault(boolean def) {
        this.def = def;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public boolean isIs_default() {
        return def;
    }

    public void setIs_default(boolean is_default) {
        this.def = is_default;
    }

    public boolean isIs_closed() {
        return closed;
    }

    public void setIs_closed(boolean is_closed) {
        this.closed = is_closed;
    }
}
