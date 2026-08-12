class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //The brute force is surely using two loops , outer loop i=>0-n-1 , inner loop j => i+1 - n-1 and in inner loop temp[j] > temp[i} then answer[i] = j-i;

        int n = temperatures.length;
        int[] answer = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = n-1; i > -1; i-- ){

            while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i])
                stack.pop();

            if(!stack.isEmpty())
                answer[i] = stack.peek() - i; 

            stack.push(i);
        }
    return answer;
    }
}