import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
    //valid anagram if count of characters in s is equal to count of characters in t
    //using hashmaps for this - frequencyOfs = {character,freq} frequencyOft = {character,freq}

    //calculating the freq of each character in string s
    HashMap <Character,Integer> frequency = new HashMap<>();
    for(Character ch : s.toCharArray()) {
        frequency.put(ch,frequency.getOrDefault(ch,0) + 1);
    }

    //iterating over the string t
    for(Character ch :  t.toCharArray()) {
    //if-> the character in the second string is not present in the first one OR the character
    //count in the string t appears more than the character count in the string s then return 
    //false not a anagram
            if(!frequency.containsKey(ch) || frequency.get(ch) == 0) return false;
            frequency.put(ch,frequency.get(ch) - 1);
    }

    return true;
    }
    
}