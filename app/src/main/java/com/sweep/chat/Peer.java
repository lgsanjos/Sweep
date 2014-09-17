package com.sweep.chat;

/**
 * Created by ganjos on 9/17/14.
 */
public class Peer {

    private String name;
    private String ipAddress;

    public Peer(String name, String ip) {
        this.name = name;
        this.ipAddress = ip;

        if (name == null || name.isEmpty())
            throw new RuntimeException("Can't create a new peer without name.");
    }

    public String getName() {
        return name;
    }

    public String getIpAddress() {
        return ipAddress;
    }
}
