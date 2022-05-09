package com.juli0mendes.solid.liskovsubstitutionprinciple.before;

import java.util.Arrays;

public class Instagram implements SocialMedia, VideoCallManager {

    @Override
    public void chat(String user) {
        System.out.println("Chatting on Instagram with: " + user);
    }

    @Override
    public void groupCall(String... users) {
        System.out.println("Taking a Group Call on Instagram with: " + Arrays.toString(users));
    }
}
