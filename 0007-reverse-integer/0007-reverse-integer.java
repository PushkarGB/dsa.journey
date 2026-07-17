class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x!=0){
            try{
                rev = Math.addExact(Math.multiplyExact(rev,10),x%10);
                x /= 10;
            }catch(ArithmeticException e){
                return 0;
            }
        }
        return rev;
    }
}