class Solution {
    public boolean isPalindrome(String s) {
        String t = s.toLowerCase().replaceAll("[^a-z0-9]","");
        char[] c = t.toCharArray();
        int l = 0,r = c.length -1;
        while(l < r){
            if(c[l] != c[r]) return false;
            l++;r--;
            
        }
        return true;
    }
}
