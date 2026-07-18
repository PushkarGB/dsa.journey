class Solution {
    public int fib(int n) {
        int fib = 0  , a = 0 , b = 1;
        if(n<=1) return n;
        while(n>1){
            fib = a+b;
            a = b;
            b = fib;
            n--;
        }
        return fib;
    }
}