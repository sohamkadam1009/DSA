import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        //Two arrays - to compare freq
        //two pointers to shrink the window size - left and right

       //two arrays to compare frequency- check anagram
       int[] windowFreq = new int[26]; // total-26 characters
       int[] pFreq = new int[26];
       int left = 0;
       List<Integer> result = new ArrayList<>();

        //prefilling the pFreq array
        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }

       for(int right=0;right<s.length();right++) {
            windowFreq[s.charAt(right) - 'a']++;

            //shrinking the window from left if size exceeds
            if(right-left+1 > p.length()) {
                windowFreq[s.charAt(left) - 'a']--;
                left++;
            }

            if(right-left+1 == p.length()) {
                //checking if its a anagram or not
                if(Arrays.equals(windowFreq,pFreq)) {
                    //its a anagram store the initial index-left in the resuletd array
                    result.add(left);
                }
            }
       }

       return result;
    }
}