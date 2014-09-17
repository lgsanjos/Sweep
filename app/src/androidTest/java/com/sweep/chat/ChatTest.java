package com.sweep.chat;

import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.SmallTest;

/**
 * Created by ganjos on 9/17/14.
 */
public class ChatTest extends AndroidTestCase{

    @SmallTest
    public void testSendMessageToAnotherPeer() {
        Room r = new Room();
        Peer joe = new Peer("Joe", "10.0.0.2");
        Peer john = new Peer("John", "10.0.0.5");

        r.addPeer(joe);
        r.addPeer(john);

        Chat chatRoom = new Chat(r);
        String message = "whats up duuuuude";

        chatRoom.sendMessageFrom(message, joe);
        fail("incomplete scenario");
    }


}
