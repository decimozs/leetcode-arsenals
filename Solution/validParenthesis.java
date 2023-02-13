import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // create an object for the stack
        Stack<Character> stack = new Stack<>();

        // convert string to array of characters using for each
        for(char c : s.toCharArray()) {
            switch(c) {
                // determine the push condition
                // push if its opening brackets
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                
                // determine the closing brackets
                // check the if the corresponding brackets has its own open brackets on the top of the stack if its not then will pop
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(') {
                        // hence check the stack if it have the opening brackets if not then it will return false because it is invalid
                        return false;
                    } break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    } break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    } break;  
            }
        }
        // used to check if the stack is empty or not
        // true if we have empty stack
        // false if we have unused brackets in the stack
        return stack.isEmpty();
    }
}