package com.juli0mendes.solid.liskovsubstitutionprinciple.before;

import java.util.ArrayList;
import java.util.List;

public class LSPClient {

    public static void main(String[] args) {
        List<SocialMedia> socialMediaList = new ArrayList<>();
        socialMediaList.add(new Instagram());
        socialMediaList.add(new Facebook());
        socialMediaList.add(new WhatsApp());

        for (SocialMedia socialMedia : socialMediaList) {
            socialMedia.chat("user");
        }
    }
}
