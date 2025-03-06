package com.features.leetcode.greedyAlgo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@NoArgsConstructor
public class FollowerPath {

    @Getter
    private List<Follower> accounts;

    private long count;

    public FollowerPath(List<Follower> accounts) {
        this.accounts = accounts;
    }

    public void addFollower(String userName, long count) {
        accounts.add(new Follower(userName, count));
    }

    void addCount(long count) {
        this.count += count;
    }

}
