class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n > 0 && (n & (n-1)) == 0){
            System.out.print(n +"is power of 2");
            return true;
        }
    return false;
    }
}