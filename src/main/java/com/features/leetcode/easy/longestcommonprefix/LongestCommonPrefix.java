package com.features.leetcode.easy.longestcommonprefix;

public class LongestCommonPrefix {
    public String process(String[] inputs) {
        if (inputs.length == 0) {
            return "";
        }
        String prefix = inputs[0];
        for (int i = 1; i < inputs.length; i++) {
            while(inputs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public String processOpt(String[] strs) {

        if (strs.length == 0) {
            return "";
        }  // Find the minimum length string in the array
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }

        // Use binary search to find the longest common prefix
        int low = 1;
        int high = minLength;

        while (low <= high) {
            int middle = (low + high) / 2;
            if (isCommonPrefix(strs, middle)) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        // Return the longest common prefix
        return strs[0].substring(0, (low + high) / 2);
    }

    private boolean isCommonPrefix(String[] strs, int length) {
        String prefix = strs[0].substring(0, length);
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(prefix)) {
                return false;
            }
        }
        return true;
    }

}
