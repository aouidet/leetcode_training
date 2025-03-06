package com.features.leetcode.greedyAlgo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SocialUserTest {

    @Test
    void findMostFollowerPath_shouldReturnResult_when() {

        // GIVEN
        // WHEN
        GreedyAlgo greedyAlgo = new GreedyAlgo(prepareNetwork());

        // THEN
        Assertions.assertEquals(greedyAlgo.findMostFollower("root"), 5);
    }

    private SocialConnector prepareNetwork() {
        SocialConnector connector = new SocialConnector();

        SocialUser root = new SocialUser("root");
        SocialUser child1 = new SocialUser("child1");
        SocialUser child2 = new SocialUser("child2");
        SocialUser child3 = new SocialUser("child3");

        SocialUser child21 = new SocialUser("child21");
        SocialUser child211 = new SocialUser("child211");
        SocialUser child2111 = new SocialUser("child2111");
        SocialUser child31 = new SocialUser("child31");
        SocialUser child311 = new SocialUser("child311");
        SocialUser child3111 = new SocialUser("child3111");


        child211.addFollowers(List.of(child2111));
        child311.addFollowers(List.of(child3111));
        child21.addFollowers(List.of(child211));

        child31.addFollowers(Arrays.asList(child311, new SocialUser("child312"), new SocialUser("child313"), new SocialUser("child314")));

        child1.addFollowers(Arrays.asList(new SocialUser("child11"), new SocialUser("child12")));
        child2.addFollowers(Arrays.asList(child21, new SocialUser("child22"), new SocialUser("child23")));
        child3.addFollowers(List.of(child31));


        root.addFollowers(Arrays.asList(child1, child2, child3));

        connector.setUsers(Arrays.asList(root, child1, child2, child3, child21, child31, child311, child211));
        return connector;
    }
}
