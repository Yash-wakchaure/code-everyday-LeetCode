class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left<right){
            // skip nonAlphanumeric from left
            while(left< right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            } 

            // skip nonAlphanumeric from right
            while(left< right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            } 

            // Compare characters after converting to lowercase
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            
            left ++;
            right --;
        }
        return true;
    }
}