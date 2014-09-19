package com.sweep.chat;

import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import com.sweep.TestModule;
import javax.inject.Inject;
import dagger.ObjectGraph;

import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

/**
 * Created by ganjos on 9/17/14.
 */
public class ChatTest extends AndroidTestCase {

    @Inject
    PeerToPeerMessageSender sender;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        System.setProperty("dexmaker.dexcache", getContext().getCacheDir().getPath());

        ObjectGraph graph = ObjectGraph.create(new TestModule());
        graph.inject(this);
        assertNotNull("Instance should be injected", sender);

    }

    @SmallTest
    public void testSendMessageToAnotherPeer() {
        Room room = new Room();
        Peer joe = new Peer("Joe", "10.0.0.2");
        Peer john = new Peer("John", "10.0.0.5");

        room.addPeer(joe);
        room.addPeer(john);

        Chat chatRoom = new Chat(room);
        String message = "whats up duuuuude";

        chatRoom.sendMessageFrom(message, joe);
        verify(sender, times(1)).send(joe, john, message);
    }


}
