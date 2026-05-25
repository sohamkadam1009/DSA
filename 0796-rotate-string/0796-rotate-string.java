class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String result = s.repeat(2);
        if(result.contains(goal)) return true;
        return false;
    }
}