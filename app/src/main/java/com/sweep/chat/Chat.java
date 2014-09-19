package com.sweep.chat;

import javax.inject.Inject;

/**
 * Created by ganjos on 9/17/14.
 */
public class Chat {

    @Inject
    PeerToPeerMessageSender sender;

    private Room room;

    public Chat(Room room) {
        this.room = room;
    }

    public void sendMessageFrom(final String message, Peer from) {
        for (Peer p : room.selectAllPeers()) {
            if (p == from)
                continue;

            sender.send(from, p, message);
        }
    }
}
