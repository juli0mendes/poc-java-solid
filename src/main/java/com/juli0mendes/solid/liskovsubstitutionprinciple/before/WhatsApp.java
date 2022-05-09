package com.juli0mendes.solid.liskovsubstitutionprinciple.before;

import java.util.Arrays;

public class WhatsApp implements SocialMedia, VideoCallManager {

    @Override
    public void chat(String user) {
        System.out.println("Chatting on WhatsApp with: " + user);
    }
    @Override
    public void groupCall(String... users) {
        System.out.println("Taking a Group Call on WhatsApp with: " + Arrays.toString(users));
    }
}
