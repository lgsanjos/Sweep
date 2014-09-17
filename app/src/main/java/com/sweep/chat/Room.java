package com.sweep.chat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ganjos on 9/17/14.
 */
public class Room {

    private List<Peer> peers;

    public Room() {
        this.peers = new ArrayList<Peer>();
    }

    public boolean isEmpty() {
        return peers.isEmpty();
    }

    public void addPeer(Peer peer) {
        peers.add(peer);
    }

    public List<Peer> selectAllPeers() {
        return peers;
    }

    public void remove(Peer peer) {
        peers.remove(peer);
    }
}
