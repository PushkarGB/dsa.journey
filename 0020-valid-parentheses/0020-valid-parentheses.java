class Solution {
    public boolean isValid(String s) {
        int i = 0; 
        Deque<Character> stack = new ArrayDeque<>();
        for(int j = 0; j < s.length(); j++){
            char ch = s.charAt(j);
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;

                char top = stack.pop();
                if((top == '(' && ch !=')') ||
                    (top == '{' && ch !='}') ||
                    (top == '[' && ch !=']')) 
                    return false;
            }
        }
        return stack.isEmpty();
    }
}