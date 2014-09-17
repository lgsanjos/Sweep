package com.sweep.chat;

import android.test.suitebuilder.annotation.SmallTest;

/**
 * Created by ganjos on 9/17/14.
 */
public class PeerTest {

    @SmallTest
    public void testShit() {
        Peer = new Peer();
        assertEquals("", peer.getName());
        assertEquals("", peer.getIpAddress());
    }
}
