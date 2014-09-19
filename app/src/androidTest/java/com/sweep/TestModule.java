package com.sweep;

import com.sweep.chat.Chat;
import com.sweep.chat.ChatTest;
import com.sweep.chat.PeerToPeerMessageSender;
import dagger.Module;
import dagger.Provides;

import static org.mockito.Mockito.mock;

/**
 * Created by ganjos on 9/19/14.
 */

@Module (
    injects = { Chat.class, ChatTest.class, PeerToPeerMessageSender.class },
    overrides = true
)
public class TestModule {

    @Provides
    public PeerToPeerMessageSender providePeerToPeerMessageSender() {
        return mock(PeerToPeerMessageSender.class);
    }

}
