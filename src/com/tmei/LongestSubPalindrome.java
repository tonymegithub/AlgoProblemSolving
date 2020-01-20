package com.tmei;

//Example 1:
//Input: "babad"
//        Output: "bab"
//        Note: "aba" is also a valid answer.
//
//example 2:
//Input: "cbbd"
//        Output: "bb"

public class LongestSubPalindrome {
    public String longestPalindrome(String s) {
        if(s.length() == 0)
            return "";

        if(s == null)
            return "";

        int answerStart = 0;
        int answerEnd = 0;

        char []stringArray = s.toCharArray();
        for(int start=0; start < stringArray.length; start++){
            for(int end = stringArray.length-1; end > start; end--)
            {
                //String subStrToTest = s.substring(start, end);
                if((answerEnd - answerStart + 1) < (end-start+1)) {
                    if (isPalindrome(stringArray, start, end)) {
                        if ((answerEnd - answerStart + 1) < (end - start + 1)){
                            answerStart = start;
                            answerEnd = end;
                        }

                    }
                }
            }
        }

        return s.substring(answerStart, answerEnd + 1);
    }

    private boolean isPalindrome(char[] s, int start, int end){
        while(start < end) {
            if (s[start] != s[end])
                return false;

            start++;
            end--;
        }

        return true;
    }

}
