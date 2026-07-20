class Solution {
    public boolean areNumbersAscending(String s) {
        String[] tokens = s.split(" ");
        int prev = -1;
        for(String token : tokens){
            if( token.length() <= 3 && Character.isDigit(token.charAt(0))){
                int i = 1;
                while(i < token.length() && Character.isDigit(token.charAt(i++)));
                if(i>=token.length()){
                    int cur = Integer.parseInt(token); 
                    System.out.println(cur + " " + token);
                    if(cur <= prev) return false;
                    else prev = cur;
                }
            }
        }
        return true;
    }
}