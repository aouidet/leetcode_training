package com.features.leetcode.easy.findfirstindexoccurence;

public class Solution {

    public static int strStr(String haystack, String needle) {
        if(needle == null || needle.isEmpty()) {
            return 0;
        }
       for (int i = 0; i <= haystack.length() - needle.length(); i++) {
           if(haystack.startsWith(needle, i)) {
               return i;
           }
       }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(strStr("eadbutsad", "sad"));;
    }
}
