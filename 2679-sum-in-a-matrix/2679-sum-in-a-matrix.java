class Solution {
    public int matrixSum(int[][] nums) {
        int score = 0;

       for(int i=0; i<nums.length; i++){
        Arrays.sort(nums[i]);
       }

       // Take maximum of each column, from right to left
       for(int j = nums[0].length-1; j>=0; j--){
        int max = 0;
         for (int i =0; i<nums.length; i++){
            max = Math.max(max, nums[i][j]);
         }
         score+=max;
       }
       return score;

    }
}