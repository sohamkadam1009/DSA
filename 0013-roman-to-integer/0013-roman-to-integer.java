class Solution {
    public int romanToInt(String s) {
        int result = 0;
        
        HashMap<Character, Integer> map = new HashMap<>(Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        ));

        
         for(int i=0 ;i < s.length()-1;i++) {
            int current = map.get(s.charAt(i));

            int next = map.get(s.charAt(i+1));
            if(current < next) {
                result -= current;
            } else {
                result += current;
            }
        }
        
        return result+=map.get(s.charAt(s.length()-1));

    }
}