class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int max = 0;

        for(int i = 0; i < piles.length; i++){
            if(piles[i]>max) max = piles[i];
        }

        int high = max;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (can(mid,piles,h)) { //if can eat in mid hours
                high = mid; // we try to find if less possible because we need minimumm speed 
            } else { // mid is not the speed at which we can eat in 8 hours any speed <mid also cannot
                low = mid + 1; //low is tracking the lowest possible speed to satisfy condition
            }
        }
        return low;
    }

    boolean can(int speed, int[] piles, int h) {

        int hours = 0;

        for (int pile : piles) {
            hours += (pile + speed - 1) / speed; //Math.ceil(pile/speed);

            if (hours > h)
                return false;
        }
        return true;

        /*
        For positive integers:
        
        ceil(a / b)
        
        can be written as:
        
        (a + b - 1) / b
        */

    }
}