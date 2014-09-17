package com.sweep.chat;

import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.SmallTest;

import java.util.List;

/**
 * Created by ganjos on 9/17/14.
 */
public class RoomTest extends AndroidTestCase {

    @SmallTest
    public void testCreateAnEmptyRoom() {
        Room room = new Room();
        assertTrue(room.isEmpty());
    }

    @SmallTest
    public void testAddOnePeerAtAnEmptyRoom() {
        Room room = new Room();
        Peer joe = new Peer("Joe", "10.1.1.5");

        assertTrue(room.isEmpty());
        room.addPeer(joe);
        assertFalse(room.isEmpty());
    }

    @SmallTest
    public void testAddTwoPeersAtAnEmptyRoom() {
        Room room = new Room();
        Peer joe = new Peer("Joe", "10.1.1.5");
        Peer average = new Peer("Average", "10.1.1.6");

        assertTrue(room.isEmpty());
        room.addPeer(joe);
        assertFalse(room.isEmpty());
        room.addPeer(average);
        assertFalse(room.isEmpty());
    }

    @SmallTest
    public void testSelectAllPeersFromARoom() {
        Room room = new Room();
        Peer joe = new Peer("Joe", "10.1.1.5");
        Peer average = new Peer("Average", "10.1.1.6");
        room.addPeer(average);
        room.addPeer(joe);

        List<Peer> all = room.selectAllPeers();
        assertSame(average, all.get(0));
        assertSame(joe, all.get(1));
    }

    @SmallTest
    public void testTakeAPeerOutOfTheRoom() {
        Room room = new Room();
        Peer joe = new Peer("Joe", "10.1.1.5");

        room.addPeer(joe);
        room.remove(joe);
        assertTrue(room.isEmpty());
    }
}
