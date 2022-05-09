package com.juli0mendes.solid.liskovsubstitutionprinciple.after;

public abstract class SocialMedia {

    abstract void chat(String user);
    abstract void publish(Object post);
    abstract void groupCall(String... users);
}
