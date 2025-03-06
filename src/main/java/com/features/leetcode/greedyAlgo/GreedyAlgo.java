package com.features.leetcode.greedyAlgo;

import java.util.List;

public class GreedyAlgo {

    int currentLevel = 0;
    final int maxLevel = 3;

    SocialConnector connector;
    FollowerPath followerPath;

    public GreedyAlgo(SocialConnector connector) {
        super();
        this.connector = connector;
        this.followerPath = new FollowerPath();
    }

    public long findMostFollower(String account) {

        long max = 0;
        SocialUser toFollow = null;

        List<SocialUser> followers = connector.getFollower(account);
        for(SocialUser follow: followers) {
            long followersCount = follow.getFollowerCount();
            if(followersCount > max) {
                toFollow = follow;
                max = followersCount;
            }
        }

        if(currentLevel < maxLevel -1) {
            currentLevel ++;
            assert toFollow != null;
            max += findMostFollower(toFollow.getUserName());

        }
        return max;
    }
}
