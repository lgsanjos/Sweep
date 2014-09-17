package com.sweep.chat;

import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.SmallTest;

/**
 * Created by ganjos on 9/17/14.
 */
public class PeerTest extends AndroidTestCase {

    @SmallTest
    public void testCreateNewPeer() {
        Peer peer = new Peer("SAnjos", "127.0.0.1");
        assertEquals("SAnjos", peer.getName());
        assertEquals("127.0.0.1", peer.getIpAddress());
    }

    @SmallTest
    public void testCantCreatePeerWithNullName() {
        try {
            new Peer(null, "127.0.0.1");
            fail("An exception was expected =/");
        } catch (Exception e) {
            assertEquals("Can't create a new peer without name.", e.getMessage());
        }
    }

    @SmallTest
    public void testCantCreatePeerWithEmptyName() {
        try {
            new Peer("", "127.0.0.1");
            fail("An exception was expected =/");
        } catch (Exception e) {
            assertEquals("Can't create a new peer without name.", e.getMessage());
        }
    }
}
