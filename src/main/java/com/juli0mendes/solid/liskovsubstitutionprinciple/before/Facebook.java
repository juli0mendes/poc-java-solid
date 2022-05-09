package com.juli0mendes.solid.liskovsubstitutionprinciple.before;

public class Facebook implements SocialMedia, PostManager {

    @Override
    public void publish(Object post) {
        System.out.println("Publishing a post on Facebook: " + post);
    }

    @Override
    public void chat(String user) {
        System.out.println("Chatting on Facebook with: " + user);
    }
}
