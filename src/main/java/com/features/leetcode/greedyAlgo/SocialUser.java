package com.features.leetcode.greedyAlgo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class SocialUser {

    @Getter
    private String userName;

    @Getter @Setter
    private List<SocialUser> followers;

    public SocialUser(String username) {
        super();
        this.userName = username;
        this.followers = new ArrayList<>();
    }

    public SocialUser(String username, List<SocialUser> followers) {
        super();
        this.userName = username;
        this.followers = followers;
    }


    public long getFollowerCount() {
        return followers.size();
    }

    public void addFollowers(List<SocialUser> followers) {
        this.followers.addAll(followers);
    }
}
