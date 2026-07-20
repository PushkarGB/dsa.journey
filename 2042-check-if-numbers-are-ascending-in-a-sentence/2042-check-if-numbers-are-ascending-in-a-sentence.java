class Solution {
    public boolean areNumbersAscending(String s) {
        int prev = -1;
        int i = 0;

        while (i < s.length()) {

            if (Character.isDigit(s.charAt(i))) {

                int num = 0;

                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }

                if (num <= prev)
                    return false;

                prev = num;
            } else {
                i++;
            }
        }

        return true;
    }
}