class Solution {
    public String removeOuterParentheses(String s) {
        //use levels to recognize the depthness of the paranthesis
        int level = 0;
        StringBuilder result = new StringBuilder(); 

        for(char ch : s.toCharArray()) {  
            if(ch == '(') {
                if(level > 0) result.append(ch);
                level++;
            } else if(ch == ')') {
                level--;
                if(level > 0) result.append(ch);
            }
        }

        return result.toString();

    }
}