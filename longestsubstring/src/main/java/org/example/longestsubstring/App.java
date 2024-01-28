package org.example.longestsubstring;

import java.util.*;

public class App {
    public int lengthOfLongestSubstring(String s) {
        int result;
        if (s == null || s.isEmpty()) {
            result = 0;
        } else if (s.length() == 1) {
            result = 1;
        } else {
            result = 1;
            for (int windowSize = 2; windowSize <= s.length(); windowSize++) {
                if (anyZeroDupsSubstring(s, windowSize)) {
                    result = windowSize;
                } else {
                    break;
                }
            }
        }
        return result;
    }

    private boolean anyZeroDupsSubstring(String s, int winSize) {
        boolean found = false;
        int possibleSubstrings = (s.length() + 1) - winSize;
        for (int i = 0; i < possibleSubstrings; i++) {
            if (noDuplicateChars(s.substring(i, i + winSize))) {
                found = true;
                break;
            }
        }
        return found;
    }

    private boolean noDuplicateChars(String str) {
        boolean result = true;
        HashMap<Character, Object> charMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (charMap.containsKey(c)) {
                result = false;
                break;
            } else {
                charMap.put(c, null);
            }
        }
        return result;
    }
}
