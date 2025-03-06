package com.features.leetcode.greedyAlgo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class SocialConnector {

    private boolean isCounterEnabled = true;

    private int counter = 4;

    @Getter @Setter
    List<SocialUser> users;

    SocialConnector() {
        users = new ArrayList<>();
    }

    public boolean switchCounter() {
        this.isCounterEnabled = !this.isCounterEnabled;
        return this.isCounterEnabled;
    }

    public List<SocialUser> getFollower(String account) {
        if(counter < 0) {
            throw new IllegalStateException("API limit reached");
        } else {
            if(this.isCounterEnabled) {
                counter --;
            }
            for(SocialUser user: users) {
                return user.getFollowers();
            }
        }
        return new ArrayList<>();
    }
}
