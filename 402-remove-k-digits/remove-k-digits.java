import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> numStack = new Stack<>();
        
        for (char digit : num.toCharArray()) {
           
            while (k > 0 && !numStack.isEmpty() && digit < numStack.peek()) {
                
                numStack.pop();
                k--;
            }
            
            numStack.push(digit);
        }
        
        
        while (k > 0 && !numStack.isEmpty()) {
            numStack.pop();
            k--;
        }

        
        StringBuilder temp = new StringBuilder();
        while (!numStack.isEmpty()) {
            temp.append(numStack.pop());
        }
        
        temp.reverse();

        
        int m = temp.length();
        StringBuilder result = new StringBuilder();
        int foundNonZero = 0;
        for (int i = 0; i < m; i++) {
            if (temp.charAt(i) == '0' && foundNonZero == 0) {
                continue;
            } else {
                result.append(temp.charAt(i));
                foundNonZero = 1;
            }
        }
        
        if (result.length() == 0)
            result.append('0');
        return result.toString();
    }
}