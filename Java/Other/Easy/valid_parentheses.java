/*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
    determine if the input string is valid.

    An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

    Example 1:

    Input: s = "()"
    Output: true

    Example 2:

    Input: s = "()[]{}"
    Output: true

    Example 3:

    Input: s = "(]"
    Output: false

    Example 4:

    Input: s = "([)]"
    Output: false

    Example 5:

    Input: s = "{[]}"
    Output: true
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ')' && !stack.isEmpty()){
                char c = stack.pop();
                if(c != '('){
                    return false;
                }
            }
            else if(s.charAt(i) == '}' && !stack.isEmpty()){
                char c = stack.pop();
                if(c != '{'){
                    return false;
                }
            }
            else if(s.charAt(i) == ']' && !stack.isEmpty()){
                char c = stack.pop();
                if(c != '['){
                    return false;
                }
            }
            else{
                stack.add(s.charAt(i));
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}