package com.features.leetcode.easy.longestcommonprefix;

public class LongestCommonPrefixInt {

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int maxLength = 0;
       if(arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) {
           return 0;
       }

       for (int x: arr1) {
          String strX = String.valueOf(x); // convert to string
           for (int y: arr2) {
               String strY = String.valueOf(y);
               int commonPrefixLength = getCommonPrefix(strX, strY);
               maxLength = Math.max(maxLength, commonPrefixLength);
           }
       }
        return maxLength;
    }

    private int getCommonPrefix(String strX, String strY) {
        // calculate le min length
        int minLength = Math.min(strX.length(), strY.length());
        int count = 0;
        while(count < minLength && strX.charAt(count) == strY.charAt(count)) {
            count ++;
        }
        return count;
    }
}
