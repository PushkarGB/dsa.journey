class Solution {
    public boolean checkString(String s) {
        int Ai = -1;
        int Bi = -1;
        int brk = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a') {
                Ai = i;
            } else {
                Bi = i;
            }

            if (Bi > -1 && Ai > Bi)
                brk++;

            if (brk > 0)
                return false;
        }
        return true;
    }
}