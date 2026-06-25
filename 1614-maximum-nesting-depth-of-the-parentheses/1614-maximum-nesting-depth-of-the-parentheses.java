class Solution {
    public int maxDepth(String s) {
        int currentDepth = 0, maxDepth = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') {
                currentDepth +=1;
                maxDepth = Math.max(currentDepth,maxDepth);
            } else if(c == ')') {
                currentDepth -= 1;
            }
        }

        return maxDepth;
    }
}